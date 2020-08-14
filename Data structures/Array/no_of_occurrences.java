/*Given an number n. Find the number of occurrences of n in the array
input : 3
        11
        1 2 3 3 5 3 6 8 3 4 5 
output : 4        
*/

import java.util.Scanner;
class no_of_occurrences{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        /* System.out.println("Enter the number"); */
        int n = s.nextInt();
        /* System.out.println("Enter the size of the array"); */
        int size = s.nextInt();

        int arr[] = new int[size];
        int i, count = 0;
        /* System.out.println("Enter the elements into the array : "); */
        for(i=0; i<size; i++){
            arr[i] = s.nextInt();
        }

        for(i=0; i<size; i++){
            if(arr[i] == n){
                count += 1;
            }
        }
        /* System.out.println("The no of occurrences of " + n + "is" + count); */
        System.out.println(count);
    }
}