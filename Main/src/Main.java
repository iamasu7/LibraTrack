public class Main {
    static void main(String[] args) {
        String[] studentName = {"Assan", "Lamin", "John", "Peter","Andrew"};
        int[] studentAge = {25,30,32,27,29};
        int[] studentNumber = {1,2,3,4,5};
        String[] location = {"Brusubi","Serrekunda","Lamin","Farato","Bakau"};
        boolean[] paidFees = {true,true,false,true,false};

        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Are You Adding A New Student? Y or N");
            String userInput = in.next();

            if (userInput.equalsIgnoreCase("n"))break;
            System.out.println("Enter Student Name: ");
            String name = in.next();

            System.out.println("Enter Student Age: ");
            int age = in.nextInt();

            System.out.println("Enter Student Number: ");
            int stuNum = in.nextInt();

            System.out.println("Enter Student Location: ");
            String lo = in.next();

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
        
    }
}