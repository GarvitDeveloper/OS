

//Import section
import javax.annotation.processing.Messager;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main_Activity {
    //OOPs Section
    static void Setups() {
        System.out.println("Welcome to HARFORD-DOS(HARFORD DISK OPERATING SYSTEM)!");
        System.out.println("We have tons of features!");
        System.out.println("Starting HARFORD-DOS....");

    }

    static void Boot() {
        System.out.println("...");
        System.out.println("Thousands of processes are running...");
        System.out.println(".");
        System.out.println("..");
        System.out.println("...");
        System.out.println(".");
        System.out.println("..");
        System.out.println("...");
        System.out.println(".");
        System.out.println("..");
        System.out.println("...");
        System.out.println(".");
        System.out.println("..");
        System.out.println("...");
        System.out.println(".");
        System.out.println("..");
        System.out.println("...");
        System.out.println("Done...");
        System.out.println("Booting H-DOS");
        System.out.println("Starting H-DOS");

    }
    static void Main_Operating_System(){
        System.out.println("Applications");
        System.out.println("Word Adventurer");
        System.out.println("File Explorer");
    }

    public static void main(String[] args) throws IOException {
        Boot();
        Scanner test = new Scanner(System.in);
        System.out.println("Please enter your username.");
        String username = test.nextLine();
        System.out.println("Please enter your password");
        String password = test.nextLine();
        System.out.println("Automatically signed in as " + username);
        FileOutputStream b = new FileOutputStream("data.txt");
        b.write((username + "\n" + password).getBytes());

    }

}
