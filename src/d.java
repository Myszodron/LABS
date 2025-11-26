// Exercise 2
public class d {
    static void main(String[] args) {
        if (args.length < 2 || args.length > 4) {
            System.out.println("Distance to point");
            return;
        }
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        // (x,y) = (4,7)

        int x0 = (args.length >= 3) ? Integer.parseInt(args[2]): 0;
        int y0 = (args.length == 4) ? Integer.parseInt(args[3]): 0;
        //The origin = (0,0)

        double tx = x - x0;
        double ty = y - y0;
        double distance = Math.hypot( tx, ty);

        System.out.printf("Point=(" + x + "," + y + "), Reference=(" + x0 + "," + y0 + ")%n");
        System.out.printf("Euclidean distance =" + distance);

    }
}