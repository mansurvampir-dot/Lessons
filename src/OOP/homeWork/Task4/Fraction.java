package OOP.homeWork.Task4;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть нулем");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        s();
    }

    private int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private void s() {
        int commonDivisor = gcd(numerator, denominator);
        this.numerator /= commonDivisor;
        this.denominator /= commonDivisor;
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    public Fraction add(Fraction other) {
        int newNum = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDen = this.denominator * other.denominator;
        return new Fraction(newNum, newDen);
    }

    public Fraction subtract(Fraction other) {
        int newNum = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDen = this.denominator * other.denominator;
        return new Fraction(newNum, newDen);
    }

    public Fraction multiply(Fraction other) {
        return new Fraction(this.numerator * other.numerator, this.denominator * other.denominator);
    }

    public Fraction divide(Fraction other) {
        return new Fraction(this.numerator * other.denominator, this.denominator * other.numerator);
    }

    public String toString() {
        if (denominator == 1) return String.valueOf(numerator);
        return numerator + "/" + denominator;
    }
}

