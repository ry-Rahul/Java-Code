public class methodOverloading {

    static void area()
    {
        System.out.println("Area is the total surface of a 2D shape");
    }
    
    static int area(int a)
    {
        return a * a;
    }
    
    static int area(int a, int b)
    {
        return a * b;
    }

    public static void main(String[] args) {
        
        // methodOverloading obj = new methodOverloading();
        area();
        int a = area(5);
        System.out.println("Area of square is: " + a);

        int b = area(5, 6);
        System.out.println("Area of rectangle is: " + b);

        

    }
    
}
