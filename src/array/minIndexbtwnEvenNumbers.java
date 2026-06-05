package array;

public class minIndexbtwnEvenNumbers {
    public static int arrayProblem2(int arr[]){
        int minLen=Integer.MAX_VALUE;
        int first=-1;
        int sec=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                sec=first;
                first=i;

            }
            if(first>=0 && sec>=0)minLen=Math.min(minLen,(first-sec));

        }
        if(minLen==Integer.MAX_VALUE)return -1;
        return minLen;
    }

    public static void main(String args[]){
        int arr[]={6,5,3,4,2,6};
        System.out.println(arrayProblem2(arr));

    }
}
