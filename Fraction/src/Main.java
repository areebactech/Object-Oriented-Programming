class Fraction {
    private int numerator;
    private int denominator;

    // Default constructor
    public Fraction() {
        this.numerator = 0;
        this.denominator = 1; // Avoid division by zero
    }

    // Parameterized constructor
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Denominator cannot be zero.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        simplify(); // Reduce the fraction
    }

    // Setters
    public void setNumerator(int numerator) {
        this.numerator = numerator;
        simplify();
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Denominator cannot be zero.");
        }
        this.denominator = denominator;
        simplify();
    }

    // Getters
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    // Simplify fraction using GCD
    private void simplify() {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;

        // Keep denominator positive
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    // Find GCD using Euclidean algorithm
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

    // Display function
    public void display() {
        System.out.println(numerator + "/" + denominator);
    }

    // Equals method to check if two fractions are identical
    public boolean equals(Fraction other) {
        return this.numerator == other.numerator && this.denominator == other.denominator;
    }

    // Main method to test the class
    public static void main(String[] args) {
        Fraction f1 = new Fraction(2, 4);
        Fraction f2 = new Fraction(1, 2);
        Fraction f3 = new Fraction(3, 4);

        System.out.print("Fraction 1: ");
        f1.display();
        System.out.print("Fraction 2: ");
        f2.display();
        System.out.print("Fraction 3: ");
        f3.display();

        // Check equality
        System.out.println("f1 equals f2: " + f1.equals(f2)); // true
        System.out.println("f1 equals f3: " + f1.equals(f3)); // false
    }
}
