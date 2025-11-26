// Exercise 4
 class numbers {
    static void main(String[] args) {
        double[] j = new double[5];
        double sum = 0.0;

        for (int k = 0; k < 5; k++) {
           j[k] = Math.random();
            sum += j[k];
        }

        double min = j[0];
        double max = j[0];

        for (int k = 1; k < 5; k++) {
            min = Math.min(min, j[k]);
            max = Math.max(max, j[k]);
        }

        System.out.println("Values:" + j[0]+ " " + j[1] + " " + j[2] + " " + j[3] + " " + j[4] );
        System.out.println("Average =" + sum / 5.0);
        System.out.println("Min =" + min);
        System.out.println("Max =" + max);
    }
}