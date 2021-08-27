/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Niko
 */
public class bruh {
    public static int search(int B[], int A){

         for (int i = 0; i < B.length;i++) 
             if (B[i] == A){
             return i;
             }
             return -1;
     }
     public static void main(String[] args){

         int B[] = new int [10];
         int A;
         int C = 15;
         System.out.println("The number we need to find: "+ C);
         System.out.println("Code Initializing...");
        for (int k = 0; k < B.length;k++) {
            A = (int) (Math.random() * 50);
            int result = search(B,A);
          while (result != -1){
                A = (int) (Math.random() * 50);
                result = search(B,A);
            }
            B[k] = A;
            System.out.println(B[k]);
         }
        int result = search(B, C);

  if (result == -1)
    System.out.print("Element not found");
  else
    System.out.print("Element found at index: " + result);
     }
}

