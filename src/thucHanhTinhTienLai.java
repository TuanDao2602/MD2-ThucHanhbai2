import java.util.Scanner;

public class thucHanhTinhTienLai {
    public static void main(String[] args) {
        double money=1.0; // tiền gửi
        int month = 1; //tháng gửi
        double interestRate =1.0; // tỷ lệ lãi suất
        Scanner input =new Scanner(System.in);
        System.out.println(" nhập vào số tiền gửi");
        money =input.nextDouble();
        System.out.println("nhập vào số tháng gửi");
        month=input.nextInt();
        System.out.println("Enter annual interest rate in percentage: ");
        interestRate = input.nextDouble(); //interestRate LÃI SUẤT
        double totalInterest = 0;
        for (int i=0;i<month;i++){
            totalInterest += money *(interestRate/100)/12*month;
        }
        System.out.println("total of interest: " + totalInterest);//tổng tiền lãi
    }
}
