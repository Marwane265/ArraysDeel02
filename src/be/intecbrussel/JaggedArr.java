package be.intecbrussel;

public class JaggedArr {
    public static void main(String[] args) {


        //Jagged array
        //5 rijen mag =>  int[][] nums = new int[5][];
        //5 kolommen mag niet! => int[][] nums = new int[][5];

        int[][] nums = new int[5][];
        nums[0] = new int[5];
        nums[1] = new int[50];
        nums[2] = new int[15];
        nums[3] = new int[25];
        nums[4] = new int[5];



        for (int row = 0; row<nums.length;row++){
            for (int col = 0; col<nums[row].length;col++){
                System.out.print(nums[row][col]);
            }
            System.out.println();
        }


    }
}
