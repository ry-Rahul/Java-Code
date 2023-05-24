class circle {

    public int radius;

    circle(int r) {
        System.out.println("this is the circle constructor");
        this.radius = r;
    }

}

class cylinder extends circle {
    
    cylinder(int r, int h) {

        super(r);
        this.height = h;
        System.out.println("this is the cylinder constructor");
        
    }

    public int height;
    
    public double volume() {
        return Math.PI * this.radius * this.radius * height;
    }


}

public class QuestionInheritence {
    
     
    public static void main(String[] args) {
        // circle c1 = new circle(2);

        cylinder c2 = new cylinder(12, 4);
        System.out.println(c2.volume());

    }
    
}
