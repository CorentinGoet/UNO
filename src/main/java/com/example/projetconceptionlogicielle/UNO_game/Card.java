package com.example.projetconceptionlogicielle.UNO_game;


/**
 * Classe modélisant une carte à jouer.
 */
public class Card {
    //TODO: Compléter la classe
    public enum couleur {
        red     {public String toString() {return "RED";}},
        green   {public String toString() {return "GREEN";}},
        blue    {public String toString() {return "BLUE";}},
        yellow  {public String toString() {return "YELLOW";}},
        black   {public String toString() {return "BLACK";}},
    }

    //Possibilité entre rouge, vert, bleu, jaune et noire (changement de couleur et +4)
    public enum valeur {
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
        ten     { public String toString() { return "SKIP";}},
        eleven  { public String toString() { return "REVERSE";}},
        twelve  { public String toString() { return "DRAW_TWO";}},
        thirteen{ public String toString() { return "WILDDRAW_FOUR";}},
        fourteen{ public String toString() { return "WILD";}},
    }
    // Prend une valeur entre 0 et 9
    //La valeur 10 correspond à la carte skip
    //La valeur 11 correspond à la carte reverse
    //La valeur 12 correspond à la carte draw_two
    //La valeur 13 correspond à la carte WildDraw_four
    //La valeur 14 correspond à la carte wild (changement de couleur)





}
