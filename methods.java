public class methods {

     static int sumOfArray(int arr[])
     {
         int sum = 0;
         for (int i = 0; i < arr.length; i++) {
             sum = sum + arr[i];
         }
         return sum;
     }
    

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        
        // making an a object 
        // methods obj = new methods();
        // int sum = obj.sumOfArray(arr);

        int sum = sumOfArray(arr);
        System.out.println("The sum of the array is: " + sum);
    }
    
}
