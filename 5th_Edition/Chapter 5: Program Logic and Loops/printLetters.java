public static void printLetters(String text) {
    if (text.length() == 0)
        return;
    for (int i = 0; i < text.length()-1; i++) {
        System.out.print(text.charAt(i) + "-");
    }
    System.out.println(text.charAt(text.length()-1));   // to end the line of output
}
