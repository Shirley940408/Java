import java.util.Scanner;
public class TestOperator{
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println(b==a);
               
        System.out.println("Please input a year");
        Scanner sc =new Scanner(System.in); 
        int year=sc.nextInt();

        if(((year%4==0)&&(year%100!=0))||(year%400==0)){
          System.out.println("Yes, it is a leap year.");
        }else{
          System.out.println("No, it is not.");
        }
    }   
}
    