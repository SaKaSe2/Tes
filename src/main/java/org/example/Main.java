package org.example;

/**
 * Kelas ini berisi metode utama yang memeriksa apakah sebuah bilangan bulat
 * merupakan bilangan prima.
 */
public class Main {

    /**
     *   Metode utama yang menjalankan program.
     * Metode ini menginisialisasi sebuah nilai bilangan bulat dan memeriksa apakah bilangan tersebut prima.
     *
     /**
     *
     * @param args tidak digunakan
     */
    public static void main(String[] args) {
        int number = 29;
        boolean isPrime = true;

        // Loop untuk memeriksa pembagian dari 2 hingga setengah dari bilangan
        for (int i = 2; i <= number / 2; ++i) {
            // Jika bilangan habis dibagi i, maka bilangan tersebut bukan prima
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }


        if (isPrime) {
            System.out.println(number + " adalah bilangan prima.");
        } else {
            System.out.println(number + " bukan bilangan prima.");
        }
    }
}