package array;
import java.util.*;
import java.util.Scanner;

public class arrays {

    //sum of two array-------------------------------



    //subtraction of two array------------------------


    //String Palindrome or not??-------------------------
    public static boolean palindrome(String name){
        for(int i=0;i<name.length()/2;i++){
            if(name.charAt(i)!=name.charAt(name.length()-i-1)){
                return false;
            }
        }
        return true;
    }

    //Geomertic Progression-----------------------------

    public static void geomertic_preogression(int arr[]){
        for(int i=1;i<arr.length-1;i++){
            int st=i-1;
            int end=i+1;
            int curr=arr[i];
            while(curr%arr[st]!=0 && st>=0){
                st--;
            }
            while(arr[end]%curr!=0 && end<arr.length){
                end++;
            }
            if(curr/arr[st]==arr[end]/curr){
                System.out.println(arr[st]+" "+curr+" "+arr[end]);
            }
        }
    }

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
//
//        int[] arr1={1,2,3};
//        int[] arr2={1,0,7};

//        System.out.println(linearSearch(arr,3));
//        linerarSearch2(arr,3);
//        System.out.println(arrayProblem2(arr));
//        System.out.println(maxDistance(arr1));
//        sameIndexelem(arr1,arr2);
//        resOfsub(arr1,arr2);
//        System.out.println(palindrome("abccba"));
//        int arr[]={4,3,1,2,5,6};
//        reverse(arr);
//        int arr[]={4,5,0,-2,-3,1};
//        subArray(arr);
//        int arr[]={1,2,6,9,18,36,72};
//        geomertic_preogression(arr);

        int arr[]={1,2,1,3,4,5};
        missing_number(arr);
    }
}
