package array;

public class swap_Reverse_Rotate {
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
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String args[]){

        int arr[]={4,3,1,2,5,6};
        reverse(arr);
        subArray(arr);
        rotateArr(arr,4);
    }

}
