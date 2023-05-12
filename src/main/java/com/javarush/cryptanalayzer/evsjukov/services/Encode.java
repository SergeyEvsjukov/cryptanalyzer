package com.javarush.cryptanalayzer.evsjukov.services;
import java.io.*;
import java.util.Arrays;

public class Encode {
    public static void main(String[] args) {
        try(FileReader reader = new FileReader("input.txt"))
        {
            char[] buf = new char[256];
            int i;
            while((i = reader.read(buf))>0){
                if(i < 256){
                    buf = Arrays.copyOf(buf, i);
                }
                System.out.print(buf);
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
