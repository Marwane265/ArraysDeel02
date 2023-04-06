package be.intecbrussel;

public class Array2DFill {
    public static void main(String[] args) {


        int[][] numbers = new int[2][3];
        numbers[0][0] = 20;
        numbers[0][1] = 30;
        numbers[0][2] = 40;

        numbers[1][0] = 20;
        numbers[1][1] = 30;
        numbers[1][2] = 40;

        numbers[2][0] = 100;
        numbers[2][1] = 100;
        numbers[2][2] = 100;


        //op te tellen van 1 tot 9
        int counter = 1;
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                numbers[row][col] = counter;
                counter++;
            }
        }


        for (int[] nums : numbers) {
            for (int n : nums) {
                System.out.print(n + " ");
            }
            System.out.println();
        }


    }
}
