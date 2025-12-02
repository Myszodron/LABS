import java.util.*;

public class week7 {
    public static void Main(String[] args) {

        ArrayNames();

    }

    private static long time(Runnable task) {
        long start = System.currentTimeMillis();
        task.run();
        return System.currentTimeMillis() - start;
    }

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

}
