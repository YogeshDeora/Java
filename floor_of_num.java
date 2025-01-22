public class floor_of_num {
    public static void main(String[] args) {
        int arr[]={12,44,56,78,88,98,100,432,500};
        int target=80;
        int ans =floor(arr, target);
        System.out.println(ans);
    }

    static int floor(int arr[],int target){
        int start=0;
        int end=arr.length-1;

        boolean isAsc=arr[start]<arr[end];

        while(start<=end){
            int mid =start+ (end -start)/2;
            if(target>arr[arr.length-1]){
                return -1 ;
            }
            if (arr[mid]==target){
                return mid;
            }

            if (isAsc){
                if(target<arr[mid]){
                    end =mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else {
                if(target>arr[mid]){
                    end =mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return end;

    }
}
