package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int wordIndex;

        for (int i = 0; i < post.length; i++) {
            wordIndex = word.length - post.length + i;
            if (post[i] != word[wordIndex]) {
                result = false;
                break;
            }
        }

        return result;
    }
}
