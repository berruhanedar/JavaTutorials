package _09_ForLoop;

// for ( statement 1 ; statement 2 ; statement 3 ){}
// Statement 1 is executed (one time) before the execution of the code block.
// Statement 2 defines the condition for executing the code block.
// Statement 3 is executed (every time) after the code block has been executed

public class FoorLoop {
    public static void main(String[] args) {
        // Example 1
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        System.out.println("-----------------------");

        // Example 2
        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i);
        }

    }
}
