/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdi;

/**
 *
 * @author cc161255426
 */
public class PDI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Matriz matriz = Matriz.abrirArquivo("w4.pgm");
        //Matriz matriz2 = Matriz.abrirArquivo("wg.pgm");
        //Matriz matriz3 = Matriz.abrirArquivo("wb.pgm");
        //Matriz op = Operacoes.escurecer(matriz, 133);
        //Matriz.salvarArquivo(op, "lenaEscuro.pgm");
        //op = Operacoes.negativo(matriz);
        ///Matriz.salvarArquivo(op, "lenaNegativa.pgm");
        //Matriz.salvarArquivo(op, "lenaEscuro.pgm");
        //Matriz filtro = new Matriz(15,15);
//        filtro.matriz[0][0] = 1;filtro.matriz[0][1] = 1;filtro.matriz[0][2] = 1;
//        filtro.matriz[1][0] = 1;filtro.matriz[1][1] = 1;filtro.matriz[1][2] = 1;
//        filtro.matriz[2][0] = 1;filtro.matriz[2][1] = 1;filtro.matriz[2][2] = 1;
//        for(int i=0;i<filtro.altura;i++)
//            for(int j=0;j<filtro.largura;j++)
//                filtro.matriz[i][j] = 1;
//        Matriz op = Operacoes.Filtro(matriz,filtro);
//        Matriz.salvarArquivo(op, "moonfiltro2.pgm");
//        Matriz op2 = Operacoes.somarMatrizes(matriz,op);
//        Matriz.salvarArquivo(op2, "moonfiltro2soma.pgm");
//        Matriz op = Operacoes.FiltroMedia(matriz,filtro);
//        Matriz.salvarArquivo(op, "hubble15.pgm");
//        Matriz op2 = Operacoes.binarizar(op);
//        Matriz.salvarArquivo(op2, "hubble15tresh.pgm");
//        int histo[] = Operacoes.histograma(matriz);
//        Operacoes.salvarArquivo(histo, "histo.txt");
//        int histoeq[] = Operacoes.histogramaequ(matriz);
//        Operacoes.salvarArquivo(histoeq, "histoeq.txt");
//          Matrizcor matriz2 = Matrizcor.abrirArquivo();
//          Matriz op = Operacoes.canal(matriz2, 0);
//          Matriz.salvarArquivo(op, "lennaR.pgm");
//          op = Operacoes.canal(matriz2, 1);
//          Matriz.salvarArquivo(op, "lennaG.pgm");
//          op = Operacoes.canal(matriz2, 2);
//          Matriz.salvarArquivo(op, "lennaB.pgm");
       Matrizcor matriz =  Matrizcor.abrirArquivo("strawberries.ppm");
       Matriz op = Operacoes.rgbToHSI(matriz,0);
       Matriz.salvarArquivo(op, "Wh.pgm");
       op = Operacoes.rgbToHSI(matriz,1);
       Matriz.salvarArquivo(op, "Ws.pgm");
       op = Operacoes.rgbToHSI(matriz,2);
       Matriz.salvarArquivo(op, "Wi.pgm");

    }
    
}
