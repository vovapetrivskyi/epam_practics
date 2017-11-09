package run;

import book.Book;
import library_creation.Library_creator;
import show.Show;

import java.util.Arrays;
import java.util.Scanner;

import Sort_by_publishing_house.BooksComparator;

/**
 * Created by Volodymyr Petrivskyi on 09.11.2017.
 */
public class Run {
    public static void run() {
        Book[] books = null;

        Scanner in = new Scanner(System.in);
        int choice = 0;
        while (choice != 7) {
            try {
                Show.showMenu();
                choice = in.nextInt();
                switch (choice) {
                    case 1: {
                        try {
                            System.out.println("Input size");
                            int size = in.nextInt();
                            books = Library_creator.create_Library(size);
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    }
                    case 2: {
                        if (books != null)
                            Show.showAllBooks(books);
                        else
                            System.out.println("You have no books. Fill your library");
                        break;
                    }
                    case 3: {
                        if (books != null) {
                            Show.showAuthorBooks(books);
                        } else
                            System.out.println("You have no books. Fill your library");
                        break;
                    }
                    case 4: {
                        if (books != null) {
                            Show.showPublishingHouseBooks(books);
                        } else
                            System.out.println("You have no books. Fill your library");
                        break;
                    }
                    case 5: {
                        if (books != null) {
                            Show.showOlderBooks(books);
                        } else
                            System.out.println("You have no books. Fill your library");
                        break;
                    }
                    case 6: {
                        if (books != null) {
                            Arrays.sort(books, new BooksComparator());
                        } else
                            System.out.println("You have no books. Fill your library");
                        break;
                    }
                }
            } catch (Exception e) {
                System.out.println("Choose correctly");
                in.next();
            }
        }

        System.out.println("Good bye");
    }
}
