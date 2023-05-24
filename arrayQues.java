import java.util.Collections;
public class arrayQues {
    public static void main(String[] args) {
        float marks[] = { 1.1f, 2.2f, 3.3f, 4.4f, 5.5f, 6.6f, 7.7f, 8.8f, 9.9f, 10.10f };

        // float sum = 0, sum1 = 0;
        // for(int i = 0; i<marks.length; i++)
        // {
        //     sum = sum + marks[i];
        // }
        // System.out.println("The sum of thea array is :" + sum);
        // System.out.println();

        // for(float elements:marks)
        // {
        //     sum1 += elements;
        // }
        // System.out.println("The sum of thea array is :" + sum1);

        //Question searching in an array 

        // float num = 70.5f ;
        // for(int i = 0; i<marks.length; i++)
        // {
        //     if(marks[i] == num)
        //     {
        //         System.out.println("The number is present at index: " + i);
        //     }
        // }

        // Question reverse an array

        for(float elements:marks)
        {
            System.out.print(" " + elements);
        }
        
        System.out.println();

        int start = 0;
        int end = marks.length - 1;
            while(start<end)
            {
                float temp = marks[start];
                marks[start] = marks[end];
                marks[end] = temp;
                start++;
                end--;

            }
            
            for(float elements:marks)
            {
                System.out.print(" "+elements);
            }
            

    }
    
}
