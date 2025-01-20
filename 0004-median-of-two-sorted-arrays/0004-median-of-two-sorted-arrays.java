class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       return  Merged_Array(nums1 ,nums2);
    }
        public static double Merged_Array(int[] arr , int[] arr1){
            int n=arr1.length;
            int m=arr.length;
        int [] arr2= new int[n+m];
        int k=0;
        int j=0;
        for(int i=0 ; i<n+m ; i++){
            if(k<m){
                arr2[i]=arr[k];
                k++;
            }
            else{
                arr2[i]=arr1[j];
                j++;
            }
        }
        Arrays.sort(arr2);
        int s=(m+n)/2;
        if((n+m)%2==0){
            double h=(double)(arr2[s-1]+arr2[s])/2;
           return h;
        }
        else{
            double l= (double)(arr2[s]);
            return l;
        }
    }
}