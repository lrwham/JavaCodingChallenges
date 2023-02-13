package org.lrwham;

import org.lrwham.ciphers.Caesar;

public class Main {
    public static void main(String[] args) {

        String plain = "Hello, World!";

        System.out.println(plain);

        String secret = Caesar.encipher(plain, 6);

        System.out.println(secret);

        System.out.println(Caesar.decipher(secret, 6));

        System.out.println(Caesar.encipher("Hello, World!", 6).equals("Nkrru, Cuxrj!"));
    }
}