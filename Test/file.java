package Test;
import java.io.FileReader;

class Main {
    public static void main(String[] args) {

        // to store contents of file
        char[] contents = new char[100];
        try {
            // create a reader using the FileReader
            FileReader input = new FileReader("message.txt");

            // read characters
            input.read(contents);

            // print contents of file
            System.out.println(contents);

            // close FileReader
            input.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}