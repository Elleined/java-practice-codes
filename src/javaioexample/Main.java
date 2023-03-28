package javaioexample;

import javaioexample.multiplecopier.MultipleFileReader;
import javaioexample.textcloner.TextCloner;
import javaioexample.textcopier.TextCopier;

public class Main {
    public static void main(String[] args) {
        new TextCloner().clone();
        new TextCopier().copy();
        new MultipleFileReader().multipleFileReader();
    }
}
