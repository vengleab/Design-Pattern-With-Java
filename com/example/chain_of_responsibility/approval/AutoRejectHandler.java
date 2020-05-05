package com.example.chain_of_responsibility.approval;

import com.example.chain_of_responsibility.approval.Approver;

public class AutoRejectHandler extends Approver {
   public AutoRejectHandler() {
      super("auto-reject", false, 0);
   }

   @Override
   public void handle(ExpenseReport report) {
      report.reject();
   }

}