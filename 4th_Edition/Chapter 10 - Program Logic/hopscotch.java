public void hopscotch(int a) {
    System.out.println("   1");
    if (a <= 0) 
        return;
    int count = 2;
    for (int i = 0; i < a; i++) {
        System.out.println(count + "     " + (count + 1));
        count += 2;
        System.out.println("   " + count);
        count += 1;
        
    }
}
