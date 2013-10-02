package banco;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;

public class ProyectoBanco {

    public static CCuenta LeerDatos(int op) {
        CCuenta obj = null;
        String nombre, cuenta;
        double saldo, tipoi, mant;
        System.out.print("Nombre …………………:");
        nombre = Leer.dato();
        System.out.print("Cuenta …………………:");
        cuenta = Leer.dato();
        System.out.print("Saldo …………………:");
        saldo = Leer.datoDouble();
        System.out.print("Tipo de interes …………………:");
        tipoi = Leer.datoDouble();
        if (op == 1) {
            System.out.print("Mantenimineto…………………:");
            mant = Leer.datoDouble();
            obj = new CCuentaAhorro(nombre, cuenta, saldo, tipoi, mant);
        } else {
            int transex;
            double imptrans;
            System.out.print("Importe de transacciones…………………:");
            imptrans = Leer.datoDouble();
            System.out.print("Transacciones exentas…………………:");
            transex = Leer.datoInt();
            if (op == 2) {
                obj = new CCuentaCorriente(nombre, cuenta, saldo, tipoi, imptrans, transex);
            } else {
                obj = new CCuentaCorrienteConIn(nombre, cuenta, saldo, tipoi, imptrans, transex);
            }
        }
        return obj;
    }

    public static int menu() {
        System.out.print("\n\n");
        System.out.println("1. Saldo");
        System.out.println("2. Buscar ");
        System.out.println("3. Ingreso");
        System.out.println("4. Reintegro");
        System.out.println("5. Añadir");
        System.out.println("6. Eliminar");
        System.out.println("7. Mantenimiento");
        System.out.println("8. Salir");
        System.out.println();
        System.out.println(" Opción  ");
        int op;
        do {
            op = Leer.datoInt();
        } while (op < 1 || op > 8);
        return op;
    }

    public static void main(String[] args) {

        PrintStream flujoS = System.out;
        CBanco banco = new CBanco();
        int opcion = 0;
        int op1 = 0;
        int op2 = 0;
        int opcion2 = 0;
        int pos = -1;
        String cadenabuscar = null;
        String nombre, cuenta;
        double cantidad;
        boolean eliminado = false;
        boolean listaModificada = false;
        
        
        do {
                opcion = menu();
                switch (opcion) {
                    case 1:
                        flujoS.print("Nombre o cuenta, total o parcial");
                        cadenabuscar = Leer.dato();
                        pos = banco.buscar(cadenabuscar, 0);
                        if (pos == -1) {
                            if (banco.longitud() != 0) {
                                flujoS.println("Busqueda fallida");
                            } else {
                                flujoS.println("No hay clientes");
                            }
                        } else {
                            flujoS.println(banco.clienteEn(pos).obtenerNombre());
                            flujoS.println(banco.clienteEn(pos).obtenerCuenta());
                            flujoS.println(banco.clienteEn(pos).estado());
                        }
                        break;
                    case 2:
                        do {
                            flujoS.print("\nMENU");
                            flujoS.print("\n[1] Buscar por nombre");
                            flujoS.print("\n[2] Buscar por un numero cuenta ");
                            flujoS.print("\nIngrese la opcion");


                            op1 = Leer.datoInt();


                            switch (op1) {
                                case 1:
                                    flujoS.print("\nNombre");
                                    String nom = Leer.dato();
                                    pos = banco.buscarNom(nom);
                                    if (pos == -1) {
                                        if (banco.longitud() != 0) {
                                            flujoS.print("\nNo se encontro cliente");
                                        } else {
                                            flujoS.print("\nNo hay clientes registrados");
                                        }
                                    } else {
                                        flujoS.println(banco.clienteEn(pos).obtenerNombre());
                                        flujoS.println(banco.clienteEn(pos).obtenerCuenta());
                                        flujoS.println(banco.clienteEn(pos).estado());
                                    }

                                    break;

                                case 2:
                                    flujoS.println("\n Numero de Cuenta");
                                    String cue = Leer.dato();
                                    pos = banco.buscarCue(cue);
                                    if (pos == -1) {
                                        if (banco.longitud() != 0) {
                                            flujoS.print("\nNo se encontro cliente");
                                        } else {
                                            flujoS.print("\nNo hay clientes registrados");
                                        }
                                    } else {
                                        flujoS.println(banco.clienteEn(pos).obtenerNombre());
                                        flujoS.println(banco.clienteEn(pos).obtenerCuenta());
                                        flujoS.println(banco.clienteEn(pos).estado());
                                    }

                                    break;

                            }
                            break;
                        } while (op1 < 1 || op1 > 2);
                        break;
                    case 3:
                    case 4:

                        flujoS.print("\nCuenta");
                        cuenta = Leer.dato();
                        pos = banco.buscar(cuenta, 0);
                        if (pos == -1) {
                            if (banco.longitud() != 0) {
                                flujoS.println("\nNo se encontro cliente");
                            } else {
                                flujoS.println("\nNo hay clientes registrados");
                            }
                        } else {
                            flujoS.print("Cantidad: ");
                            cantidad = Leer.datoDouble();
                            if (opcion == 3) {
                                banco.clienteEn(pos).ingreso(cantidad);
                            } else {
                                banco.clienteEn(pos).reintegro(cantidad);
                            }

                        }
                        break;
                    case 5:
                        flujoS.print("TIPO DE CUENTA : 1-(CA),2-(CC),3-(CCI)");
                        do {
                            opcion2 = Leer.datoInt();


                        } while (opcion2 < 1 || opcion2 > 3);
                        banco.añadir(ProyectoBanco.LeerDatos(opcion2));
                        listaModificada = true;


                        break;
                    case 6:
                        flujoS.print("\nMENU");
                        flujoS.print("\n[1] Eliminar por nombre");
                        flujoS.print("\n[2] Eliminar por un numero cuenta ");
                        flujoS.print("\nIngrese la opcion");
                        do {
                            op2 = Leer.datoInt();

                        } while (op2 < 1 || op2 > 2);
                        switch (op2) {
                            case 1:
                                flujoS.print("Cuenta: ");
                                cuenta = Leer.dato();
                                eliminado = banco.eliminarCue(cuenta);
                                if (eliminado) {
                                    flujoS.println("Registro eliminado");
                                } else if (banco.longitud() != 0) {
                                    flujoS.println("cuenta no enecontrada");
                                } else {
                                    flujoS.println("no hay clientes");
                                }
                                break;
                            case 2:
                                flujoS.print("Nombre: ");
                                nombre = Leer.dato();
                                eliminado = banco.eliminarNom(nombre);
                                if (eliminado) {
                                    flujoS.println("Registro eliminado");
                                } else if (banco.longitud() != 0) {
                                    flujoS.println("cuenta no enecontrada");
                                } else {
                                    flujoS.println("no hay clientes");
                                }

                                break;
                        }
                        break;
                    case 8:

                        /*if (listaModificada) {
                            ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream("banco.txt"));
                            ous.writeObject(banco);
                            ous.close();

                        }*/
                        banco = null;
                }
            } while (opcion != 8);
        
        
        /*try {
            File fichero = new File("banco.txt");
            if (!fichero.exists()) {
                banco = new CBanco();
                flujoS.println("Se ha creado una nueva lista");
            } else {
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("banco.txt"));
                banco = (CBanco) ois.readObject();
                ois.close();
                flujoS.println("Se ha creado con exito");

            }

            
        } catch (IOException e) {
            System.out.println("Error:" + e.getMessage());

        } catch (ClassNotFoundException e) {
            System.out.println("Error:" + e.getMessage());

        }*/
    }
}
