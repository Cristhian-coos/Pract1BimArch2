/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab1bimarchivos.seguro;

import java.util.Scanner;

/**
 *
 * @author win
 */
public class principalSeguro {
     public static void main(String[] args) {
        
        seguro segVida=new SeguroVida();
        seguro segAcc=new SeguroAccidentes();
        
        OperacionesSeg obj=new OperacionesSeg();
        
        Scanner leer = new Scanner(System.in);
        boolean continuar = true;
        int opcion;
        do {
            System.out.println("MENU DE OPCIONES");
            System.out.println("1. CREAR ARCHIVO");
            System.out.println("2. REGISTRAR SEGURO DE VIDA");
            System.out.println("3. REGISTRAR SEGURO DE ACCIDENTES");
            System.out.println("4. MOSTRAR SEGURO DE VIDA");
            System.out.println("5. MOSTRAR SEGURO DE ACCIDENTES ");
            System.out.println("6. CUOTA MENSUAL DE SEGURO DE VIDA");
            System.out.println("7. FECHA FINAL DE SEGURO DE ACCIDENTES ");
            System.out.println("8. SALIR");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    obj.crearArchivo();
                    break;
                case 2:
                    obj.registrar(segVida);
                   obj.guardarObjetos();
                    break;
                case 3:
                    obj.registrar(segAcc);
                    obj.guardarObjetos();
                    break;
                case 4:
                    obj.leerClientes();
                    obj.mostrarSegVida();
                    break;
                case 5:
                    obj.leerClientes();
                    obj.mostrarSegAcc();
                    break;
                case 6:
                    obj.leerClientes();
                    obj.cuotMensual();
                    obj.guardarObjetos();
                    break;
                case 7:
                    obj.leerClientes();
                    obj.Fechfinal();
                    obj.guardarObjetos();
                    break;
                default:
                    continuar = false;
                    break;
            }

        } while (continuar);
    }
}
