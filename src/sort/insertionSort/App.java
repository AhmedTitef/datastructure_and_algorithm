package sort.insertionSort;

public class App {
    public static void main(String[] args) {

        int[] myArray = insertionSort( new int[]{19, 8, 3, 15, 87, 12, 99} );
        for (int i = 0; i < myArray.length; i++) {
            System.out.println( myArray[i] );
        }
    }

    public static int[] insertionSort(int[] a) {
        int element;
        for (int i = 1; i < a.length - 1; i++) {

            element = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > element) { //j>=0 because we dont want j to go negative when we decrement

                a[j+1] = a[j]; // does swap
                j--;//decrements to check the previous number
            }

            a[j+ 1] = element;


        }
        return a;
    }

}
