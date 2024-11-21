package com.LiarsDeck;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // Testing revolver mechanics
        Revolver revolver = new Revolver();
        System.out.println("Shooting bullet: " + revolver.getChambers());
        while (!revolver.shoot()) {
            System.out.println("Shooting bullet: " + revolver.getChambers());
        }
    }
}