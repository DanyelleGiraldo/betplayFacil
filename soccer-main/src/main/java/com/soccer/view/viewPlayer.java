package com.soccer.view;

import java.util.Scanner;

import com.soccer.Controller;
import com.soccer.model.entity.Player;

public class viewPlayer {
       public static Controller controlador = new Controller();
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
                            sc.nextLine();
                     
                            System.out.println("Ingrese el nombre del jugador");
                            String nombrejugador = sc.nextLine();
                     
                            System.out.println("Ingrese el apellido del jugador");
                            String apellidojugador = sc.nextLine();
                     
                            System.out.println("Ingrese la edad del jugador");
                            int edadjugador = sc.nextInt();
                            sc.nextLine();
                     
                            System.out.println("Ingrese el dorsal del jugador");
                            int dorsaljugador = sc.nextInt();
                            sc.nextLine();
                     
                            System.out.println("Ingrese la posicion del jugador");
                            String posicionjugador = sc.nextLine();
                     
                            Player nuevoJugador = new Player(idjugador, nombrejugador, apellidojugador, edadjugador, dorsaljugador, posicionjugador);
                            controlador.jugadores.put(idjugador, nuevoJugador);

                     break;

                     case 2:

                            System.out.println("Ingrese el codigo del jugador a actualizar:");
                            int codigojugador = sc.nextInt();
                            sc.nextLine();

                            if(controlador.jugadores.containsKey(codigojugador)){
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
                            Player pl = new Player();
                            boolean encontrado = false;
                            
                            while(!encontrado){
                                   System.out.println("Ingrese el id del jugador o ");
                                   int codigop=sc.nextInt();
                                   sc.nextLine();

                                   if(controlador.jugadores.containsKey(codigop)){
                                          pl = controlador.jugadores.get(codigop);
                                          System.out.println("Nombre del jugador es: "+ pl.getNombre());
                                          encontrado = true;
                                          break;
                                   }
                                   if(!encontrado){
                                          System.out.println("El jugador con el id: "+ codigop + " no existe");
                                   }
                            }
                            
                     break;
                     case 4:
                            System.out.println("Ingrese el id del jugador a eliminar: ");
                            int jugadoraeliminar = sc.nextInt();
                            sc.nextLine();

                            if(controlador.jugadores.containsKey(jugadoraeliminar)){
                                   controlador.jugadores.remove(jugadoraeliminar);
                                   System.out.println("el jugador con el id: "+ jugadoraeliminar+ " ha sido eliminado");
                            }else{
                                   System.out.println("el jugador con el codigo: "+ jugadoraeliminar + " no existe");
                            }
                     break;

                     case 5:
                            System.out.println("Listado de todos los jugadores: ");
                            for (Integer key : controlador.jugadores.keySet()) {
                            Player currentPlayer = controlador.jugadores.get(key);
                            System.out.println("Codigo: " + key);
                            System.out.println("Nombre: " + currentPlayer.getNombre());
                            System.out.println("Apellido: " + currentPlayer.getApellido());
                            System.out.println("Edad: " + currentPlayer.getEdad());
                            System.out.println("Dorsal: " + currentPlayer.getDorsal());
                            System.out.println("Posicion: " + currentPlayer.getPosicion());
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