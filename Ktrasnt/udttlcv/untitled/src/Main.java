import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double money =1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Hãy nhập số tiền cần gửi:");
        money = input.nextDouble();
        System.out.println("Hãy nhập số tháng gửi:");
        month = input.nextInt();
        System.out.println("Hãy nhập số lãi suất:");
        interestRate = input.nextDouble();
        double totalInterest = 0;
        for(int i = 0;i < month; i++){
            totalInterest += money * (interestRate/100)/12 * month;
            System.out.println("Tổng lãi xuất: " + totalInterest);
        }


    }
}