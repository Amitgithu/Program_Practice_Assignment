import java.util.Scanner;

class Addition{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Addition of two numbers is : " + (num1 + num2));
        sc.close();
    }
}