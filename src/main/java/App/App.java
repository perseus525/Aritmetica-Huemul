package App;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marclo
 */
public class App {
    
  public void llenarSuma(int[][] matriz){
  
      int llenado;
      
      int base =matriz.length;
      
      for(int i =0; i<matriz.length;i++){
          
           for(int j =0; j<matriz.length;i++){
          
          llenado = i + j;
          
          llenado = revisar(llenado, base);
          
          matriz[i][j]=llenado;
        }    
      }
  }  
  
  public int revisar(int n, int base){
      while( n >= base){
          
          n=n-base;
      }
      return n;
  }
}
