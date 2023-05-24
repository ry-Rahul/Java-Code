@FunctionalInterface
interface MyLambda {
    //  public void display();
    public int show(int x, int y);
}

public class lambda {
    public static void main(String[] args) {
        MyLambda m = (x, y) -> x + y;
        
        System.out.println(m.show(10, 20));
    }
}
