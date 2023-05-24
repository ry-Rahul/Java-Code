public class D2array {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        int arr1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int arr2[][] = { { 10, 11, 12 }, { 13, 14, 15 }, { 16, 17, 18 } };
        int arr3[][] = new int[3][3];
        
        for(int i = 0; i<arr1.length; i++)
        {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(" " + arr1[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        for(int i = 0; i<arr2.length; i++)
        {
            for (int j = 0; j < arr2.length; j++) {
                System.out.print(" " + arr2[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        for(int i = 0; i<arr1.length; i++)
        {
            for (int j = 0; j < arr1.length; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }

        }
        
        for(int i = 0; i<arr3.length; i++)
        {
            for (int j = 0; j < arr3.length; j++) {
                System.out.print(" " + arr3[i][j]);
            }
            System.out.println();
        }



    }
    
}
