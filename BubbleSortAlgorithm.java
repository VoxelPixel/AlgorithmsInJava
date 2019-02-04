package Algorithms;

public class BubbleSortAlgorithm {

    public static void main(String[] args){
        int[] unsortedArr = {8, 1, 6, 9, 5, 4, 2, 7, 0, 3};
        int arrLength = unsortedArr.length;

        int temp = 0;
        for (int i = 0; i < arrLength; i++) {
            for (int j = 1; j < arrLength-i; j++) {
                if(unsortedArr[j-1] > unsortedArr[j]){
                    //swap elements
                    temp = unsortedArr[j-1];
                    unsortedArr[j-1] = unsortedArr[j];
                    unsortedArr[j] = temp;
                }
            } // inner for
        } // for

        for (int i = 0; i < unsortedArr.length; i++) {
            System.out.print(unsortedArr[i] + " ");
        }
    }
}
