//  Write a method called quadratic that solves quadratic equations and prints their roots. 

public void quadratic(int a, int b, int c) {
    double help = helper(a,b,c);
    System.out.println("First root = " +( (-b + help)/ (2 * a) ) );
    System.out.println("Second root = " +( (-b - help)/ (2 * a) ) );
}
public double helper(int a, int b, int c) {
    return Math.sqrt(b*b - (4*a*c));
}
