package gas_mileage;
import java.util.Scanner;
public class Gas_Mileage {

    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        int milesDriven,gallonsPerTrip,total=0;
        double milesPerGallon;
        boolean check=true;
        int i=1;
        while(check==true){
            
            System.out.print("enter the driven miles : ");
            milesDriven=input.nextInt();
            System.out.print("enter number of used gallons : ");
            gallonsPerTrip=input.nextInt();
            if(milesDriven<0 || gallonsPerTrip<0){
                System.out.println("you ended the operation");
                System.out.println("-------------------------");
                check= false;
            }
            else{
                milesPerGallon=(double)milesDriven/gallonsPerTrip;
                total+=milesPerGallon;
            
            System.out.printf("the miles per gallon in trip %d  = %.3f .\n\n",i++,milesPerGallon);
            
            }
        }
        System.out.println("the total of miles per gallon : "+total);
        System.out.println("the average of miles per gallon :"+(total/3.0));
    
    }
    
}
