//bignumber ex1
import java.util.Scanner;


    public class Main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("عدد اول را وارد کنید:");
            String num1 = input.next();

            System.out.println("عدد دوم را وارد کنید:");
            String num2 = input.next();

            String sum = "";
            int carry = 0;
            int i = num1.length() - 1;
            int j = num2.length() - 1;

            while (i >= 0 || j >= 0 || carry > 0) {
                int d1 = (i >= 0) ? num1.charAt(i--) - '0' : 0;
                int d2 = (j >= 0) ? num2.charAt(j--) - '0' : 0;

                int total = d1 + d2 + carry;
                sum = (total % 10) + sum;
                carry = total / 10;
            }

            System.out.println("نتیجه : " + sum);
        }
    }

