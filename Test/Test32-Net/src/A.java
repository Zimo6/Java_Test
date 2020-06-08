import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class A {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("student.txt");
//        Scanner sc = new Scanner(f);
        FileReader reader = new FileReader("Test32-Net\\student.txt");
//        System.out.println(reader);


    }
}
