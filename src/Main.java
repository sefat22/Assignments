import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }


    public class HeartRates {
        private String firstName;
        private String lastName;
        private int birthMonth;
        private int birthDay;
        private int birthYear;

        public HeartRates(String firstName, String lastName, int birthMonth, int birthDay, int birthYear) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.birthMonth = birthMonth;
            this.birthDay = birthDay;
            this.birthYear = birthYear;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getBirthMonth() {
            return birthMonth;
        }

        public void setBirthMonth(int birthMonth) {
            this.birthMonth = birthMonth;
        }

        public int getBirthDay() {
            return birthDay;
        }

        public void setBirthDay(int birthDay) {
            this.birthDay = birthDay;
        }

        public int getBirthYear() {
            return birthYear;
        }

        public void setBirthYear(int birthYear) {
            this.birthYear = birthYear;
        }

        public int calculateAge() {
            Calendar now = Calendar.getInstance();
            int currentYear = now.get(Calendar.YEAR);
            int currentMonth = now.get(Calendar.MONTH) + 1;
            int currentDay = now.get(Calendar.DAY_OF_MONTH);

            int age = currentYear - birthYear;
            if (currentMonth < birthMonth) {
                age--;
            } else if (currentMonth == birthMonth && currentDay < birthDay) {
                age--;
            }

            return age;
        }

        public int calculateMaxHeartRate() {
            int age = calculateAge();
            return 220 - age;
        }

        public String calculateTargetHeartRate() {
            int maxHeartRate = calculateMaxHeartRate();
            int minTargetHeartRate = (int) (maxHeartRate * 0.5);
            int maxTargetHeartRate = (int) (maxHeartRate * 0.85);
            return minTargetHeartRate + " - " + maxTargetHeartRate + " beats per minute";
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your first name: ");
            String firstName = scanner.nextLine();

            System.out.print("Enter your last name: ");
            String lastName = scanner.nextLine();

            System.out.print("Enter your birth month (1-12): ");
            int birthMonth = scanner.nextInt();

            System.out.print("Enter your birth day (1-31): ");
            int birthDay = scanner.nextInt();

            System.out.print("Enter your birth year (4-digit year): ");
            int birthYear = scanner.nextInt();

            HeartRates person = new HeartRates(firstName, lastName, birthMonth, birthDay, birthYear);

            System.out.println("\n" + person.getFirstName() + " " + person.getLastName() + ":");
            System.out.println("Age: " + person.calculateAge() + " years");
            System.out.println("Maximum heart rate: " + person.calculateMaxHeartRate() + " beats per minute");
            System.out.println("Target heart rate: " + person.calculateTargetHeartRate());
        }
    }
}