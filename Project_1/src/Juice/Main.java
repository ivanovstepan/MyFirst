package Juice;

import java.io.IOException;

/**
 * Created by Stepan on 15.02.2015.
 */
public class Main {
    public static void main(String[] args) {
        Juice juice = new Juice();
        Reader_Writer reader_writer = new Reader_Writer();
        try {
            reader_writer.readJuices("juice.in",juice.getJuice());
            reader_writer.writeInFileComponents("juice1.out", juice.firstTask());
            reader_writer.writeInFileComponents("juice2.out", juice.secondTask());
            reader_writer.writeCount("juice3.out",juice.thirdTask());
        }
        catch (IOException e){System.err.print("Wrong");}
    }
}
