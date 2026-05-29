public class Numbers {
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

    public static int  binTodeci2(int n){
        int res=0;
        int power=1;
        while(n>0){
            int num=n%10;
            res=res+num*power;
            power*=2;
            n=n/10;
        }
        return res;
    }

    public static int octTodeci(int n){
        int res=0;
        int power=0;
        while(n>0){
            res+=(n%10)*(int)Math.pow(8,power);
            power++;
            n=n/10;
        }
        return res;
    }

    public static int octTodeci2(int n){
        int res=0;
        int power=1;
        while(n>0){
            int num=n%10;
            res=res+num*power;
            power*=8;
            n=n/10;
        }
        return res;
    }

    public static void main(String args[]){
//        System.out.println(deciTobin(100));
//        System.out.println(decimalToBinary(100));
//        System.out.println(binTodeci(1100100));
        System.out.println(octTodeci(140));
        System.out.println(binTodeci2(1100100));
        System.out.println(octTodeci2(140));
    }
}
