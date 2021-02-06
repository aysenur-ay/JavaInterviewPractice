package Practice.Repl;

public class UtopianTree {
    public static void main(String[] args) {

        // your code
        // ----------------------------
        int year = 1;
        int size = 1;
        int growth = 1;


        for (int n = 1; n <= 3; n++){
            System.out.println("year " + year + " - growth " + growth + " cm");
            System.out.println("tree size: " + size + "cm");
            year++;
            size++;

        }

        growth++;
        size++;

        for (int i = 4; i <= 10; i++){

            System.out.println("year " + year + " - growth " + growth + " cm");
            System.out.println("tree size: " + size + "cm");
            year++;
            size+=2;
        }



    }
}
/*
The Utopian Tree grows exactly 1 cm for the first three years, and after that it grows by 2 cm every year, this is a simple implementation of the algorithm. You will need to use loops to create it.
Show 10 years of growth of the Utopian Tree.

Output:
year 1 - growth 1 cm
tree size: 1cm
year 2 - growth 1 cm
tree size: 2cm
year 3  - growth 1 cm
tree size:3cm
year 4 - growth 2 cm
tree size: 5cm
year 5 - growth 2 cm
tree size: 7cm
year 6 - growth 2 cm
tree size: 9cm
... until you reach year 10
 */
