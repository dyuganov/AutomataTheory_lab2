package ru.nsu.dyuganov.automatatheorylab2;

public class Symbol implements Word {
    private char s;

    public Symbol(char symbol) {
        this.s = symbol;
    }

    public char getS() {
        return s;
    }

    @Override
    public String toString () {
        return "Symbol(" + s + ")";
    }
}
