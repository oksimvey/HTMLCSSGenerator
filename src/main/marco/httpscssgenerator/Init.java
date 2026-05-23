import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import javax.naming.spi.DirectoryManager;

public class Init {

    
    public static void main(String[] args) {

        try {
            FileWriter file = new FileWriter("Main.java");

            file.write("public class Main {\n" +
                    "    public static void main(String[] args) {\n" +
                    "        System.out.println(\"Hello, World!\");\n" +
                    "    }\n" +
                    "}\n");

            file.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}