
import java.util.Scanner;
    public class Main {
        public static void main( String [] args )
        {
            boolean again = true;
            int request;

            Scanner input = new Scanner(System.in);

            project2_1 d = new project2_1();

            do
            {
                d.StartRace();

                System.out.println("");
                System.out.println( "Do you want to Play again: 1.Yes   2.No" );
                request = input.nextInt();

                if (request == 1)
                {
                    again = true;
                }
                else
                {
                    again = false;
                }
            } while (again == true);
            System.out.println("Thank you for Playing");
        }
    }
