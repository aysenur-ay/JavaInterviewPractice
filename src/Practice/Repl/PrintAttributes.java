package Practice.Repl;

public class PrintAttributes {
    public static void main(String[] args) {

        Attrib a = new Attrib();
        a.name = "ball";
        a.color = "red";
        a.amount = 1;


        System.out.println(a.asString());
    }
}

class Attrib {

    public String name, color;
    public int amount;

    public void setInfo(String name, String color, int amount){
        this.name = name;
        this.color = color;
        this.amount = amount;
    }

    public String asString(){
        return "name: " + name + " color: " + color + " amount: " + amount;
    }

}
/*
The class Atts holds a few attributes and has a method called asString.

the attributes are name and color -both are strings and amount which is an int.
their visibility is public.

asString returns a string showing all the Atts in a format.

for example:

   Atts a = new Atts();
   a.name = "table";
   a.color = "brown";
   a.amount = 1;

   System.out.println(a.asString());

prints:
name: table color: brown amount: 1

create the required attributes and method inside the atts class
 */
