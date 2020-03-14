package hashtable;

public class HashTable {

    String[] hashArray;
    int arraySize;
    int size = 0; //counter for number of elements(slots) in hashtable

    public HashTable(int noOfSlots) {


        if (isPrime( noOfSlots )) {
            hashArray = new String[noOfSlots];
            arraySize = noOfSlots;
        } else {
            int primeCount = getNextPrime( noOfSlots ); //primecount is the number of slots but in prime
            hashArray = new String[primeCount];
            arraySize = primeCount;


            System.out.println( "Hash table size given" + noOfSlots + " is not a prime number" );
            System.out.println( "Hash table size changed to: " + primeCount );
        }

    }


    private boolean isPrime(int num) {
        //A prime number is a numeral that is greater than 1 and
        // cannot be divided evenly
        // by any other number except 1 and itself.
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private int getNextPrime(int num) {
        for (int i = num; true; i++) { //it keeps incrementing the i until we find the prime
            if (isPrime( i )) {  //if it is prime
                return i;       //return that new number
            }
        }
    }

    //this will give us the index number that we would like to insert
    private int hashFunc1(String word) {
        int hashVal = word.hashCode();//hashval of that string in numeric

        System.out.println("hashvalue before: " + hashVal);
        hashVal = hashVal % arraySize; //to make the hashval value inscluded in the arraysize not larger than arraysize for example
        System.out.println("hashvalue after: " + hashVal);

        if (hashVal < 0) { //if hashvalue is negative
            hashVal += arraySize;
            System.out.println("hashvalue after if it is negative: " + hashVal);
        }

        return hashVal; //ideal index position we would like to insert or search in
    }

    //now if this hashval is busy, do this func2, and returns step size > 0

    private int hashFunc2(String word) {
        int hashVal = word.hashCode();
        hashVal = hashVal % arraySize;

        if (hashVal < 0) {
            hashVal += arraySize; //incrasing hashval by arraysize
        }

        return 3 - hashVal % 3;  // must be prime numbers and smaller than arraysize

    }


    public void insert(String word) {
        int hashVal = hashFunc1( word );
        int stepSize = hashFunc2( word );

        while (hashArray[hashVal] != null) { //it keeps doing that until we find an empty slot to insert
            hashVal = hashVal + stepSize; //here we using the stepsize to keep incrementing
            hashVal = hashVal % arraySize;
        }
        //when we exit this loop ^^ that means we found that empty slot

        hashArray[hashVal] = word;
        System.out.println( "Inserted word: " + word );
        size++;


    }

    public String find(String word) {
        int hashVal = hashFunc1( word );
        int stepSize = hashFunc2( word );

        while (hashArray[hashVal] != null) {
            if (hashArray[hashVal].equals( word )){
                return hashArray[hashVal];
            }
            hashVal = hashVal + stepSize;
            hashVal = hashVal % arraySize;
        }
        return hashArray[hashVal];

    }


    public void displayTable(){
        System.out.println("Table: ");
        for (int i = 0; i< arraySize ; i++){
            if (hashArray[i] != null){
                System.out.print(hashArray[i] + " ");

            }else {
                System.out.print("* null * ");
            }
            System.out.println("");
        }
    }

}
