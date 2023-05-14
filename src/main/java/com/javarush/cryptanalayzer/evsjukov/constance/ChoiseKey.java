package com.javarush.cryptanalayzer.evsjukov.constance;

import java.util.Random;

public class ChoiseKey {
    private static int key;

    public ChoiseKey() {
        Random r = new Random();
        key = r.nextInt(CryptoAlphabet.keyLimits);
        if (key == 0) {
            this.key = key + 1;
        }
       this.key = key;
    }

    public static int getKey() {
        return key;
    }
    public void setKey (int key) {
        this.key = key;
    }
}

