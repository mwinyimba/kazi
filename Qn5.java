import java.util.Scanner;
class Qn5{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the  value of a");
        float a =input.nextFloat();
        System.out.println("The number of value before adding is"+a);
        System.out.println("Enter the value of b");
        float b = input.nextFloat();
        float sum = a+b;
        System.out.println("The value of a after adding is"+sum);
    }
}