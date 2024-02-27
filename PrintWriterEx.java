
import java.io.File;
import java.io.*;
import java.time.*;

public class PrintWriterEx {

        public static void main(String[] args) throws Exception {
            File file = new File("output.txt");
            PrintWriter writer = new PrintWriter(file);

            writer.println("Hello, world!");
            writer.println("Today's date is: \n"+ LocalDate.now());

            writer.close(); // Important to close the stream!
        }
    }








