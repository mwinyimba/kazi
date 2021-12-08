import java.util.Scanner;
class PartB1{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the value of d,e,f");
        int d = input.nextInt();
        
        int e = input.nextInt();
       
        int f =input.nextInt();
        if(d>e){
            if(d>f)
            System.out.println(d+ "is largest number");
            else
            System.out.println(f+ "is largest number");
        }else{
            if(f>e)
            System.out.println(f+ "is largest number");
            else
            System.out.println(e+ "is largest number");
        }

    }
}