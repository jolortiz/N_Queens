// Queens.java
// Jonathan Ortiz
// jolortiz
// A program that solves the n-Queens problem.

class Queens{

   public static void main(String[] args){
      int fact, c=0;
      if(args.length>2 || args.length<1){
          quit();
      }
      if(args.length == 1){
         try{
         int n = Integer.parseInt(args[0]);
         int[] A = new int[n+1];
         for(int i=n; i>0; i--){
            A[i] = i;
         }
         fact = factorial(n);
         for(int i=1; i<fact; i++){
            if(! isSolution(A)){
               nextPermutation(A);
            }else{
               nextPermutation(A);
               c++;
            }
         }
         System.out.println(n+"-Queens has "+c+" solutions");
         System.exit(0);
         }catch(NumberFormatException e){
         quit();
         }
      }

      if(args.length == 2){
         if(args[0].equals("-v")){
            try{
               int n = Integer.parseInt(args[1]);
               int A[] = new int[n+1];
               for(int i =n; i>0; i--){
                  A[i] = i;
               }
               fact = factorial(n);
               for(int i=0; i<fact; i++){
                  if(! isSolution(A)){
                     nextPermutation(A);
                  }else{
                     printarray(A);
                     nextPermutation(A);
                     c++;
                  }
               }
               System.out.println(n+"-Queens has "+c+" soultions");
            }catch(NumberFormatException e){
            quit();
            }
         }else{ quit();
         }
      }else{ quit();
      }
   }

   static boolean isSolution(int[] C){
      for(int i=1; i<C.length-1; i++){
         for(int j=i+1; j<C.length; j++){
            if(Math.abs(C[i]-C[j]) == Math.abs(i-j)){
            return false;
            }
         }
      }
      return true;
   }

   static void nextPermutation(int[] B){
      int index = B.length-2;
      int pivot = -1;
      int successor = -1;
      for(int i=index; i>0; i--){
         if(B[i] < B[i+1]){
            pivot = i;
            break;
         }
      }
      if(pivot<0){
         reversearray(B, 1);
         return;
      }
      for(int i=index+1; i>0; i--){
         if(B[i]>B[pivot]){
            successor = i;
            break;
         }
      }
      swap(B, pivot, successor);
      reversearray(B, pivot);
      return;
   }

   static void reversearray(int[] Z, int index){
      int j = Z.length-1;
      for(int i = index+1; i<j; i++){
         swap(Z, i, j);
         j--;
      }
      return;
   }

   static void swap(int[] Q, int i, int j){
      int temp = Q[i];
      Q[i] = Q[j];
      Q[j] = temp;
   }

   static void printarray(int[] P){
         System.out.print("(");
      for(int i=1; i<P.length; i++){
         if(i == P.length-1){
            System.out.print(P[i]+")");
         }else{
            System.out.print(P[i]+", ");
         }
      }
      System.out.println();
   }

   static int factorial(int x){
      int product = 1, i = 1;
      while(i<=x){
         product *= i;
         i++;
      }
      return product;
   }

   static void quit(){
      System.out.println("Usage: Queens [-v] number");
      System.out.println("Option:  -v   verbose output, print all solution");
      System.exit(0);
   }

}

