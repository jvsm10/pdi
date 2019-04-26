/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdi;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author cc161255426
 */
public class Operacoes {
    
    public static Matriz somarMatrizes(Matriz matrizA, Matriz matrizB){
        Matriz matrizResultado = new Matriz(matrizA.altura, matrizA.largura);
        for(int i=0; i< matrizA.altura; i++){
            for(int j=0; j<matrizB.largura; j++){
                matrizResultado.matriz[i][j] = matrizA.matriz[i][j] + matrizB.matriz[i][j];
            }
        }
        return matrizResultado;
    }
    
    
    public static Matriz escurecer(Matriz matriz, int valor){
        Matriz resul = new Matriz(matriz.altura, matriz.largura);
        int val;
        for(int i =0; i<matriz.altura; i++){
            for(int j=0 ; j<matriz.largura; j++){
                val = matriz.matriz[i][j] - valor;
                if(val <0)
                    resul.matriz[i][j] = 0;
                else
                    resul.matriz[i][j] = val;
            }
        }
        return resul;
    }
    
    public static Matriz negativo(Matriz matriz){
        Matriz resul = new Matriz(matriz.altura, matriz.largura);
        int val;
        for(int i =0; i<matriz.altura; i++){
            for(int j=0 ; j<matriz.largura; j++){
                val = 255 - matriz.matriz[i][j] ;
                resul.matriz[i][j] = val;
            }
        }
        return resul;
    }
    
    public static Matriz clarearSoma(Matriz matriz, int val){
        Matriz resul = new Matriz(matriz.altura, matriz.largura);
        int soma;
        for(int i =0; i<matriz.altura; i++){
            for(int j=0 ; j<matriz.largura; j++){
                soma = val + matriz.matriz[i][j] ;
                resul.matriz[i][j] = soma;
            }
        }
        return resul;
    }
    
     public static Matriz girar90(Matriz matriz){
        Matriz resul = new Matriz(matriz.largura, matriz.altura);
        int soma;
        for(int i =0; i<matriz.altura; i++){
            for(int j=0 ; j<matriz.largura; j++){
                soma = matriz.matriz[i][j] ;
                resul.matriz[j][i] = soma;
            }
        }
        return resul;
    }
     
     public static Matriz girarmenos90(Matriz matriz){
        Matriz resul = new Matriz(matriz.largura, matriz.altura);
        int soma;
        for(int i =0; i<matriz.altura; i++){
            for(int j=0 ; j<matriz.largura; j++){
                soma = matriz.matriz[matriz.altura-j-1][i] ;
                resul.matriz[i][j] = soma;
            }
        }
        return resul;
    }
     
     public static Matriz girar180(Matriz matriz){
        Matriz resul = new Matriz(matriz.altura, matriz.largura);
        int soma;
        for(int i =0; i<matriz.altura; i++){
            for(int j=0 ; j<matriz.largura; j++){
                soma = matriz.matriz[matriz.altura-i-1][matriz.largura-j-1] ;
                resul.matriz[i][j] = soma;
            }
        }
        return resul;
    }
     
     public static Matriz binarizar(Matriz matriz){
        Matriz resul = new Matriz(matriz.altura, matriz.largura);
        int val = 107;
        for(int i =0; i<matriz.altura; i++){
            for(int j=0 ; j<matriz.largura; j++){
                 if(matriz.matriz[i][j] < 64)
                    resul.matriz[i][j] = 0 ;
                 else 
                     resul.matriz[i][j] = 255;
            }
        }
        return resul;
    }
     
     public static Matriz espelharcoluna(Matriz matriz){
        Matriz resul = new Matriz(matriz.altura, matriz.largura);
        int soma;
        for(int i =0; i<matriz.altura; i++){
            for(int j=0 ; j<matriz.largura; j++){
                soma = matriz.matriz[matriz.altura-i-1][j] ;
                resul.matriz[i][j] = soma;
            }
        }
        return resul;
    }
     public static Matriz espelharlinha(Matriz matriz){
        Matriz resul = new Matriz(matriz.altura, matriz.largura);
        int soma;
        for(int i =0; i<matriz.altura; i++){
            for(int j=0 ; j<matriz.largura; j++){
                soma = matriz.matriz[i][matriz.largura-j-1] ;
                resul.matriz[i][j] = soma;
            }
        }
        return resul;
    }
     
     public static Matriz faAB(Matriz matriz,int a, int b,int nc){
        Matriz resul = new Matriz(matriz.altura, matriz.largura);
        for(int i =0; i<matriz.altura; i++){
            for(int j=0 ; j<matriz.largura; j++){
                 if(matriz.matriz[i][j] > a && matriz.matriz[i][j] < b){
                    resul.matriz[i][j] = nc ;
                 }
                 else{ 
                     resul.matriz[i][j] = 0;
                 }
            }
        }
        return resul;
    }
     
     public static Matriz fbAB(Matriz matriz,int a, int b,int nc){
        Matriz resul = new Matriz(matriz.altura, matriz.largura);
        for(int i =0; i<matriz.altura; i++){
            for(int j=0 ; j<matriz.largura; j++){
                 if(matriz.matriz[i][j] >= a && matriz.matriz[i][j] <= b){
                    resul.matriz[i][j] = nc ;
                 }
                 else{ 
                     resul.matriz[i][j] = matriz.matriz[i][j];
                 }
            }
        }
        return resul;
    }
     
     public static Matriz subMat(Matriz matriz, Matriz matrizb) {
        Matriz resul = new Matriz(matriz.altura, matriz.largura);
        for(int i =0; i<matriz.altura; i++){
            for(int j=0 ; j<matriz.largura; j++){
                if((matriz.matriz[i][j] - matrizb.matriz[i][j]) < 0)
                    resul.matriz[i][j] = Math.abs(matriz.matriz[i][j] - matrizb.matriz[i][j]);
                else
                    resul.matriz[i][j] = matriz.matriz[i][j] - matrizb.matriz[i][j];
            }
        }
        return resul;
    }
     
     public static Matriz opGama(Matriz matriz, float gama,float c){
         Matriz resul = new Matriz(matriz.altura, matriz.largura);
         float s,inter;
        for(int i =0; i<matriz.altura; i++){
            for(int j=0 ; j<matriz.largura; j++){
                inter = (((float)matriz.matriz[i][j])/255.0f);
                s = c*((float)Math.pow(inter, gama));
                resul.matriz[i][j] = (int)(s*255);
            }
        }
        return resul;
     }
     
     public static Matriz opLog(Matriz matriz,float c){
         Matriz resul = new Matriz(matriz.altura, matriz.largura);
         float s,inter;
        for(int i =0; i<matriz.altura; i++){
            for(int j=0 ; j<matriz.largura; j++){
                inter = (((float)matriz.matriz[i][j])/255.0f);
                s = c*((float)Math.log10(1+inter));
                resul.matriz[i][j] = (int)(s*255);
            }
        }
        return resul;
     }
     
     public static Matriz zoom(Matriz matriz,int zoom){
         Matriz resul = new Matriz(matriz.altura*zoom, matriz.largura*zoom);
        for(int i =0; i<matriz.altura; i++){
            for(int j=0 ; j<matriz.largura; j++){
              for(int z=0;z<zoom;z++){
                for(int z2=0;z<zoom;z++){
                    resul.matriz[i+z][j+z2] = matriz.matriz[i][j];
                }
              }
            }
        }
        return resul;
     }
     
     public static int[] histograma(Matriz matriz){
         int histo[] = new int[256];
         int cor;
         for(int i=0;i<256;i++)
             histo[i]=0;
         for(int i =0; i<matriz.altura; i++){
            for(int j=0 ; j<matriz.largura; j++){
                cor = matriz.matriz[i][j];
                histo[cor]++;
            }
        }
        return histo;
     }
     
     public static void salvarArquivo(int[] histo, String nome){
        try{
            FileWriter arq = new FileWriter("img/"+nome);
            PrintWriter gravarArq = new PrintWriter(arq);
            for(int i=0;i<256;i++)
                gravarArq.printf(i + "  " + histo[i] + "\n");
            arq.close();
        }catch(IOException e){
            
        }
    }
     
     
     public static Matriz rMinMax(Matriz matriz,int rmin,int rmax){
         Matriz resul = new Matriz(matriz.altura, matriz.largura);
         float m = 255/(rmax-rmin); 
         float s;
        for(int i =0; i<matriz.altura; i++){
            for(int j=0 ; j<matriz.largura; j++){
                if(matriz.matriz[i][j]<rmin)
                    resul.matriz[i][j] = 0;
                else if(matriz.matriz[i][j]>rmax)
                    resul.matriz[i][j] = 255;
                else{
                    s = m*(float)(matriz.matriz[i][j]-rmax) + 255;
                    resul.matriz[i][j] = (int)s;
                }
                    
            }
        }
        return resul;
     }
     
     public static Matriz Filtro(Matriz matriz,Matriz filtro){
         Matriz resul = new Matriz(matriz.altura, matriz.largura);
         int soma,p,q;
        for(int i =0; i<matriz.altura; i++){
            for(int j=0 ; j<matriz.largura; j++){
                p=-1;
                q=-1;
                soma = 0;
              for(int k=0;k<filtro.largura;k++){
                  for(int n=0;n<filtro.largura;n++){
                      //System.out.println((i+p) + " -> "+(j+q));
                      if(i+p<0 || j+q<0 || i+p==matriz.altura || j+q==matriz.largura)
                        soma += 0;
                      else
                          soma += matriz.matriz[i+p][j+q] * filtro.matriz[k][n];
                      q++;
                  }
                  p++;
                  q=-1;
              }
              resul.matriz[i][j] = soma;
            }
        }
        return resul;
     }
     
     public static Matriz FiltroMedia(Matriz matriz,Matriz filtro){
         Matriz resul = new Matriz(matriz.altura, matriz.largura);
         int soma,p,q;
         int tam = filtro.largura;
         p=(tam/(-2));
         System.out.println(p);
        for(int i =0; i<matriz.altura; i++){
            for(int j=0 ; j<matriz.largura; j++){
                p=(tam/(-2));
                q=(tam/(-2));
                soma = 0;
              for(int k=0;k<filtro.largura;k++){
                  for(int n=0;n<filtro.largura;n++){
                      //System.out.println((i+p) + " -> "+(j+q));
                      if(i+p<0 || j+q<0 || i+p>=matriz.altura || j+q>=matriz.largura)
                        soma += 0;
                      else
                          soma += matriz.matriz[i+p][j+q] * filtro.matriz[k][n];
                      q++;
                  }
                  p++;
                  q=(tam/(-2));
              }
              resul.matriz[i][j] = soma/(filtro.largura*filtro.largura);
            }
        }
        return resul;
     }
     
     public static int[] histogramaequ(Matriz matriz){
         int histo[] = histograma(matriz);
         int cor;
         int sk[] = new int[256];
         float soma=0;
         float p[] = new float[256]; 
         for(int i=0;i<histo.length;i++){
             p[i] = (float)histo[i]/((float)(matriz.altura*matriz.largura));
             for(int k=0;k<=i;k++)
                 soma+=p[k];
             sk[i] = (int)(255 * soma);
             soma=0;
         }
        return sk;
     }
     
     public static Matriz canal(Matrizcor matriz,int canal){
         Matriz resul = new Matriz(matriz.altura, matriz.largura);
        for(int i =0; i<matriz.altura; i++){
            for(int j=0 ; j<matriz.largura; j++){
                    resul.matriz[i][j] = matriz.matriz[i][j][canal];
            }
        }
        return resul;
     }
     public static Matrizcor canalmudar(Matrizcor matriz,int canal,double modi){
         Matrizcor resul = new Matrizcor(matriz.altura, matriz.largura,3);
        for(int i =0; i<matriz.altura; i++){
            for(int j=0 ; j<matriz.largura; j++){
                for(int k=0;k<3;k++)
                    if(k==canal)
                    resul.matriz[i][j][k] = (int)(matriz.matriz[i][j][k]*modi);
                    else resul.matriz[i][j][k] = matriz.matriz[i][j][k];
            }
        }
        return resul;
     }
     public static Matrizcor canalmisturar(Matrizcor matriz){
         Matrizcor resul = new Matrizcor(matriz.altura, matriz.largura,3);
        for(int i =0; i<matriz.altura; i++){
            for(int j=0 ; j<matriz.largura; j++){
                    resul.matriz[i][j][0] = matriz.matriz[i][j][1];
                    resul.matriz[i][j][1] = matriz.matriz[i][j][2];
                    resul.matriz[i][j][2] = matriz.matriz[i][j][0];
            }
        }
        return resul;
     }
     
     public static Matriz canalCMY(Matrizcor matriz,int canal){
         Matriz resul = new Matriz(matriz.altura, matriz.largura);
        for(int i =0; i<matriz.altura; i++){
            for(int j=0 ; j<matriz.largura; j++){
                    resul.matriz[i][j] = 255-matriz.matriz[i][j][canal];
            }
        }
        return resul;
     }
     
     public static Matrizcor canalToRGB(Matriz matriz,Matriz matriz2, Matriz matriz3){
         Matrizcor resul = new Matrizcor(matriz.altura, matriz.largura,3);
        for(int i =0; i<matriz.altura; i++){
            for(int j=0 ; j<matriz.largura; j++){
                
                resul.matriz[i][j][0] = matriz.matriz[i][j];
                resul.matriz[i][j][1] = matriz2.matriz[i][j];
                resul.matriz[i][j][2] = matriz3.matriz[i][j];
            }
        }
        return resul;
     }
     
     public static double reH(double r,double g, double b){
         double h;
         if(b<g){
             h = Math.acos((0.5*((r-g)+(r-b)))/Math.pow(((r-g)*(r-g)+(r-b)*(g-b)),0.5));
         }
         else{
             h = (2*Math.PI-Math.acos((0.5*((r-g)+(r-b)))/Math.pow(((r-g)*(r-g)+(r-b)*(g-b)),0.5)));
         }
         return h;
     }
     public static double minimo(double r, double g, double b){
         if(r<g && r<b)
             return r;
         if(g<r & g<b)
             return g;
         else return b;
     }
     
     public static Matriz rgbToHSI(Matrizcor matriz,int sel){
         Matriz resul = new Matriz(matriz.altura, matriz.largura);
        for(int i =0; i<matriz.altura; i++){
            for(int j=0 ; j<matriz.largura; j++){
                    double r = (double)matriz.matriz[i][j][0]/(double)(matriz.matriz[i][j][0]+matriz.matriz[i][j][1]+matriz.matriz[i][j][2]);
                    double g = (double)matriz.matriz[i][j][1]/(double)(matriz.matriz[i][j][0]+matriz.matriz[i][j][1]+matriz.matriz[i][j][2]);
                    double b  = (double)matriz.matriz[i][j][2]/(double)(matriz.matriz[i][j][0]+matriz.matriz[i][j][1]+matriz.matriz[i][j][2]);
                    double h = reH(r,g,b);
                    double s = 1-3*minimo(r,g,b);
                    double it = (double)(matriz.matriz[i][j][0]+matriz.matriz[i][j][1]+matriz.matriz[i][j][2])/(3*255);
                    if(sel == 0){
                        resul.matriz[i][j] = (int)((h*255)/(2*Math.PI)); 
                    }
                    if(sel == 1)
                        resul.matriz[i][j] = (int)s*255;
                    else
                        resul.matriz[i][j] = (int)it*255;
            }
        }
        return resul;
     }
}
