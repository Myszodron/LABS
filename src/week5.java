import java.util.*;
import java.util.Arrays;

public class week5 {
    public static void main(String[] args) {
    PasswordChecker();
    PunctuationCounter();
    GamblersRuin();
    Crossover();
    TokenLengthDist();
    DecimalToBinaryConversion();
}
    private static void printBits(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
    private static void printReverse(int[] arr, int len) {
        for (int i = len - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    private static int loopUntil(boolean breakOnMatch) {
        return 0;
    }

    //Exercise 1
    private static void PasswordChecker() {
        String correct = "Juki";
        String[] attempts = {"mango", "Juki", "horses"};

        int logs = 0;
        for (String input : attempts) {
            if (logs == 5) break;
            if (input.equals(correct)) {
                System.out.println("Access granted!");
                return;
            }
            System.out.println("Access denied!");
            logs++;
        }
        System.out.println("Log-in disabled, too many attempts");
    }

    // Exercise 2
    private static void PunctuationCounter() {
        String s = "Hi, is my cat here? His name is Juki and he likes to eat a lot!";
        System.out.println("Sentence = "  + s + " ");
        System.out.println("Sentence statistics:");

        int period = 0, comma = 0, question= 0, exclamation = 0, colon = 0, semicolon = 0, other = 0;
        for (char c : s.toCharArray()) {
            switch (c) {
                case '.' -> period++;
                case ',' -> comma++;
                case '?' -> question++;
                case '!' -> exclamation++;
                case ':' -> colon++;
                case ';' -> semicolon++;
                default -> other++;
            }
        }

        System.out.println("period = " + period);
        System.out.println("comma = " + comma);
        System.out.println("question mark = " + question);
        System.out.println("exclamation = " + exclamation);
        System.out.println("colons = " + colon);
        System.out.println("semicolon = " + semicolon);
        System.out.println("other = " + other);
    }

    //Exercise 3
    private static void GamblersRuin() {
        int win = 0;
        for (int t = 0; t < 1000; t++) {
            int stake = 500;

            while (stake > 0 && stake < 2500) {
                stake += (Math.random() < 0.5) ? 1 : -1;
            }
            if (stake == 2500) win++;
        }
        System.out.println("Gambler wins " + win + " trials out of 1000");
    }

    //Exercise 4
    private static void Crossover() {
        int n = 10;

        int[] c1 = new int[n];
        int[] c2 = new int[n];
        Random r = new Random();

        for (int i = 0; i < n; i++) {
            c1[i] = r.nextInt(2);
            c2[i] = r.nextInt(2);
        }

        int point = r.nextInt(n);

        int[] out1 = Arrays.copyOf(c1, n);
        int[] out2 = Arrays.copyOf(c2, n);

        for (int i = point; i < n; i++) {
            int temp = c1[i];
            c1[i] = c2[i];
            c2[i] = temp;
        }

        System.out.print("Chromosome 1: ");
        printBits(c1);
        System.out.print("Chromosome 2: ");
        printBits(c2);
        System.out.println("Cross point: " + point);
        System.out.print("Offspring 1: ");
        printBits(out1);
        System.out.print("Offspring 2: ");
        printBits(out2);
    }

    //Exercise 5
    private static void TokenLengthDist() {
        String sentence = "I am writing a program by the name of TokenLengthDist. This is an interesting problem to solve. END";
        String[] tokens = sentence.split(" ");

        int[] dist = new int[17];

        for (String t : tokens) {
            if (t.equals("END")) break;
            int l = t.length();
            dist[Math.min(l, 16)]++;
        }

        int[] copy = Arrays.copyOf(dist, dist.length);

        System.out.println(sentence.replace(" END", ""));

        for (int i = 1; i <= 16; i++) {
            System.out.println(i + ": " + copy[i]);
        }
    }

    //Exercise 6
    private static void DecimalToBinaryConversion() {
        int n = 13;

        if (n == 0) {
            System.out.println("Binary= 0");
            return;
        }

        int[] bits = new int[Integer.SIZE];
        int idx = 0;

        while (n > 0) {
            bits[idx++] = n % 2;
            n /= 2;
        }

        System.out.print("Binary= ");
        printReverse(bits, idx);
    }

}
