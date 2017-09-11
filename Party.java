public class Party {
    public static void main(String[] args) {
        System.out.println("It's a big ol' Java party!");
    }
}


public class Party {
  public static void main(String[] args) {
    for (int i = 1; i <= 10; i++) {
      int x = 6 * i - 4;
      System.out.println(x);
    }
  }
}

//i recive an error when trying to compile the above code with this code. the error points to line 18.
import java.util.Scanner;

public class Party {
    public static void main(String[] args) {

        System.out.println( "Hello. What is your name?" );

        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.nextLine();

        System.out.println("It's nice to meet you, " + userInput);
    }
}
