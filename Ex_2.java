package Gupy;

import java.util.Scanner;

public class Ex_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        int a = 0;
        int b = 1;
        while (b < numero) {
            int temp = a;
            a = b;
            b = temp + b;
        }
        
        if (b == numero) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }

	}

}
