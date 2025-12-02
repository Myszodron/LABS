import java.util.*;

public class week7 {

    private static ArrayList<Integer> currentAL;
    private static LinkedList<Integer> currentLL;

    public static void Main(String[] args) {

        ArrayNames();
        ArrayReverse();
        ArraySentence();
        ArrayTime();
        ArrayTimeBegin();
        ArrayTimeRandom();
        ArrayTimeDelete();
        WhyTime();
    }

    //
    private static long time(Runnable task) {
        long start = System.currentTimeMillis();
        task.run();
        return System.currentTimeMillis() - start;
    }

    private static void listAccess(int size, Runnable workAL, Runnable workLL) {
        currentAL = new ArrayList<>();
        currentLL = new LinkedList<>();

        for (int i = 0; i < size; i++) {
            currentAL.add(i);
            currentLL.add(i);

            long tA = time(workAL);
            long tL = time(workLL);

            System.out.println("ArrayList access time: " + tA + " ms");
            System.out.println("LinkedList access time: " + tL + " ms");
            System.out.println();

        }
    }

    private static void repeat(int time, Runnable task) {
        for (int i = 0; i < time; i++)
            task.run();
    }

    //A
    private static void ArrayNames() {

        ArrayList<String> names = new ArrayList<>(
                Arrays.asList("Juki", "Daria", "John", "Natalie", "Ron")
        );

        while (!names.isEmpty()) {
            printRemove(names);
        }
        System.out.println();
    }

    private static void printRemove(ArrayList<String> list) {
        for (String s : list)
            System.out.println(s);

        list.removeFirst();
        System.out.println("Updated list: " + list);
    }

    //B
    private static void ArrayReverse() {

        int n = 8;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++)
            list.add((int) (Math.random() * 10) + 1);

        System.out.println("List of integers: " + list);

        reverseList(list);

        System.out.println("Reversed list: " + list);
        System.out.println();
    }

    private static void reverseList(ArrayList<Integer> a) {
        for (int l = 0, r = a.size() - 1; l < r; l++, r--) {
            int temp = a.get(l);
            a.set(l, a.get(r));
            a.set(r, temp);
        }
    }

    //C
    private static void ArraySentence() {

        ArrayList<String> word = new ArrayList<>(
                Arrays.asList("Juki", "gets", "chubby", "in", "winter")
        );

        String sentence = "";

        for (int i = 0; i < word.size(); i++) {
            sentence += word.get(i);
            if (i < word.size() - 1)
                sentence += " ";
        }

        System.out.println(sentence);
        System.out.println();
    }

    //D
    private static void ArrayTime() {

        Random r = new Random();

        listAccess(1_000_000,
                () -> repeat(10_000, () -> currentAL.get(r.nextInt(currentAL.size()))),
                () -> repeat(10_000, () -> currentLL.get(r.nextInt(currentLL.size())))
        );
    }

    //E
    private static void ArrayTimeBegin() {

        listAccess(1_000_000,
                () -> repeat(10_000, () -> currentAL.add(0, 0)),
                () -> repeat(10_000, () -> currentLL.addFirst(0))
        );
    }

   //F
    private static void ArrayTimeRandom() {

        Random r = new Random();

        listAccess(1_000_000,
                () -> repeat(10_000, () -> currentAL.add(r.nextInt(currentAL.size()), 0)
                ),
                () -> repeat(10_000, () -> currentLL.add(r.nextInt(currentLL.size()), 0)
                )
        );
    }

    //G
    private static void  ArrayTimeDelete() {

        listAccess(1_000_000,
                () -> repeat(10_000, () -> currentAL.remove(0)),
                () -> repeat(10_000, () -> currentLL.removeFirst())
        );
    }

    //H
    private static void WhyTime() {
        System.out.println(

        );
    }

    //I
    private static int countVowels(String s) {

        int count = 0;

        for (char a : s.toLowerCase().toCharArray())
            if ("aeiou".indexOf(a) >= 0)
                count++;

        return count;
    }

    private static boolean isVowel(char a) {
        a = Character.toLowerCase(a);
        return ""
    }

    private static void countVowelsExample() {
        System.out.println("Vowels in 'Juki is cute': " + countVowels("Juki is cute"));
        System.out.println();
    }




}













