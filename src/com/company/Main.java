package com.company;

public class Main {

    public static void main(String[] args) { // найти среди чисел от 50 до 70 второе простое число и завершить цикл
                                            // использованием break. не втыкаю абсссоооолютно как найти 2е число((

        boolean prime = true;
        for (int P = 50; P <= 70; P++) {
            for (int i = 2; i < P; i++) {
                if (P % i == 0) {
                  prime = false;
                    break;
                }
            }
            if (prime) System.out.println(P);
            else prime = true;
        }

	}
}
