import java.util.Scanner;
class Qn6{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the value a");
        int a = input.nextInt();
        System.out.println("Please enter the value of b");
        int b = input.nextInt();
        int add =a+b;
        int sub =a-b;
        int mul =a*b;
        int div =a/b;
         System.out.println("The result of adding is"+add);
         System.out.println("The result of subration is"+sub);
         System.out.println("The result of multplying is"+mul);
         System.out.println("The result of dividing is"+div);
          


    }
}