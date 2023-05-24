class rectangle
{
    public int length;
    public int breadth;
    
    rectangle() {
        System.out.println("Non-Param of rectangle");
    }
    rectangle(int x,int y) {
        length = x;
        breadth = y;
    }
}

class cuboid extends rectangle{
    public int height;
    
    cuboid() {
        System.out.println("Non-Param of cuboid");
    }

    cuboid(int x, int y, int z) {
        // !super keyword is used to call the constructor of the parent class
        super(x, y);
        height = z;
    }
    public void volume() {
        System.out.println("Volume "+length*breadth*height);
    }
}

public class SuperConstructor {

    public static void main(String[] args) {
        cuboid c = new cuboid(10, 20, 30);
        c.volume();
    }
    
}