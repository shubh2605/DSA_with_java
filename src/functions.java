public class functions {

    public static void sum(int a,int b,int c){

        System.out.println(a+b+c);
    }

    public static boolean isPrime(int num){
        for(int i=2;i*i<=num;i++){
            if(num%i==0)return false;
        }
        return true;
    }

    public static long nfactorial(long n){
        if(n==1 || n==0)return 1;
        long val =n*nfactorial(n-1);
        return val;
    }

    public static long nPr(long n, long r) {
        // code here
        if(r>n)return 0;
        // code here
        long result=nfactorial(n)/(nfactorial(n-r)*nfactorial(r));
        return result;
    }

    public static void printNum(int n){
        if(n==1) {
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printNum(n-1);
    }

    public static int evenSum(int st,int end){

        int sum=0;
//        for(int i=st;i<=end;i++){
//            if(i%2==0)sum+=i;
//        }
        if(end<st){
            return sum;
        }
        if(end%2==0)sum+=end;

        return evenSum(st,end-1);
    }

    public static String greetting(String name){

        return "Hello "+ name;
    }

    public static boolean LastsecEven(int n,int r){
        int count=0;
        while(n>0){
            count++;
            int num=n%10;
            n=n/10;
            if(count==2 && num%2==0)return true;
        }
        return false;
    }

    public static String deciTobin(int n){
        StringBuilder sb=new StringBuilder("");
        while(n>0){
            sb.append(n%2);
            n=n/2;
        }
        return sb.reverse().toString();
    }


    public static int decimalToBinary(int n){
        int res=0;
        int power=1;
        while(n>0){
            int rem=n%2;
            res+=rem*power;
            power*=10;
            n=n/2;
        }
        return res;
    }


    public static int  binTodeci(int n){
        int res=0;
        int power=0;
        while(n>0){
            res+=(n%10)*(int)Math.pow(2,power);
            power++;
            n=n/10;
        }
        return res;
    }

//    public static int octTobin(int n){
//
//    }

    public static void main(String[] args){
//        add(2,3//these r called argumnets);
//        sum(2,4,6);
//        System.out.println(isPrime(9));
//        System.out.println(nPr(33,9));
//        printNum(10);
//        System.out.println(evenSum(2,9));
//        System.out.println(LastsecEven(124365));
//        System.out.println(greetting("Shubham"));
//        System.out.println(deciTobin(100));
//        System.out.println(decimalToBinary(100));
//        System.out.println(binTodeci(1100100));

    }
}
