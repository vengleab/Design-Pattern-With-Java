package com.example.chain_of_responsibility.approval;

public class CEO extends Approver {
   private static final int APPROVAL_LIMIT = Integer.MAX_VALUE;

   public CEO(String name) {
      super(name, true, APPROVAL_LIMIT);
      setNextApprover(new AutoRejectHandler());
   }
}