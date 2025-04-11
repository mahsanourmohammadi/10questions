import java.util.Scanner;
public class exercise5 {



        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("یک عدد وارد کنید: ");
            String number = input.next();

            int length = number.length();

            // اگر طول عدد فرد باشد، نمی‌شود به دو نیمه تقسیم کرد
            if (length % 2 != 0) {
                System.out.println("عدد باید زوج رقم داشته باشد");
                return;
            }

            int half = length / 2;
            int sumFirst = 0;
            int sumSecond = 0;

            // جمع ارقام نیمه اول
            for (int i = 0; i < half; i++) {
                sumFirst += number.charAt(i) - '0';
            }

            // جمع ارقام نیمه دوم
            for (int i = half; i < length; i++) {
                sumSecond += number.charAt(i) - '0';
            }

            // مقایسه دو مجموع
            if (sumFirst == sumSecond) {
                System.out.println("مجموع دو نیمه برابر است");
            } else {
                System.out.println("مجموع دو نیمه برابر نیست");
            }
        }
    }

