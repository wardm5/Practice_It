public void printAverage(Scanner scan) {
    System.out.print("Type a number: ");
    int num = scan.nextInt();
    int count = 0;
    int sum = 0;
    if (num < 0)
        return;
    while (num >= 0) {
        sum += num;
        count++;
        System.out.print("Type a number: ");
        num = scan.nextInt();
    }
    System.out.println("Average was " + (double) sum / count);
}
