import java.util.Scanner;

public class exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] kandida = {"reza", "ahmad", "ali", "moham", "asgar"};
        int reza = 0;
        int ahmad = 0;
        int ali = 0;
        int moham = 0;
        int asgar = 0;
        int a = 10;
        for (String i : kandida) {
            System.out.println(i);


            for (int i = 0; i < 10; i++) {
                String sh = sc.nextLine();
                if (sh.equals("reza")) {
                    reza++;

                } else if (sh.equals("ahmad")) {
                    ahmad++;
                } else if (sh.equals("ali")) {
                    ali++;
                } else if (sh.equals("moham")) {
                    moham++;
                } else if (sh.equals("asgar")) {
                    asgar++;

                }
            }
            System.out.println("reza vote :");
            System.out.println("ahmad vote :");
            System.out.println("ali vote :");
            System.out.println("moham vote :");
            System.out.println("asgar vote :");


        }
    }
}