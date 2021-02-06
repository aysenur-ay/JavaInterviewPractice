package Practice.Repl;
import java.util.Scanner;

public class Status_codes {
    public static void main(String[] args) {
        //Do Not Change
        System.out.println("Enter status code:");
        Scanner scan=new Scanner (System.in);
        int status= scan.nextInt();

        //WRITE YOUR CODE HERE:

        String message = " ";

        switch(status){
            case 200: message = "OK"; break;
            case 201: message = "Created"; break;
            case 202: message = "Accepted"; break;
            case 301: message = "Moved Permanently"; break;
            case 303: message = "See other"; break;
            case 304: message = "Not Modified"; break;
            case 307: message = "Temporary Redirect"; break;
            case 400: message = "Bad Request"; break;
            case 401: message = "Unauthorized"; break;
            case 403: message = "Forbidden"; break;
            case 404: message = "Not Found"; break;
            case 410: message = "Gone"; break;
            case 500: message = "Internal Server Error"; break;
            case 503: message = "Service Unavialable"; break;
            default: message = "Invalid status code!";
        }

        System.out.println (message);




    }
}
/*
HTTP is the protocol that governs communications between web servers and web clients (i.e. browsers).
 Part of the protocol includes a status code returned by the server to tell the browser the status
 of its most recent page request. Some of the codes and their meanings are listed below:

 */
