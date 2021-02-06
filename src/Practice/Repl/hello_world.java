package Practice.Repl;

public class hello_world {

    public static void main(String[] args) {
        hello();
        world();
    }

    public static void hello(){
        //WRITE YOUR CODE HERE
        String str = "Hello ";
        System.out.print(str);

    }

    public static void world(){
        //WRITE YOUR CODE HERE
        String str2 = "World!";
        System.out.print(str2);
    }

}

/*
Given 2 static methods hello() and world().
Provide an implementation for both of them in order to print appropriate message.
So hello() method should print "Hello" and world() method should print "World!".
output: Hello World!
 */
