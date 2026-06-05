package array;

public class lineraSearch {
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

    public static void main(String args[]){
        int arr[]={6,5,2,3,4,1,0};
        System.out.println(linearSearch(arr,3));
        linerarSearch2(arr,3);
    }

}
