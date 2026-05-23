public class pattern {

//    square pattern--------------------------------

//        public static void squarepattern(int n){
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }


//    mountain-----------------------------------------

//    public static void mountain(int n){
//        for(int i=0;i<n;i++){
//            for(int j=0;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n-i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }

//    number pattern------------------------------------

//        public static void numberpattern(int n){
//        for(int i=0;i<n;i++){
//            for(int j=0;j<=i;j++){
//                System.out.print((j+1)+" ");
//            }
//            System.out.println();
//        }
//    }

//    pyramid-------------------------------------

//    public static void pyramid(int n){
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n-i-1;j++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<=i-1;j++){
//                System.out.print("*");
//            }
//            for(int j=0;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

//    reverse pyramid-------------------------------

//    public static void reversepyramid(int n){
//        for(int i=0;i<n;i++){
//            for(int j=0;j<i;j++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<n-i;j++){
//                System.out.print("*");
//            }
//            for(int j=0;j<n-i-1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

//    righttraingle------------------------------
//        public static void righttriangle(int n){
//        for(int i=0;i<n;i++){
//            for(int j=0;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
    //alphabetid error---------------------------

//    public static void alphabetic(int n){
//
//        for(int i=0;i<n;i++){
//            char ch='A';
//            for(int j=0;j<=i;j++){
//                System.out.print(ch);
//                ch++;
//            }
//            System.out.println();
//        }
//    }

//    public static void reversealphabetic(int n){
//
//        for(int i=0;i<n;i++){
//            char ch='A';
//            for(int j=0;j<n-i;j++){
//                System.out.print(ch);
//                ch++;
//            }
//            System.out.println();
//        }
//    }

//    public static void pyramid2(int n){
//        for(int i=0;i<=n;i++){
//            for(int j=0;j<i;j++){
//                System.out.print("  ");
//            }
//            for(int j=0;j<2*(n-i)-1;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }


//    hollow square---------------------------
//
//    public static void hollowsq(int n){
//        for(int i=0;i<n;i++){
//            if(i==0 || i==n-1){
//                for(int j=0;j<n;j++){
//                    System.out.print("* ");
//                }
//            }else{
//                for(int j=0;j<n;j++){
//                    if(j==0 || j==n-1){
//                        System.out.print("* ");
//                    }else{
//                        System.out.print("  ");
//                    }
//                }
//            }
//            System.out.println();
//        }
//    }

//    hollow triangle pattern---------------------
// public static void hollowtri(int n) {
//    for (int i=0;i<n;i++) {
//        for (int j = 0; j<n-i;j++) {
//            System.out.print(" ");
//        }
//        for (int j=0;j<=i;j++) {
//            if (j==0|| j==i || i==n-1) {
//                System.out.print("* ");
//            } else {
//                System.out.print("  ");
//            }
//        }
//        System.out.println();
//    }
//}


//    staircase pattern-----------------------------------

//    public static void staircase(int n){
//        int value=2;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=value;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//            if(i%2==0)value+=2;
//        }
//    }

     public static void XPattern(int n) {
//         using hollow triangle concept------------------------

//         for (int i=n-2;i>=1;i--) {
//             for (int j = 0; j<n-i;j++) {
//                 System.out.print(" ");
//             }
//             for (int j=0;j<=i;j++) {
//                 if (j==0|| j==i || i==n-1) {
//                     System.out.print("* ");
//                 } else {
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//        for (int i=0;i<n-1;i++) {
//            for (int j = 0; j<n-i;j++) {
//                System.out.print(" ");
//            }
//            for (int j=0;j<=i;j++) {
//                if (j==0|| j==i || i==n-1) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

//         best logic--------------------------------

//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                if(i==j || (i+j)==(n-1)){
//                    System.out.print("* ");
//                }else{
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
    }
    public static void main(String args[]){
//        pyramid(4);
//        reversepyramid(4);
//        numberpattern(4);
//        mountain(4);
//        squarepattern(4);
//        righttriangle(4);
//        alphabetic(4);
//        reversealphabetic(4);
//        pyramid2(4);
//        hollowsq(4);
//        hollowtri(5);
//        staircase(6);
//        XPattern(5);
    }
}
