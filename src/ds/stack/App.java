package ds.stack;

public class App {

    public static void main(String[] args) {
        Stack theStack = new Stack( 2 );


        System.out.println(reversedString( "hello" ));



        while (!theStack.isEmpty()){
            long value = theStack.pop();
            System.out.println(value);
        }
    }
    public static String reversedString (String str){
        int stackSize = str.length();
        Stack theStack = new Stack( stackSize );
        for (int j = 0 ; j< str.length(); j++){
            char ch = str.charAt( j );
            theStack.push( ch );
        }
        String result = "";
        while (!theStack.isEmpty()){
            char ch = theStack.pop();
            result = result + ch;
        }
        return result;
    }
}
