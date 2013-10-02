package banco;


import java.io.*;


public class Leer {
public static int datoInt(){
		return Integer.parseInt(dato());
	}
	public static String dato(){
		String sdato="";
		try
		{
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader flujoE=new  BufferedReader(isr);
			sdato=flujoE.readLine();
		}
		catch(IOException e)
		{
			System.err.println("ERROR:+e.getMessage()");
		}
		return sdato;
		}
		public static long datoLong(){
			return Long.parseLong(dato());
		}
		public static double datoDouble(){
			return Double.parseDouble(dato());
		}

}
