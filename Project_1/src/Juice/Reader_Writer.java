package Juice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Reader_Writer {
    private FileWriter fw;
    private Scanner sc;

    public void readJuices(String path,ArrayList<String> arrayList)throws FileNotFoundException{
        sc = new Scanner(new File(path));
        int i=0;
        while (sc.hasNext()){
            arrayList.add(sc.nextLine());
            //System.out.println(arrayList.get(i));
            i++;
        }
    }

    public void writeInFileComponents(String path,ArrayList<String> arrayList) throws IOException{
        fw = new FileWriter(path);
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()){
            fw.write(it.next()+"\n");
        }
        fw.close();
    }

    public void writeCount(String path, int k) throws IOException{
        fw = new FileWriter(path);
        fw.write("количество: "+k);
        fw.close();
    }

}
