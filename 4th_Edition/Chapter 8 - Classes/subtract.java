//  Subtracts the given amount of time from this time span.

public void subtract(TimeSpan span) {
    if (span.minutes > this.minutes) {
        this.hours -= span.hours;
        this.hours -= 1;
        this.minutes = this.minutes - span.minutes + 60;
    } else {
        add(-span.hours, -span.minutes);
    }
}
