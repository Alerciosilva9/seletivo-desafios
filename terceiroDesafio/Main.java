package terceiroDesafio;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o tamanho do Array");
        int size = scan.nextInt();
        System.out.println("Digite o valor Alvo");
        int alvo = scan.nextInt();
        System.out.println("Informe os valores a serem inseridos no array");
        int[] vetor = new int[size];
        int ctrl = 0;
        while (ctrl<size){
            vetor[ctrl] = scan.nextInt();
            ctrl++;
        }
        System.out.println("O numero de pares que satisfazem o alvo é "+verificarAlvo(alvo,vetor));
    }

    public static int verificarAlvo(int alvo,int[] vetor){
        int verificar = 0;
        for (int i:vetor){
            for (int j:vetor){
                if(i-j==alvo){
                    verificar++;
                }
            }
        }
        return verificar;
    }

}
