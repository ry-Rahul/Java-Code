public class variableArguments {

    static int sum(int x,int ...arr)
    {
        int result = 0;
        for (int i : arr)
        {
            result += i;
        }

        return result;
    }
    public static void main(String[] args) {
        System.out.println("Variable Arguments");
        System.out.println("sum of 4 and 5 is:" + sum(4, 5));
        System.out.println("sum of 4, 5 and 6 is:" + sum(4, 5, 6));
        System.out.println("sum of 4, 5, 6 and 7 is:" + sum(4, 5, 6, 7));
        System.out.println("sum of 4, 5, 6, 7 and 8 is:" + sum(4, 5, 6, 7, 8));
        System.out.println("sum of 4, 5, 6, 7, 8 and 9 is:" + sum(4, 5, 6, 7, 8, 9));
        System.out.println("sum of nothing is "+ sum(1));
    }
    
}
