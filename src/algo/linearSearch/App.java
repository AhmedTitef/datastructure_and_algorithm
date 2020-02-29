package algo.linearSearch;

public class App {
    public static void main(String[] args) {


    }
   public static int LinearSearch(int [] a , int x){
        int answer = -1;
        int n = a.length;
        for (int i = 0 ; i < n ; i++ ){
            if (a [i] == x){
                return  i;
            }
        }
        return answer;
    }
}
