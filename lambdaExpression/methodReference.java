
@FunctionalInterface
interface MyLambda
{
    public int display(String str1,String str2);
}

/*class My implements MyLambda
{
    public void display()
    {
        System.out.println("Hello World");
    }
}*/

public class methodReference {
      
    public methodReference(String s) {
        System.out.println(s.toUpperCase());
    }
    public static void main(String[] args) {
        
        // MyLambda m=()->{System.out.println("Hello world");};
       
        // MyLambda m = methodReference::new; for constructor reference
        MyLambda m = String::compareTo;
       System.out.println(m.display("zello","well"));
        
        
    }
    
}