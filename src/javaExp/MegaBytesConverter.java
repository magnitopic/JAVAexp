package javaExp;

public class MegaBytesConverter {
    public static void main(String[] args){
        int kiloBytes=56824;
        printMegaBytesAndKiloBytes(kiloBytes);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int megas=kiloBytes/1024;
        int KBrestantes=-((megas*1024)-kiloBytes);
        System.out.println(kiloBytes+"KB = "+megas+"MB and "+KBrestantes+"KB");
    }
}
