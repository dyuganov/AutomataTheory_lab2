package ru.nsu.dyuganov.automatatheorylab2;

public class Concatenation implements Word {
    private Word s1;
    private Word s2;

    public Concatenation(Word word1, Word word2) {
        this.s1 = word1;
        this.s2 = word2;
    }

    public Word getS1() {
        return s1;
    }

    public Word getS2() {
        return s2;
    }

    @Override
    public String toString () {
        String s = "concat(" + s1.toString() + " , " + s2.toString() + ")";
        return s;
    }
}
