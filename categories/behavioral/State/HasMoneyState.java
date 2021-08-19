package categories.behavioral.State;

import java.util.Random;

/**
 * HasMoneyState is concrete classes implementing State interface.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class HasMoneyState implements State {
    GumballMachine gumballMachine;
 
    public HasMoneyState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
  
    public void insertMoney() {
        System.out.println("Money received. Current total money is " + gumballMachine.totalMoney);
    }
 
    public void ejectMoney() {
        System.out.println("Money returned");
        gumballMachine.setState(gumballMachine.getNoMoneyState());
    }
 
    public void turnCrank() {
        System.out.println("You turned...");
        if(gumballMachine.totalMoney<0.50)
        {
            System.out.println("Money Insufficient");        
        }
        else
        {
           gumballMachine.setState(gumballMachine.getSoldState()); 
        }
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
    public String toString() {
        return "waiting for turn of crank";
    }
}
