class Area {

    private double len;
    private double wid;
    private double peri;
    private double area;

    public void setLenWidt(double l , double w) {
        len = l;
        wid = w;
    }

    public void setArea(int a) {
        double area = len * wid;
        if (a == area) {
            area = a;
        } else {
            System.out.println("Area is not correct");
        }
    }
    
    public void setPerimeter(int p) {
        double perim = 2 * len + 2 * wid;
        if (p == perim) {
            peri = p;
        } else {
            System.out.println("Perimeter is not correct");
        }
    }
    
    public double getArea() {
        return area;
    }

    public double getPermi() {
        return peri;
    }

}


public class acessModifier {
    public static void main(String[] args) {
        Area c1 = new Area();

        c1.setLenWidt(10, 20);
        c1.setArea(25);
        c1.setPerimeter(6);

        System.out.println("the area is = "+c1.getArea());
        System.out.println("the perimeter is = "+c1.getPermi());


        
    }
    
}
