package com.example.chainOfResponsibility.approval;

public class ExpenseReport {
  private int totalDollarAmount;
  private boolean isInternationalTravel;
  private State state = State.initial;
  private Approver handler;

  public int getTotalDollarAmount() {
    return this.totalDollarAmount;
  }
  public void setTotalDollarAmount(int totalAmount) {
    this.totalDollarAmount = totalAmount;
  }

  public boolean isInternationalTravel() {
    return this.isInternationalTravel;
  }

  public State getState() {
    return this.state;
  }

  public void reject() {
    this.state = State.rejected;
  }

  public void approve(Approver approver) {
    this.handler = approver;
    this.state = State.approved;
  }

  public Approver getHandler() {
    return this.handler;
  }

}