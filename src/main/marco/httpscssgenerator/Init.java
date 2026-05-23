import java.io.FileWriter;
import java.io.IOException;

public class Init {

    
    public static void main(String[] args) {

        try {
            FileWriter file = new FileWriter("index.html");

            file.write("<!DOCTYPE html>\n");
            file.write("<html>\n");
            file.write("<head>\n");
            file.write("    <title>Minha Pagina</title>\n");
            file.write("</head>\n");
            file.write("<body>\n");
            file.write("    <h1>Hello World!</h1>\n");
            file.write("    <p>Gerado por Java</p>\n");
            file.write("</body>\n");
            file.write("</html>\n");

            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}