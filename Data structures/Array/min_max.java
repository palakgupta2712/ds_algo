//Find the maximum and minimum element in the array
import java.util.Scanner;
class min_max{
    public static void main(String[] args) {
        int arr[] = new int[5]; //Creates an array of size = 5;
        Scanner s = new Scanner(System.in);
        //Input from the user
        System.out.println("Enter the elements: ");
        for(int i = 0; i<5; i++){
            arr[i] = s.nextInt();
        }
        int i = 0;
        /* Min element in an array- 
         loop through the array and compare each element of the array with the 'min',
         if any element is less than min i.e.{ if(arr[i]<min) } then store that element in 'min',
         then compare other elemens with the new 'min' value. */
        
        int min = arr[0];
        for(i = 0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i]; 
            }
        }
        System.out.println("The minimum element is : " + min);

        /* Max element in an array:-
        loop through the array and compare each element of the array with the 'max',
        if any element is greater than max i.e.{ if(arr[i]>max) } then store that element in 'max',
        then compare other elemens with the new 'max' value. */
        int max = arr[0];
        for(i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("The maximum element is : " + max);
    }
}