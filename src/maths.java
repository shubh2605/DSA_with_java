public class maths {
//        Sum of squares of numbers------------------------------

//    public static void SumSquare(int n){
//        int sum=0;
//        while(n>0){
//            int num=n%10;
//            sum+=(num*num);
//            n=n/10;
//        }
//        System.out.println(sum);
//    }

//    Armstrong number-----------------------------------------

//        public static boolean Armstrong(int n){
//        int val=n;
//        int sum=0;
//        while(val>0){
//            int num=val%10;
//            sum+=(int)Math.pow(num,3);
//            val=val/10;
//        }
//        if(n==val)return true;
//        return false;
//    }


//    prefectcube-----------------------------------
//        public static void perfectcube(int a,int b){
//        for(int i=1;i*i*i<=b;i++){
//            if((int)Math.pow(i,3) >=a){
//                System.out.println((int)Math.pow(i,3));
//            }
//        }
//    }

//    fibonacci------------------------------------
//        public static int fibo(int n) {
//        if (n == 0) return 0;
//        if (n == 1 || n == 2) return 1;
//        return fibo(n - 1) + fibo(n - 2);
//    }

//    fibonacci second method-------------------------
//        public static int fibobeg(int n){
//        int first=0;
//        int second=1;
//        for(int i=1;i<=n;i++){
//            int sum=first+second;
//            first=second;
//            second=sum;
//        }
//        return first;
//    }

//    perefect square-------------------------
//        public static void perfectsq(int a,int b){
//        for(int i=1;i<=10;i++){
//            if((int)Math.pow(i,2) >=a && (int)Math.pow(i,2) <=b){
//                System.out.println((int)Math.pow(i,2));
//            }
//        }
//    }

//    eucledieans algo for gcd------------------

//    public static void gcd1(int a,int b){
//
//        while(a!=0){
//            int num=b%a;
//            b=a;
//            a=num;
//        }
//        System.out.println(b);
//    }

    public  static void mains(String args[]){
//        SumSquare(4);
//        Armstrong(4);
//        perfectcube(3,5);
//        fibo(4);
//        fibobeg(4);
//        perfectsq(4,5);
//        gcd1(4,5);
    }
}
