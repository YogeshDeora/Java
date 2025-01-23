import java.util.Scanner;

public class second_smallest_and_2ndlargest {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=second_small(arr, n);
        System.out.println(ans);
        int ans_1=second_large(arr, ans);
        System.out.println(ans_1);
    }
    public static int second_small(int arr[],int n){
        int min =arr[0];
        int second_min=arr[1];
        for(int i=2;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>min&&arr[i]<second_min){
                second_min=arr[i];
            }
        }
        return second_min;
    }

    public static int second_large(int arr[],int n){
        int max=arr[0];
        int second_max=arr[n];
        for(int i=2;i<n;i++){
            if(arr[i]>max){
                second_max=max;
                max=arr[i];
            }
            if(arr[i]!=max&&arr[i]>=second_max){
                second_max=arr[i];
            }
        }
        return second_max;
    }
}


