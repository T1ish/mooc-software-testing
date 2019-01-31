package tudelft.gettingstarted;

import org.junit.jupiter.api.Assertions;
//The library below doesn't work, so the further below library is being used to run the tests.
//import org.junit.jupiter.api.Test;
import org.junit.Test;

public class GettingStartedTest {

    @Test
    public void addFiveTo20() {
        int result = new GettingStarted().addFive(20);
        Assertions.assertEquals(25,result);
    }

//    UNCOMMENT THE CODE BELOW, AND FILL THE GAPS!

    @Test
    public void addFiveToZero() {
        int result = new GettingStarted().addFive(0);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void addFiveToMinus20(){
        int result = new GettingStarted().addFive(-20);
        Assertions.assertEquals(-15, result);
    }

//    @Test
//    public void addFiveToMinus20() {
//        int result = new GettingStarted().addFive(???);
//        Assertions.assertEquals(????,result);
//    }
}
