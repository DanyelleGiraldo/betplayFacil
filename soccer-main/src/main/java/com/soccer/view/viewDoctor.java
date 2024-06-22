package com.soccer.view;

import java.util.Scanner;

import com.soccer.Controller;
import com.soccer.model.entity.Doctor;

public class viewDoctor {
    public static Controller controlador;
       public void start() {
       Scanner sc = new Scanner(System.in);
       while(true){
              System.out.println("1. Crear entrenado");
              System.out.println("2. Actualizar entrenador");
              System.out.println("3. Buscar entrenador");
              System.out.println("4. Eliminar entrenador");
              System.out.println("5. Listar todos entrenador");
              System.out.println("6. Salir");
              int choice = sc.nextInt();
              sc.nextLine();
              Doctor doctor = new Doctor();
              switch (choice) {
                     case 1:
                            
                     break;

                     case 2:
                            
                     break;

                     case 3:
                            
                     break;
                     case 4:
                        
                    break;


                     case 5:
                            System.out.println("Listado de todos los entrenadores:");
                            
                     break;

                     case 6:
                     sc.close();
                     System.exit(0);
                     default:
                     System.out.println("Opcion invalida, intentelo de nuevo.");
                     }
              }
       }
}
