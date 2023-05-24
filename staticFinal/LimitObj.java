class limitInstance {
    private static int count = 0;
    private static limitInstance obj = null;

    private limitInstance() {
        count++;
    }

    public static limitInstance getInstance() {
        if (count <= 2) {
            obj = new limitInstance();
        }
        return obj;
    }
}

public class LimitObj {
    public static void main(String[] args) {
        limitInstance obj1 = limitInstance.getInstance();
        limitInstance obj2 = limitInstance.getInstance();
        limitInstance obj3 = limitInstance.getInstance();
        limitInstance obj4 = limitInstance.getInstance();
        limitInstance obj5 = limitInstance.getInstance();
        limitInstance obj6 = limitInstance.getInstance();
        limitInstance obj7 = limitInstance.getInstance();

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
        System.out.println(obj4);
        System.out.println(obj5);
        System.out.println(obj6);
        System.out.println(obj7);
        
    }
}
