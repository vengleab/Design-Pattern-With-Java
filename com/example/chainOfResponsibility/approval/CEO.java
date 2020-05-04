package com.example.chainOfReponsibility.approval;

import com.example.chainOfResponsibility.approval.Approver;


public class CEO extends Approver {
   private static final int APPROVAL_LIMIT = Integer.MAX_VALUE;

   public CEO(String name) {
      super(name, true, APPROVAL_LIMIT);
      setNextApprover(new AutoRejectHandler());
   }
}