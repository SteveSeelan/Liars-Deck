package com.LiarsDeck;

public class Revolver {
    private static final int MAX_CHAMBERS = 10;
    private static final int BULLET_POSITION = 1;
    // NOTE usually would be 6, making it 10 so that
    // 1st shot is less likely to eliminate a player
    private int chambers;

    public Revolver() {
        chambers = MAX_CHAMBERS;
    }

    public boolean shoot() {
        if (chambers <= 1 || BULLET_POSITION == (int)(Math.random() * chambers)) {
            return true;
        } else {
            chambers -= 2;
            return false;
        }
    }

    public int getChambers() {
        return chambers;
    }
}
