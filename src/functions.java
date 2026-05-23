//    fxn is a block of code use to run specific task
//    features:
//    increase readibility,
//    inhance reusablility
//in java,we cant declare a fxn inside a fxn
//Fxn and their local variable are created in stack memory
//stack contains the stack frames made by fxn which contains its variable
//object,refrence ,runtime data are stored in heap momory

//Static variables must be declared outside of method.
// If you try to use the static keyword to declare a variable inside a method, the compiler will throw an "illegal start of expression" error.

//public static void statisStudy(){
//
//        int d=190;       local scope variable
//        if(i%2==0){
//            itn r=101;   block scope variable
//        }
//}


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
    static long nPr(long n, long r) {
        // code here
        if(r>n)return 0;
        // code here
        long result=nfactorial(n)/(nfactorial(n-r)*nfactorial(r));
        return result;
    }

    public static void main(String[] args){
//        add(2,3//these r called argumnets);
//        sum(2,4,6);
//        System.out.println(isPrime(9));
        System.out.println(nPr(33,9));

    }
}
