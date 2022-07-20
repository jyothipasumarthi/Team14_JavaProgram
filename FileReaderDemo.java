import java.io.FileReader;
import java.io.IOException;
public class FileReaderDemo {
    public static void main(String[] args) throws IOException{
        FileReader fr=new FileReader("C:\\Users\\chandana\\OneDrive\\Desktop\\Jyothi\\File.txt");
        int j;
        while((j=fr.read())!=-1) {
            System.out.print((char)j);
           // fr.close();//
        }
        fr.close();
    }
}