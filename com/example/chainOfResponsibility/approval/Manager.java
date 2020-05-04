package com.example.chainOfReponsibility.approval;

import com.example.chainOfResponsibility.approval.Approver;

public class Manager extends Approver {
  private static final int APPROVAL_LIMIT = 5000;

  public Manager(String name, boolean canApproveInternaltional) {
    super(name, canApproveInternaltional, APPROVAL_LIMIT);
  }
}