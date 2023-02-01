package school.mjc.stage0.conditions.finalTask;

public class CoordinatePane {
    public void printQuadrant(int x, int y) {
        if (x == 0 || y == 0) {
            System.out.println("zero");
            return;
        }
        boolean isRight = x > 0;
        boolean isTop = y > 0;
        System.out.println(isRight ?
                isTop ? "first" : "fourth" :
                isTop ? "second" : "third");

    }
}
