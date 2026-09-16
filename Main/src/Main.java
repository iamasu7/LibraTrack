import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        String[] bookTitle = {"The Law Of Success", "As A Man Thinketh", "The Way To Wealth"};
        String[] bookAuthor = {"Napoleon Hill","James Allen","Benjamin Franklin"};
        double[] bookIsbn = {978-1-58542-352-8,978-1-56414-362-4,978-1-60239-219-5};
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

            System.out.println("Has The Student Paid The Tuition Fee: ");
            boolean fees = in.nextBoolean();

            studentName = Arrays.copyOf(studentName, studentName.length+1);
            studentName[studentName.length-1] = name;
            System.out.println(Arrays.toString(studentName));

            studentAge = Arrays.copyOf(studentAge, studentAge.length+1);
            studentAge[studentAge.length-1] = age;
            System.out.println(Arrays.toString(studentAge));

            studentNumber = Arrays.copyOf(studentNumber, studentNumber.length+1);
            studentNumber[studentNumber.length-1] = stuNum;
            System.out.println(Arrays.toString(studentNumber));

            location = Arrays.copyOf(location, location.length+1);
            location[location.length-1] = lo;
            System.out.println(Arrays.toString(location));

            paidFees = Arrays.copyOf(paidFees, paidFees.length+1);
            paidFees[paidFees.length-1] = fees;
            System.out.println(Arrays.toString(paidFees));

        } while (true);

        for (int i = 0; i < studentName.length; i++) {

            String checkStatus = null;
            if (paidFees[i]) {
                checkStatus = ("Paid");
            } else {
                checkStatus = ("Not Paid");
            }
            System.out.println(studentName[i] + " " + studentAge[i] + " " + studentNumber[i] + " " + location[i] + " " + checkStatus);

        }



        System.out.println("Enter Student Name:___");
        String searchTerm = in.next();
        boolean found = false;

        for (int i = 0; i < studentName.length; i++) {
            if(searchTerm.equalsIgnoreCase(studentName[i])) {
                System.out.println(studentName[i]+ "\t" +studentAge[i]+ "\t" +studentNumber[i]+ "\t" +location[i]+ "\t" +paidFees[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student Not Found.");
        }
    }
}