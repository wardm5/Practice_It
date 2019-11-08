public void arrayBugs() {
  int[] first = new int[2];
  first[0] = 3;
  first[1] = 7;
  int[] second = new int[2];
  second[0] = 3;
  second[1] = 7;

  // print the array elements
  System.out.println("first  = [" + first[0] + ", " + first[1] + "]");
  System.out.println("second = [" + second[0] + ", " + second[1] + "]");

  // see if the elements are the same
  if (first[0] == second[0] && first[1] == second[1]) {
      System.out.println("They contain the same elements.");
  } else {
      System.out.println("The elements are different.");
  }
}
