package com.example.eva1_clima_frag;

public class Clima {
    private int imagen;
    private String Ciudad;
    private double temperatura;
    private String clima;


    public Clima(int imagen, String Ciudad, double temperatura, String clima) {
        this.imagen = imagen;
        this.Ciudad = Ciudad;
        this.temperatura = temperatura;
        this.clima = clima;
    }

    public Clima(){

        imagen = R.drawable.sunny;
        Ciudad = "Chihuahua";
        temperatura = 40;
        clima = "Caluroso";
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }
}
