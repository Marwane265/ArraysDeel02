package be.intecbrussel;

import java.util.Arrays;

public class MathWithArr2d {
    public static void main(String[] args) {

        //manier 2 om een array creeren
        int[]num01 = {1, 2, 3, 4,5};
        System.out.println(Arrays.toString(num01));

        //manier 2 om een 2D-array creeren
        int[][] number1= {{1,2,3},
                {4,5,6}};

        System.out.println(Arrays.deepToString(number1));

        for (int row = 0; row<number1.length;row++){
            for (int col = 0; col<number1[row].length;col++){
                System.out.print(number1[row][col]);

            }
            System.out.println();
        }



    }
}
