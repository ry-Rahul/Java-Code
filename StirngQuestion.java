public class StirngQuestion {
    public static void main(String[] args) {

        String str = "123";
        String str2 = "456";

        int carry = 0, sum = 0, d1, d2;
        String result = "";

        int len1 = str.length() - 1;
        int len2 = str2.length() - 1;

        while (len1 >= 0 || len2 >= 0) {
            d1 = str.charAt(len1) - '0';
            d2 = str2.charAt(len2) - '0';

            sum = d1 + d2 + carry;
            carry = sum / 10;
            sum = sum % 10;

            result = sum + result;
            len1--;
            len2--;
        }
        if (carry != 0)
            result = carry + result;
        System.out.println(result);
    }
}