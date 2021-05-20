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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Interfaz Interfaz = new Interfaz();
		Interfaz.inicio();
	}

	public void inicio() {
		
		int opc = 0;

		opc = JOptionPane.showOptionDialog(null, "", "Bienvenido",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { "Jugar", "Salir" }, "Jugar");
		
		switch(opc) {
		case 0:
			// Llamada a método para inicializar areglos con las preguntas y respuestas del Quizz
			Question.añadirPreguntasYRespuestas();
			Question.nombre = (String) JOptionPane.showInputDialog(null, "Ingresa tu nombre: ", "Nombre Jugador",
					JOptionPane.PLAIN_MESSAGE, new ImageIcon("src/principal/imagenes/nombre.png"), null, null);

			menuOpciones();//Llamada a metodo para seleccionar el tema de las preguntas y ejecutar sus metodos
			break;
		case 1:
			JOptionPane.showMessageDialog(null, "Hasta luego!", "Mensaje de despedida", JOptionPane.PLAIN_MESSAGE,
					new ImageIcon("src/actividad542/imagenes/despedida.png"));// Mensaje de despedida
			break;
		default:
			//Mostar mensaje de error y que vuelva a ingresar opciones 
		}
	}
	
	public void menuOpciones() {
		
		// Ciclo para repetir la selección de temas
				do {

					opc = JOptionPane.showOptionDialog(null, "Seleccione el tema de las preguntas:", "Selección de tema",
							JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null,
							new Object[] { "Historia", "Geografía", "Cine" }, "Historia");

					// en base al tema seleccionado por el usuario se ejecuta su correspondiente
					// switch, haciendo la llamada a los metodos correspondientes del tema
					// seleccionado por el usuario
					switch (opc) {
					case 0:
						Question.desplegarPreguntasHistoria();
						// Question.revisarRespuestasH();
						//Question.desplegarResultado();
						break;
					case 1:
						Question.desplegarPreguntasGeografia();
						//Question.revisarRespuestasG();
						//Question.desplegarResultado();
						break;
					case 2:
						Question.desplegarPreguntasCine();
						//Question.revisarRespuestasC();
						//Question.desplegarResultado();
						break;
					}
					
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
				res = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Quiere volver a jugar? \n1)Si \n2)No",
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
