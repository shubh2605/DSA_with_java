package array;
import java.util.*;
import java.util.Scanner;

public class arrays {
    public static void evenPrint(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0) System.out.print(arr[i]+" ");
        }
    }
    public static boolean linearSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key)return true;
        }
        return false;
    }

    public static void linerarSearch2(int arr[],int key){
        int pos=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                pos=i;
                break;
            }
        }
        System.out.println(pos);
    }


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

    public static boolean palindrome(String name){
        for(int i=0;i<name.length()/2;i++){
            if(name.charAt(i)!=name.charAt(name.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){

        int[] arr1={1,2,3};
        int[] arr2={1,0,7};

//        System.out.println(linearSearch(arr,3));
//        linerarSearch2(arr,3);
//        System.out.println(arrayProblem2(arr));
//        System.out.println(maxDistance(arr1));
//        sameIndexelem(arr1,arr2);
//        resOfsub(arr1,arr2);
        System.out.println(palindrome("abccba"));
    }
}
