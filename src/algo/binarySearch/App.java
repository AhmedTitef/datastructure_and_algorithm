package algo.binarySearch;

public class App {
    public static void main(String[] args) {
        System.out.println(binarySearch( new int [ ]{ 1,2,4,5,6,8} , 5 ));
    }

    public static int binarySearch ( int [] a , int x){
        int p = 0 ;
        int n = a.length;
        int r  = n - 1;
        int q;
        while (p <= r){
            q = (p+r)/2;
            if(a[q] == x){
                return q;
            }
            else if(x < a[q]){
                r = q-1;

            }
            else if(x > a[q]){
                p = q+1;
            }



        }
        return  -1;

    }
}
