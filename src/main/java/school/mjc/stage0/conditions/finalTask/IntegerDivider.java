package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        if (divider == 0) {
            System.out.println("division by zero");
            return;
        }
        System.out.println(dividend / divider * divider != dividend ?
                "cannot be divided completely" : "can be divided completely");
    }
}
