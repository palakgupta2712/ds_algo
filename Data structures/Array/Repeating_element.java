/* https://www.geeksforgeeks.org/find-first-repeating-element-array-integers/ */

import java.util.Scanner;
import java.io.*;
class Repeating_element{

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[] = new int[size];
        int i,j = 0 ;

        for(i = 0; i<size; i++){
            arr[i] = s.nextInt();
        }

        for(i = 0; i<arr.length; i++){
            for(j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j])
                {
                   System.out.println(arr[i]);
                   return;
                }
            }
        }

    }
}