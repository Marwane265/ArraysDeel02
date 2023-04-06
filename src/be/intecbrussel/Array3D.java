package be.intecbrussel;

public class Array3D {
    public static void main(String[] args) {


        int[][][] numbersArr3D = new int[5][3][4];

        for (int layers = 0; layers < numbersArr3D.length; layers++) {
            for (int row = 0; row < numbersArr3D[layers].length; row++) {
                for (int col = 0; col < numbersArr3D[layers][row].length; col++) {
                    System.out.print(numbersArr3D[layers] [row] [col]);
                }
                System.out.println();
            }
            System.out.println();
        }


    }
}
