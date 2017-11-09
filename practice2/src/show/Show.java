package show;

import book.Book;

import java.util.Scanner;

import static java.lang.System.in;

/**
 * Created by Volodymyr Petrivskyi on 09.11.2017.
 */
public class Show {

    public static void showMenu() {
        System.out.println("Choose action:");
        System.out.println("1. Fill your library");
        System.out.println("2. Show all books");
        System.out.println("3. Show books of selected author");
        System.out.println("4. Show books of selected publishing house");
        System.out.println("5. Show books of older than selected year");
        System.out.println("6. Sort books(publishing house)");
        System.out.println("7. Exit");
    }

    public static void showAllBooks(Book[] books) {
        for (Book book : books)
            System.out.println(book);
    }

    public static void showAuthorBooks(Book[] books) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input author");
        String author = in.nextLine();
        for (Book book : books)
            if (book.getAuthor().equalsIgnoreCase(author))
                System.out.println(book);
    }

    public static void showPublishingHouseBooks(Book[] books) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input publishing house");
        String publishing_house = in.nextLine();
        for (Book book : books)
            if (book.getPublishing_house().equalsIgnoreCase(publishing_house))
                System.out.println(book);
    }

    public static void showOlderBooks(Book[] books) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input year");
        int year = in.nextInt();
        for (Book book : books)
            if (book.getYear() < year)
                System.out.println(book);
    }
}
