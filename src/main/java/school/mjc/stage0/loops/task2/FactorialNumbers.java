package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int counter = 0;
        int num = 1;
        while (counter <= printToInclusive) {
            num = num * counter;
            if (num == 0) {
                num = 1;  // !0 == 1
            }
            System.out.println(num);
            counter++;
        }
    }
}
