package com.javarush.cryptanalayzer.evsjukov.view;

import com.javarush.cryptanalayzer.evsjukov.services.BrutForce;
import com.javarush.cryptanalayzer.evsjukov.services.Decode;
import com.javarush.cryptanalayzer.evsjukov.services.Encode;

import javax.swing.text.View;
import java.util.Scanner;

public class EntryPoint {
    public static void main (String[] args) {
        System.out.println("Для кодирования файла нажмите \"1\"");
        System.out.println("Для раскодирования файла нажмите \"2\"");
        System.out.println("Для автоматической расшифровки файла нажмите \"3\"");
//        Функция шифровки и расшифровки текста введенного в консоль минуя запись в файл

//        System.out.println("Для кодировки введенного текста нажмите \"4\"");
//        System.out.println("Для раскодировки введенного текста нажмите \"5\"");
        Scanner scanner = new Scanner(System.in);
        int choiseFunction = scanner.nextInt();
        switch (choiseFunction){
            case 1:
                Encode encode = new Encode();
                break;
            case 2:
                Decode decode = new Decode();
                break;
            case 3:
                BrutForce brutForce= new BrutForce();
                break;
//                Включение функции шифровки и расшифровки текста введенного в консоль

//            case 4:
//                System.out.println("Введите текст для шифрования");
//                break;
//            case 5:
//                System.out.println("Введите текст для расшифровке");
//                break;
            default:
                System.out.println("Введенное значение не поддерживается");
        }
    }
}
