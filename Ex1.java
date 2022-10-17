// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Ex1 {
    public static void main(String[] args) {
        zeroDivision();
        read();
        add();
//        overFlow();
    }

    static void zeroDivision(){
        ArrayList<String> arr = new ArrayList<>();
        int a = 5;
        try{
            a = a/0;
        } catch (Exception e) {
            System.out.println(e.getMessage()); // ArithmeticException
        }
    }

    static void read() {
        try (FileReader reader = new FileReader("path")) {
            int c;
            String name = "";
            while ((c = reader.read()) != -1) {
                name += (char) c;
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage()); // FileNotFoundException
        }
    }

    static void add(){
        String[] arr = new String[5];
        try{
            System.out.println(arr[5]);
        } catch (Exception e) {
            System.out.println(e.getMessage()); // ArrayIndexOutOfBoundsException
        }
    }

    static String overFlow(){
        return overFlow(); // StackOverflowError
    }
}