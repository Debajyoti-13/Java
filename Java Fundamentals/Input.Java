import java.util.Scanner;

public  class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Date of Death:");
        int num = sc.nextInt();
        System.out.printf("Your Date of Death is:%d", num);
        double num1 = sc.nextDouble();
        System.out.printf("Your Date of Death is:%.2f", num1);
        String num2 = sc.nextLine();
        System.out.printf("Your Date of Death is:%s", num2);
    }
}
