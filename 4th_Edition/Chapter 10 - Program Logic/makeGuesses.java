public void makeGuesses() {
    Random rand = new Random(50);
    int random = rand.nextInt() + 1;
    int num = 0;
    while (random <= 48) {
        num++;
        System.out.println("guess = " + random);
        random = rand.nextInt() + 1;
    }
    System.out.println("guess = " + random);
    System.out.println("total guesses = " + num);
}
