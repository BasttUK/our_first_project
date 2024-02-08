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
        System.out.println("Your name: "+name);
        System.out.println("Ypur second name: "+secname);
        System.out.println("Your surname: "+surname);
        System.out.println("your age: "+age);
        System.out.println("Youe ID: "+id);
        in.close();
    }
}
