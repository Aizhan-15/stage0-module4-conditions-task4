package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int first1 = 20;
        int second1 = 30;
        int third1 = 40;
        if (first1 >= second1 && first >= third1) {
            System.out.println(first1);
        } else {
            if (second >= third1) {
                System.out.println(second1);
            } else {
                System.out.println(third1);
            }
        }
    }
}
