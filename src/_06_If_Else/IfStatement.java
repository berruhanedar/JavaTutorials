package _06_If_Else;

public class IfStatement {

    /*
    • Less than: a < b
    • Less than or equal to: a <= b
    • Greater than: a > b
    • Greater than or equal to: a >= b
    • Equal to a == b
    • Not Equal to: a != b
     */

    /* Short Hand If.. Else.. Statement
    varaible = (condition) ? expressionTrue : expressionFalse;
    */

    public static void main(String[] args) {

        // Example 1
        if (20 > 18) {
            System.out.println("20 is greater than 18");
        }

        // Example 2 -> If Statement
        int x = 20;
        int y = 18;
        if (x > y) {
            System.out.println("x is greater than y");
        }

        // Example 3 -> Else Statement
        int time = 20;
        if (time < 18) {
            System.out.println("Good day");
        } else {
            System.out.println("Good Evening");
        }

        // Example 4 -> Else If Statement
        int clock = 22;
        if (clock < 10) {
            System.out.println("Good morning");
        } else if (clock < 18) {
            System.out.println("Good afternoon");
        } else {
            System.out.println("Good evening");
        }

        // Example 5 -> Short Hand If.. Else.. Statement
        int zaman = 20 ;
        String result = (zaman < 10) ? "Good Day" : "Good Evening";
        System.out.println(result);
    }
}
