package com.LostCode.MVC.Model;

public class TareaModel {
    private String descripcion;
    private boolean completada;

    public TareaModel(String descripcion) {
        this.descripcion = descripcion;
        this.completada = false;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void marcarComoCompletada() {
        completada = true;
    }
}
