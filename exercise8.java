
import java.util.Scanner;

public class exercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ورود اعداد
        System.out.println("اعداد را با فاصله وارد کنید :");
        String[] nums = input.nextLine().split(" ");

        // شمارش اعداد
        System.out.println("\nنتیجه شمارش:");
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == null) continue;

            int count = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i].equals(nums[j])) {
                    count++;
                    nums[j] = null; // علامت گذاری برای شمارش نشدن مجدد
                }
            }

            System.out.println(nums[i] + " -> " + count + " بار");
        }
    }
}
