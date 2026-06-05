package array;

public class maxDisbtwnTwoSameNum {
    public  static void maxDistance(int[] arr){
        int len=0;
        for(int i=0; i< arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    len=Math.max(len, j-i);
                }
            }
        }
        System.out.println(len);
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,2,5};
        maxDistance(arr);
    }

}
