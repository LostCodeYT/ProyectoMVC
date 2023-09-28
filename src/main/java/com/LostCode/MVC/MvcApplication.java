package com.LostCode.MVC;

import com.LostCode.MVC.Controller.TareaController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MvcApplication {

	public static void main(String[] args) {

				TareaController controlador = new TareaController();

				controlador.agregarTarea("Hacer compras");
				controlador.agregarTarea("Estudiar para el examen");
				controlador.agregarTarea("Ejercicio matutino");
				controlador.marcarTareaComoCompletada(0);
				controlador.agregarTarea("Llevar el coche al taller");
	}

	}


