package algo.recursion;

public class App {
    public static void main(String[] args) {
        //  reduceByOne( 10 );

        //System.out.println(recursicveLinearSearch( new int[]{ 4 , 48 , 425, 6, 7, 2 , 0} , 0 , 48 ));
        System.out.println( recursiveBinarySearch( new int[]{4, 48, 425, 6, 7, 2, 0}, 0, 6, 4 ) );
    }

    public static void reduceByOne(int n) {
        if (n != 0) {
            reduceByOne( n - 1 );
        }
        System.out.println( "Completed  call " + n ); // vip
    }

    public static int recursicveLinearSearch(int[] a, int i, int x) {
        int n = a.length;
        if (i > n - 1) {
            return -1;
        } else if (a[i] == x) {
            return i;
        } else {
            System.out.println( "index at : " + i );
            return recursicveLinearSearch( a, i + 1, x );
        }
    }

    public static int recursiveBinarySearch(int[] a, int p, int r, int x) {


        if (p > r) {
            return -1;
        }
        int q = (p + r) / 2;

        if (x < a[q]) {
            return recursiveBinarySearch( a, p, q - 1, x );

        } else if (x > a[q]) {
            return recursiveBinarySearch( a, q + 1, r, x );
        } else if (x == a[q]) {
            return q;
        }
        return -1;
    }
}

