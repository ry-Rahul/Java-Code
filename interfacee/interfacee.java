interface test{
    void meth1();
    void meth2();

}
class test2 implements test{
    public void meth1(){
        System.out.println("iam meth1");
    }
    public void meth2(){
        System.out.println("iam meth2");
    }
    public void meth3(){
        System.out.println("iam meth3");
    }
}
public class interfacee{
    
    public static void main(String[] args) {
        test t = new test2();
        t.meth1();
        t.meth2();
    }
}
