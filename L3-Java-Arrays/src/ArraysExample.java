public class ArraysExample {
    public static void main(String[] args) {

        int[] array = new int[3];
        array[0] = 4;
        array[1] = 7;
        array[2] = 8;

        array[0] = 6;


        //System.out.println(array[0]);

        int[][] massiv = new int[3][3];

        massiv[0][0] = 3;
        massiv[0][1] = 6;
        massiv[0][2] = 4;
        massiv[1][0] = 2;
        massiv[1][1] = 9;
        massiv[1][2] = 1;
        massiv[2][0] = 3;
        massiv[2][1] = 5;
        massiv[2][2] = 8;



        for (int i=0; i < massiv.length; i++){
            for (int j=0; j < massiv.length; j ++) {
                System.out.print(massiv[i][j] +" ");
            }
            System.out.println();
        }

    }
}
