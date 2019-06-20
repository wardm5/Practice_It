//  Returns the "Manhattan distance" between the current Point object and the given other Point object.

public int manhattanDistance(Point other) {
    int x = Math.abs(other.x - this.x);
    int y = Math.abs(other.y - this.y);
    return x + y;
}
