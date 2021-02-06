package Practice.Repl;

public class evens {

    public static void main(String[] args) {
        //WRITE YOUR CODE HERE

        for(int i = 1; i <= 100; i++){
            while(i % 2 == 0){
                System.out.print(i+", ");
                i++;
            }
        }
    }
}
/*
Write a program that will print out even numbers from 2 to 100 through the comma.


 */
