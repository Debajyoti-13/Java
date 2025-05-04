import java.util.Scanner;

public  class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number:");
        int b = sc.nextInt();
        if (a>b){
            System.out.printf("Largest Number is:%d", a);
        }
        else {
            System.out.printf("Largest Number is:%d", b);
        }
    }
}
