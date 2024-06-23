package com.soccer.view;

import java.util.Scanner;

import com.soccer.Controller;
import com.soccer.model.entity.Coach;

public class viewCoach {

    public static Controller controlador;
       public void start() {
       Scanner sc = new Scanner(System.in);
       while(true){
              System.out.println("1. Crear entrenador");
              System.out.println("2. Actualizar entrenador");
              System.out.println("3. Buscar entrenador");
              System.out.println("4. Eliminar entrenador");
              System.out.println("5. Listar todos entrenador");
              System.out.println("6. Salir");
              int choice = sc.nextInt();
              sc.nextLine();
              Coach entrenador = new Coach();
              switch (choice) {
                     case 1:
                            System.out.println("Ingrese el id del entrenador: ");
                            int idcoach = sc.nextInt();
                            sc.nextLine();

                            System.out.println("Ingrese el nombre del entrenador:");
                            String nombrentrenador = sc.nextLine();

                            System.out.println("Ingrese el apellido del coach: ");
                            String apellidoentrenenador = sc.nextLine();

                            System.out.println("Ingrese la edad del entrenador: ");
                            int edadentrenador = sc.nextInt();
                            sc.nextLine();

                            System.out.println("Ingrese la id de la federacion: ");
                            int idfederacion= sc.nextInt();
                            sc.nextLine();
                            
                            Coach nuevoCoach = new Coach(idcoach, nombrentrenador, apellidoentrenenador, edadentrenador, idfederacion);
                            controlador.entrenadores.put(idcoach, nuevoCoach);
                     break;

                     case 2:
                            System.out.println("Ingrese el id del coach a actualizar: ");
                            int codigoentrenador= sc.nextInt();
                            sc.nextLine();

                            if (controlador.entrenadores.containsKey(codigoentrenador)) {
                                Coach entrenadoract = controlador.entrenadores.get(codigoentrenador);

                                System.out.println("Ingrese el nombre de el entrenador: ");
                                String nuevonombre= sc.nextLine();
                                entrenadoract.setNombre(nuevonombre);

                                System.out.println("Ingrese el apellido del entrenado: ");
                                String nuevoapellido = sc.nextLine();
                                entrenadoract.setApellido(nuevoapellido);

                                System.out.println("Ingrese la edad del entrenador: ");
                                int nuevaedad = sc.nextInt();
                                sc.nextLine();
                                entrenadoract.setEdad(nuevaedad);

                                System.out.println("Ingrese el id de la federacion: ");
                                int nuevafederacion = sc.nextInt();
                                sc.nextLine();
                                entrenadoract.setIdFederacion(nuevafederacion);
                                                               
                            } else {
                                System.out.println("El coach con el id: "+ codigoentrenador + " no existe.");

                            }
                            
                     break;

                     case 3:
                            Coach ch= new Coach();
                            boolean encontrado = false;

                            while (!encontrado) { 
                                System.out.println("Ingrese el id del coach: ");
                                int codigoc = sc.nextInt();
                                sc.nextLine();

                                if(controlador.entrenadores.containsKey(codigoc)){
                                    ch = controlador.entrenadores.get(codigoc);
                                    System.out.println("Nombre del coach es: "+ ch.getNombre());
                                    encontrado = true;
                                    break;
                                }
                                if(!encontrado){
                                    System.out.println("El entrenado con el id: "+ codigoc + " no existe.");
                                }
                            }
                            
                     break;
                     case 4:
                        System.out.println("Ingrese el id del entrenador a eliminar: ");
                        int entrenadoreliminar = sc.nextInt();
                        sc.nextLine(); 

                        if (controlador.entrenadores.containsKey(entrenadoreliminar)) {
                            controlador.entrenadores.remove(entrenadoreliminar);
                            System.out.println("El entrenador con el id " + entrenadoreliminar + " ha sido eliminado.");
                        } else {
                            System.out.println("El entrenador con el id " + entrenadoreliminar + " no existe.");
                        }
                    break;


                     case 5:
                            System.out.println("Listado de todos los entrenadores:");
                            for (int key : controlador.entrenadores.keySet()) {
                                Coach coach = controlador.entrenadores.get(key);
                                System.out.println("ID: " + coach.getId());
                                System.out.println("Nombre: " + coach.getNombre());
                                System.out.println("Apellido: " + coach.getApellido());
                                System.out.println("Edad: " + coach.getEdad());
                                System.out.println("ID de Federación: " + coach.getIdFederacion());
                                System.out.println("----------------------");
                            }
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
