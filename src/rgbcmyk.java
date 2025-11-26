// Exercise 5
public class rgbcmyk {
    static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("CMYK to RGB <C> <M> <Y> <K>");
            return;
        }
        double C = Double.parseDouble(args[0]);
        double M = Double.parseDouble(args[1]);
        double Y = Double.parseDouble(args[2]);
        double K = Double.parseDouble(args[3]);


        double c = C / 100.0;
        double m = M / 100.0;
        double y = Y / 100.0;
        double k = K / 100.0;


        double r = 255 * (1 - c) * (1 - k);
        double g = 255 * (1 - m) * (1 - k);
        double b = 255 * (1 - y) * (1 - k);

        int R = (int)Math.round(r);
        int G = (int)Math.round(g);
        int B = (int)Math.round(b);

        System.out.printf("RGB = (%d, %d, %d)%n", R, G, B);
    }
}
