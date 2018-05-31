/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
    Programa que permite calcular el total de ventas de 4 Sucursales y el promedio de ventas de las mismas.
*/
package tarea1;

/**
 *
 * @author Carlos
 */
public class ReporteSucursales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            
            //Arreglos globales inicializados
            String [ ] meses = {"Agosto", "Octubre", "Diciembre"};
            String [ ] sucursales = {"Sucursal 1", "Sucursal 2", "Sucursal 3", "Sucursal 4"};
            double [ ] ventas_mes_1 = {4500.2, 5500.2, 6500.2, 2500.1};
            double [ ] ventas_mes_2 = {1500.2, 2500.2, 3500.2, 1500.1};
            double [ ] ventas_mes_3 = {2300.2, 1200.2, 4700.2, 3200.1};
            
            //Arreglos no inicializados.
            double [ ] venta_total_sucursal = new double [4]; //Guardara los valores totales de ventas de cada sucursal.
            double [ ] venta_promedio_sucursal = new double [4]; //Guardara el promedio de ventas de cada sucursal.
            
            //Variables globales
            double suma_ventas_sucursal; //Acumulador de las ventas de cada mes.
            double promedio_sucursal; //Guarda el promedio de cada sucursal
            double total_ventas_sucursales = 0; // Acumula las ventas totales de cada sucursal
            String cadena ;
            
            cadena = String.format("%65s\n\n","REPORTE SUCURSALES"); //Valor inicial de la variable 'cadena'
            
            //Ciclo que permite hacer los calculos.
            for (int contador = 0; contador < sucursales.length; contador ++){
                //Acumula la suma de las ventas de cada mes de cada sucursal
                suma_ventas_sucursal = ventas_mes_1[contador] + ventas_mes_2[contador] + ventas_mes_3[contador];
                promedio_sucursal = suma_ventas_sucursal / meses.length;  // Calcula el promedio de ventas de cada sucursal.
                total_ventas_sucursales = total_ventas_sucursales + suma_ventas_sucursal; // Acumula el total de ventas de cada sucursal.
                venta_total_sucursal [contador] = suma_ventas_sucursal; // Guarda en el arreglo 'total ventas sucursal' el total de ventas.
                venta_promedio_sucursal [contador] = promedio_sucursal;// Guarda el promedio de cada sucursal,
            }
            
            //Ciclo  que permite concatenar la variable 'cadena' con los nombres de los meses de ventas.
            for (int contador = 0; contador < meses.length; contador ++){
                //Primera concatenacion de la variable 'cadena'.
                cadena = String.format("%s%23s",cadena,meses[contador]);
            }
            //Segunda concatenacion de la variable 'cadena'.
           cadena = String.format("%s%20s%20s\n\n", cadena,"Total","Promedio");
           
           //Ciclo que permite concatenar la variable 'cadena' con cada uno de los valores calculados.
           for (int contador = 0; contador < sucursales.length; contador ++){
               //Tercera concatenacion de la variable 'cadena'.
               cadena = String.format("%s%-17s%-22.1f%-21.1f%-24.1f%-17.1f%.1f\n",cadena,sucursales[contador],ventas_mes_1[contador],
                       ventas_mes_2[contador],ventas_mes_3[contador],venta_total_sucursal[contador],venta_promedio_sucursal[contador]);
           }
           
           //Concatenacion final de la variable 'cadena'.
           cadena = String.format("%s\n%s %.1f\n",cadena,"El total de ventas de todas las sucursales es:",total_ventas_sucursales);
           
            System.out.println(cadena);//Presenta en pantalla lo que contiene la variable 'cadena'.
            
    }
    
}
