public class array {
    public static void main(String[] args) {
        //array is a collection of similar types of data
        
        int marks[] = { 5, 2, 6, 99, 8, 74, 10, 0 };
        // float marks[] = { 12.3f, 45.56f };
        //int marks[]= new int [5]
        //    marks -> is a reference and this is object
        
        for(int i = 0; i<marks.length; i++)
        {
            System.out.print(" " + marks[i]);
        }
        System.out.println();
        System.out.println("The length of the array is: " + marks.length+"\n");



        // for each loops 
         for(int elements: marks)
         {
             System.out.print(" "+elements);
         }
        

    }
}
