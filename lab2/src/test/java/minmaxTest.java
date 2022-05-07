import static org.junit.Assert.*;

import org.junit.Test;
public class minmaxTest{

    @Test
    public void case1(){
        minmax one = new minmax();
        int []A = {2,3,4,1,7,29,0,1,17,10,23};
        int []output = {0,29};
        assertArrayEquals( output , one.minmax(A));
    }
    @Test
    public void case2(){
        minmax two = new minmax();
        int []A = {2,3,4,1,7,29,0,1,17,10,23,-1,333}; //array
        int []output = {-1,333};
        assertArrayEquals(output,two.minmax(A) );
    }
    @Test
    public void case3() {
        minmax three = new minmax();
        int[] A = {22, 234, 109, 1829, 9, 167, 83, 4, 2389}; //array
        int[] output = {4, 2389};
        assertArrayEquals(output, three.minmax(A));
    }
    @Test
    public void case4() {
        minmax four = new minmax();
        int[] A = {2,9,9,4,2,5,27,11,15,10}; //array
        int[] output = {2, 27};
        assertArrayEquals(output, four.minmax(A));
    }

    @Test
    public void case5(){
        minmax five = new minmax();
        int []A = {1};
        int []output = {1,1};
        assertArrayEquals(output, five.minmax(A));
    }

}






