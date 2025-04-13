package _10_Break_And_Continue;

// The break statement can also be used to jump out (exit) of a loop.
public class Break {
    public static void main(String[] args) {

        // Example 1
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("-------------------");

        // Example 2
        int i = 0 ;
        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 4) {
                break;
            }
        }

    }
}
