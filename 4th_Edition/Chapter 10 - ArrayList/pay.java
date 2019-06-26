/**
  *  Write a method named pay that accepts a real number for a TA's salary and an integer 
  *  for the number of hours the TA worked this week, and returns how much money to pay 
  *  the TA. For example, the call pay(5.50, 6) should return 33.0.
  */

public double pay(double rate, int hours) {
    if (hours > 8)
        return (rate * 8) + (rate * 1.5 * (hours - 8));
    return rate * hours;
}
