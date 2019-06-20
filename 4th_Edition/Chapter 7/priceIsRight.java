//  Method accepts an array of integers bids and an integer price as parameters. The method returns the element in the bids array that is closest in value to price without being larger than price. 

int priceIsRight(int[] arr, int price) {
    int result = -1;
    for (int i = 0; i < arr.length; i ++) { 
        if (arr[i] <= price && arr[i] > result) {
            result = arr[i];
        }
    }
    return result;
}
