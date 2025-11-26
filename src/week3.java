// Exercise 1
public class week3 {
    static void main(String[] args) {
        System.out.println("Fair coin flip : " + (Math.random() < 0.5 ? "Heads" : "Tails"));
    }
}

// Exercise 2
class w3 {
    static void main(String[] args) {
        int a = 2;
        int b = -8;
        int c = 5;


        System.out.println(" Equation: " + a + "x^2" + b + "+x" + c + "=0");

        double delta = (Math.pow(b, 2) - 4 * a * c);
        double r1 = (-b + Math.sqrt(delta)) / (2 * a);
        double r2 = (-b - Math.sqrt(delta)) / (2 * a);

        if (delta < 0) {
            System.out.println("Has no real roots");
        } else if (delta == 0) {
            System.out.println("Has one root:" + (-b / (2 * a)));
        } else {
            System.out.println("Has two roots: " + r1 + " and " + r2);
        }
    }
}
//Exercise 3
class w4 {
    static void main(String[] args) {
        int x = 1;
        int y = 5;
        int z = 6;

        System.out.println("Sides: a=" +x + ", b=" + y + ", c=" + z);

        if (x + y > z && x + z >y && y + z > x) {
            double sp = (x + y + z) / 2.0;
            double area = Math.sqrt(sp * (sp - x) * (sp - y) * (sp - z));

            System.out.println("Triangle area: " + area);
        } else {
            System.out.println("It is not possible to construct a triangle with the provided data");
        }

    }
}
// Exercise 4
class tax {
    static void main(String[] args) {
        double income = 75000, tax;

        if (income <= 2500) {
            tax = 0.15 * income;
        } else if (income <= 50000) {
            tax = 3750 + 0.28 * (income - 25000);
        } else if (income <= 75000) {
            tax = 10750 + 0.31 * (income - 50000);
        } else
            tax = 18500 + 0.40 * (income - 75000);

        System.out.println("Tax = " + tax + "$");
    }
}
//Exercise 5
class calendar {
    static void main(String[] args) {
        int year = 2015;
        boolean leap = (year % 4 == 0 && year % 100 == 0) || (year % 400 == 0);

        System.out.println(year);
        System.out.println( leap ? "Is a leap year" : "Is not a leap year");
    }
}
// Exercise 6
    class bmi {
    static void main(String[] args) {
        double mass = 82;
        double height = 1.82;
        System.out.println("Mass: " + mass + " kg");
        System.out.println("Height: " + height + " m");

        double BMI = mass / Math.pow(height, 2);

        if (BMI < 18.5) {
            System.out.println("Underweight");
        } else if (BMI < 25) {
            System.out.println("Normal");
        } else if (BMI < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}

