// Write a program to reverse an array.

//Solution : Swap the elements at te start and end index of the array,
then increment thestart index and decrement te end index.
Then again swap both the indices and continue the loop till 
    (start<end)

import java.util.Scanner;
class reverse_array{
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner s = new Scanner(System.in);
        int i = 0;
        //Input Elements into the array.
        System.out.println("ENTER VALUES IN THE ARRAY:");
        for (i=0; i<5; i++){
            arr[i] = s.nextInt();
        }
        
        System.out.println("The original of the array is:");
        for(i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + "  ");
        }

        int temp;
        int start = 0;
        int end = arr.length-1;
        //loop through all the elements and swap the start and end elements.
        while(start<end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }    

        System.out.println("\n The reverse of the array is:");
        for(i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + "  ");
        }
    }
}