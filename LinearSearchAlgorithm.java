public class LinearSearchAlgorithm {
    public static void main(String[] args){
        char[] arr = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        char search_for = 'e';
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search_for){
                System.out.println("Found at index: " + i);
                break;
            }
        }
    }
}
