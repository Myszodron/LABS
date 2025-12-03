public class week4 {
    public static void main(String[] args) {

        numberSum();
        collatzNumber();
        primeNumber();
        reverseString();
        palindromeCheck();
        reverseSentence();
        stringOccur();
        compress();
    }

    private static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0) return false;
        return true;
    }

    private static String reverse(String s) {
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--)
            reversed = reversed + s.charAt(i);
        return reversed;
    }

    private static boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r))
                return false;   // early stop
            l++;
            r--;
        }
        return true;
    }

    //Exercise 1
    private static void numberSum() {
        int sum = 0;
        for (int i = 2; i <= 100; i += 2)
            sum += i;

        System.out.print("Sum of all even numbers 1-100 = " + sum);
        System.out.println();
    }

    //Exercise 2
    private static void collatzNumber() {
        int n = 14;
        System.out.println("Collatz number sequence for n = " + n + ": ");

        int it = 0, maxIt = 10000;

        while (n != 1 && it < maxIt) {
            System.out.println(n + " ");
            n = (n % 2 == 0) ? n / 2 : 3 * n + 1;
            it++;
        }

        System.out.println(n);
        if (it >= maxIt)
            System.out.println(" (Stopped)");
    }

    //Exercise 3
    private static void primeNumber() {

        int limit = 15;
        System.out.print("Prime numbers up to " + limit + ": ");

        for (int i = 2; i < limit; i++)
            if (isPrime(i))
                System.out.print(i + " ");

        System.out.println();
    }

    //Exercise 4
    private static void reverseString() {
        String s = "Juki";

        System.out.print("String = " + s);
        System.out.print(" Reversed = " + reverse(s));
        System.out.println();
    }

    //Exercise 5
    private static void palindromeCheck() {
        String s = "'mango'";

        System.out.print("word " + s);
        System.out.print(isPalindrome(s) ? "is a palindrome" : " isn't a palindrome");
        System.out.println();
    }

    //Exercise 6
    private static void reverseSentence() {
        String sentence = "Juki is cute";
        System.out.print("Sentence: " + sentence);

        System.out.print(" Reversed sentence: ");
        String[] words = sentence.split(" ");

        for (String w : words)
            System.out.print(reverse(w) + " ");
        System.out.println();
    }

    //Exercise 7
    private static void stringOccur() {
        String main = "'Batat'";
        String sub = "'at'";
        int count = 0;

        for (int i = 0; i <= main.length() - sub.length(); i++) {
            if (main.startsWith(sub, i)) {
                count++;
            }
        }
        System.out.print(sub + " occurs " + count + " times in " + main);
        System.out.println();
    }

    //Exercise 8
    private static void compress() {
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

        System.out.println();
    }
}



