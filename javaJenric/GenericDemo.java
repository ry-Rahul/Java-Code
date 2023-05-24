
@SuppressWarnings ("unchecked")
public class GenericDemo<T> {
     T data[] = (T[]) new Object[5];
    public static void main(String[] args) {
        GenericDemo<String> gd = new GenericDemo<>();
        gd.data[0] = "John";
        gd.data[1] = "Mary";
        gd.data[2] = "Peter";
        gd.data[3] = "Paul";
        gd.data[4] = "James";
        
        System.out.println("Printing the array");
    }
}
