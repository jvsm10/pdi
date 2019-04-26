/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdi;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author cc161255426
 */
public class Matriz {
    public int altura;
    public int largura;
    public int intensidade;
    public int[][] matriz;
    
    public Matriz(int altura, int largura) {
        this.altura = altura;
        this.largura = largura;
        matriz = new int[altura][largura];
        intensidade = 255;
    }
    
    public Matriz(int altura, int largura, int intensidade) {
        this.altura = altura;
        this.largura = largura;
        matriz = new int[altura][largura];
        this.intensidade = intensidade;
    }
    
    public void addMatriz(int x, int y, int valor){
        matriz[x][y] = valor;
    }
    
    
    public static Matriz abrirArquivo(String nome){
        try {
            FileReader arq = new FileReader("img/"+nome);
            Scanner scanner = new Scanner(arq);
            
            String linha = scanner.nextLine();
            if(!scanner.hasNextInt())
                linha = scanner.nextLine();
            if(!scanner.hasNextInt()) scanner.nextInt();
            int largura = scanner.nextInt();
            int altura = scanner.nextInt();
            scanner.nextInt();
            Matriz matrix = new Matriz(altura, largura);
            int valor;
            for(int i = 0 ; i<altura; i++){       
                for(int j =0 ; j<largura; j++){
                        valor = scanner.nextInt();
                        matrix.matriz[i][j] = valor;
                }
            }
            arq.close();
            return matrix;
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
            e.getMessage());
        }
        return null;
    }
    
    
    public static void salvarArquivo(Matriz matriz, String nome){
        try{
            FileWriter arq = new FileWriter("img/"+nome);
            PrintWriter gravarArq = new PrintWriter(arq);
 
            gravarArq.printf("P2\n");
            gravarArq.printf("#Lena escura\n");
            gravarArq.printf("%d ", matriz.largura);
            gravarArq.printf("%d\n", matriz.altura);
            gravarArq.printf("255\n");
            for (int i=0; i< matriz.altura ; i++) {
                for(int j=0; j<matriz.largura; j++){
                       gravarArq.printf("%d\n", matriz.matriz[i][j]);
                }
            }
        }catch(IOException e){
            
        }
    }
}
