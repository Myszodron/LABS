public class Week4Exercises {
    public static void main(String[] args) {

        week41.run();
            System.out.println();
        week42.run(new String[]{"12"});
            System.out.println();
        week43.run(new String[]{"20"});
            System.out.println();
        week44.run(new String[]{"Juki"});
            System.out.println();
        week45.run(new String[]{"Juki"});
            System.out.println();
        week46.run(new String[]{"Juki", "is", "cute"});
            System.out.println();
        week47.run();
            System.out.println();
        week48.run();
            System.out.println();
    }
    //Exercise 1
    class week41 {
        static void run() {
            int sum = 0;
            for (int i = 2; i <= 100; i += 2) sum += i;
            System.out.print("Sum of all even numbers 1-100 = " + sum);
        }
    }
    //Exercise 2
    class week42 {
        static void run(String[] args) {
            if (args.length != 1) {
                System.out.print("Collatz number conjecture");
                return;
            }
            int n = Integer.parseInt(args[0]);
            System.out.print("Collatz conjecture values for " + (args[0]) + ": " +n + " ");

            while (n != 1) {
                if (n % 2 == 0) {
                    n = n / 2;
                } else {
                    n = 3 * n + 1;
                }
                System.out.print(n + " ");
            }
        }
    }
    //Exercise 3
    class week43 {
        static void run(String[] args) {
            if (args.length != 1) {
                System.out.print("Prime numbers");
                return;
            }

            int limit = Integer.parseInt(args[0]);
                System.out.print("Prime numbers up to " + limit + ": ");

            for (int i = 2; i <= limit; i++) {
                boolean Prime = true;
                for (int j = 2; j <= Math.sqrt(i); j++)
                    if (i % j == 0) {
                        Prime = false;
                        break;
                    }
                if (Prime) System.out.print(i + " ");
            }
        }
    }
    //Exercise 4
    class week44 {
        static void run(String[] args) {
            if (args.length != 1) {
                System.out.print("Reverse string");
                return;
            }

            String s = args[0];
            String reversed = "";
            for (int i = s.length() - 1; i >= 0; i--) reversed += s.charAt(i);
            System.out.print("Reverse of the word " + args[0] + " is: " + reversed);
        }
    }
    //Exercise 5
    class week45 {
        static void run(String[] args) {
            if (args.length != 1) {
                System.out.print("Palindrome");
                return;
            }

            String s = args[0];
            String reversed = " ";
            for (int i = s.length() - 1; i >= 0; i--) reversed += s.charAt(i);

            if (s.equalsIgnoreCase(reversed))
                System.out.print(s + " is a palindrome");
            else
                System.out.print(s + " isn't a palindrome");
        }
    }
    //Exercise 6
    class week46 {
        static void run(String[] args) {
            if (args.length == 0) {
                System.out.print(" Reverse words");
                return;
            }
            System.out.print("Reversed sentence: ");
            for (String w : args) {
                for (int i = w.length() - 1; i >= 0; i--) System.out.print(w.charAt(i));
                System.out.print(" ");
            }
        }
    }
    //Exercise 7
    class week47 {
        static void run() {
            String main = "Batat";
            String sub = "at";
            int count = 0;

            for (int i = 0; i <= main.length() - sub.length(); i++) {
                if (main.startsWith(sub, i)) {
                    count++;
                }
            }
            System.out.print( sub + " occurs " + count + " times in " + main);
        }
    }
    //Exercise 8
    class week48 {
        static void run() {
            String text = "dddeffnnnn";
            String result = "";
            int count = 1;

            for (int i = 0; i < text.length() - 1; i++) {
                if (text.charAt(i) == text.charAt(i + 1)) {
                    count++;
                } else {
                    result += text.charAt(i) + "" + count;
                    count = 1;
                }
            }
            result += text.charAt(text.length() - 1) + "" + count;
            System.out.print(text + " is converted to: " + result);
        }
    }
}


