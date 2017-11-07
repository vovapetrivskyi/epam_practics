package task_2;

/**
 * Created by Home on 07.11.2017.
 */
public class PerfectNumber {
    public void findPerfectNumbers(int size) {
        if (size > 0) {
            for (int i = 1; i < size; i++) {
                int c = 0;
                for (int j = 1; j < size; j++)
                    if ((i % j == 0) && (j != i))
                        c = c + j;
                if (i == c)
                    System.out.println(i + " is perfect number");
            }
        } else
            System.err.println("Input correct size");
    }
}
