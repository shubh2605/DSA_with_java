package array;

public class print_numbers {
    public static void evenPrint(int arr[]){
        for (int j : arr) {
            if (j % 2 == 0) System.out.print(j + " ");
        }
    }
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7};
        evenPrint(arr);
    }
}
