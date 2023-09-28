package com.LostCode.MVC.Controller;

import com.LostCode.MVC.Model.TareaModel;
import com.LostCode.MVC.View.TareaVista;

public class TareaController {
    private TareaModel[] tareas;
    private TareaVista vista;

    public TareaController() {
        tareas = new TareaModel[0];
        vista = new TareaVista();
    }

    public void agregarTarea(String descripcion) {
        TareaModel tarea = new TareaModel(descripcion);
        TareaModel[] nuevasTareas = new TareaModel[tareas.length + 1];
        for (int i = 0; i < tareas.length; i++) {
            nuevasTareas[i] = tareas[i];
        }
        nuevasTareas[nuevasTareas.length - 1] = tarea;
        tareas = nuevasTareas;
        vista.mostrarListaDeTareas(tareas);
    }

    public void marcarTareaComoCompletada(int indice) {
        if (indice >= 0 && indice < tareas.length) {
            tareas[indice].marcarComoCompletada();
            vista.mostrarListaDeTareas(tareas);
        } else {
            System.out.println("Índice de tarea no válido.");
        }
    }
}

