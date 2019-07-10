/*
    Write a method named stretch that accepts an array of integers as a parameter and returns a new array twice as 
    large as the original, replacing every integer from the original array with a pair of integers, each half the 
    original. If a number in the original array is odd, then the first number in the new pair should be one higher 
    than the second so that the sum equals the original number. For example, if a variable named list refers to an
    array storing the values {18, 7, 4, 24, 11}, the call of stretch(list) should return a new array 
    containing {9, 9, 4, 3, 2, 2, 12, 12, 6, 5}. (The number 18 is stretched into the pair 9, 9, the number 7 is 
    stretched into 4, 3, the number 4 is stretched into 2, 2, the number 24 is stretched into 12, 12 and the number 
    11 is stretched into 6, 5.)
 */

public int[] stretch(int[] arr) {
    int[] result = new int[arr.length * 2];
    int index = 0;
    for (int i = 0; i < arr.length; i++) {
        int a = arr[i] / 2;
        int b = arr[i] - a;
        result[index] = b;
        result[index+1] = a;
        index += 2;
    }
    return result;
}
