package banco;


import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class CCuentaCorriente extends CCuenta implements Serializable {

private int transacciones;
private double importePorTrans;
private int transExentas;
public CCuentaCorriente(){}
public CCuentaCorriente(String nom, String cue, double sal, double tipo, double imptrans, int transex){
super(nom,cue,sal,tipo);
transacciones=0;
asignarImportePorTrans(imptrans);
asignarTransExentas(transex);
}
public void decrementarTransacciones(){
transacciones--;
}
public void asignarImportePorTrans(double imptrans)
{
if(imptrans<0)
{
System.out.println("Error: cantidad negativa");
return;
}
importePorTrans=imptrans;
}
public double obtenerImportePorTrans(){
return importePorTrans;
}
public void asignarTransExentas(int transex)
{
if(transex<0)
{
System.out.println("Error: cantidad negativa");
return;
}
transExentas=transex;
}
public int obtenerTransExentas()
{
    return transExentas;
}
 public void ingreso(double cantidad)
 { super.ingreso(cantidad);
   transacciones++;
 }


 public void reintegro(double cantidad)
         { super.ingreso(cantidad);
   transacciones++;
 }

 public void comisiones ()
         { GregorianCalendar fechaActual=new GregorianCalendar();
           int dia= fechaActual.get(Calendar.DAY_OF_MONTH);
           if (dia==1)
           {int n = transacciones- transExentas;
            if (n>0)reintegro(n*importePorTrans);
            transacciones=0;
           }}


 public double intereses()
         { GregorianCalendar fechaActual=new GregorianCalendar();
           int dia= fechaActual.get(Calendar.DAY_OF_MONTH);
           if (dia!=1)return 0.0;

           double interesesProducidos= 0.0;
           if (estado()<= 3000)
               interesesProducidos= estado()* 0.5/1200.0;
           else
           {
             interesesProducidos= 3000* 0.5/1200.0 +
                     (estado()-3000 )*obtenerTipoDeInteres()/1200.0;
           }
           ingreso(interesesProducidos);
           decrementarTransacciones();
           return interesesProducidos;
 }
 }


