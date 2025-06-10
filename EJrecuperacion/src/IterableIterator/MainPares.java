package IterableIterator;

public class MainPares {
    public static void main(String[] args) {
        System.out.println("Números pares entre 10 y 30:");
        for (int par : new RangoPares(10, 30)) {
            System.out.print(par + " ");
        }
    }
}

