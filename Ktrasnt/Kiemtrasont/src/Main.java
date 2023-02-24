import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        if (number < 2)
        System.out.println(number + "is not a prime");
        else {
            int i =2 ;
            boolean check = true;
            while (i <= Math.sqrt(number)){
                if (number % i ==0 ) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
            System.out.println(number + "toi khong phai tung ngu ma toi rat ngu  ");
            else
            System.out.println(number  +"tooi la tung ngu ");

        }
    }
}