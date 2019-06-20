//  Returns the slope of the line drawn between this Point and the given other Point.

public double slope(Point other) {
    if (other.x == this.x)
        throw new IllegalArgumentException();
    return (double) (other.y - this.y) / (double) (other.x - this.x);
}
