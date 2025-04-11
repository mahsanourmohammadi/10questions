import java.util.Scanner;
public class exercise2{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter word:");
        String word = sc.nextLine();
        String temp ="";
        for (int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if (temp.indexOf(ch)==-1){
                temp+=ch;}
            }
        System.out.println(temp);
        }
    }

