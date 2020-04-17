import java.util.Arrays;

public class DebugArrays {
    public static void main(String[] args) {


        ////1.Create an array to hold the numbers 1-10.
        int [] numList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < 10; i++) {
            System.out.println(numList[i]);
        }


////2.Loop through that array and sum the numbers 1-10, then print that total to the screen.
        //int numList () = ({1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        int total = 0;
        for (int i = 0; i < numList.length; i++) {
            total = total + numList[i];
        }
        System.out.println("The total of the numbers is " + total);
    }

}

/*********************test***********
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * 7
 * 8
 * 9
 * 10
 * The total of the numbers is 55
 *
 * Process finished with exit code 0
 */
/