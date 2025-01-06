import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num =sc.nextInt();
        int orig=num;
        int rev=0;
        while (num>0){
            int last=num%10;
             rev = rev*10+last;
            num=num/10;
        }
        if(orig==rev){
            System.out.println("Palindrome_Number");
        }
        else{
            System.out.println("Not_a_Palindrome_Number");
        }

    }
}
