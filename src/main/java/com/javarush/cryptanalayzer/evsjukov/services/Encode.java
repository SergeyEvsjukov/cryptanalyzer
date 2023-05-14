package com.javarush.cryptanalayzer.evsjukov.services;
import com.javarush.cryptanalayzer.evsjukov.constance.ChoiseKey;
import com.javarush.cryptanalayzer.evsjukov.constance.CryptoAlphabet;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class Encode {
    public static void main(String[] args) {
        System.out.println("Введите ключ для шифрования от 1 до " + (CryptoAlphabet.keyLimits+1));
        System.out.println("Или нажмите \"Пробел\" для получения случайного ключа для ширования");
        Scanner scanner = new Scanner(System.in);
        ChoiseKey key = new ChoiseKey();
        System.out.println(key.getKey());

//        ArrayList<Character> input = new ArrayList<Character>();
//        try(FileReader reader = new FileReader("input.txt"))
//        {
//            char[] buf = new char[256];
//            int i;
//            while((i = reader.read(buf))>0){
//                if(i < 256){
//                    buf = Arrays.copyOf(buf, i);
//                }
//                System.out.println(buf);
//            }
//        }
//        catch(IOException ex){
//            System.out.println(ex.getMessage());
//        }

    }
}
