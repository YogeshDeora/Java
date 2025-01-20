public class ceiling {
        public static void main(String[] args) {
           int arr[]={12,44,56,78,88,98,100,432,500};
           int target=80;
           int ans =ceil(arr, target);
           System.out.println(ans);
        }
        static int ceil(int arr[] ,int target){
           int start=0;
           int end=arr.length-1;
   
           boolean isAsc=arr[start]<arr[end];
   
           while(start<=end){
               int mid =start+ (end -start)/2;
   
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
           return start;
   
        }

   
}
