import java.util.Scanner;

public class Smallest_letter_greater_than_target {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        char arr[]=new char[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.next().charAt(0);
        }
        char target=sc.next().charAt(0);

        System.out.println(character(arr, target));

    }
    static  char character(char arr[], char target){
        int start=0;
        int end=arr.length-1;

        while (start<=end){
            int mid =start+(end-start)/2;

            if(target>arr[mid]){
                start=mid+1;
                
            }
            else{
                end=mid-1;
                
            }
        }
        return arr[start%arr.length];
    }
}
