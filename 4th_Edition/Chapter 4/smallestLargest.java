//  Write a method named smallestLargest that asks the user to enter numbers, then prints the smallest and largest of all the numbers typed in by the user. 

public void smallestLargest() {
    Scanner scan = new Scanner(System.in);
    System.out.print("How many numbers do you want to enter? ");
    int a = scan.nextInt();
    int large = Integer.MIN_VALUE;
    int small = Integer.MAX_VALUE;
    for (int i = 1; i <= a; i++) {
        System.out.print("Number " + i + ": ");
        int temp = scan.nextInt();
        if (temp > large)
            large = temp;
        if (temp < small) 
            small = temp;
    }
    System.out.println("Smallest = " + small);
    System.out.println("Largest = " + large);
}
