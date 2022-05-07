public class minmax {

    public int [] minmax (int A[] ){

        int n =A.length;

        int [] minmax = {A[0] , A[0]}; // minmax[0] is the minimum value and minmax[1] is the maximum value

        for ( int i=1; i<n; i++){
            if(A[i] <= minmax[0])
                minmax[0] = A[i];
            else if (A[i] >= minmax[1])
                minmax[1] = A[i];
        }

        return minmax;

    }
}
