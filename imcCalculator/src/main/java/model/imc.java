package model;

import java.util.ArrayList;

public class imc {
    private final double peso;
    private final int altura;
    private final int idade;
    private final String sexo;

    public imc(double peso, int altura, int idade, String sexo) {
        this.peso = peso;
        this.altura = altura;
        this.idade = idade;
        this.sexo = sexo;

    }

    public String calcularImc(double peso,int altura,int idade,String sexo) {
        double imc = peso / ((altura/100) * (altura/100));
        if (sexo.equals("Feminino") && idade > 65) {
            if (imc < 22) {
                return "Abaixo do peso";
            } else if (imc < 27) {
                return "Peso normal";
            } else if (imc < 32) {
                return "Sobrepeso";
            } else if (imc < 37) {
                return "Obesidade grau 1";
            } else if (imc < 42) {
                return "Obesidade grau 2";
            } else {
                return "Obesidade grau 3";
            }
        }else if (sexo.equals("Masculino") && idade>65) {
            if (imc < 22) {
                return "Abaixo do peso";
            } else if (imc < 27) {
                return "Peso normal";
            } else if (imc < 30) {
                return "Sobrepeso";
            } else if (imc < 35) {
                return "Obesidade grau 1";
            } else if (imc < 40) {
                return "Obesidade grau 2";
            } else {
                return "Obesidade grau 3";
            }

        }if (idade == 2 && sexo.equals("Masculino")) {
            if (imc < 15.5) {
                return "Abaixo do peso";
            } else if (imc < 17.5) {
                return "Peso normal";
            } else if (imc < 18.5) {
                return "Sobrepeso";
            } else {
                return "Obesidade";
            }
        } else if (idade == 4 && sexo.equals("Masculino")) {
            if (imc < 15.0) {
                return "Abaixo do peso";
            } else if (imc < 16.5) {
                return "Peso normal";
            } else if (imc < 18.0) {
                return "Sobrepeso";
            } else {
                return "Obesidade";
            }
        } else if (idade == 6 && sexo.equals("Masculino")) {
            if (imc < 14.5) {
                return "Abaixo do peso";
            } else if (imc < 17.0) {
                return "Peso normal";
            } else if (imc < 19.0) {
                return "Sobrepeso";
            } else {
                return "Obesidade";
            }
        } else if (idade == 8 && sexo.equals("Masculino")) {
            if (imc < 15.0) {
                return "Abaixo do peso";
            } else if (imc < 18.0) {
                return "Peso normal";
            } else if (imc < 20.0) {
                return "Sobrepeso";
            } else {
                return "Obesidade";
            }
        } else if (idade == 10 && sexo.equals("Masculino")) {
            if (imc < 16.0) {
                return "Abaixo do peso";
            } else if (imc < 20.0) {
                return "Peso normal";
            } else if (imc < 22.0) {
                return "Sobrepeso";
            } else {
                return "Obesidade";
            }
        } else if (idade == 2 && sexo.equals("Feminino")) {
            if (imc < 15.0) {
                return "Abaixo do peso";
            } else if (imc < 17.0) {
                return "Peso normal";
            } else if (imc < 18.0) {
                return "Sobrepeso";
            } else {
                return "Obesidade";
            }
        } else if (idade == 4 && sexo.equals("Feminino")) {
            if (imc < 14.0) {
                return "Abaixo do peso";
            } else if (imc < 16.0) {
                return "Peso normal";
            } else if (imc < 18.0) {
                return "Sobrepeso";
            } else {
                return "Obesidade";
            }
        } else if (idade == 6 && sexo.equals("Feminino")) {
            if (imc < 14.0) {
                return "Abaixo do peso";
            } else if (imc < 17.0) {
                return "Peso normal";
            } else if (imc < 19.0) {
                return "Sobrepeso";
            } else {
                return "Obesidade";
            }
        } else if (idade == 8 && sexo.equals("Feminino")) {
            if (imc < 14.5) {
                return "Abaixo do peso";
            } else if (imc < 18.0) {
                return "Peso normal";
            } else if (imc < 20.5) {
                return "Sobrepeso";
            } else {
                return "Obesidade";
            }
        } else if (idade == 10 && sexo.equals("Feminino")) {
            if (imc < 15.0) {
                return "Abaixo do peso";
            } else if (imc < 19.0) {
                return "Peso normal";
            } else if (imc < 22.0) {
                return "Sobrepeso";
            } else {
                return "Obesidade";
            }
        } else{
            if (imc < 16) {
                return "Baixo peso muito grave";
            } else if (imc < 17) {
                return "Baixo peso grave";
            } else if (imc < 18.5) {
                return "Baixo peso";
            } else if (imc < 25) {
                return "Peso normal";
            } else if (imc < 30) {
                return "Sobrepeso";
            } else if (imc < 35) {
                return "Obesidade grau 1";
            } else if (imc < 40) {
                return "Obesidade grau 2";
            } else {
                return "Obesidade grau 3 (obesidade mórbida)";
            }
        }
    }


}