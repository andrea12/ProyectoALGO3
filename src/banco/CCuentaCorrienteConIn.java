package banco;


import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class CCuentaCorrienteConIn extends CCuentaCorriente implements Serializable {
 public CCuentaCorrienteConIn(){}//constructor sin parametros
        public CCuentaCorrienteConIn(String nom,String cue,double sal,double tipo,double imptrans,int transex){
        //invocar al constrructor de la supérclase
            super(nom,cue,sal,tipo,imptrans,transex);


        }

    public double intereses(){
    GregorianCalendar fechaActual=new GregorianCalendar();
    int dia=fechaActual.get(Calendar.DAY_OF_MONTH);
    if(dia!=1 || estado()<3000)return 0.0;

    double interesesProducidos=0.0;
    interesesProducidos=estado()+obtenerTipoDeInteres()/1200.0;
    ingreso(interesesProducidos);

    decrementarTransacciones();


    return interesesProducidos;


    }
}
