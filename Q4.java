import java.util.Scanner;
class Q4{
    public static void main (String [] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the name");
        String name=input.nextLine();
        System.out.println("Please enter your age");
        int a=input.nextInt();
        System.out.println("Welcome" +   name   + "you are" +a+ "years");

    }
}