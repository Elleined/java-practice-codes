package javaioexample.textcloner;
import java.io.*;

// Clone index.txt contents to my-index.txt
public class TextCloner {

    public TextCloner() {
    }

    public TextCloner clone() {
        try (BufferedInputStream input = new BufferedInputStream(
                new FileInputStream("C:\\Users\\Administrator\\IdeaProjects\\PracticeCoding\\" +
                        "src\\javaioexample\\textcloner\\index.txt")
            );
             BufferedOutputStream output = new BufferedOutputStream(
                new FileOutputStream("C:\\Users\\Administrator\\IdeaProjects\\PracticeCoding\\" +
                        "src\\javaioexample\\textcloner\\myindex.txt")
             )
        ){
            int len = input.available();
            byte[] data = input.readNBytes(len);
            output.write(data);
            System.out.println("Text Cloned Successfully!!!");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return this;
    }
}
