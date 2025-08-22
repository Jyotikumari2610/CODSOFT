import java.util.*;
public class CurrencyConverter {
       public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Currency Converter!!");
        System.out.println("1.USD to Rupee");
        System.out.println("2.Rupee to USD");
        System.out.println("3.Euro to Rupee");
        System.out.println("4.Rupee to Euro");
        System.out.println("Enter your choice:");
        int choice=sc.nextInt();
        if(choice==1){
            System.out.println("Enter the amount in USD:");
            float USD=sc.nextFloat();
            float Rupee=USD*87.37f;
            System.out.println(+USD+ " USD is equal to: " +Rupee+ "Rupee");
        }
        else if(choice==2){
            System.out.println("Enter the amount in Rupee:");
            float Rupee=sc.nextFloat();
            float Usd=Rupee*0.011f;
            System.out.println(+Rupee+ " Rupee is equal to: " +Usd+ "Usd");
        }
        else if(choice==3){
            System.out.println("Enter the amount in Euro:");
            float Euro=sc.nextFloat();
            float Rupee=Euro*101.32f;
            System.out.println(+Euro+ " Euro is equal to: " +Rupee+ "Rupee");
        }
        else if(choice==4){
             System.out.println("Enter the amount in Rupee:");
            float Rupee=sc.nextFloat();
            float Euro=Rupee*0.010f;
            System.out.println(+Rupee+ " Rupee is equal to: " +Euro+ "Usd");
        }
        else {
            System.out.println("Invalid coice");
        }
    }
}
  
