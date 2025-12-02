import java.util.*;

public class week7 {
    public static void Main(String[] args) {

        ArrayNames();
        ArrayReverse();

    }
    //
    private static long time(Runnable task) {
        long start = System.currentTimeMillis();
        task.run();
        return System.currentTimeMillis() - start;
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
        for (int l = 0, r = a.size() - 1; l < r;  l++, r--) {
            int temp = a.get(l);
            a.set(l, a.get(r));
            a.set(r,temp);
        }


    }

}
