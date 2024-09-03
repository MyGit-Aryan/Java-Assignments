import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.logging.log4j.*;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {


        Logger lo = LogManager.getLogger(Main.class);//LOGGER CREATED

        lo.info("This is an INFO log");
        String res="";

        try {
            FileInputStream inputStream = new FileInputStream("./src/main/resources/input.txt");
            int i=0;

            while ((i = inputStream.read()) != -1) {
                System.out.print((char) i);
                res+=i;
            }
            inputStream.close();
        } catch (FileNotFoundException e) {
            lo.error("You Have not created your source file");
        }


        FileOutputStream outputStream = null;
        try{
            outputStream = new FileOutputStream("./Output.txt");
            outputStream.write(res.getBytes());
        }
        catch (FileNotFoundException e){
            lo.error("Please grant create permission");
        }


        outputStream.close();
    }
}