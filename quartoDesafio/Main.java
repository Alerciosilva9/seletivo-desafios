package quartoDesafio;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int j = scan.nextInt();
        scan.nextLine();
        List<String> linhas = new ArrayList<>();
        while (j>0){
            linhas.add(scan.nextLine());
            j--;
        }
        linhas.forEach(i -> desembaralhar(i));
    }

    public static void desembaralhar(String linha){
        int metadeChar = linha.length()/2;
        StringBuilder first =new StringBuilder(linha.substring(0,metadeChar));
        StringBuilder second =new StringBuilder(linha.substring(metadeChar));
        System.out.println(first.reverse().toString() + second.reverse().toString());
    }
}
