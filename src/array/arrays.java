package array;
import java.util.*;
import java.util.Scanner;

public class arrays {

    //print even numbers------------------------------

    public static void evenPrint(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0) System.out.print(arr[i]+" ");
        }
    }

    //Linear Search return boolean-----------------------------

    public static boolean linearSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key)return true;
        }
        return false;
    }
    //Linear Search return position of key-----------------------------

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

    //second minimum index of array---------------------

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

    //max distance btwn index of two equal element-------------------
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

    //sum of two array-------------------------------

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

    //subtraction of two array------------------------

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
    //String Palindrome or not??-------------------------
    public static boolean palindrome(String name){
        for(int i=0;i<name.length()/2;i++){
            if(name.charAt(i)!=name.charAt(name.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    //Swapping two values------------------

    public static void swap(int a,int b,int arr[]){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;

    }

    //revese an array---------------------------

    public static void reverse(int arr[]){
        for(int i=0;i<arr.length/2;i++){
            int st=i,end=arr.length-i-1;
            swap(st,end,arr);
        }

        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }

    //rotate an array--------------------
    public static void subArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
    static void rotateArr(int arr[], int d) {
        int n=arr.length;
        int nums[]=new int[n];
        d=d%n;
        for(int i=0;i<n-d;i++){
            nums[i]=arr[i+d];
        }
        for(int i=n-d;i<n;i++){
            nums[i]=arr[i-(n-d)];
        }
        for(int i=0;i<n;i++){
            arr[i]=nums[i];
        }
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
        int arr[]={1,2,6,9,18,36,72};
        geomertic_preogression(arr);

    }
}
