package me.dominicpace.jasm;

public class jASM {

    public static void main(String[] args) {
        System.out.println("Vopi's Java 8080 assembler");
        if(args.length < 2) {
            System.out.println("USAGE: java jASM <input.s>");
        }
    }
}
