package Sort_by_publishing_house;

import java.util.Comparator;

import book.Book;

/**
 * Created by Volodymyr Petrivskyi on 09.11.2017.
 */
public class BooksComparator implements Comparator {
    @Override
    public int compare(Object obj1, Object obj2) {
        String publishing_hous1 = ((Book) obj1).getPublishing_house();
        String publishing_hous2 = ((Book) obj2).getPublishing_house();
        return publishing_hous1.compareTo(publishing_hous2);
    }
}
