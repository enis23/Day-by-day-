package day26_Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception4 {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\SomeFolder\\file.txt");

            FileReader fileReader = new FileReader(file);
        }catch(FileNotFoundException ex) {
            System.out.println("File not found");
            System.out.println(ex.getStackTrace());
        }
        }

}
