import java.util.Scanner;

public class IOManager {
    
  

    public static void read(String message){

       System.out.println(message);
    }

    public static String write(String message){

        Scanner scanner = new Scanner(System.in);
        System.out.println(message);

        return scanner.next();
        
    }

}
