package control;
import model.imc;

import java.util.Scanner;

public class programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a altura em centimetros:");
        double altura = scanner.nextInt();
        System.out.println("Digite o peso em kg:");
        double peso = scanner.nextDouble();
        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();
        System.out.println("Digite seu sexo (Masculino/Feminino):");
        String sexo = scanner.nextLine();
    }
}
