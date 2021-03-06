package banco;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

public class Base {
    
    public static String leerDato(){
        String dato = "inicio";
        try{
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
            dato = teclado.readLine();
        }catch(Exception e){
            mostrar("Error de Lectura de datos.");
        }
        return dato;
    }
    
    public static void mostrar(String cadena){
        System.out.println(cadena);
    }
    
    public static void mostrarSeguido(String cadena){
        System.out.print(cadena);
    }
    
    public static int convertirCadenaEntero(String cadena){
        int dato = -99999;
        try{
            dato = Integer.parseInt(cadena);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al convertir - "+cadena+" - a Entero.","Clinica",JOptionPane.ERROR_MESSAGE);
        }
        return dato;
    }
    
    public static double convertirCadenaReal(String cadena){
        double dato = -99999;
        try{
            dato = Double.parseDouble(cadena);
        }catch(Exception e){
            mostrar("Error al convertir - "+cadena+" - a Entero.");
        }
        return dato;
    }
    
     public static void mostrarOpcion(String cad, int tipo) {
        JOptionPane.showMessageDialog(null, cad, "Sistema de Banco Fisi ", tipo);
    }
    
    public static long convertirCadenaEnteroLargo(String cadena){
        long dato = -99999;
        try{
            dato = Long.parseLong(cadena);
        }catch(Exception e){
            mostrar("Error al convertir - "+cadena+" - a Entero.");
        }
        return dato;
    }
    
    public static String completarIzquierda(String cadena, int cantidad, String simbolo){
        String aux = "";     
        double veces = cantidad;
        
        veces = veces / simbolo.length();
        veces = Math.ceil(veces);
        
        for(int i=0; i<veces; i++){
            aux = aux + simbolo;
        }        
        
        if(cantidad-cadena.length()>=0){
            aux = aux.substring(0,cantidad-cadena.length()); 
            aux = aux + cadena;
        }else{
            aux = cadena.substring(0,cantidad); 
        }
                
        return aux;
    }
    
    public static String completarDerecha(String cadena, int cantidad, String simbolo){
        String aux = "";     
        double veces = cantidad;
        
        veces = veces / simbolo.length();
        veces = Math.ceil(veces);
        
        for(int i=0; i<veces; i++){
            aux = aux + simbolo;
        }        
        
        if(cantidad-cadena.length()>=0){            
            aux = cadena + aux;
            aux = aux.substring(0,cantidad); 
        }else{
            aux = cadena.substring(0,cantidad); 
        }
                
        return aux;
    }
    
    public static String centrarCadena(String cadena, int cantidad, String simbolo){
        String aux = "";
        String cadenaD, cadenaI;
        int tamanio, tamanioI;
        int cantidadD, cantidadI;
                
        if(cantidad - cadena.length() > 0){
            tamanio = cadena.length();
            tamanioI = (tamanio + 1)/2;            
            cantidadI = (cantidad + 1)/2;
            cantidadD = cantidad - cantidadI;
            cadenaI = completarIzquierda(cadena.substring(0,tamanioI),cantidadI,simbolo);
            cadenaD = completarDerecha(cadena.substring(tamanioI,tamanio),cantidadD,simbolo);
            aux = cadenaI + cadenaD;
        }
        
        return aux;
    }
    
    public static String getFecha(){        
        GregorianCalendar calendario = new GregorianCalendar(); 
        String dato = completarIzquierda(""+calendario.get(calendario.DAY_OF_MONTH),2,"0"); 
        dato = dato + "/" + completarIzquierda(""+((calendario.get(calendario.MONTH)) + 1),2,"0"); 
        dato = dato + "/" + completarIzquierda(""+calendario.get(calendario.YEAR),4,"0");                 
        return dato;
    }   
    
    public static String getDia(){        
        GregorianCalendar calendario = new GregorianCalendar(); 
        String dato = completarIzquierda(""+calendario.get(calendario.DAY_OF_MONTH),2,"0"); 
        return dato;
    }

    public static String getMes(){        
        GregorianCalendar calendario = new GregorianCalendar(); 
        String dato = completarIzquierda(""+((calendario.get(calendario.MONTH)) + 1),2,"0");         
        return dato;
    }

    public static String getAnio(){        
        GregorianCalendar calendario = new GregorianCalendar(); 
        String dato = completarIzquierda(""+calendario.get(calendario.YEAR),4,"0");                 
        return dato;
    }
    
    public static String getHoraMinSeg(){        
        GregorianCalendar calendario = new GregorianCalendar(); 
        String dato = completarIzquierda(""+calendario.get(calendario.HOUR),2,"0"); 
        dato = dato + ":" + completarIzquierda(""+((calendario.get(calendario.MINUTE))),2,"0"); 
        dato = dato + ":" + completarIzquierda(""+calendario.get(calendario.SECOND),2,"0");                 
        return dato;
    }
    
    public static String getHoraMin(){        
        GregorianCalendar calendario = new GregorianCalendar(); 
        String dato = completarIzquierda(""+calendario.get(calendario.HOUR),2,"0"); 
        dato = dato + ":" + completarIzquierda(""+((calendario.get(calendario.MINUTE))),2,"0");         
        return dato;
    }
    
    public static String getHoraMinSegAmPm(){        
        GregorianCalendar calendario = new GregorianCalendar(); 
        String dato = completarIzquierda(""+calendario.get(calendario.HOUR),2,"0"); 
        dato = dato + ":" + completarIzquierda(""+((calendario.get(calendario.MINUTE))),2,"0"); 
        dato = dato + ":" + completarIzquierda(""+calendario.get(calendario.SECOND),2,"0");                         
        if(calendario.get(calendario.AM_PM) == 0){
            dato = dato + " AM";    
        }else{
            dato = dato + " PM";    
        }        
        return dato;
    }
    
    public static String getHoraMinAmPm(){        
        GregorianCalendar calendario = new GregorianCalendar(); 
        String dato = completarIzquierda(""+calendario.get(calendario.HOUR),2,"0"); 
        dato = dato + ":" + completarIzquierda(""+((calendario.get(calendario.MINUTE))),2,"0");         
        if(calendario.get(calendario.AM_PM) == 0){
            dato = dato + " AM";    
        }else{
            dato = dato + " PM";    
        }        
        return dato;
    }
    
    public static String getHoraMinSegAmPm2(){        
        GregorianCalendar calendario = new GregorianCalendar(); 
        String dato = completarIzquierda(""+calendario.get(calendario.HOUR),2,"0"); 
        dato = dato + ":" + completarIzquierda(""+((calendario.get(calendario.MINUTE))),2,"0"); 
        dato = dato + ":" + completarIzquierda(""+calendario.get(calendario.SECOND),2,"0");                         
        if(calendario.get(calendario.AM_PM) == 0){
            dato = dato + " A.M.";    
        }else{
            dato = dato + " P.M.";    
        }        
        return dato;
    }
    
    public static String getHoraMinAmPm2(){        
        GregorianCalendar calendario = new GregorianCalendar(); 
        String dato = completarIzquierda(""+calendario.get(calendario.HOUR),2,"0"); 
        dato = dato + ":" + completarIzquierda(""+((calendario.get(calendario.MINUTE))),2,"0");         
        if(calendario.get(calendario.AM_PM) == 0){
            dato = dato + " A.M.";    
        }else{
            dato = dato + " P.M.";    
        }        
        return dato;
    } 
    
    public static String getHora(){        
        GregorianCalendar calendario = new GregorianCalendar(); 
        String dato = completarIzquierda(""+calendario.get(calendario.HOUR),2,"0");         
        return dato;
    }
    
    public static String getMinuto(){        
        GregorianCalendar calendario = new GregorianCalendar(); 
        String dato = completarIzquierda(""+((calendario.get(calendario.MINUTE))),2,"0");         
        return dato;
    }
    
    public static String getSegundo(){         
        GregorianCalendar calendario = new GregorianCalendar(); 
        String dato = completarIzquierda(""+calendario.get(calendario.SECOND),2,"0");                 
        return dato;
    }
    
    public static String getDireccionIp(){         
        String dato;
        int posicion;
        try{
            dato = java.net.InetAddress.getLocalHost().toString();          
            posicion = dato.indexOf("/");
            if(posicion>=0){
                dato = dato.substring(posicion + 1);
            }
        }catch(Exception e){
            dato = "No se encontro LocalHost";
        }
        return dato;
    }
    
    public static String getNombreMaquina(){         
        String dato;
        int posicion;
        try{
            dato = java.net.InetAddress.getLocalHost().toString();          
            posicion = dato.indexOf("/");
            if(posicion>=0){
                dato = dato.substring(0,posicion);
            }            
        }catch(Exception e){
            dato = "No se encontro LocalHost";
        }
        return dato;
    }
    
    public static String getMesEnLetra(int mes){
        String dato = "";
        switch(mes){
            case  1: dato = "Enero"; break;
            case  2: dato = "Febrero"; break;
            case  3: dato = "Marzo"; break;
            case  4: dato = "Abril"; break;
            case  5: dato = "Mayo"; break;
            case  6: dato = "Junio"; break;
            case  7: dato = "Julio"; break;
            case  8: dato = "Agosto"; break;
            case  9: dato = "Setiembre"; break;
            case 10: dato = "Octubre"; break;
            case 11: dato = "Noviembre"; break;
            case 12: dato = "Diciembre"; break;            
        }
        return dato;
    }
    
    public static String getDiaEnLetra(){
        GregorianCalendar calendario = new GregorianCalendar(); 
        int dia = calendario.get(calendario.DAY_OF_WEEK);         
        String dato = "";
        
        switch(dia){
            case  1: dato = "Domingo"; break;
            case  2: dato = "Lunes"; break;
            case  3: dato = "Martes"; break;
            case  4: dato = "Miercoles"; break;
            case  5: dato = "Jueves"; break;
            case  6: dato = "Viernes"; break;
            case  7: dato = "Sabado"; break;                    
        }
        return dato;
    }
    
    public static String getFechaEnLetra(){
        String dato;
        dato = getDia()+" de "+getMesEnLetra(convertirCadenaEntero(getMes()))+" del "+getAnio(); 
        return dato;
    }
    
    public static void mensaje(String strMensaje, String strTitulo, int iTipoIcono){
        JOptionPane.showMessageDialog(null,strMensaje,strTitulo,iTipoIcono);
    }
    
    public static void centrarVentana(JFrame jfrmVentana){
        try{
            Dimension tamPantalla = Toolkit.getDefaultToolkit().getScreenSize();
            int x,y,width,height;
            x = ((int)tamPantalla.getWidth() );
            y = ((int)tamPantalla.getHeight() );
            width = ((int)jfrmVentana.getSize().getWidth() );
            height = ((int)jfrmVentana.getSize().getHeight() );
            x = (x/2) - (width/2);
            y = (y/2) - (height/2);
            jfrmVentana.setBounds(x,y,width,height);
        }catch(Exception e){}
    }
    
    public static DefaultFormatterFactory creaFormatoControl(int tipo, 
                                        int cantEnt, int cantFra, char caracter){
        DefaultFormatterFactory factory = null;
        MaskFormatter numcase = null;
        String cadena = "";
        int i;
                
        for(i=0;i<cantEnt;i++){
            cadena = cadena + "#";
        }
        if(cantFra > 0){
            cadena = cadena + ".";
            for(i=0;i<cantFra;i++){
                cadena = cadena + "#";
            }
        }
        switch(tipo){
            case 1:
                try {
                    numcase = new MaskFormatter(cadena);
                    numcase.setPlaceholderCharacter(caracter);   
                    numcase.setOverwriteMode(true);   
                    numcase.setValidCharacters("0123456789");               
                    factory = new DefaultFormatterFactory(numcase);                    
                }catch (Exception pe) {
                    Base.mostrar("Error al dar Formato de Numero Entero");
                }
                break;
            case 2:
                try {
                    numcase = new MaskFormatter(cadena);
                    numcase.setPlaceholderCharacter(caracter);   
                    numcase.setOverwriteMode(true);   
                    numcase.setValidCharacters("0123456789");       
                    factory = new DefaultFormatterFactory(numcase);                    
                }catch (Exception pe) {
                    Base.mostrar("Error al dar Formato de Numero Real");
                }
                break;
        }
        
        return factory;
    }
}
