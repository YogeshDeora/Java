import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num =sc.nextInt();
        int orig =num;
        int sum=0;
        while(num>0){
            int last =num%10;
            sum=sum+(last*last*last);
            num=num/10;
        }
        if(orig==sum){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not an Armstrong number");
        }


    }
}
