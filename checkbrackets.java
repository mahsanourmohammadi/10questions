import java.util.Scanner;
public class checkbrackets {


        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("یک جمله با پرانتز وارد کنید:");
            String text = input.nextLine();

            int count = 0;

            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                if (c == '(') {
                    count++;
                } else if (c == ')') {
                    count--;
                }

                if (count < 0) {
                    break;
                }
            }

            if (count == 0) {
                System.out.println("پرانتزها درست هستند");
            } else {
                System.out.println("پرانتزها نادرست هستند");
            }
        }
    }

