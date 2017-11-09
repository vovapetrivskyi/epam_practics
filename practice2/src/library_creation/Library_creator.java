package library_creation;

import book.Book;
import java.util.Random;

/**
 * Created by Volodymyr Petrivskyi on 09.11.2017.
 */
public class Library_creator {

    public static Book[] create_Library(int size) throws Exception {
        if (size > Library.library.length)
            throw new Exception("Input correct size");

        int[] indexes = new int[size];

        Random random = new Random();
        int i;
        for (i = 0; i < size; i++)
            indexes[i] = -1;
        i = 0;
        while (i < size) {
            boolean flag = true;
            int random_index = random.nextInt(Library.library.length);
            for (int j = 0; j < size; j++)
                if (indexes[j] == random_index)
                    flag = false;
            if (flag) {
                indexes[i] = random_index;
                i++;
            }
        }

        Book[] selected_books = new Book[size];
        for (i = 0; i < size; i++)
            selected_books[i] = Library.library[indexes[i]];

        return selected_books;
    }
}
