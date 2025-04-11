import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // گرفتن آرایه از کاربر
        System.out.println("اعداد رو با فاصله بنویسید (مثال: 1 3 5 2):");
        String[] adadha = input.nextLine().split(" ");

        // گرفتن دو عدد از کاربر
        System.out.println("عدد اول:");
        int a = input.nextInt();
        System.out.println("عدد دوم:");
        int b = input.nextInt();

        // پیدا کردن موقعیت ها
        int posA = -1, posB = -1;
        int minFasele = adadha.length;

        for (int i = 0; i < adadha.length; i++) {
            int num = Integer.parseInt(adadha[i]);

            if (num == a) {
                posA = i;
            }
            if (num == b) {
                posB = i;
            }

            if (posA != -1 && posB != -1) {
                int fasele = Math.abs(posA - posB);
                if (fasele < minFasele) {
                    minFasele = fasele;
                }
            }
        }

        // نمایش نتیجه
        if (posA == -1 || posB == -1) {
            System.out.println("یکی از اعداد تو آرایه نیست!");
        } else {
            System.out.println("کمترین فاصله بین " + a + " و " + b + ": " + minFasele);
        }
    }
}