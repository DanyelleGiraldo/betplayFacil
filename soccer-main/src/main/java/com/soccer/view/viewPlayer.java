package com.soccer.view;

import com.soccer.Controller;
import com.soccer.model.entity.Player;
import java.util.Scanner;

public class viewPlayer {
       public static Controller controlador;
       public void start() {
       Scanner sc = new Scanner(System.in);
       while(true){
              System.out.println("1. Crear Jugador");
              System.out.println("2. Actualizar Jugador");
              System.out.println("3. Buscar Jugador");
              System.out.println("4. Eliminar Jugador");
              System.out.println("5. Listar todos Jugador");
              System.out.println("6. Salir");
              int choice = sc.nextInt();
              sc.nextLine();
              Player jugador = new Player();
              switch (choice) {
                     case 1:

                            System.out.println("Ingrese el id del jugador");
                            int idjugador = sc.nextInt();
                            jugador.setId(idjugador);
                            sc.nextLine();

                            System.out.println("Ingrese el nombre del jugador");
                            String nombrejugador = sc.nextLine();
                            jugador.setNombre(nombrejugador);

                            System.out.println("Ingrese el apellido del jugador");
                            String apellidojugador = sc.nextLine();
                            jugador.setApellido(apellidojugador);

                            System.out.println("Ingrese la edad del jugador");
                            int edadjugador = sc.nextInt();
                            jugador.setEdad(edadjugador);
                            sc.nextLine();

                            System.out.println("Ingrese el dorsal del jugador");
                            int dorsaljugador = sc.nextInt();
                            jugador.setDorsal(dorsaljugador);
                            sc.nextLine();

                            System.out.println("Ingrese la posicion del jugador");
                            String posicionjugador = sc.nextLine();
                            jugador.setPosicion(posicionjugador);

                     break;

                     case 2:

                            System.out.println("Ingrese el codigo del jugador a actualizar:");
                            int codigojugador = sc.nextInt();
                            sc.nextLine();

                            if(controlador.jugadores.contains(codigojugador)){
                                   Player jugadoract = controlador.jugadores.get(codigojugador);

                                   System.out.println("Ingrese el nombre del jugador");
                                   String nuevonombre = sc.nextLine();
                                   jugadoract.setNombre(nuevonombre);

                                   System.out.println("Ingrese el apellido");
                                   String nuevoapellido= sc.nextLine();
                                   jugadoract.setApellido(nuevoapellido);

                                   System.out.println("Ingrese la  edad ");
                                   int nuevaedad = sc.nextInt();
                                   sc.nextLine();
                                   jugadoract.setEdad(nuevaedad);

                                   System.out.println("Ingrese el dorsal");
                                   int nuevodorsal = sc.nextInt();
                                   sc.nextLine();
                                   jugadoract.setDorsal(nuevodorsal);

                                   System.out.println("Ingrese la posicion del jugador");
                                   String nuevaposicion = sc.nextLine();
                                   jugadoract.setPosicion(nuevaposicion);

                            } else {
                                   System.out.println("el jugador con el id: "+ codigojugador + " no existe");
                            }
                     break;

                     case 3:
                            boolean encontrado = false;
                            Scanner sca = new Scanner(System.in);
                            
                            while (!encontrado) {
                            System.out.println("Ingrese el ID del jugador (o 'salir' para salir):");
                            String codigoJug = sca.nextLine();
                            
                            if (codigoJug.equalsIgnoreCase("salir")) {
                                   System.out.println("Saliendo del programa...");
                                   break; 
                            }
                            
                                   if (controlador.equipos.contains(codigoJug)) {
                                   System.out.println("Nombre de mi jugador: " + jugador.getNombre());
                                   encontrado = true; 
                                   break; 
                                   }
                            
                            if (!encontrado) {
                                   System.out.println("El jugador con el ID '" + codigoJug + "' no existe.");
                            }
                            }
                            
                            sc.close();       
                            
                     break;
                     case 4:
                            System.out.println("Ingrese el id del jugador a eliminar: ");
                            String jugadoraeliminar = sc.nextLine();

                            if(controlador.jugadores.contains(jugadoraeliminar)){
                                   controlador.jugadores.remove(jugadoraeliminar);
                                   System.out.println("el jugador con el id: "+ jugadoraeliminar+ " ha sido eliminado");
                            }else{
                                   System.out.println("el jugador con el codigo: "+ jugadoraeliminar + " no existe");
                            }
                     break;

                     case 5:
                            System.out.println("Listado de todos los jugadores: ");
                            for(String key : controlador.jugadores.keySet()){
                                   jugador = controlador.jugadores.get(key);
                                   System.out.println("Codigo: "+ key);
                                   System.out.println("Nombre: "+ jugador.getNombre());
                                   System.out.println("Apellido: "+ jugador.getApellido());
                                   System.out.println("Edad: "+ jugador.getEdad());
                                   System.out.println("Dorsal: "+ jugador.getDorsal());
                                   System.out.println("pocision; "+jugador.getPosicion());
                                   System.out.println("-----------------------------------");
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