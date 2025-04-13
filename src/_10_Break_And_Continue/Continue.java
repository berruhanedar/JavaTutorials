package _10_Break_And_Continue;

// The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next
// iteration in the loop.
public class Continue {
    public static void main(String[] args) {

        // Example 1
        for(int i = 1; i <= 10; i++) {
            if(i == 4) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("---------------");

        // Example 2
        int i = 0 ;
        while(i < 10) {
            if(i == 4) {
                i ++ ;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
