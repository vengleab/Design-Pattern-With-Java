package com.example.chainOfResponsibility;

public class CashDispener {
  public int denominator;
  private CashDispener nextDispenser=null;
  public CashDispener(int val) {
    this.denominator = val;
  }

  public void setNextDispenser(CashDispener next) {
    if(this.nextDispenser==null){
      this.nextDispenser = next;
      return;
    }
    this.nextDispenser.setNextDispenser(next);
  }

  public void dispense(int amount){
    if(amount >= this.denominator) {
      int num = amount / this.denominator;
      int balance = amount % this.denominator;
      System.out.println(num+"*"+this.denominator+"$");
      if(balance!=0){
        nextDispenser.dispense(balance);
      }
    } else {
      nextDispenser.dispense(amount);
    }
  }


}