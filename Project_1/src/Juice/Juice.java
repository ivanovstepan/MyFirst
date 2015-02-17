package Juice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class Juice implements Runnable {

    public ArrayList<String> getJuice() {
        return juice;
    }

    private ArrayList<String> juice;
    private ArrayList<String> components;

    public Juice (){
        juice = new ArrayList<String>();
        components = new ArrayList<String>();
    }
    public void run(){
        Collections.sort(components,new Comp());
    }
    private void getComponents(){
        Set compon = new LinkedHashSet<String>();
        for (int i=0;i<juice.size();i++){
            String [] a = juice.get(i).split(" ");
            for (int j=0;j<a.length;j++){
                compon.add(a[j]);
            }
        }
        components = new ArrayList<String>(compon);
    }

    public ArrayList<String> firstTask(){
       getComponents();
        return components;
    }

    public ArrayList<String> secondTask(){
        run();
        return components;
    }

    public int  thirdTask(){
        ArrayList<String> newArray = new ArrayList<String>(juice);
        Collections.sort(newArray, new Comporator());
        for (int i=0;i<newArray.size();i++){
            //System.out.println(newArray.get(i));
        }
        int count=0;
        for (int k=0;k<newArray.size();k++){
            if (newArray.get(k).split(" ").length==1){
                //System.out.println(newArray.get(k));
                String compon = new String(newArray.get(k));
                //newArray.remove(k);
                count++;
                for (int i=k+1;i<newArray.size();i++){
                    if (newArray.get(i).split(" ")[0].contains(compon)) {
                        //System.out.println(newArray.get(i));
                        newArray.remove(i);
                        i--;
                    }
                }
            }
            else count++;
        }
        return count+1;
    }
}
