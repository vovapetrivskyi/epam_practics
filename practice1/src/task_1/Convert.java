package task_1;

/**
 * Created by Home on 06.11.2017.
 */
public class Convert {
    public void convert(int input_number, char system) {
        if (input_number > 0) {
            if (system == 'b') {
                System.out.print(input_number + " in binary format = ");
                int size = 0;
                int input = input_number;
                while (input > 0) {
                    size++;
                    input /= 2;
                }
                char[] result = new char[size];
                for (int i = size - 1; i >= 0; i--) {
                    input = input_number % 2;
                    result[i] = (char) (48 + input);
                    input_number /= 2;
                }
                show(result);
            }
            if (system == 'o') {
                System.out.print(input_number + " in octal format = ");
                int size = 0;
                int input = input_number;
                while (input > 0) {
                    size++;
                    input /= 8;
                }
                char[] result = new char[size];
                for (int i = size - 1; i >= 0; i--) {
                    input = input_number % 8;
                    result[i] = (char) (48 + input);
                    input_number /= 8;
                }
                show(result);
            }
            if (system == 'h') {
                System.out.print(input_number + " in hex format = ");
                int size = 0;
                int input = input_number;
                while (input > 0) {
                    size++;
                    input /= 16;
                }
                char[] result = new char[size];
                for (int i = size - 1; i >= 0; i--) {
                    input = input_number % 16;
                    if (input < 10)
                        result[i] = (char) (48 + input);
                    else
                        result[i] = (char) (55 + input);
                    input_number /= 16;
                }
                show(result);
            }
        } else
            System.err.println("Input correct number");
    }

    void show(char[] input) {
        for (int i = 0; i < input.length; i++)
            System.out.print(input[i]);
        System.out.println();
    }
}
