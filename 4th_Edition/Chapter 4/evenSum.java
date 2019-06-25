//  Write a method named evenSum that prompts the user for many integers and print the total even sum and maximum of the even numbers.

void evenSum() {
    Scanner scan = new Scanner(System.in);
    System.out.print("how many integers? ");
    int start = scan.nextInt();
    int sum = 0;
    int max = 0;
    for (int i = 0; i < start; i++ ) {
        System.out.print("next integer? ");
        int temp = scan.nextInt();
        if (temp % 2 == 0) {
            sum = temp + sum;
            if (temp > max) {
                max = temp;
            }
        }
    }
    System.out.println("even sum = " + sum);
    System.out.print("even max = " + max);
}
