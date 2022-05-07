import static org.junit.Assert.*;

import org.junit.Test;
public class watchTest {

    // Case1 and Case2 -  edge coverage testing
    @Test
    public void case1(){
        watch one = new watch();
        String inputs = "abadacaad";
        String output = "Current state: Normal_Display, Time  Date: 1 - 1 - 2000  Time: 00:00";
        assertEquals( output , one.watch(inputs));
    }

    @Test
    public void case2(){
        watch two = new watch();
        String inputs = "cbababababa";
        String output = "Current state: Normal_Display, Time  Date: 2 - 2 - 2001  Time: 01:01";
        assertEquals( output , two.watch(inputs));
    }

    // Case3 and Case4 - ADUP testing
    @Test
    public void case3(){
        watch three = new watch();
        String inputs = "cbbabbbaaaa";
        String output = "Current state: Normal_Display, Time  Date: 1 - 1 - 2000  Time: 03:02";
        assertEquals( output , three.watch(inputs));
    }

    @Test
    public void case4(){
        watch four = new watch();
        String inputs = "caabbabbbbabbba";
        String output = "Current state: Normal_Display, Time  Date: 3 - 5 - 2003  Time: 00:00";
        assertEquals( output , four.watch(inputs));
    }
}