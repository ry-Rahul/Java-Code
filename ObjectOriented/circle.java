class circlee {
   public float radius;

   public double area() {
       return Math.PI * radius * radius;
   }

   public double parameter() {
       return 2 * Math.PI * radius;
   }
   
   public double circumference() {
       return parameter();
   }

   public double diameter() {
       return 2 * radius;
   }
    

}
public class circle {
    public static void main(String[] args) {
        circlee c1 = new circlee();
        c1.radius = 7;
        System.out.println("Area of circle is " + c1.area());
        System.out.println("Parameter of circle is " + c1.parameter());
        System.out.println("Circumference of circle is " + c1.circumference());
        System.out.println("Diameter of circle is " + c1.diameter());
    }
}