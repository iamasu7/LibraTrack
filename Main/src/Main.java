import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        String[] bookTitle = {"The Law Of Success", "As A Man Thinketh", "The Way To Wealth"};
        String[] bookAuthor = {"Napoleon Hill","James Allen","Benjamin Franklin"};
        String[] bookIsbn = {"978-1-58542-352-8","978-1-56414-362-4","978-1-60239-219-5"};
        boolean[] bookAvailable = {true,true,false};

        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Are You Adding A New Book? Y or N");
            String userInput = in.next();

            if (userInput.equalsIgnoreCase("n"))break;
            System.out.println("Enter Book Name: ");
            String name = in.next();

            System.out.println("Enter Book Author: ");
            String author = in.next();

            System.out.println("Enter Book ISBN: ");
            double isbn = in.nextDouble();

            System.out.println("Enter Book Status: ");
            boolean status = in.nextBoolean();

            bookTitle = Arrays.copyOf(bookTitle, bookTitle.length+1);
            bookTitle[bookTitle.length-1] = name;
            System.out.println(Arrays.toString(bookTitle));

            bookAuthor = Arrays.copyOf(bookAuthor, bookAuthor.length+1);
            bookAuthor[bookAuthor.length-1] = author;
            System.out.println(Arrays.toString(bookAuthor));

            bookIsbn = Arrays.copyOf(bookIsbn, bookIsbn.length+1);
            bookIsbn[bookIsbn.length-1] = isbn;
            System.out.println(Arrays.toString(bookIsbn));

            bookAvailable = Arrays.copyOf(bookAvailable, bookAvailable.length+1);
            bookAvailable[bookAvailable.length-1] = status;
            System.out.println(Arrays.toString(bookAvailable));

        } while (true);

        for (int i = 0; i < bookTitle.length; i++) {

            String checkStatus = null;
            if (bookAvailable[i]) {
                checkStatus = ("Paid");
            } else {
                checkStatus = ("Not Paid");
            }
            System.out.println(bookTitle[i] + " " + bookAuthor[i] + " " + bookIsbn[i] + " " + checkStatus);

        }



        System.out.println("Enter Student Name:___");
        String searchTerm = in.next();
        boolean found = false;

        for (int i = 0; i < bookTitle.length; i++) {
            if(searchTerm.equalsIgnoreCase(bookTitle[i])) {
                System.out.println(bookTitle[i]+ "\t" +bookAuthor[i]+ "\t" +bookIsbn[i]+ "\t" +bookAvailable[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student Not Found.");
        }
    }
}