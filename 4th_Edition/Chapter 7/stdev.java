// Method takes in an array and calculates the standard devation of the array (using a helper for average). O(n) run-time. 

public static double stdev(int[] array) {
    double average = average(array);
    System.out.println(average);
    int count = array.length;
    double sum = 0;
    for (int i = 0; i < array.length; i++) {
        sum = sum + (array[i] - average) * (array[i] - average);
    }
    double result = sum / (count - 1);
    return Math.sqrt(result);
}


static double average(int[] array) {
    int sum = 0;
    int count = array.length;
    for (int i = 0; i < count; i ++) {
        sum = sum + array[i];
    }
    return (double) sum / count;
}
