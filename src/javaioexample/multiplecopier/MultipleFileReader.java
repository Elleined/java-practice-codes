package javaioexample.multiplecopier;
import java.io.*;
import java.util.Vector;

// Read multiple files and write all to result
public class MultipleFileReader {

    public MultipleFileReader() {
    }

    public MultipleFileReader multipleFileReader() {
        try (BufferedInputStream fileInput1 = new BufferedInputStream(
                     new FileInputStream("C:\\Users\\Administrator\\" + "IdeaProjects\\" +
                             "PracticeCoding\\src\\javaioexample\\multiplecopier\\test1.txt")
             );
             BufferedInputStream fileInput2 = new BufferedInputStream(
                     new FileInputStream("C:\\Users\\Administrator\\" + "IdeaProjects\\" +
                             "PracticeCoding\\src\\javaioexample\\multiplecopier\\test2.txt")
             );
             BufferedInputStream fileInput3 = new BufferedInputStream(
                     new FileInputStream("C:\\Users\\Administrator\\" + "IdeaProjects\\" +
                             "PracticeCoding\\src\\javaioexample\\multiplecopier\\test3.txt")
             )
        ){
            final Vector<BufferedInputStream> vectorInput = new Vector<>();
            vectorInput.add(fileInput1);
            vectorInput.add(fileInput2);
            vectorInput.add(fileInput3);
            copyText(vectorInput);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return this;
    }

    private void copyText(Vector<BufferedInputStream> vectorInput) {
        try (SequenceInputStream sequence = new SequenceInputStream(vectorInput.elements());
             BufferedOutputStream fileOutput = new BufferedOutputStream(
                     new FileOutputStream("C:\\Users\\Administrator\\" + "IdeaProjects\\" +
                             "PracticeCoding\\src\\javaioexample\\multiplecopier\\result.txt")
             )
        ){
            while (sequence.read() != -1) {
                fileOutput.write(sequence.readAllBytes());
            }
            System.out.println("Multiple text file copied Successfully!!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
