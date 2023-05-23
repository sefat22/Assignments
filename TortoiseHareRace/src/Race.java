import java.util.Random;


class project2_1
{
    int[] race = new int[70];
    int tortoise;
    int hare;
    Random randomnumbers = new Random();
    boolean again = true;

    public void StartRace()
    {
        tortoise = 1;
        hare = 1;
        System.out.println("ON YOUR MARK, GET SET.... BANG!!!");
        System.out.println("AND THEY'RE OFF!!!!");
        while (tortoise < 70 && hare < 70)
        {
            MoveHare();
            MoveTortoise();
            DisplayCurrentLocation();
        } //end while
        if
        (tortoise > hare)
        {
            System.out.println("TORTOISE WINS!! YAY!!!!!");
        }
        else if
        (hare > tortoise)
        {
            System.out.println("HARE WINS!!!");
        }
        else if
        (hare == tortoise)
        {
            System.out.println("TIE!!!");
        }
    }

    public void MoveTortoise()
    {
        //to randomize move
        int percent = randomnumbers.nextInt(10) + 1;
        //now determine moves based on graph
        //fast plod
        if (percent >= 1 && percent <= 5)
        {
            tortoise += 3;
        }
        //slip
        else if (percent == 6 || percent == 7)
        {
            tortoise -= 6;
        }
        //slow plod
        else
        {
            ++tortoise;
        }
        // protect from going past start
        if (tortoise < 1)
        {
            tortoise = 1;
        }
        // to make sure game ends
        else if (tortoise > 70)
        {
            tortoise = 70;
        }
    }// end tortoise

    public void MoveHare()
    {
        // randomize move
        int percent = randomnumbers.nextInt(10) + 1;
        // determine moves by graph
        //big hop
        if (percent == 3 || percent == 4)
        {
            hare += 9;
        }
        //big slip
        else if (percent == 5)
        {
            hare -= 12;
        }
        // small hop
        else if (percent >= 6 && percent <= 8)
        {
            ++hare;
        }
        // )small slip
        else if (percent > 8)
        {
            hare -= 2;
        }
        //ensure hare doesn't go past start
        if (hare < 1)
        {
            hare = 1;
        }
        // ensure hare doesnt go past end
        else if (hare > 70)
        {
            hare = 70;
        }
    } // end movehare

    public void DisplayCurrentLocation()
    {
        //this is the location of each on the array
        for (int count = 1; count <= 70; count++)
            // same spot
            if (count == tortoise && count == hare)
            {
                System.out.println("OUCH");
            }
            else if (count == hare)
            {
                System.out.println("H");
            }
            else if (count == tortoise)
            {
                System.out.println("T");
            }
            else
                System.out.println();
    }}



