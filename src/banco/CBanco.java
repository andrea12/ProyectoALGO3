package banco;

import java.io.Serializable;


public class CBanco implements Serializable{

    private CCuenta[] clientes;
    private int nElementos;

    public CBanco() {
        nElementos = 0;
        clientes = new CCuenta[nElementos];
    }

    private void unElementoMas(CCuenta[] clientesActuales) {
        nElementos = clientesActuales.length;
        clientes = new CCuenta[nElementos + 1];
        for (int i = 0; i < nElementos; i++) {
            clientes[i] = clientesActuales[i];
        }
        nElementos++;



    }

    private void unElementoMenos(CCuenta[] clientesActuales) {
        if (clientesActuales.length == 0) {
            return;
        }
        int k = 0;
        nElementos = clientesActuales.length;
        clientes = new CCuenta[nElementos - 1];
        for (int i = 0; i < nElementos; i++) {
            clientes[k++] = clientesActuales[i];
        }
        nElementos--;



    }

    public void insertarCliente(int i, CCuenta objeto) {
        if (i >= 0 && i < nElementos) {
            clientes[i] = objeto;
        } else {
            System.out.println("Indice fuera de limites");
        }
    }

    public CCuenta clienteEn(int i) {
        if (i >= 0 && i < nElementos) {
            return clientes[i];
        } else {
            System.out.println("Indice fuera de limites");
        }
        return null;
    }

    public int longitud() {
        return nElementos;
    }

    public void añadir(CCuenta obj) {
        unElementoMas(clientes);
        insertarCliente(nElementos - 1, obj);
    }

    public boolean eliminarNom(String nombre) {
        for (int i = 0; i < nElementos; i++) {
            if (nombre.compareTo(clientes[i].obtenerNombre()) == 0) {
                clientes[i] = null;
                unElementoMenos(clientes);
                return true;
            }
        }
        return false;
    }

    public boolean eliminarCue(String cuenta) {
        for (int i = 0; i < nElementos; i++) {
            if (cuenta.compareTo(clientes[i].obtenerCuenta()) == 0) {
                clientes[i] = null;
                unElementoMenos(clientes);
                return true;
            }
        }
        return false;
    }

    public int buscarCue(String cuenta) {
        int pos = 0;
        for (int i = 0; i < nElementos; i++) {
            if (cuenta.compareTo(clientes[i].obtenerCuenta()) == 0) {
                pos = i;
            } else {
                pos = -1;
            }
        }
        return pos;
    }

    public int buscarNom(String nombre) {
        int pos = 0;
        for (int i = 0; i < nElementos; i++) {
            if (nombre.compareTo(clientes[i].obtenerNombre()) == 0) {
                pos = i;
            } else {
                pos = -1;
            }
        }
        return pos;
    }
    
    
    public String verTodo(){
         
        String a="\n TODAS LAS CUENTAS "+ "\n::::::::::::::::::::::::::::::::::::\n\n";
        
        for (int i = 0; i < nElementos; i++) {
           a=a+verCuenta(i);
             
        }
        return a;
    
    }

    public String verCuenta(int pos){
         
        String a="\n INFORMACION DEL CLIENTE\n"+"==========================";
        a=a+"\n - Nombre :"+clientes[pos].obtenerNombre()+"\n - Cuenta : "+clientes[pos].obtenerCuenta()
                +"\n - Saldo : "+ clientes[pos].estado()+"\n\n";
        return a;
    
    }
    
    public int buscar(String str, int pos) {
        String nom, cuen;

        if (str == null) {
            return -1;
        }
        if (pos < 0) {
            pos = 0;
        }

        for (int i = pos; i < nElementos; i++) {
            nom = clientes[i].obtenerNombre();
            if (nom == null) {
                continue;
            }
            if (nom.indexOf(str) > -1) {
                return i;
            }
            cuen = clientes[i].obtenerCuenta();

            if (cuen == null) {
                continue;
            }
            if (cuen.indexOf(str) > -1) {
                return i;
            }
        }

        return -1;
    }
}
