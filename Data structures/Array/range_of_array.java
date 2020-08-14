/* Find the range of the array.
Range means the difference between the maximum and minimum element in the array.
input :  5
        -1 5 -3 91 58
output : 94 [91-(-3)] 
*/

import java.util.Scanner;
class range_of_array{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[] = new int[size];
        int i;
        for(i = 0; i<size; i++){
            arr[i] = s.nextInt();
        }

        int min = arr[0];
        for (i=0; i<size; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }

        int max = arr[0];
        for (i=0; i<size; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

        int range = max - min;
        System.out.println("The range of the array is :" + range);
    }
}
