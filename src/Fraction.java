public class Fraction{
    private int num;
    private int den;

    public Fraction() {
        num= 0;
        den= 1;
    }
    public Fraction(int n , int d) {
        num = n;
        den = d;
    }

    public void add(Fraction other) {
        this.num = this.num * other.den + other.num * this.den;
        this.den = this.den * other.den;
    }

    public void subtract(Fraction other) {
        this.num = this.num * other.den - other.num * this.den;
        this.den = this.den * other.den;
    }

    public void multiply(Fraction other) {
        this.num = this.num * other.num ;
        this.den = this.den * other.den;
    }

    public int getNumerator() {
        return num;
    }

    public int getDenominator() {
        return den;
    }

    public void setNumerator(int x) {
        num = x;
    }

    public void setDenominator(int x) {
        den = x;
    }

    public String toString() {
        return num+ "/"+den;
    }
}
