package Algorithms;

public class BinarySearchAlgorithm {
    public static void main(String[] args){
        int[] sorted_arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int search_for = 3;
        int low = sorted_arr[0];
        int high = sorted_arr[sorted_arr.length-1];

        while (low <= high){
            int mid_of_array = (high + low) / 2;
            if ( mid_of_array < search_for ) {
                low = mid_of_array + 1;
            } else if ( mid_of_array == search_for ) {
                System.out.println(search_for + " found at index: " + mid_of_array + ".");
                break;
            } else {
                high = mid_of_array - 1;
            }
        } // while
        if (low > high) {
            System.out.println(search_for + " isn't present in the list.\n");
        }

    } // main()
}
