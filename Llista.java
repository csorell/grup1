/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author perro
 */
public class Llista {
    private int[] primera;
    private int[] segunda;
    private int[] tercera;
    private int temp;
    
    
    public Llista(){
        primera = new int[]{1,2,6};
        segunda = new int[]{4,5,8};
        tercera = new int[6];
    }
    
    public void ordenar(){
        System.arraycopy(primera, 0, tercera, 0, 3);
        System.arraycopy(segunda, 0, tercera, 3, 3);
        
        
        for(int i=0; i<6; i++){
            for(int j=i; j>0; j--){
                if (tercera[j] < tercera[j-1]){
                    temp = tercera[j];
                    tercera[j] = tercera[j-1];
                    tercera[j-1] = temp;
                }
            }
        }
        
        for(int i=0; i<6; i++){
            System.out.print(tercera[i]+" ");
        }
    }
    
    
    public static void main(String[] args) {
        Llista l1 = new Llista();
        l1.ordenar();
    }
    
}
