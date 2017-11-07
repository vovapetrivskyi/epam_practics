import task_1.Convert;
import task_2.PerfectNumber;
import task_3.Pyramid;
import task_4.Matrix;

/**
 * Created by Home on 06.11.2017.
 */
public class Main {
    public static void main(String args[]){
        System.out.println("Task 1");
        Convert convert = new Convert();
        convert.convert(38,'b');
        convert.convert(38,'o');
        convert.convert(933,'h');
        System.out.println("Task 2");
        PerfectNumber perfectNumber = new PerfectNumber();
        perfectNumber.findPerfectNumbers(1000);
        System.out.println("Task 3");
        Pyramid pyramid = new Pyramid();
        pyramid.buildPyramid(9);
        System.out.println("Task 4");
        Matrix matrix = new Matrix(5);
    }
}
