package ar.edu.um.programacion2_2018.consigna2;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {
    protected int dia;
    protected int mes;
    protected int anho;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnho() {
        return anho;
    }

    public void setAnho(int anho) {
        this.anho = anho;
    }

    public Fecha() {}

    public Fecha(int dia, int mes, int anho) {
        System.out.println("Estoy cargando la fecha...");
        this.dia = dia;
        this.mes = mes;
        this.anho = anho;
    }

    public void show (){
        System.out.println("Fecha (dd/mm/aaaa): " + dia + "/"+ mes + "/" + anho);
    }

    public String toString (){
        return "Dia: " + dia + " Mes: " + mes + " Año: " + anho;
    }

    public void desplazar (int cantDias){
        System.out.println("Dias a desplzar: " + cantDias);
        
        Calendar calendario = Calendar.getInstance();

        calendario.set(Calendar.YEAR, this.anho);
        calendario.set(Calendar.MONTH, this.mes -1);
        calendario.set(Calendar.DAY_OF_MONTH,this.dia);
        System.out.println("Calendario tiene - " + calendario.getTime());

        if (cantDias == 0){
            System.out.println("Desplazamiento Nulo " + calendario.getTime());
        }else if (cantDias > 0) {
            calendario.add(Calendar.DAY_OF_MONTH, cantDias);
            System.out.println("Desplazamiento Positivo " + calendario.getTime());
        } else {
            calendario.add(Calendar.DAY_OF_MONTH, -cantDias);
            System.out.println("Desplazamiento Negativo " + calendario.getTime());
        }
    }
}
