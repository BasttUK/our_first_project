package introduce;
import java.util.Scanner;

public class one{

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input your name: ");
        String name = in.nextLine();
        System.out.print("Input your second name: ");
        String secname = in.nextLine();
        System.out.print("Input your surname: ");
        String surname = in.nextLine();
        System.out.print("Input your age: ");
        int age = in.nextInt();
        System.out.print("Input your ID: ");
        int id = in.nextInt();
        System.out.printf("Your name: %s Your second name: %s Your surname: %s your age: %d Your ID: %d ",name, secname, surname, age, id);
        in.close();
    }
}
