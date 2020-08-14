import java.util.Scanner;
class Array {
    public static void main(String[] args) {
        int arr[] = new int[5];   //creates an array of size 5 to storr integer values
        Scanner s = new Scanner(System.in);
        //Input into a array from user
        System.out.println("Enter the elements in the array ::");
        for(int i = 0; i<5; i++){
            arr[i] = s.nextInt();
        }
        //Display the elements of the array
        for(int i = 0; i<5; i++){
            System.out.println("The element at " + (i+1) + " is " + arr[i]);
        }
    }
}