package Practice.Repl;

public class profitOrLoss {
    public static void main (String [] args){

    }
    public static String c_profits (int buyPrice,int sellPrice)
    {
        //your code here
        String result = "";

        if(sellPrice > buyPrice){
            result = "profit";
        }else if(sellPrice < buyPrice){
            result = "loss";
        }else if(sellPrice == buyPrice){
            result = "no loss";
        }
        System.out.println(result);

        return result;
    }
}
/*
c_profits gets the buyPrice(int) and sellPrice(int) and determines if there was a profit or loss.
it returns a string value that can be "profit","loss","no loss"

for example:
c_profis(100,1500)
returns : "profit"

c_profis(20,5)
returns : "loss"

c_profis(100,100)
returns : "no loss"
 */
