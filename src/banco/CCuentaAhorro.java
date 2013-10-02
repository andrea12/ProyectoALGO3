package banco;


import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class CCuentaAhorro extends CCuenta implements Serializable{
private double cuotaMantenimiento;
public CCuentaAhorro(){}
public CCuentaAhorro(String nom,String cue,double sal,double tipo,double mant){
super(nom,cue,sal,tipo);
asignarCuotaManten(mant);
}
public void asignarCuotaManten(double cantidad)
{
if(cantidad<0)
{
System.out.println("Error: cantidad negativa");
return;
}
cuotaMantenimiento=cantidad;
}
public double obtenerCuotaManten()
{
return cuotaMantenimiento;
}
public void comisiones()
{
GregorianCalendar fechaActual=new GregorianCalendar();
int dia=fechaActual.get(Calendar.DAY_OF_MONTH);
if(dia==1)reintegro(cuotaMantenimiento);
}
public double intereses()
{
GregorianCalendar fechaActual=new GregorianCalendar();
int dia=fechaActual.get(Calendar.DAY_OF_MONTH);
if(dia!=1)return 0.0;
double interesesProducidos =0.0;
interesesProducidos=estado()*obtenerTipoDeInteres()/1200.0;
ingreso(interesesProducidos);
return interesesProducidos;

}
}