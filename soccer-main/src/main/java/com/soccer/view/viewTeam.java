package com.soccer.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.soccer.Controller;
import com.soccer.model.entity.Coach;
import com.soccer.model.entity.Doctor;
import com.soccer.model.entity.Player;
import com.soccer.model.entity.Team;

public class viewTeam {
    public static Controller controlador;
    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Crear Equipo");
            System.out.println("2. Actualizar Equipo");
            System.out.println("3. Buscar Equipo");
            System.out.println("4. Eliminar Equipo");
            System.out.println("5. Listar todos Equipos");
            System.out.println("6. Salir");
            int choice = sc.nextInt();
            sc.nextLine(); 
            Team equipo = new Team();
            ArrayList<Player> jugadoresz = new ArrayList<>();


            switch (choice) {
                case 1:
                    ArrayList<Player> jugadores = new ArrayList<>();
                    ArrayList<Coach> instructores = new ArrayList<>();
                    ArrayList<Doctor> doctores = new ArrayList<>();
                    String codigoEquipo = null;

                    System.out.println("Ingrese el código del equipo:");
                    codigoEquipo = sc.nextLine();

                    System.out.println("Ingrese Nombre del equipo:");
                    equipo.setNombre(sc.nextLine());

                    System.out.println("Ingrese la ciudad:");
                    equipo.setCiudad(sc.nextLine());

                    do {
                            System.out.println("Ingrese el ID del jugador:");
                            int idjugador = sc.nextInt();
                            Player jugador = new Player();
                            jugador.setId(idjugador);  
                            jugadoresz.add(jugador);
                        
                            System.out.println("¿Quiere agregar otro jugador? \n 1: Sí \n 2: No");
                            int opcion = sc.nextInt();
                            sc.nextLine(); 
                            if (opcion == 2) {
                                break;
                            }
                            sc.nextLine();
                    } while (true);
                        equipo.setLstJugadores(jugadoresz);

                    equipo.setLstJugadores(jugadores); 

                    do {
                        System.out.println("Ingrese el ID del instructor:");
                        int idinstructor = sc.nextInt();
                        Coach instructor = new Coach();
                        instructor.setId(idinstructor);
                        instructores.add(instructor);

                        System.out.println("¿Quiere agregar otro instructor? \n 1: Sí \n 2: No");
                        int opcion = sc.nextInt();
                        if (opcion == 2) {
                            break;
                        }
                        sc.nextLine();
                    } while (true);

                    equipo.setLstEntrenadores(instructores); 

                    do {
                        System.out.println("Ingrese el ID del medico:");
                        int idmedico = sc.nextInt();
                        Doctor medico = new Doctor();
                        medico.setId(idmedico);
                        doctores.add(medico);

                        System.out.println("¿Quiere agregar otro medico? \n 1: Sí \n 2: No");
                        int opcion = sc.nextInt();
                        if (opcion == 2) {
                            break;
                        }
                        sc.nextLine();
                    } while (true);
                    equipo.setLstMasajistas(doctores);

                    controlador.equipos.put(codigoEquipo, equipo);
                break;


        case 2:
                    System.out.println("Ingrese el código del equipo a actualizar:");
                    codigoEquipo = sc.nextLine();
                
                    if (controlador.equipos.containsKey(codigoEquipo)) {
                        Team equipoact = controlador.equipos.get(codigoEquipo);
                
                        System.out.println("Ingrese el nuevo nombre del equipo:");
                        String nuevoNombre = sc.nextLine();
                        equipoact.setNombre(nuevoNombre);
                
                        System.out.println("Ingrese la nueva ciudad del equipo:");
                        String nuevaCiudad = sc.nextLine();
                        equipoact.setCiudad(nuevaCiudad);

                        do {
                            System.out.println("Ingrese el ID del jugador:");
                            int idjugador = sc.nextInt();
                            Player jugador = new Player();
                            jugador.setId(idjugador);  
                            jugadoresz.add(jugador);
                        
                            System.out.println("¿Quiere agregar otro jugador? \n 1: Sí \n 2: No");
                            int opcion = sc.nextInt();
                            sc.nextLine(); 
                            if (opcion == 2) {
                                break;
                            }
                        } while (true);
                        equipo.setLstJugadores(jugadoresz); 
                
                    ArrayList<Coach> entrenadores = new ArrayList<>();
                    do {
                            System.out.println("Ingrese el ID del entrenador:");
                            int idEntrenador = sc.nextInt();
                            Coach entrenador = new Coach(); 
                            entrenador.setId(idEntrenador);
                            entrenadores.add(entrenador);
                
                            System.out.println("¿Quiere agregar otro entrenador? \n 1: Sí \n 2: No");
                            int opcion = sc.nextInt();
                            sc.nextLine();
                            if (opcion == 2) {
                                break;
                            }
                    } while (true);
                    equipoact.setLstEntrenadores(entrenadores);
                
                    ArrayList<Doctor> medicos = new ArrayList<>();
                    do {
                            System.out.println("Ingrese el ID del médico:");
                            int idMedico = sc.nextInt();
                            Doctor medico = new Doctor(); 
                            medico.setId(idMedico);
                            medicos.add(medico);
                
                            System.out.println("¿Quiere agregar otro médico? \n 1: Sí \n 2: No");
                            int opcion = sc.nextInt();
                            sc.nextLine(); 
                            if (opcion == 2) {
                                break;
                            }
                    } while (true);
                    equipoact.setLstMasajistas(medicos);
                
                    controlador.equipos.put(codigoEquipo, equipoact);
                
                    System.out.println("Equipo actualizado correctamente.");
                    } else {
                        System.out.println("El equipo con código " + codigoEquipo + " no existe.");
                    }
        break;
    
        case 3:
                    Team eq = new Team();
                    boolean encontrado = false;
                    Scanner sca = new Scanner(System.in);
                    
                    while (!encontrado) {
                        System.out.println("Ingrese el ID del equipo (o 'salir' para salir):");
                        String codigoE = sca.nextLine();
                        
                        if (codigoE.equalsIgnoreCase("salir")) {
                            System.out.println("Saliendo del programa...");
                            break; 
                        }
                        
                            if (controlador.equipos.contains(codigoE)) {
                                System.out.println("Nombre de mi equipo: " + eq.getNombre());
                                encontrado = true; 
                                break; 
                            }
                        
                        if (!encontrado) {
                            System.out.println("El equipo con el ID '" + codigoE + "' no existe.");
                        }
                    }
                    
                    sc.close(); 
        
        break;
        case 4:
                    Team eqa = new Team();
                    System.out.println("Ingrese el id del equipo a eliminar: ");
                    String idequipoeliminar = sc.nextLine();

                    if(controlador.equipos.contains(idequipoeliminar)){
                        controlador.equipos.remove(idequipoeliminar);
                        System.out.println("El equipo "+ eqa.getNombre()+ " ha sido eliminado");
                    }else {
                        System.out.println("El equipo con código " + idequipoeliminar + " no existe.");
                    }
                    
        break;

        case 5:
                    System.out.println("Listado de todos los Equipos:");
                    for (String key : controlador.equipos.keySet()) {
                    Team equipoa = controlador.equipos.get(key);
                    System.out.println("Código: " + key);
                    System.out.println("Nombre: " + equipoa.getNombre());
                    System.out.println("Ciudad: " + equipoa.getCiudad());
                    System.out.println("Jugadores:");
                    for (Player jugador : equipoa.getLstJugadores()) {
                        System.out.println("- ID: " + jugador.getId());
                    }
                    System.out.println("Entrenadores:");
                    for (Coach entrenador : equipoa.getLstEntrenadores()) {
                        System.out.println("- ID: " + entrenador.getId());                           
                    }
                    System.out.println("Doctores:");
                    for (Doctor doctor : equipoa.getLstMasajistas()) {
                        System.out.println("- ID: " + doctor.getId()); 
                    }
                    System.out.println("-----------------------------------");
            }
        break;
            

        case 6:
                return;
            default:
            System.out.println("Opción inválida, intentelo de nuevo.");
                
            }
        }
    }
}
