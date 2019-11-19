public void hopscotch(int n) {
    int level = 0;
    int count = 1; 
    while (level < n) {
        System.out.println("   " + count);
        count++;
        System.out.print(count + "     ");
        count++;
        System.out.println(count);
        count++;
        level++;
    }
    System.out.println("   " + count);
}
