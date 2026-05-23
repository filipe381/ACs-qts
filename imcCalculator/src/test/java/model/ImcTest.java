package model;
import model.imc;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ImcTest {
    // Mulher idosa
    @Test
    public void testeCalcularImcMulherAcima65AbaixoPeso() {
        imc pessoa = new imc(21.9, 100, 70, "Feminino");
        assertEquals("Abaixo do peso", pessoa.calcularImc(21.9, 100, 70, "Feminino"));
    }
    @Test
    public void testeCalcularImcMulherAcima65PesoNormalLimInferior() {
        imc pessoa = new imc(22, 100, 70, "Feminino");
        assertEquals("Peso normal", pessoa.calcularImc(22, 100, 70, "Feminino"));
    }
    @Test
    public void testeCalcularImcMulherAcima65PesoNormalLimSuperior() {
        imc pessoa = new imc(26.99, 100, 70, "Feminino");
        assertEquals("Peso normal", pessoa.calcularImc(26.99, 100, 70, "Feminino"));
    }
    @Test
    public void testeCalcularImcMulherAcima65PesoSobrepesoLimInferior() {
        imc pessoa = new imc(27, 100, 70, "Feminino");
        assertEquals("Sobrepeso", pessoa.calcularImc(27, 100, 70, "Feminino"));
    }
    @Test
    public void testeCalcularImcMulherAcima65PesoSobrepesoLimSuperior() {
        imc pessoa = new imc(31.99, 100, 70, "Feminino");
        assertEquals("Sobrepeso", pessoa.calcularImc(31.99, 100, 70, "Feminino"));
    }
    @Test
    public void testeCalcularImcMulherAcima65ObesidadeGrau1LimInferior() {
        imc pessoa = new imc(32, 100, 70, "Feminino");
        assertEquals("Obesidade grau 1", pessoa.calcularImc(32, 100, 70, "Feminino"));
    }
    @Test
    public void testeCalcularImcMulherAcima65ObesidadeGrau1LimSuperior() {
        imc pessoa = new imc(36.99, 100, 70, "Feminino");
        assertEquals("Obesidade grau 1", pessoa.calcularImc(36.99, 100, 70, "Feminino"));
    }
    @Test
    public void testeCalcularImcMulherAcima65ObesidadeGrau2LimInferior() {
        imc pessoa = new imc(37, 100, 70, "Feminino");
        assertEquals("Obesidade grau 2", pessoa.calcularImc(37, 100, 70, "Feminino"));
    }
    @Test
    public void testeCalcularImcMulherAcima65ObesidadeGrau2LimSuperior() {
        imc pessoa = new imc(41.99, 100, 70, "Feminino");
        assertEquals("Obesidade grau 2", pessoa.calcularImc(41.99, 100, 70, "Feminino"));
    }
    @Test
    public void testeCalcularImcMulherAcima65ObesidadeGrau3() {
        imc pessoa = new imc(42, 100, 70, "Feminino");
        assertEquals("Obesidade grau 3", pessoa.calcularImc(42, 100, 70, "Feminino"));
    }
    // Homem idoso
    @Test
    public void testeCalcularImcHomemAcima65AbaixoPeso() {
        imc pessoa = new imc(21.9, 100, 70, "Masculino");
        assertEquals("Abaixo do peso", pessoa.calcularImc(21.9, 100, 70, "Masculino"));
    }
    @Test
    public void testeCalcularImcHomemAcima65PesoNormalLimInferior() {
        imc pessoa = new imc(22, 100, 70, "Masculino");
        assertEquals("Peso normal", pessoa.calcularImc(22, 100, 70, "Masculino"));
    }
    @Test
    public void testeCalcularImcHomemAcima65PesoNormalLimSuperior() {
        imc pessoa = new imc(26.99, 100, 70, "Masculino");
        assertEquals("Peso normal", pessoa.calcularImc(26.99, 100, 70, "Masculino"));
    }
    @Test
    public void testeCalcularImcHomemAcima65PesoSobrepesoLimInferior() {
        imc pessoa = new imc(27, 100, 70, "Masculino");
        assertEquals("Sobrepeso", pessoa.calcularImc(27, 100, 70, "Masculino"));
    }
    @Test
    public void testeCalcularImcHomemAcima65PesoSobrepesoLimSuperior() {
        imc pessoa = new imc(29.99, 100, 70, "Masculino");
        assertEquals("Sobrepeso", pessoa.calcularImc(29.99, 100, 70, "Masculino"));
    }
    @Test
    public void testeCalcularImcHomemAcima65ObesidadeGrau1LimInferior() {
        imc pessoa = new imc(30, 100, 70, "Masculino");
        assertEquals("Obesidade grau 1", pessoa.calcularImc(30, 100, 70, "Masculino"));
    }
    @Test
    public void testeCalcularImcHomemAcima65ObesidadeGrau1LimSuperior() {
        imc pessoa = new imc(34.99, 100, 70, "Masculino");
        assertEquals("Obesidade grau 1", pessoa.calcularImc(34.99, 100, 70, "Masculino"));
    }
    @Test
    public void testeCalcularImcHomemAcima65ObesidadeGrau2LimInferior() {
        imc pessoa = new imc(35, 100, 70, "Masculino");
        assertEquals("Obesidade grau 2", pessoa.calcularImc(35, 100, 70, "Masculino"));
    }
    @Test
    public void testeCalcularImcHomemAcima65ObesidadeGrau2LimSuperior() {
        imc pessoa = new imc(39.99, 100, 70, "Masculino");
        assertEquals("Obesidade grau 2", pessoa.calcularImc(39.99, 100, 70, "Masculino"));
    }
    @Test
    public void testeCalcularImcHomemAcima65ObesidadeGrau3() {
        imc pessoa = new imc(40, 100, 70, "Masculino");
        assertEquals("Obesidade grau 3", pessoa.calcularImc(40, 100, 70, "Masculino"));
    }
    // Criança menino
    @Test
    public void testeCalcularImcMenino2AbaixoPeso() {
        imc pessoa = new imc(14.0, 100, 2, "Masculino");
        assertEquals("Abaixo do peso", pessoa.calcularImc(14.0, 100, 2, "Masculino"));
    }
    @Test
    public void testeCalcularImcMenino2PesoNormalLimInferior() {
        imc pessoa = new imc(15.5, 100, 2, "Masculino");
        assertEquals("Peso normal", pessoa.calcularImc(15.5, 100, 2, "Masculino"));
    }
    @Test
    public void testeCalcularImcMenino2PesoNormalLimSuperior() {
        imc pessoa = new imc(17.4, 100, 2, "Masculino");
        assertEquals("Peso normal", pessoa.calcularImc(17.4, 100, 2, "Masculino"));
    }
    @Test
    public void testeCalcularImcMenino2SobrepesoLimInferior() {
        imc pessoa = new imc(17.5, 100, 2, "Masculino");
        assertEquals("Sobrepeso", pessoa.calcularImc(17.5, 100, 2, "Masculino"));
    }
    @Test
    public void testeCalcularImcMenino2SobrepesoLimSuperior() {
        imc pessoa = new imc(18.4, 100, 2, "Masculino");
        assertEquals("Sobrepeso", pessoa.calcularImc(18.4, 100, 2, "Masculino"));
    }
    @Test
    public void testeCalcularImcMenino2Obesidade() {
        imc pessoa = new imc(18.5, 100, 2, "Masculino");
        assertEquals("Obesidade", pessoa.calcularImc(18.5, 100, 2, "Masculino"));
    }
    @Test
    public void testeCalcularImcMenino4AbaixoPeso() {
        imc pessoa = new imc(14.0, 100, 4, "Masculino");
        assertEquals("Abaixo do peso", pessoa.calcularImc(14.0, 100, 4, "Masculino"));
    }
    @Test
    public void testeCalcularImcMenino4PesoNormalLimInferior() {
        imc pessoa = new imc(15.0, 100, 4, "Masculino");
        assertEquals("Peso normal", pessoa.calcularImc(15.0, 100, 4, "Masculino"));
    }
    @Test
    public void testeCalcularImcMenino4PesoNormalLimSuperior() {
        imc pessoa = new imc(16.4, 100, 4, "Masculino");
        assertEquals("Peso normal", pessoa.calcularImc(16.4, 100, 4, "Masculino"));
    }
    @Test
    public void testeCalcularImcMenino4SobrepesoLimInferior() {
        imc pessoa = new imc(16.5, 100, 4, "Masculino");
        assertEquals("Sobrepeso", pessoa.calcularImc(16.5, 100, 4, "Masculino"));
    }
    @Test
    public void testeCalcularImcMenino4SobrepesoLimSuperior() {
        imc pessoa = new imc(17.9, 100, 4, "Masculino");
        assertEquals("Sobrepeso", pessoa.calcularImc(17.9, 100, 4, "Masculino"));
    }
    @Test
    public void testeCalcularImcMenino4Obesidade() {
        imc pessoa = new imc(18.0, 100, 4, "Masculino");
        assertEquals("Obesidade", pessoa.calcularImc(18.0, 100, 4, "Masculino"));
    }
    @Test
    public void testeCalcularImcMenino6AbaixoPeso() {
        imc pessoa = new imc(14.0, 100, 6, "Masculino");
        assertEquals("Abaixo do peso", pessoa.calcularImc(14.0, 100, 6, "Masculino"));
    }
    @Test
    public void testeCalcularImcMenino6PesoNormalLimInferior() {
        imc pessoa = new imc(14.5, 100, 6, "Masculino");
        assertEquals("Peso normal", pessoa.calcularImc(14.5, 100, 6, "Masculino"));
    }
    @Test
    public void testeCalcularImcMenino6PesoNormalLimSuperior() {
        imc pessoa = new imc(16.9, 100, 6, "Masculino");
        assertEquals("Peso normal", pessoa.calcularImc(16.9, 100, 6, "Masculino"));
    }
    @Test
    public void testeCalcularImcMenino6SobrepesoLimInferior() {
        imc pessoa = new imc(17.0, 100, 6, "Masculino");
        assertEquals("Sobrepeso", pessoa.calcularImc(17.0, 100, 6, "Masculino"));
    }
    @Test
    public void testeCalcularImcMenino6SobrepesoLimSuperior() {
        imc pessoa = new imc(18.9, 100, 6, "Masculino");
        assertEquals("Sobrepeso", pessoa.calcularImc(18.9, 100, 6, "Masculino"));
    }
    @Test
    public void testeCalcularImcMenino6Obesidade() {
        imc pessoa = new imc(19.0, 100, 6, "Masculino");
        assertEquals("Obesidade", pessoa.calcularImc(19.0, 100, 6, "Masculino"));
    }
    @Test
    public void testeCalcularImcMenino8AbaixoPeso() {
        imc pessoa = new imc(14.0, 100, 8, "Masculino");
        assertEquals("Abaixo do peso", pessoa.calcularImc(14.0, 100, 8, "Masculino"));
    }
    @Test
    public void testeCalcularImcMenino8PesoNormalLimInferior() {
        imc pessoa = new imc(15, 100, 8, "Masculino");
        assertEquals("Peso normal", pessoa.calcularImc(15, 100, 8, "Masculino"));
    }
    @Test
    public void testeCalcularImcMenino8PesoNormalLimSuperior() {
        imc pessoa = new imc(17.9, 100, 8, "Masculino");
        assertEquals("Peso normal", pessoa.calcularImc(17.9, 100, 8, "Masculino"));
    }
    @Test
    public void testeCalcularImcMenino8SobrepesoLimInferior() {
        imc pessoa = new imc(18.0, 100, 8, "Masculino");
        assertEquals("Sobrepeso", pessoa.calcularImc(18.0, 100, 8, "Masculino"));
    }
    @Test
    public void testeCalcularImcMenino8SobrepesoLimSuperior() {
        imc pessoa = new imc(19.9, 100, 8, "Masculino");
        assertEquals("Sobrepeso", pessoa.calcularImc(19.9, 100, 8, "Masculino"));
    }
    @Test
    public void testeCalcularImcMenino8Obesidade() {
        imc pessoa = new imc(20.5, 100, 8, "Masculino");
        assertEquals("Obesidade", pessoa.calcularImc(20.5, 100, 8, "Masculino"));
    }
    @Test
    public void testeCalcularImcMenino10AbaixoPeso() {
        imc pessoa = new imc(15.9, 100, 10, "Masculino");
        assertEquals("Abaixo do peso", pessoa.calcularImc(15.9, 100, 10, "Masculino"));
    }
    @Test
    public void testeCalcularImcMenino10PesoNormalLimInferior() {
        imc pessoa = new imc(16.0, 100, 10, "Masculino");
        assertEquals("Peso normal", pessoa.calcularImc(17.0, 100, 10, "Masculino"));
    }
    @Test
    public void testeCalcularImcMenino10PesoNormalLimSuperior() {
        imc pessoa = new imc(19.9, 100, 10, "Masculino");
        assertEquals("Peso normal", pessoa.calcularImc(19.9, 100, 10, "Masculino"));
    }
    @Test
    public void testeCalcularImcMenino10SobrepesoLimInferior() {
        imc pessoa = new imc(20.0, 100, 10, "Masculino");
        assertEquals("Peso normal", pessoa.calcularImc(17.0, 100, 10, "Masculino"));
    }
    @Test
    public void testeCalcularImcMenino10SobrepesoLimSuperior() {
        imc pessoa = new imc(21.9, 100, 10, "Masculino");
        assertEquals("Peso normal", pessoa.calcularImc(19.9, 100, 10, "Masculino"));
    }
    @Test
    public void testeCalcularImcMenino10Obesidade() {
        imc pessoa = new imc(22.0, 100, 10, "Masculino");
        assertEquals("Obesidade", pessoa.calcularImc(22.0, 100, 10, "Masculino"));
    }
    //crianca menina
    @Test
    public void testeCalcularImcMenina2AbaixoPeso() {
        imc pessoa = new imc(14.0, 100, 2, "Feminino");
        assertEquals("Abaixo do peso", pessoa.calcularImc(14.0, 100, 2, "Feminino"));
    }
    @Test
    public void testeCalcularImcMenina2PesoNormalLimInferior() {
        imc pessoa = new imc(15.0, 100, 2, "Feminino");
        assertEquals("Peso normal", pessoa.calcularImc(15.0, 100, 2, "Feminino"));
    }
    @Test
    public void testeCalcularImcMenina2PesoNormalLimSuperior() {
        imc pessoa = new imc(16.9, 100, 2, "Feminino");
        assertEquals("Peso normal", pessoa.calcularImc(16.9, 100, 2, "Feminino"));
    }
    @Test
    public void testeCalcularImcMenina2SobrepesoLimInferior() {
        imc pessoa = new imc(17.0, 100, 2, "Feminino");
        assertEquals("Sobrepeso", pessoa.calcularImc(17.0, 100, 2, "Feminino"));
    }
    @Test
    public void testeCalcularImcMenina2SobrepesoLimSuperior() {
        imc pessoa = new imc(17.9, 100, 2, "Feminino");
        assertEquals("Sobrepeso", pessoa.calcularImc(17.9, 100, 2, "Feminino"));
    }
    @Test
    public void testeCalcularImcMenina2Obesidade() {
        imc pessoa = new imc(18.0, 100, 2, "Feminino");
        assertEquals("Obesidade", pessoa.calcularImc(18.0, 100, 2, "Feminino"));
    }
    @Test
    public void testeCalcularImcMenina4AbaixoPeso() {
        imc pessoa = new imc(13.9, 100, 4, "Feminino");
        assertEquals("Abaixo do peso", pessoa.calcularImc(13.9, 100, 4, "Feminino"));
    }
    @Test
    public void testeCalcularImcMenina4PesoNormalLimInferior() {
        imc pessoa = new imc(14.0, 100, 4, "Feminino");
        assertEquals("Peso normal", pessoa.calcularImc(14.0, 100, 4, "Feminino"));
    }
    @Test
    public void testeCalcularImcMenina4PesoNormalLimSuperior() {
        imc pessoa = new imc(15.9, 100, 4, "Feminino");
        assertEquals("Peso normal", pessoa.calcularImc(15.9, 100, 4, "Feminino"));
    }
    @Test
    public void testeCalcularImcMenina4SobrepesoLimInferior() {
        imc pessoa = new imc(16.0, 100, 4, "Feminino");
        assertEquals("Sobrepeso", pessoa.calcularImc(16.0, 100, 4, "Feminino"));
    }
    @Test
    public void testeCalcularImcMenina4SobrepesoLimSuperior() {
        imc pessoa = new imc(17.9, 100, 4, "Feminino");
        assertEquals("Sobrepeso", pessoa.calcularImc(17.9, 100, 4, "Feminino"));
    }
    @Test
    public void testeCalcularImcMenina4Obesidade() {
        imc pessoa = new imc(18.0, 100, 4, "Feminino");
        assertEquals("Obesidade", pessoa.calcularImc(18.0, 100, 4, "Feminino"));
    }
    @Test
    public void testeCalcularImcMenina6AbaixoPeso() {
        imc pessoa = new imc(13.9, 100, 6, "Feminino");
        assertEquals("Abaixo do peso", pessoa.calcularImc(13.9, 100, 6, "Feminino"));
    }
    @Test
    public void testeCalcularImcMenina6PesoNormalLimInferior() {
        imc pessoa = new imc(14.0, 100, 6, "Feminino");
        assertEquals("Peso normal", pessoa.calcularImc(14.0, 100, 6, "Feminino"));
    }
    @Test
    public void testeCalcularImcMenina6PesoNormalLimSuperior() {
        imc pessoa = new imc(16.9, 100, 6, "Feminino");
        assertEquals("Peso normal", pessoa.calcularImc(16.9, 100, 6, "Feminino"));
    }
    @Test
    public void testeCalcularImcMenina6SobrepesoLimInferior() {
        imc pessoa = new imc(17.0, 100, 6, "Feminino");
        assertEquals("Sobrepeso", pessoa.calcularImc(17.0, 100, 6, "Feminino"));
    }
    @Test
    public void testeCalcularImcMenina6SobrepesoLimSuperior() {
        imc pessoa = new imc(18.9, 100, 6, "Feminino");
        assertEquals("Sobrepeso", pessoa.calcularImc(18.9, 100, 6, "Feminino"));
    }
    @Test
    public void testeCalcularImcMenina6Obesidade() {
        imc pessoa = new imc(19.0, 100, 6, "Feminino");
        assertEquals("Obesidade", pessoa.calcularImc(19.0, 100, 6, "Feminino"));
    }
    @Test
    public void testeCalcularImcMenina8AbaixoPeso() {
        imc pessoa = new imc(14.4, 100, 8, "Feminino");
        assertEquals("Abaixo do peso", pessoa.calcularImc(14.4, 100, 8, "Feminino"));
    }
    @Test
    public void testeCalcularImcMenina8PesoNormalLimInferior() {
        imc pessoa = new imc(14.5, 100, 8, "Feminino");
        assertEquals("Peso normal", pessoa.calcularImc(14.5, 100, 8, "Feminino"));
    }
    @Test
    public void testeCalcularImcMenina8PesoNormalLimSuperior() {
        imc pessoa = new imc(17.9, 100, 8, "Feminino");
        assertEquals("Peso normal", pessoa.calcularImc(17.9, 100, 8, "Feminino"));
    }
    @Test
    public void testeCalcularImcMenina8SobrepesoLimInferior() {
        imc pessoa = new imc(18.0, 100, 8, "Feminino");
        assertEquals("Sobrepeso", pessoa.calcularImc(18.0, 100, 8, "Feminino"));
    }
    @Test
    public void testeCalcularImcMenina8SobrepesoLimSuperior() {
        imc pessoa = new imc(20.4, 100, 8, "Feminino");
        assertEquals("Sobrepeso", pessoa.calcularImc(20.4, 100, 8, "Feminino"));
    }
    @Test
    public void testeCalcularImcMenina8Obesidade() {
        imc pessoa = new imc(20.5, 100, 8, "Feminino");
        assertEquals("Obesidade", pessoa.calcularImc(20.5, 100, 8, "Feminino"));
    }
    @Test
    public void testeCalcularImcMenina10AbaixoPeso() {
        imc pessoa = new imc(14.9, 100, 10, "Feminino");
        assertEquals("Abaixo do peso", pessoa.calcularImc(14.9, 100, 10, "Feminino"));
    }
    @Test
    public void testeCalcularImcMenina10PesoNormalLimInferior() {
        imc pessoa = new imc(15.0, 100, 10, "Feminino");
        assertEquals("Peso normal", pessoa.calcularImc(15.0, 100, 10, "Feminino"));
    }
    @Test
    public void testeCalcularImcMenina10PesoNormalLimSuperior() {
        imc pessoa = new imc(18.9, 100, 10, "Feminino");
        assertEquals("Peso normal", pessoa.calcularImc(18.9, 100, 10, "Feminino"));
    }
    @Test
    public void testeCalcularImcMenina10SobrepesoLimInferior() {
        imc pessoa = new imc(19.0, 100, 10, "Feminino");
        assertEquals("Sobrepeso", pessoa.calcularImc(19.0, 100, 10, "Feminino"));
    }
    @Test
    public void testeCalcularImcMenina10SobrepesoLimSuperior() {
        imc pessoa = new imc(21.9, 100, 10, "Feminino");
        assertEquals("Sobrepeso", pessoa.calcularImc(21.9, 100, 10, "Feminino"));
    }
    @Test
    public void testeCalcularImcMenina10Obesidade() {
        imc pessoa = new imc(22.0, 100, 10, "Feminino");
        assertEquals("Obesidade", pessoa.calcularImc(22.0, 100, 10, "Feminino"));
    }
    // Homem adulto
    @Test
    public void testeCalcularImcHomemBaixoPesoMuitoGrave() {
        imc pessoa = new imc(15.9, 100, 40, "Masculino");
        assertEquals("Baixo peso muito grave", pessoa.calcularImc(15.9, 100, 40, "Masculino"));
    }
    @Test
    public void testeCalcularImcHomemBaixoPesoGraveLimInferior() {
        imc pessoa = new imc(16.0, 100, 40, "Masculino");
        assertEquals("Baixo peso grave", pessoa.calcularImc(16.0, 100, 40, "Masculino"));
    }
    @Test
    public void testeCalcularImcHomemBaixoPesoGraveLimSuperior() {
        imc pessoa = new imc(16.9, 100, 40, "Masculino");
        assertEquals("Baixo peso grave", pessoa.calcularImc(16.9, 100, 40, "Masculino"));
    }
    @Test
    public void testeCalcularImcHomemBaixoPesoLimInferior() {
        imc pessoa = new imc(18.0, 100, 40, "Masculino");
        assertEquals("Baixo peso", pessoa.calcularImc(18.0, 100, 40, "Masculino"));
    }
    @Test
    public void testeCalcularImcHomemBaixoPesoLimSuperior() {
        imc pessoa = new imc(18.4, 100, 40, "Masculino");
        assertEquals("Baixo peso", pessoa.calcularImc(18.4, 100, 40, "Masculino"));
    }
    @Test
    public void testeCalcularImcHomemPesoNormalLimInferior() {
        imc pessoa = new imc(18.5, 100, 40, "Masculino");
        assertEquals("Peso normal", pessoa.calcularImc(18.5, 100, 40, "Masculino"));
    }
    @Test
    public void testeCalcularImcHomemPesoNormalLimSuperior() {
        imc pessoa = new imc(24.9, 100, 40, "Masculino");
        assertEquals("Peso normal", pessoa.calcularImc(24.9, 100, 40, "Masculino"));
    }
    @Test
    public void testeCalcularImcHomemSobrepesoLimInferior() {
        imc pessoa = new imc(25.0, 100, 40, "Masculino");
        assertEquals("Sobrepeso", pessoa.calcularImc(25.0, 100, 40, "Masculino"));
    }
    @Test
    public void testeCalcularImcHomemSobrepesoLimSuperior() {
        imc pessoa = new imc(29.9, 100, 40, "Masculino");
        assertEquals("Sobrepeso", pessoa.calcularImc(29.9, 100, 40, "Masculino"));
    }
    @Test
    public void testeCalcularImcHomemObesidadeGrau1LimInferior() {
        imc pessoa = new imc(30.0, 100, 40, "Masculino");
        assertEquals("Obesidade grau 1", pessoa.calcularImc(30.0, 100, 40, "Masculino"));
    }
    @Test
    public void testeCalcularImcHomemObesidadeGrau1LimSuperior() {
        imc pessoa = new imc(34.9, 100, 40, "Masculino");
        assertEquals("Obesidade grau 1", pessoa.calcularImc(34.9, 100, 40, "Masculino"));
    }
    @Test
    public void testeCalcularImcHomemObesidadeGrau2LimInferior() {
        imc pessoa = new imc(35.0, 100, 40, "Masculino");
        assertEquals("Obesidade grau 2", pessoa.calcularImc(35.0, 100, 40, "Masculino"));
    }
    @Test
    public void testeCalcularImcHomemObesidadeGrau2LimSuperior() {
        imc pessoa = new imc(39.9, 100, 40, "Masculino");
        assertEquals("Obesidade grau 2", pessoa.calcularImc(39.9, 100, 40, "Masculino"));
    }
    @Test
    public void testeCalcularImcHomemObesidadeGrau3() {
        imc pessoa = new imc(40.0, 100, 40, "Masculino");
        assertEquals("Obesidade grau 3 (obesidade mórbida)", pessoa.calcularImc(40.0, 100, 40, "Masculino"));
    }



}
