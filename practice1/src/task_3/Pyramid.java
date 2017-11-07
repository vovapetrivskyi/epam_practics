package task_3;

/**
 * Created by Home on 07.11.2017.
 */
public class Pyramid {
    public void buildPyramid(int height){
        if(height > 0 && height < 10){
            for (int i = 0; i < height; i++)
            {
                int point = 1;
                System.out.print(point);
                for (int j = 1; j <= i; j++)
                {
                    point *= (i - j + 1);
                    point /= j;
                    System.out.print(" ");
                    System.out.print(point);
                }
                System.out.println();
            }
        }
        else
            System.err.println("Input correct height");
    }
}
