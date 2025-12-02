import java.util.*;

public class week7 {
    public static void Main(String[] args) {

        ArrayNames();
        ArrayReverse();
        ArraySentence();
        ArrayTime();

    }

    //
    private static long time(Runnable task) {
        long start = System.currentTimeMillis();
        task.run();
        return System.currentTimeMillis() - start;
    }

    private static void listFill(List<Integer> list, int size) {
        for (int i = 0; i < size; i++)
            list.add(i);
    }

    //
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

    //
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

    //
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

    //
    private static void ArrayTime() {

        ArrayList<Integer> al = new ArrayList<>();
        LinkedList<Integer> ll = new LinkedList<>();

        listFill(al, 1_000_000);
        listFill(ll, 1_000_000);

        Random r = new Random();

        long tAL = time(() -> {
            for (int i = 0; i < 10_000; i++)
                al.get(r.nextInt(1_000_000));
        });

        long tLL = time(() -> {
            for (int i = 0; i < 10_000; i++)
                ll.get(r.nextInt(1_000_000));
        });

        System.out.println("ArrayList access time: " + tAL + " milliseconds");
        System.out.println("LinkedList access time: " + tLL + " milliseconds");
    }
}










