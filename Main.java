import java.util.List;

import com.example.singleton.Logger;
import com.example.chainOfResponsibility.CashDispener;
import com.example.chainOfResponsibility.approval.Manager;

class Main {
  public static void main(String[] args) {
    // Singleton
    Logger.getInstance().info("tesing");

    // Chain of responsibility
    CashDispener dispenser = new CashDispener(100);
    dispenser.setNextDispenser(new CashDispener(20));
    dispenser.setNextDispenser(new CashDispener(50));
    dispenser.setNextDispenser(new CashDispener(10));
    dispenser.setNextDispenser(new CashDispener(5));
    dispenser.setNextDispenser(new CashDispener(1));
    dispenser.dispense(13433);

    // Chain of responsibility - Approval process
    Manager manager = new Manager();
  }
}