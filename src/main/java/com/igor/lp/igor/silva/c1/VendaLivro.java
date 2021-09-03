/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.igor.lp.igor.silva.c1;

import java.util.Scanner;

/**
 *
 * @author Igor Morais
 */
public class VendaLivro {
    public static void main(String[] args) {
        
        Integer livrosEmEstoque;
        Integer qtdDeVendaEsperada;
        Integer porcentagemDeVendaEsperada;
        Integer escolha = 0;
        Integer livrosAVender;
        
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Bem vindo Escritor! Realize o controle do lançamen"
                + "to do seu livro:");
        
        System.out.println("\nQuantidade de livros em estoque:");
        livrosEmEstoque = sc.nextInt();
        
        System.out.println("\nMeta de venda dos livros (%):");
        porcentagemDeVendaEsperada = sc.nextInt();
        
        qtdDeVendaEsperada = (livrosEmEstoque * porcentagemDeVendaEsperada) /
                100;
        
        System.out.println(String.format("\nPara atingir a meta voce precisa ven"
                + "der %d livros", qtdDeVendaEsperada));
        
        while(!escolha.equals(2)){
            
            System.out.println("\nEscolha os próximos passos");
            System.out.println("1 - Vender Livros\n2 -Sair");
            
            escolha = sc.nextInt();
            
            switch (escolha) {
                case 1:
                    System.out.println("\nDigite a quantidade de livros");
                    livrosAVender = sc.nextInt();
                    
                    while(livrosAVender > livrosEmEstoque || livrosAVender < 0){
                        
                        System.out.println("\nInfelizment você não possui exempla"
                                + "res suficiente para a venda.");
                        
                        System.out.println(String.format("Quantidade disponível"
                                + ":%d", livrosEmEstoque));
                        
                        System.out.println("\nDigite uma quantidade Válida:\n");
                        livrosAVender = sc.nextInt();
                                     
                    }
                    
                    Integer livrosVendidos = 0;
                    
                    for(;livrosAVender > 0;livrosAVender--){
                        
                        livrosVendidos++;
                        livrosEmEstoque--;
                        
                        System.out.println(
                            String.format("Vendendo %d° livro",livrosVendidos)
                        );
                        
                    
                    }
                    
                    System.out.println(
                        String.format("\nVocê acabou de vender %d livros!\n"
                            + "Quantidade em estoque %d\n"
                            + "Meta de vendas:%d",livrosVendidos,livrosEmEstoque
                                ,qtdDeVendaEsperada )
                    );
                    
                    break;
                    
                case 2:
                    
                    System.out.println("Até logo");
                    break;
                
                default:
                    System.out.println("Número inválido");
                    
                    break;
            
            }
            
        }
    
        
    
    
    
    }   
}
