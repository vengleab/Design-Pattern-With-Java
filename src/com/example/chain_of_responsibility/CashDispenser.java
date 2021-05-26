package com.example.chain_of_responsibility;

public class CashDispenser {
  public int denominator;
  private CashDispenser nextDispenser=null;
  public CashDispenser(int val) {
    this.denominator = val;
  }

  public void setNextDispenser(CashDispenser next) {
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