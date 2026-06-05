package array;

public class sumOfTwoArray {
    public static   void sameIndexelem(int arr1[],int arr2[]){
        int n=arr1.length;
        int nums[]=new int[n];

        for(int i=0;i<n;i++){
            nums[i]=arr1[i]+arr2[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String args[]){
        int[] arr1={1,2,3};
        int[] arr2={1,0,7};

        sameIndexelem(arr1,arr2);
    }
}
