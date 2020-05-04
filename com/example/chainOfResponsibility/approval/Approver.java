package com.example.chainOfResponsibility.approval;

import com.example.chainOfResponsibility.approval.ExpenseReport;

public class Approver {
  private Approver nextApprover;
  private int dollarLimit;
  private boolean isOutOfOffice;
  private boolean canApproveInternational;
  private final String name;

  public Approver(String name, boolean canApproveInternational, int dollarLimit) {
    this.name = name;
    this.canApproveInternational = canApproveInternational;
    this.dollarLimit = dollarLimit;
  }

  public String getName() {
    return this.name;
  }

  public void handle(ExpenseReport report) {
    if (!canApprove(report) || isOutOfOffice()) {
      nextApprover.handle(report);
    } else {
      report.approve(this);
    }
  }

  private boolean canApprove(ExpenseReport report) {
    return report.getTotalDollarAmount()<=getDollarLimit() && (canApproveInternational() || !report.isInternationalTravel());
  }

  public void setNextApprover(Approver approver) {
    this.nextApprover = approver;
  }

  public boolean isOutOfOffice() {
    return isOutOfOffice;
  }

  public void setIsOutOfOffice(boolean isOutOfOffice) {
    this.isOutOfOffice = isOutOfOffice;
  }

  public int getDollarLimit() {
    return dollarLimit;
  }

  public boolean canApproveInternational() {
    return canApproveInternational;
  }

  public void setCanApproveInternational(boolean canApproveInternational) {
    this.canApproveInternational = canApproveInternational;
  }
}
