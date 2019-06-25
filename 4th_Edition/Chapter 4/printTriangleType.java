//  Write a method called printTriangleType that accepts three integer arguments representing the lengths of the sides of a triangle and prints what type of triangle it is. 

public void printTriangleType(int a, int b, int c) {
    if (a == b && b == c) {
        System.out.println("equilateral");
    } else if (a == b || a == c || c == b) {
        System.out.println("isosceles");
    } else {
        System.out.println("scalene");
    }   
}
