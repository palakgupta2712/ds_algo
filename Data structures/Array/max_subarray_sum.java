import java.io.*;
class max_subarray_sum{
    public static void main(String[] args) {
        int arr [] = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("The sum of subarray is :: " + subarray_sum(arr));
    }
    

    static int subarray_sum(int arr[]) {
        int start=0;
        int  end = 0;
        for(int i = 0; i<arr.length; i++){
            end = end + arr[i];
            if(start < end)
                start = end;
            if(end < 0)
                end = 0;
        }
        return start;
        
    }
}

