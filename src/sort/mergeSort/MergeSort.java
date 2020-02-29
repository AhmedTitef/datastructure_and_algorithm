package sort.mergeSort;

public class MergeSort {
    public static void sort(int inputArray[], int start, int end) {
        if (end <= start) {
            return;
        }

        int mid = (start + end) / 2;
        sort( inputArray, start, mid );
        sort( inputArray, mid + 1, end );
        merge( inputArray, start, mid, end );

    }

    public static void merge(int inputArray[], int start, int mid, int end) {
        int tempArray[] = new int[end - start + 1];

        // index counter for the left side of the array
        int leftSlot = start; //i
        //index counter for the right side of the array
        int rightSlot = mid + 1; // j

        int k = 0;

        while (leftSlot <= mid && rightSlot <= end) {
            if (inputArray[leftSlot] < inputArray[rightSlot]) {
                tempArray[k] = inputArray[leftSlot];
                leftSlot = leftSlot + 1;

            } else {
                tempArray[k] = inputArray[rightSlot];
                rightSlot++;
            }
            k = k + 1;
        }
// when it gets to here that means the above lopp
// has completed so the right and left side of the
// subarray can be considered sorted

        // if (inputArray[leftSlot] < inputArray[rightSlot]) {
        //                tempArray[k] = inputArray[leftSlot];
        //                leftSlot = leftSlot + 1;

        //if this above code only was excuted not the right slot,
        // the means temporary will only have the left =slot component only
        // and right side must be sorted already

        if (leftSlot <= mid) {
            // consider the right side done being sorted from the above code,
            // then left must be sorted already
            while (leftSlot <= mid) {
                tempArray[k] = inputArray[leftSlot];
                leftSlot++;
                k++;
            }
        } else if (rightSlot <= end) {
            while (rightSlot <= end) {
                tempArray[k] = inputArray[rightSlot];
                rightSlot = rightSlot + 1;
                k = k + 1;
            }
        }
        //
        //copy over the temp array into the appropitate slot of input array
        for (int i = 0 ; i <tempArray.length ; i++ ){
            inputArray[start +i] = tempArray[i];
        }
    }


}
