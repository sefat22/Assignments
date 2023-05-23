import java.time.LocalDate;
import java.time.Period;

//defining classes and attributes
    public class HeartRates {
        private String firstName;
        private String lastName;
        private int birthYear;
        private int birthMonth;
        private int birthDay;
//defining classes and attributes


        public HeartRates(String firstName, String lastName, int birthYear, int birthMonth, int birthDay) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.birthYear = birthYear;
            this.birthMonth = birthMonth;
            this.birthDay = birthDay;
        }

        // Getters and Setters
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

        public int getBirthYear() {
            return birthYear;
        }

        public void setBirthYear(int birthYear) {
            this.birthYear = birthYear;
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

        // Calculate age in years
        public int calculateAge() {
            LocalDate currentDate = LocalDate.now();
            LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
            return Period.between(birthDate, currentDate).getYears();
        }

        // Calculate maximum heart rate
        public int calculateMaxHeartRate() {
            int age = calculateAge();
            return 220 - age;
        }

        // Calculate target heart rate range
        public String calculateTargetHeartRate() {
            int maxHeartRate = calculateMaxHeartRate();
            int lowerBound = (int) (maxHeartRate * 0.5);
            int upperBound = (int) (maxHeartRate * 0.85);
            return lowerBound + " - " + upperBound;
        }

        public static void main(String[] args) {
            // Prompt for person's information
            String firstName = "Sefat";
            String lastName = "Monzor";
            int birthYear = 1999;
            int birthMonth = 9;
            int birthDay = 15;

            // Create HeartRates object
            HeartRates person = new HeartRates(firstName, lastName, birthYear, birthMonth, birthDay);

            // Print person's information
            System.out.println("Name: " + person.getFirstName() + " " + person.getLastName());
            System.out.println("Date of Birth: " + person.getBirthMonth() + "/" + person.getBirthDay() + "/" + person.getBirthYear());

            // Calculate and print age, max heart rate, and target heart rate range
            int age = person.calculateAge();
            int maxHeartRate = person.calculateMaxHeartRate();
            String targetHeartRate = person.calculateTargetHeartRate();

            System.out.println("Age: " + age + " years");
            System.out.println("Maximum Heart Rate: " + maxHeartRate + " bpm");
            System.out.println("Target Heart Rate Range: " + targetHeartRate + " bpm");
        }
    }

