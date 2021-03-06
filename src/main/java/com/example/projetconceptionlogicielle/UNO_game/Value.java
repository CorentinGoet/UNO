package com.example.projetconceptionlogicielle.UNO_game;

/**
 * Enumerates the different possible values for cards {@link Card}
 */
public enum Value {
    ZERO    { public String toString() { return "0";}},
    ONE     { public String toString() { return "1";}},
    TWO     { public String toString() { return "2";}},
    THREE   { public String toString() { return "3";}},
    FOUR    { public String toString() { return "4";}},
    FIVE    { public String toString() { return "5";}},
    SIX     { public String toString() { return "6";}},
    SEVEN   { public String toString() { return "7";}},
    EIGHT   { public String toString() { return "8";}},
    NINE    { public String toString() { return "9";}},
    skip     { public String toString() { return "SKIP";}},
    reverse  { public String toString() { return "REVERSE";}},
    drawTwo  { public String toString() { return "DRAW_TWO";}},
    wildDrawFour{ public String toString() { return "WILDDRAW_FOUR";}},
    wildDraw{ public String toString() { return "WILD";}},
}
