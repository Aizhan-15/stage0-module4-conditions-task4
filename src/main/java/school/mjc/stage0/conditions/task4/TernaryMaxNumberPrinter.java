package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int first1 = 10;
        int second1 = 20;
        int third1 = 30;
        int result;
        result = first1 > (second1 > third1 ? second1 : third1) ? first1 : ((second1 > third1) ? second1 : third1);
        System.out.println(result);
    }
}
