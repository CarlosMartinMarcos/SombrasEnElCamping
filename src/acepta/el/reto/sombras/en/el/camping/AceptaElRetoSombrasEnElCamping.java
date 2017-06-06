/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acepta.el.reto.sombras.en.el.camping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author DAM
 */
public class AceptaElRetoSombrasEnElCamping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        while (true) { 
            String entrada1 = bf.readLine();
            if(entrada1.equals("0 0 0"))break;
            int sombras = 0;
            int columnas = Integer.parseInt(entrada1.split(" ")[0]);
            int filas = Integer.parseInt(entrada1.split(" ")[1]);
            int[][] mapa = new int[columnas * filas][columnas * filas];
            int arboles = Integer.parseInt(entrada1.split(" ")[3]);
            String[] coords = bf.readLine().split(" ");
            for(int n = 0; n < arboles; n = n + 2){
                int[] comprobar = {Integer.parseInt(coords[n]), Integer.parseInt(coords[n + 1])};
                if(comprobar[0] - 1 >= 0 && comprobar[1] - 1 >= 0){
                    
                }
            }
            System.out.println(sombras);
        }
    }
    
}
