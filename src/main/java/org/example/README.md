# Pengecek Bilangan Prima

Program Java ini memeriksa apakah suatu bilangan bulat adalah bilangan prima. Bilangan prima adalah bilangan asli lebih dari 1 yang tidak dapat dibagi oleh bilangan lain selain 1 dan dirinya sendiri.

## Cara Kerja

Program ini mendefinisikan sebuah bilangan bulat `number` dan variabel boolean `isPrime` yang awalnya diset ke `true`. Kemudian, program menggunakan loop `for` untuk mengecek bilangan dari 2 hingga `number / 2`. Jika `number` dapat dibagi habis oleh salah satu bilangan dalam rentang ini, maka `isPrime` diset ke `false` dan loop dihentikan.

Terakhir, program memeriksa nilai `isPrime`:
- Jika `isPrime` adalah `true`, program mencetak bahwa bilangan tersebut adalah bilangan prima.
- Jika tidak, program mencetak bahwa bilangan tersebut bukan bilangan prima.

## Kode

```java
package org.example;

public class Main {
    public static void main(String[] args) {
        int number = 29;
        boolean isPrime = true;

        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
