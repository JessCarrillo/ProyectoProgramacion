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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Interfaz Interfaz = new Interfaz();
		Interfaz.inicio();
	}

	public void inicio() {

		int opc = 0;
		int res = 0;

		//Llamada a metodo para inicializar areglos con las preguntas y respuestas del Quizz
		Question.añadirPreguntasYRespuestas();
		Question.nombre = (String) JOptionPane.showInputDialog(null,"Ingresa tu nombre: ","Nombre Jugador",JOptionPane.PLAIN_MESSAGE, new ImageIcon("src/principal/imagenes/nombre.png"),null,null);

		//Ciclo para repetir la selección de temas 
		do {
			
			opc = JOptionPane.showOptionDialog(null, "Seleccione el tema de las preguntas:", "Selección de tema",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null,
					new Object[] { "Historia", "Geografía", "Cine" }, "Historia");

			switch (opc) {
			case 0:
				Question.desplegarPreguntasHistoria();
				//Question.revisarRespuestasH();
				Question.desplegarResultado();
				break;
			case 1:
				Question.desplegarPreguntasGeografia();
				Question.revisarRespuestasG();
				Question.desplegarResultado();
				break;
			case 2:
				Question.desplegarPreguntasCine();
				Question.revisarRespuestasC();
				Question.desplegarResultado();
				break;
			}
			
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
			
			Question.reiniciarVariables(); //Reiniciar contador de preguntas correctas y acumulador de puntos para cada nuevo juego del usuario con respecto a la elección de tema

		} while (res != 2); //El ciclo se repite hasta que el usuario no ingrese 2

	}

}
