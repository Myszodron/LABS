// Exercise 1
public class Main {
    static void main(String[] args) {
        if (args.length > 1) {
            System.out.println("Sphere and circle metrics ");
            return;
        }
        double R = Double.parseDouble(args[0]);
        double perimeter = 2 * R * Math.PI;
        double area = Math.pow(R, 2) * Math.PI;
        double surface = 4 * Math.pow(R, 2) * Math.PI;
        double volume = (4.0 / 3.0) * Math.pow(R, 3) * Math.PI;

        System.out.println("R=" + R);
        System.out.println("Circle perimeter=" + perimeter);
        System.out.println("Circle area=" + area);
        System.out.println("Sphere surface=" + surface);
        System.out.println("Sphere volume=" + volume);
    }
}




