package primeiroDesafio;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try{
            System.out.println("Digite a quantidade de numeros desejado");
            int j = scan.nextInt();
            List<Integer> lista = new ArrayList<>();
            while(j>0){
                lista.add(scan.nextInt());
                j--;
            }
            List<Integer> listaOrdenada = ordenar(lista);
            listaOrdenada.forEach(i -> System.out.println(i));

        }catch (InputMismatchException e){
            throw new InputMismatchException("Insira Apenas Números Inteiros e Positivos");
        }
    }

    public static List<Integer> ordenar(List<Integer> lista){
        List<Integer> ordenada = lista.stream().filter(i->i%2==0).sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        ordenada.addAll(lista.stream().filter(i->i%2!=0).sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
        return  ordenada;
    }
}
