package categories.behavioral.State;

/**
 * The test class GumballMachineTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class GumballMachineTestDrive {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);

        
        gumballMachine.insertQuarter();
        gumballMachine.insertNickle();
        gumballMachine.insertDime();
        gumballMachine.turnCrank();

        
        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();        
        gumballMachine.turnCrank();
        
        // adding the following statements to satisfy the 3rd constraint.
        gumballMachine.insertQuarter();
        gumballMachine.insertNickle();
        gumballMachine.insertDime();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
    }
}
