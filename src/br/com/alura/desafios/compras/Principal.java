package br.com.alura.desafios.compras;

import br.com.alura.desafios.compras.Produto;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String descricao;
        double valor;
        double limite;
        double totalCompra;

        System.out.print("Digite o limite do cartao: ");
        limite = ler.nextDouble();
        System.out.println();

        ArrayList<Produto> lista = new ArrayList<>();

        int i = -1;
        while (i != 0) {
            System.out.print("Digite 0 para sair ou 1 para continuar: ");
            i = ler.nextInt();
            System.out.println();
            switch (i) {
                case 1:
                    System.out.print("Digite a descricao da compra: ");
                    descricao = ler.next();

                    System.out.print("Digite o valor da compra: ");
                    valor = ler.nextDouble();

                    totalCompra = 0;
                    for (Produto compras : lista) {
                        totalCompra += compras.getValor();
                    }

                    System.out.println("********************");
                    if (limite >= totalCompra + valor) {
                        lista.add(new Produto(descricao, valor));
                        System.out.println("Compra efetuada com sucesso!");
                    } else {
                        System.out.println("Saldo insuficiente!");
                        System.out.println("COMPRAS REALIZADAS:");

                        Collections.sort(lista);

                        for (Produto compras : lista) {
                            System.out.println(compras);
                        }
                    }
                    System.out.println("********************");
                    totalCompra = 0;
                    break;
                case 0:
                    System.out.println("Obrigado pelas compras!");
                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
        }
    
        ler.close();
    }
}
