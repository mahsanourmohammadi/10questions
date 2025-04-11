import java.util.Arrays;
import java.util.Scanner;

public class exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // دریافت آرایه اول
        System.out.println("عناصر آرایه اول را وارد کنید (با فاصله جدا کنید):");
        String[] array1 = input.nextLine().split(" ");

        // دریافت آرایه دوم
        System.out.println("عناصر آرایه دوم را وارد کنید (با فاصله جدا کنید):");
        String[] array2 = input.nextLine().split(" ");

        // بررسی برابری آرایه‌ها (بدون در نظر گرفتن ترتیب)
        if (areArraysEqual(array1, array2)) {
            System.out.println("آرایه‌ها یکسان هستند");
        } else {
            System.out.println("آرایه‌ها متفاوت هستند");
        }
    }

    public static boolean areArraysEqual(String[] arr1, String[] arr2) {
        // اگر طول آرایه‌ها متفاوت باشد، قطعاً متفاوت هستند
        if (arr1.length != arr2.length) {
            return false;
        }

        // مرتب کردن هر دو آرایه
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // مقایسه عناصر یک به یک پس از مرتب سازی
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true;
    }
}
