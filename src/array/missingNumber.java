package array;

public class missingNumber {

    public static void missing_number(int arr[]){

        int size=0;
        int nums[]=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            nums[arr[i]-1]+=1;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                nums[size++]=i+1;
            }
        }
        for(int i=0;i<size;i++){
            System.out.println(nums[i]+" ");
        }
    }

    public static void main(String args[]){


        int arr[]={1,2,1,3,4,5};
        missing_number(arr);
    }
}
