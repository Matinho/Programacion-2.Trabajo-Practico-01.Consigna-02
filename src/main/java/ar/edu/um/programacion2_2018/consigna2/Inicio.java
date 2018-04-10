package ar.edu.um.programacion2_2018.consigna2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Inicio {
    public static void main (String[] args){

        Inicio start = new Inicio();
        start.iniciar();

    }

    public void iniciar(){

        Fecha fecha1 = new Fecha(13,07,1880);
        Fecha fecha2 = new Fecha(01,01,2001);
        Calendar calendar = new GregorianCalendar();

        fecha1.show();
        fecha2.show();

        System.out.println(fecha1.toString());
        System.out.println(fecha2.toString());

        fecha2.desplazar(0);

        fecha1.desplazar(-28);

        fecha2.desplazar(700);

    }

}
