public class week2 {

    public static void main(String[] args) {

        circleMetrics();
        distanceToPoint();
        dayOfWeek();
        randomNumber();
        RGBtoCMYK();

    }

    private static void circleMetrics() {
        double R = 4;

        double perimeter = 2 * R * Math.PI;
        double area = Math.pow(R, 2) * Math.PI;
        double surface = 4 * Math.pow(R, 2) * Math.PI;
        double volume = (4.0 / 3.0) * Math.pow(R, 3) * Math.PI;

        System.out.println("R = " + R);
        System.out.println("Circle perimeter = " + perimeter);
        System.out.println("Circle area = " + area);
        System.out.println("Sphere surface = " + surface);
        System.out.println("Sphere volume = " + volume);
    }

    private static void distanceToPoint() {

        int x = 4, y = 7; // Point <x,y>
        int x0 = 0, y0 = 0; //The origin <0,0>

        double dx = x - x0;
        double dy = y - y0;
        double distance = Math.hypot(dx, dy);

        System.out.printf("Point = (" + x + "," + y + ")");
        System.out.printf(" Reference = (" + x0 + "," + y0 + ")%n");
        System.out.println("Euclidean distance = " + distance);
    }

    private static void dayOfWeek() {

        int m = 12;
        int d = 25;
        int y = 2022;

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
        };

        System.out.println("Date = " + d + "." + m + "." + y);
        System.out.println("Day of the week = " + days[d0]);
        System.out.println();
    }

    private static void randomNumber() {

        double sum = 0;
        double min = 1;
        double max = 0;

        System.out.println("Values: ");

        for (int i = 0; i < 5; i++) {
            double v = Math.random();
            System.out.print(v + " ");

            sum += v;
            min = Math.min(min, v);
            max = Math.max(max, v);
        }

        System.out.println();
        System.out.println("Average = " + sum / 5.0);
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }

    private static void RGBtoCMYK() {

        double C = 30, M = 20, Y = 10, K = 0;

        int R = (int)(255 * (1 - C / 100.0) * (1 - K / 100.0));
        int G = (int)(255 * (1 - M / 100.0) * (1 - K / 100.0));
        int B = (int)(255 * (1 - Y / 100.0) * (1 - K / 100.0));

        System.out.println("CMYK = (" + C + ", " + M + ", " + Y + ", " + K + ")");
        System.out.println("RGB = (" + R + ", " + G + ", " + B + ")");
        System.out.println();
    }
}
















