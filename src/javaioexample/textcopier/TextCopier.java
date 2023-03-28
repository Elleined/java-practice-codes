package javaioexample.textcopier;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// Copy user defined text to copy-text.txt
public class TextCopier {

    public TextCopier() {
    }

    public TextCopier copy() {
        try (BufferedInputStream input = new BufferedInputStream(System.in);
             BufferedOutputStream display = new BufferedOutputStream(System.out);
             BufferedOutputStream output = new BufferedOutputStream(
                     new FileOutputStream("C:\\Users\\Administrator\\" + "IdeaProjects\\" +
                             "PracticeCoding\\src\\javaioexample\\textcopier\\copytext.txt")
             )
        ){
            System.out.println("Enter text (Press 'X' to exit):");
            int data = input.read();
            final int X = 88;
            while (data != X) {
                output.write(data);
                data = input.read();
            }
            System.out.println("Text Copied Successfully!!!");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return this;
    }
}
