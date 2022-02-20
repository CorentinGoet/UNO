package com.example.projetconceptionlogicielle.UNO_game;

/**
 * This enumeration details the different special effects for the beginning of a {@link Turn}
 */
public enum Effect {
    drawTwo,
    drawFour,
    newColor {
        public Color color;
    },
}
