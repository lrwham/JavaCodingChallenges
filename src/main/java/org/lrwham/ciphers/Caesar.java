package org.lrwham.ciphers;

public class Caesar {

    public static String encipher(String message, int key) {

        key %= 26;

        StringBuilder secret = new StringBuilder(message.length());

        for (char c : message.toCharArray()) {
            char temp = (char) (c + key);

            if (Character.isLowerCase(c)) {
                if (temp > 'z') {
                    temp -= 26;
                }
                secret.append(temp);
            } else if (Character.isUpperCase(c)) {
                if (temp > 'Z') {
                    temp -= 26;
                }
                secret.append(temp);
            } else {
                secret.append(c);
            }
        }

        return secret.toString();

    }

    public static String decipher(String secret, int key) {
        key %= 26;

        StringBuilder message = new StringBuilder(secret.length());

        for (char c : secret.toCharArray()) {
            char temp = (char) (c - key);

            if (Character.isLowerCase(c)) {
                if (temp < 'a') {
                    temp += 26;
                }
                message.append(temp);
            } else if (Character.isUpperCase(c)) {
                if (temp < 'A') {
                    temp += 26;
                }
                message.append(temp);

            } else {
                message.append(c);
            }
        }

        return message.toString();

    }

}
