package com.LostCode.MVC.View;

import com.LostCode.MVC.Model.TareaModel;

public class TareaVista {
    public void mostrarListaDeTareas(TareaModel[] tareas) {
        System.out.println("Lista de Tareas:");
        for (int i = 0; i < tareas.length; i++) {
            String estado = tareas[i].isCompletada() ? "Completada" : "Pendiente";
            System.out.println((i + 1) + ". " + tareas[i].getDescripcion() + " - " + estado);
        }
    }
}
