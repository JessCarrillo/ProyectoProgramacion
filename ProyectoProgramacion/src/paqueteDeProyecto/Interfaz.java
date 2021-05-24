/*Integrantes:
Rubiera Villareal Vanessa Estefania
Carrillo Arellano Jesus David
Aquino Chavez Luis Daniel
Ramirez Medina Aaron
Grupo 332 */

package paqueteDeProyecto;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Interfaz {

	Preguntas Question = new Preguntas();
	int opc = 0;
	int res = 0;
	boolean salir = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Interfaz Interfaz = new Interfaz();
		Interfaz.inicio();
	}

	public void inicio() {
	
		int opc = 0;

		do { //Ciclo para repetir todo el programa
			
			opc = JOptionPane.showOptionDialog(null, "", "Bienvenido", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
					new ImageIcon("src/paqueteDeProyecto/imagenes/Tema.png"), new Object[] { "Jugar", "Ver puntajes", "Salir" }, "Jugar");

			if(opc==0) {
				
				Question.añadirPreguntasYRespuestas();//Llamada a método para inicializar arreglos con las preguntas y respuestas del Quizz
				ingresarNombre();
				menuOpciones();//Llamada a metodo para seleccionar el tema de las preguntas y ejecutar sus metodos
				
				JOptionPane.showMessageDialog(null, "Hasta luego " + Question.nombre + "... \nGracias por jugar!", "Mensaje de despedida", JOptionPane.PLAIN_MESSAGE,
						new ImageIcon("src/paqueteDeProyecto/imagenes/byebye.gif"));// Mensaje de despedida de un usuario
			}
			else if(opc==1) {
				menuVerPuntajes();
			}
			else if(opc==2) {
				// Mensaje de despedida de fin del programa
				JOptionPane.showMessageDialog(null, "Gracias por utilizar nuestro programa, \nel programa se cerrará, bye bye!", 
						"Salida del programa", JOptionPane.PLAIN_MESSAGE, new ImageIcon("src/paqueteDeProyecto/imagenes/despedidaFinal2.gif"));
			}
			
		}while(opc==0 || opc==1);//Se repite el ciclo si el usuario presiona Jugar o Ver puntajes
			
	}
	
	public void menuVerPuntajes() {
		
		int opc = 0;
		
		opc = JOptionPane.showOptionDialog(null, "Seleccione el tema para ver historial de puntajes:", "Selección de tema historial de puntajes",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { "Historia", "Geografía", "Cine" }, "Historia");
		
		// en base al tema seleccionado por el usuario se ejecuta su correspondiente switch, haciendo la llamada a los metodos correspondientes del tema
		// seleccionado por el usuario
		switch (opc) {
		case 0:
			Question.verPuntajesH();
			break;
		case 1:
			Question.verPuntajesG();
			break;
		case 2:
			Question.verPuntajesC();
			break;
		}
	}
	
	public void ingresarNombre() {
		
		boolean repetir = false;
		
		do {
			Question.nombre = (String) JOptionPane.showInputDialog(null, "Ingresa tu nombre: ", "Nombre Jugador",
					JOptionPane.PLAIN_MESSAGE, new ImageIcon("src/paqueteDeProyecto/imagenes/nombre.png"), null, null);

			if(Question.nombre.equals("")) {
				JOptionPane.showMessageDialog(null, "Por favor ingresa un nombre", "Alerta",
						JOptionPane.WARNING_MESSAGE);
				repetir = true;
			}
			else { repetir = false;
			}
		}while(repetir); //Se repite ciclo hasta que el usuario ingrese un valor para nombre
	}
	
	public void menuOpciones() {
		
		// Ciclo para repetir la selección de temas
				do {

					opc = JOptionPane.showOptionDialog(null, "Seleccione el tema de las preguntas:", "Selección de tema",
							JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null,
							new Object[] { "Historia", "Geografía", "Cine" }, "Historia");
					
					Question.opc = opc; //Enviar valor opc a clase Question

					// en base al tema seleccionado por el usuario se ejecuta su correspondiente
					// switch, haciendo la llamada a los metodos correspondientes del tema
					// seleccionado por el usuario
					switch (opc) {
					case 0:
						Question.desplegarPreguntasHistoria();
						break;
					case 1:
						Question.desplegarPreguntasGeografia();
						break;
					case 2:
						Question.desplegarPreguntasCine();
						break;
					}
					
					Question.almacenarPuntajes();
					Question.desplegarResultado();
					preguntaVolverJugar();
					Question.reiniciarVariables(); // Reiniciar contador de preguntas correctas y acumulador de puntos para cada nuevo juego del usuario con respecto a la elección de tema

				} while (res != 2); // El ciclo se repite hasta que el usuario no ingrese 2
	
	}

	
	public void preguntaVolverJugar() {
		// Se muestra un mensaje para seleccionar si se desea continuar o si se quiere
		// cerrar el programa, se verifica los datos ingresados, de no ser un 1 o 2 se
		// seguira mostrando el cuadro de seleccion
		
		Boolean Condicion;

		Condicion = true;

		do {

			try {
				res = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Quieres volver a jugar " + Question.nombre + "? \n1)Si \n2)No",
						"Pregunta para volver a jugar", JOptionPane.PLAIN_MESSAGE));
				Condicion = false;
			} catch (Exception a) {
				JOptionPane.showMessageDialog(null, "Ingresa un digito valido (1 o 2)", "ERROR",
						JOptionPane.ERROR_MESSAGE);
				Condicion = true;
			}

		} while (Condicion);
	}

}
