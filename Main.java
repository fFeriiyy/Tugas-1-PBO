import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Variabel dan tipe data
        int angka;
        
        // Input
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        angka = input.nextInt();
        
        // Output
        System.out.println("Angka: " + angka);
        
        // If statement
        if (angka % 2 == 0) {
            System.out.println(angka + " merupakan angka genap");
        } else {
            System.out.println(angka + " merupakan angka ganjil");
        }
        
        System.out.println("Akan menginputkan angka sebanyak batas yang diinputkan");
        
        // Perulangan for
        for (int i = 0; i < angka; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // Perulangan while
        int i = 0;
        while (i < angka) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        
        // Perulangan do while
        int j = 0;
        do {
            System.out.print(j + " ");
            j++;
        } while (j < angka);
        System.out.println();
        
        // Array satu dimensi
        int[] arr = {1, 2, 3, 4, 5};
        System.out.print("Elemen-elemen array: ");
        for (int k = 0; k < 5; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
        
        // Array multidimensi
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Elemen-elemen matriks: ");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
