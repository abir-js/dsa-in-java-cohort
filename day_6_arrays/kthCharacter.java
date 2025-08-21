package day_6_arrays;

class Solution {
    StringBuilder word = new StringBuilder("a");

    public char kthCharacter(int k) {
        // Keep generating until we have enough length
        while (word.length() < k) {
            getWord();
        }
        return word.charAt(k - 1);
    }

    void getWord() {
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c == 'z') {
                temp.append('a');
            } else {
                temp.append((char)(c + 1));
            }
        }
        word.append(temp);
    }
}
