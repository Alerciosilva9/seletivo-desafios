package segundoDesafio;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            float value = scan.nextFloat();
            decomporCedulas(value);
            decomporMoedas(value);
        }catch (InputMismatchException e){
            throw new InputMismatchException("Valores Inseridos são invalidos");
        }

    }
    public static void decomporCedulas(float num){
        List<String> descricao = new ArrayList<String>();
        float aux = num;
        descricao.add((int)(aux/100)+" nota(s) de R$ 100.00");
        aux = aux%100;
        descricao.add((int)(aux/50)+" nota(s) de R$ 50.00");
        aux = aux%50;
        descricao.add((int)(aux/20)+" nota(s) de R$ 20.00");
        aux = aux%20;
        descricao.add((int)(aux/10)+" nota(s) de R$ 10.00");
        aux = aux%10;
        descricao.add((int)(aux/5)+" nota(s) de R$ 5.00");
        aux = aux%5;
        descricao.add((int)(aux/2)+" nota(s) de R$ 2.00");
        aux = aux%2;
        System.out.println("NOTAS:");
        descricao.forEach(i-> System.out.println(i));
    }

    public static void decomporMoedas(float num){
        List<String> descricao = new ArrayList<String>();
        float resto = BigDecimal.valueOf(num%5.0f).setScale(2, BigDecimal.ROUND_HALF_DOWN).floatValue();
        resto = resto%2.0f;
        descricao.add((int)(resto/1)+" moeda(s) de R$ 1.00");
        resto = resto%1;
        descricao.add((int)(resto/0.5f)+" moeda(s) de R$ 0.50");
        resto = resto%0.50f;
        descricao.add((int)(resto/0.25f)+" moeda(s) de R$ 0.25");
        resto = BigDecimal.valueOf(resto%0.25f).setScale(2, BigDecimal.ROUND_HALF_DOWN).floatValue();
        descricao.add((int)(resto/0.10f)+" moeda(s) de R$ 0.10");
        resto = BigDecimal.valueOf(resto%0.10f).setScale(2, BigDecimal.ROUND_HALF_DOWN).floatValue();
        descricao.add((int)(resto/0.05f)+" moeda(s) de R$ 0.05");
        resto = resto%0.05f;
        descricao.add((int)(resto/0.01f)+" moeda(s) de R$ 0.01");
        resto = resto%0.01f;
        System.out.println("Moedas:");
        descricao.forEach(i-> System.out.println(i));
    }
 }
