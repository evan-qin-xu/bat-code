package com.zeroonejourney.arrayandstring;

public class ReverseVowels {
    public String solution(String s) {
        String vowels = "aeiouAEIOU";
        char[] chs = s.toCharArray();
        int length = chs.length;
        int j = length - 1;
        for (int i = 0; i < j; i++) {
            if (vowels.indexOf(chs[i]) != -1) {
                while (j >= i + 1) {
                    if (vowels.indexOf(chs[j]) != -1) {
                        // Swap vowels
                        char temp = chs[i];
                        chs[i] = chs[j];
                        chs[j] = temp;
                        j--;
                        break;
                    }
                    j--;
                }
            }
        }
        return new String(chs);
    }
}
