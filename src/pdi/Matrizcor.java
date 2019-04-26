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
public class Matrizcor {
    public int altura;
    public int largura;
    public int intensidade;
    public int[][][] matriz;
    
    public Matrizcor(int altura, int largura, int cor) {
        this.altura = altura;
        this.largura = largura;
        matriz = new int[altura][largura][cor];
        intensidade = 255;
    }
    
    public Matrizcor(int altura, int largura, int intensidade,int cor) {
        this.altura = altura;
        this.largura = largura;
        matriz = new int[altura][largura][cor];
        this.intensidade = intensidade;
    }
    
    public void addMatriz(int x, int y, int valor,int cor){
        matriz[x][y][cor] = valor;
    }
    
    
    public static Matrizcor abrirArquivo(String nome){
        try {
            FileReader arq = new FileReader("imgcor/"+nome);
            Scanner scanner = new Scanner(arq);
            
            String linha = scanner.nextLine();
            if(!scanner.hasNextInt())
                linha = scanner.nextLine();
            if(!scanner.hasNextInt()) scanner.nextInt();
            int largura = scanner.nextInt();
            int altura = scanner.nextInt();
            scanner.nextInt();
            Matrizcor matrix = new Matrizcor(altura, largura,3);
            int valor;
            for(int i = 0 ; i<altura; i++){       
                for(int j =0 ; j<largura; j++){
                    for(int k=0;k<3;k++){
                        valor = scanner.nextInt();
                        matrix.matriz[i][j][k] = valor;
                    }
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
    
    
    public static void salvarArquivo(Matrizcor matriz, String nome){
        try{
            FileWriter arq = new FileWriter("imgcor/"+nome);
            PrintWriter gravarArq = new PrintWriter(arq);
 
            gravarArq.printf("P3\n");
            gravarArq.printf("#Lena escura\n");
            gravarArq.printf("%d ", matriz.largura);
            gravarArq.printf("%d\n", matriz.altura);
            gravarArq.printf("255\n");
            for (int i=0; i< matriz.altura ; i++) {
                for(int j=0; j<matriz.largura; j++){
                    for(int k=0;k<3;k++)
                       gravarArq.printf("%d\n", matriz.matriz[i][j][k]);
                }
            }
        }catch(IOException e){
            
        }
    }
}

