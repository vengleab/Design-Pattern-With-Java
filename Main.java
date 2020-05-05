import com.example.singleton.Logger;
import com.example.chain_of_responsibility.CashDispenser;
import com.example.chain_of_responsibility.approval.CEO;
import com.example.chain_of_responsibility.approval.ExpenseReport;
import com.example.chain_of_responsibility.approval.Manager;
import com.example.chain_of_responsibility.approval.VicePresident;

class Main {
  public static void main(String[] args) {
    // Singleton

    // Chain of responsibility
    CashDispenser dispenser = new CashDispenser(100);
    dispenser.setNextDispenser(new CashDispenser(20));
    dispenser.setNextDispenser(new CashDispenser(50));
    dispenser.setNextDispenser(new CashDispenser(10));
    dispenser.setNextDispenser(new CashDispenser(5));
    dispenser.setNextDispenser(new CashDispenser(1));
    dispenser.dispense(13433);

    // Chain of responsibility - Approval process
    Manager manager = new Manager("Joe", true);
    VicePresident vp = new VicePresident("Jane");
    CEO ceo = new CEO("Zeus");
    ExpenseReport report = new ExpenseReport();

    manager.setNextApprover(vp);
    vp.setNextApprover(ceo);

    report.setTotalDollarAmount(1_000_000);
    System.out.println("Pre-handle:"+report.getState());
    manager.handle(report);
    System.out.println("After-handle:"+report.getState());



  }
}