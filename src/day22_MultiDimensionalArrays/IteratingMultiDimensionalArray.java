package day22_MultiDimensionalArrays;

public class IteratingMultiDimensionalArray {

    public static void main(String[] args) {

        int[][] arr2D = { {1,2,3},{4,5,6,7},{8,9,10,11,12} };

        for(int i = 0; i < arr2D.length; i++){// i: index numbers of single dim array
            //System.out.println(Arrays.toString(arr2D[i]));
            for (int j = 0; j < arr2D[i].length; j++) { //j: index num of elements
                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("--------------------------");

    }
}
