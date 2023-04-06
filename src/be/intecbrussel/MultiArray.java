package be.intecbrussel;

public class MultiArray {
    public static void main(String[] args) {

        //array 10

        int[] numbers1D = new int[10];

        for (int index = 0; index < numbers1D.length; index++) {
            System.out.print(index + " ");
        }


        System.out.println();
        System.out.println("--------------------------------------------");

        //2D-array 20
        //Rijen en kolommen

        int[][] numbers2D = new int[10][10];
        for (int row = 0; row < numbers2D.length; row++) {

            for (int col = 0; col < numbers2D[row].length; col++) {

                System.out.print(numbers2D[row][col] + " ");
            }
            System.out.println();
        }


    }
}