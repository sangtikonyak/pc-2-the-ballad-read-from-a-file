package com.jap.ballad;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ballad {
    public String readPoemFromAFile(String fileName) throws FileNotFoundException,IOException {
       // Write the logic to read from a file
        FileInputStream fileInputStream=new FileInputStream("src/main/resources/ballad.txt");
       /* int readData=0;
        char data='\u0000';
        String str="";
        while ((readData=fileInputStream.read()) !=-1)
        {
          data=(char)readData;
          str+=data;

        }*/
        String balladData="";
        Scanner scanner = new Scanner(fileInputStream);
        while (scanner.hasNextLine()) {
            balladData = balladData.concat("\n"+scanner.nextLine());
        }
        return balladData;
    }

    public static void main(String[] args) {
        Ballad ballad = new Ballad();
        try {
           // throw new FileNotMatch("\"Data from file does not match\"");
            System.out.println("ballad.readPoemFromAFile(\"src/main/resources/ballad.txt\") = " + ballad.readPoemFromAFile("src/main/resources/ballad.txt"));
        }catch (FileNotFoundException e)
        {
            e.printStackTrace();
        } catch(IOException e)
        {
            e.printStackTrace();
        }
    }

}
