//  Scales this time span by the given factor. 

public void scale(int factor) {
    if (factor == 0) {
        this.hours = 0;
        this.minutes = 0;
    }
    int tempHours = this.hours;
    int tempMinutes = this.minutes;
    for (int i = 0; i < factor - 1; i++) {
        add(tempHours, tempMinutes);
    }
}
