package array;

public class geometricProgression {
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

        int arr[]={1,2,6,9,18,36,72};
        geomertic_preogression(arr);

    }
}
