 // 1> square printing
//  public class squarePattern{
//     public static void main(String[] args){
//         int n=5;
//         for(int i=1;i<=n;i++){
//             for(int j=1 ; j<=n; j++){
//                 System.out.print(" * ");
//             }
//             System.out.println();
//         }
//     }
//  }

// 2> hollow square

// public class hollowSquare{
//     public static void main(String[] args) {
//        int n=5;
//        for(int i = 1 ; i<=5 ; i++){
//         for(int j =1; j<= 5 ; j++){
//             if(i==1 || i ==n || j==1 || j==n){
//                 System.out.print("*");
//             }
//             else{
//                 System.out.print(" ");
//             }
//         }
//         System.out.println();
        
//        }
//     }
// }


//3> right triangle pattern 

// public class rightTriangle{
//     public static void main(String[] args) {
//         int n=5;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <=i ; j++) {
//                 System.out.print("*");
                
//             }
//             System.out.println();
            
//         }
//     }
// } 

// 4> inverted triangle

// public class  inverteTriangle{
//     public static void main(String[] args) {
//         int n=5;
//         for (int i = 1; i <=n; i++){
//             for (int j = 1; j <= n - i+1; j++) {

//                 System.out.print("*");
//             }
//             System.out.println();
            
//         }
//     }
// }  

//5> pyramid

// public class pyramid{
//     public static void main(String[] args) {
//         int n=5;

         
//         for (int i = 1; i <=n; i++) {
//                   // print space 
//              for (int j = 1; j <= n-i; j++) {
//                  System.out.print(" ");
//              }
//              // print stars 
//              for (int j =1; j<= (2*i-1); j++) {
//                  System.out.print("*");
//              }
//             System.out.println();
//         }
//     }
// }

// 6> diamond printing

// public class diamondstarPrinting {
//     public static void main(String[] args) {
//         int n=5;
//          // upper half 
//         for (int i = 1; i <=n; i++) {
//             //for space
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");

//             }
//             // for stars
//             for (int j = 1; j <=2*i-1; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
           
//         }
//         // for lower half
//          for(int i= n-1 ;i>=1;i--){
//             //for space
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//          }
//          //for stars
//          for (int j = 1; j <= 2*i-1 ; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
// }
 

// 7> inverted pyramid

// public class invertedStarPyramid{
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=1; i<=n;i++){
//              // space
//             for(int j=1; j<=i-1;j++){
//                 System.out.print(" ");

//             }
             
//             //stars

//             for (int j = 1; j <= 2*(n-i)+1; j++) {
             
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


   // 8 > left half diamond

   // public class leftHandStarDiamond{
   //    public static void main(String[] args) {
   //        int n=5;
   //        for(int i = 1;i<=n;i++){
   //          for(int j=1;j<=i;j++){
   //             System.out.print("*");
   //          }
   //          System.out.println();
   //        }
   //        for(int i= n-1;i>=1;i-- ){
   //          for(int j=1;j<=i;j++){
   //             System.out.print("*");
   //          }
   //          System.out.println();
   //        }
   //    }
   // }


   //  1> square number pattern

   // public class squareNumber{
   //    public static void main(String[] args) {
   //       int n = 5;
   //       for (int i = 1; i<=5; i++){
   //          for(int j= 1 ;j<=n;j++){
   //             System.out.print("1");
   //          }
   //           System.out.println();
   //       }
   //    }
   // }

   //   2> incrementing pattern

   // public class incrementingsquareNumber{
   //    public static void main(String[] args) {
   //       int n = 5;
   //       for (int i = 1; i<=5; i++){
   //          for(int j= 1 ;j<=n;j++){
   //             System.out.print(j + " ");
   //          }
   //           System.out.println();
   //       }
   //    }
   // }

   // 3> right triangle
   // public class rightTriangleNumber{
   //    public static void main(String[] args) {
   //       int n= 5;
   //       for(int i = 1;i<=n;i++){
   //          for(int j= 1;j<=i;j++){
   //             System.out.print(j +" ");
   //          }
   //          System.out.println();
   //       }
   //    }
   // }
 

    //4> inverted number triangle

   //  public class invertedNumberTriangle{
   //    public static void main(String[] args) {
   //       int n=5;
   //       for(int i= 1;i<=n;i++){
   //          for(int j=1;j<= (n-i+1) ; j++){
   //             System.out.print(j +" ");
   //          }
   //          System.out.println();
   //       }
   //    }
   //  }


   // 5>incremented  number diamond

//    public class  incrementNumberDiamond {
//     public static void main(String[] args) {

//         int n = 5;

//         // Upper Half
//         for (int i = 1; i <= n; i++) {

//             // Print number i+2, i times
//             for (int j = 1; j <= i; j++) {
//                 System.out.print((i + 2) + " ");
//             }

//             System.out.println();
//         }

//         // Lower Half
//         for (int i = n - 1; i >= 1; i--) {

//             // Print number i+2, i times
//             for (int j = 1; j <= i; j++) {
//                 System.out.print((i + 2) + " ");
//             }

//             System.out.println();
//         }
//     }
// }

   // sanwich pattern

// public class sandwich {
//     public static void main(String[] args) {

//         int n = 5;

//         // Upper half
//         for (int i = 0; i < n / 2 + 1; i++) {

//             // Print spaces
//             for (int j = 0; j < i; j++) {
//                 System.out.print("  ");
//             }

//             // Print numbers
//             int num = 3 + i;
//             int count = n - 2 * i;

//             for (int j = 0; j < count; j++) {
//                 System.out.print(num + " ");
//             }

//             System.out.println();
//         }

//         // Lower half
//         for (int i = n / 2 - 1; i >= 0; i--) {

//             // Print spaces
//             for (int j = 0; j < i; j++) {
//                 System.out.print("  ");
//             }

//             // Print numbers
//             int num = 3 + i;
//             int count = n - 2 * i;

//             for (int j = 0; j < count; j++) {
//                 System.out.print(num + " ");
//             }

//             System.out.println();
//         }
//     }
// }