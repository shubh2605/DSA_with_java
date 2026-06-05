package array;

public class subtarctionOfTwoArray {
    public static void resOfsub(int arr1[],int arr2[]){
        int num1=0;
        for(int i=0;i<arr1.length;i++){
            num1=(num1*10)+(arr1[i]);
        }
        int num2=0;
        for(int i=0;i<arr2.length;i++){
            num2=(num2*10)+(arr2[i]);
        }
        int res=Math.abs(num1-num2);
        int dub=res;
        int len=0;
        while(dub>0){
            dub=dub/10;
            len++;
        }
        int nums[]=new int[len];
        for(int i=len-1;i>=0;i--){
            nums[i]=res%10;
            res=res/10;
        }
        for(int i=0;i<len;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String args[]){

        int[] arr1={1,2,3};
        int[] arr2={1,0,7};

        resOfsub(arr1,arr2);

    }
}
