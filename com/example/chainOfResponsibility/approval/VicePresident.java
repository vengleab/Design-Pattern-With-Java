package com.example.chainOfResponsibility.approval;

import com.example.chainOfResponsibility.approval.Approver;

public class VicePresident extends Approver {
   private static final int APPROVAL_LIMIT = 100000;

   public VicePresident(String name) {
      super(name, true, APPROVAL_LIMIT);
   }
}
