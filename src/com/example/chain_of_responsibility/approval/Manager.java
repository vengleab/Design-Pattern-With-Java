package com.example.chain_of_responsibility.approval;


public class Manager extends Approver {
  private static final int APPROVAL_LIMIT = 5000;

  public Manager(String name, boolean canApproveInternational) {
    super(name, canApproveInternational, APPROVAL_LIMIT);
  }
}