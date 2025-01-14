import java.util.*;

public class gcd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num_1=sc.nextInt();
        int num_2=sc.nextInt();

        for(int i=Math.min(num_1,num_2);i>0;i--){
            if(num_1%i==0 && num_2%i==0){
                System.out.println("GCD :"+i);
                break;
            }
        }
    }
}
