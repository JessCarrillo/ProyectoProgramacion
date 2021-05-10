/*Integrantes:
Rubiera Villareal Vanessa Estefania
Carrillo Arellano Jesus David
Aquino Chavez Luis Daniel
Ramirez Medina Aaron
Grupo 332 */

package paqueteDeProyecto;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Preguntas {
	
	//Declaración e Inicialización de Variables Globales
	String PreguntasH[][] = new String[20][5];
	String PreguntasG[][] = new String[20][5];
	String PreguntasC[] = new String[5];
	
	int RespuestasH[] = new int[5]; //Arreglos de 5 espacios para las respuestas del usuario
	int RespuestasG[] = new int[5];
	int RespuestasC[] = new int[5];
	
	int ResCorrectasH[] = new int[5]; //Arreglos de 5 espacios para respuestas correctas 
	int ResCorrectasG[] = new int[5];
	int ResCorrectasC[] = new int[5];
	
	int res=0;
	int contAcertadas = 0;
	int puntos = 0;
	String tituloDR = "";
	
	String nombre = "";
	
	public void añadirPreguntasYRespuestas() {
		
		//Arreglos con preguntas para desplegarlas proximamente en ciclo for
		
		añadirPreguntasyResHistoria();
		añadirPreguntasyResGeografia();
		
		PreguntasC[0] = "¿Película que casi le da un infarto a su director Brad Bierd?";
		PreguntasC[1] = "¿Palabra más conocida del Capitán América de Los Vengadores?";
		PreguntasC[2] = "¿Cuál era la película con mas taquilla antes de ser Los Vengadores ENDGAME?";
		PreguntasC[3] = "Película de Disney que tuvo un uso del 2D y 3D en toda la película: ";
		PreguntasC[4] = "Película de DC que se volvió a estrenar en el año 2021: ";	
		
		//Arrelos con respuestas correctas según indice regresado en la variable res de los botones
		ResCorrectasH[0] = 0; 
		ResCorrectasH[1] = 2;
		ResCorrectasH[2] = 1;
		ResCorrectasH[3] = 0;
		ResCorrectasH[4] = 3;
		
		ResCorrectasG[0] = 2;
		ResCorrectasG[1] = 1;
		ResCorrectasG[2] = 0;
		ResCorrectasG[3] = 3;
		ResCorrectasG[4] = 2;
		
		ResCorrectasC[0] = 0;
		ResCorrectasC[1] = 2;
		ResCorrectasC[2] = 0;
		ResCorrectasC[3] = 1;
		ResCorrectasC[4] = 3;
		
	}
	
	public void añadirPreguntasyResHistoria() {
		
		//Preguntas
		PreguntasH[0][0] = "Selecciona el año en que inicio la guerra de independencia de Mexico";
		PreguntasH[1][0] = "¿Cuantos año duro la guerra de independencia de Mexico?";
		PreguntasH[2][0] = "¿Quien fue el primer presidente de Mexico?";
		PreguntasH[3][0] = "¿Cuando fue la batalla de Puebla?";
		PreguntasH[4][0] = "¿Como se conocia anteriormente a la actual Ciudad de Mexico?";
		
		//Respuestas de Pregunta 1
		PreguntasH[0][1] = "1810";
		PreguntasH[0][2] = "1821";
		PreguntasH[0][3] = "1921";
		PreguntasH[0][4] = "1841";
		
		//Respuestas de Pregunta 2
		PreguntasH[1][1] = "10";
		PreguntasH[1][2] = "12";
		PreguntasH[1][3] = "11";
		PreguntasH[1][4] = "13";
		
		//Respuestas de Pregunta 3
		PreguntasH[1][1] = "10";
		PreguntasH[1][2] = "12";
		PreguntasH[1][3] = "11";
		PreguntasH[1][4] = "13";
		
	}
	
	public void añadirPreguntasyResGeografia() {
		
		//Preguntas
		PreguntasG[0][0] = "¿Cuál es el país más grande del mundo?";
		PreguntasG[0][1] = "¿Cuántos países hay en el mundo?";
		PreguntasG[0][2] = "¿Cuál es la ciudad más poblada del mundo?";
		PreguntasG[0][3] = "¿Cuál es el rio más largo del mundo?";
		PreguntasG[0][4] = "¿Qué país es el segundo más grande del mundo en términos de población?";
		
		//Respuestas de Pregunta 1
		PreguntasH[0][1] = "1810";
		PreguntasH[0][2] = "1821";
		PreguntasH[0][3] = "1921";
		PreguntasH[0][4] = "1841";
		
		//Respuestas de Pregunta 2
		PreguntasH[1][1] = "10";
		PreguntasH[1][2] = "12";
		PreguntasH[1][3] = "11";
		PreguntasH[1][4] = "13";
		
		//Respuestas de Pregunta 3
		PreguntasH[1][1] = "10";
		PreguntasH[1][2] = "12";
		PreguntasH[1][3] = "11";
		PreguntasH[1][4] = "13";
		
	}
	
	public void desplegarPreguntasHistoria() { 
			
		RespuestasH[0] = JOptionPane.showOptionDialog(null, "Selecciona el año en que inicio la guerra de independencia de Mexico",
				"Preguntas de Historia", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, new ImageIcon(""),
				new Object[] { "1810", "1821", "1921", "1841" }, "1821"); //Respuesta correcta 1810, 0
		

		RespuestasH[1] = JOptionPane.showOptionDialog(null, "¿Cuantos año duro la guerra de independencia de Mexico?",
				"Preguntas de Historia", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, new ImageIcon(""),
				new Object[] { "10", "12", "11", "13"}, "12"); //Respuesta correcta 11, 2

		RespuestasH[2] = JOptionPane.showOptionDialog(null, "¿Quien fue el primer presidente de Mexico?",
				"Preguntas de Historia", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, new ImageIcon(""),
				new Object[] { "Porfirio Diaz", "Guadalupe Victoria", "Ignacio Allende", "Agustín de Iturbide" }, "Guadalupe Victoria"); //Respuesta correcta Guadalupe Victoria, 1

		RespuestasH[3] =JOptionPane.showOptionDialog(null, "¿Cuando fue la batalla de Puebla?",
				"Preguntas de Historia", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, new ImageIcon(""),
				new Object[] { "5/05/1862", "5/05/1962", "5/05/1866", "5/05/1966" }, "5/05/1952"); //Respuesta correcta 5/05/1862, 0

		RespuestasH[4] = JOptionPane.showOptionDialog(null, "¿Como se conocia anteriormente a la actual Ciudad de Mexico?",
				"Preguntas de Historia", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, new ImageIcon(""),
				new Object[] { "México Querido", "Républica", "México", "Distrito Federal" }, "Republica"); //Respuesta correcta 3

		
	}
	
	public void desplegarPreguntasGeografia() {

		//res = Integer.parseInt(JOptionPane.showInputDialog(null, PreguntasG[cont], "Pregunta de Geografía " + (cont+1),JOptionPane.PLAIN_MESSAGE)); //Obtener respuesta de usuario
		RespuestasG[0] = JOptionPane.showOptionDialog(null, "¿Cuál es el país más grande del mundo?",
				"Preguntas de Geografía", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, new ImageIcon("src/principal/imagenes/Geografia1.png"),
				new Object[] { "E.U.A", "México", "Rusia", "Brasil"}, "E.U.A"); //Respuesta correcta Rusia,  2

		RespuestasG[1] = JOptionPane.showOptionDialog(null, "¿Cuántos países hay en el mundo?",
				"Preguntas de Geografía", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, new ImageIcon("src/principal/imagenes/Geografia2.png"),
				new Object[] { "200", "195", "179", "198"}, "200"); //Respuesta correcta 195, 1

		RespuestasG[2] = JOptionPane.showOptionDialog(null, "¿Cuál es la ciudad más poblada del mundo?",
				"Preguntas de Geografía", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, new ImageIcon("src/principal/imagenes/Geografia3.png"),
				new Object[] { "Japón", "Francia", "España", "Alemania"}, "Japón"); //Respuesta correcta Japón, 0

		RespuestasG[3] = JOptionPane.showOptionDialog(null, "¿Cuál es el río más largo del mundo?",
				"Preguntas de Geografía", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, new ImageIcon("src/principal/imagenes/Geografia4.png"),
				new Object[] { "Río Bravo", "Río Volga", "Río Balsas", "Río Nilo"}, "Río Nilo"); //Respuesta correcta Río Nilo, 3

		RespuestasG[4] = JOptionPane.showOptionDialog(null, "¿Qué país es el segundo más grande del mundo \nen términos de población?",
				"Preguntas de Geografía", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, new ImageIcon("src/principal/imagenes/Geografia5.png"),
				new Object[] { "China", "Rusia", "India", "Indonesia"}, "China"); //Respuesta correcta India, 2
		
	}
	
	public void desplegarPreguntasCine() {
		
		RespuestasC[0] = JOptionPane.showOptionDialog(null, "¿Película que casi le da un infarto a su director Brad Bierd?",
				"Preguntas de Cine", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, new ImageIcon("src/principal/imagenes/Cine1.png"),
				new Object[] { "El gigante de Acero", "Los increíbles", "Ratatoille", "Los Increíbles 2" }, "El gigante de Acero"); //Correcta respuesta El gigante de Acero 0
		
		RespuestasC[1] = JOptionPane.showOptionDialog(null, "¿Palabra más conocida del Capitán América de Los Vengadores?", 
				"Preguntas de Cine", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, new ImageIcon("src/principal/imagenes/Cine2.png"),
				new Object[] { "Si entendí la referencia", "¿alguien quiere retirarse?", "Vengadores! Unidos!","Puedo hacer esto todo el día" }, "Si entendí la referencia"); //Respuesta correcta Vengadores Unidos!, 2
		
		RespuestasC[2] = JOptionPane.showOptionDialog(null, "¿Cuál era la película con mas taquilla antes de ser Los Vengadores ENDGAME?",
				"Preguntas de Cine", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, new ImageIcon("src/principal/imagenes/Cine3.png"),
				new Object[] { "Avatar", "La cenicienta", "Ready player one", "Juego de tronos" }, "Avatar"); //Respuesta correcta Avatar, 0
		
		RespuestasC[3] =JOptionPane.showOptionDialog(null, "Película de Disney que tuvo un uso del 2D y 3D en toda la película: ",
				"Preguntas de Cine", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, new ImageIcon("src/principal/imagenes/Cine4.png"),
				new Object[] { "Atlantis", "El planeta del tesoro", "Mosters Inc.", "Toys Story"}, "Atlantis"); //Respuesta correcta El planeta del tesoro, 1
		
		RespuestasC[4] = JOptionPane.showOptionDialog(null, "Película de DC que se volvió a estrenar en el año 2021: ",
				"Preguntas de Cine", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, new ImageIcon("src/principal/imagenes/Cine5.png"),
				new Object[] { "Batman Vs Superman", "Aquaman", "Wonder women 1884","Justice league, sycniders cut" }, "Batman Vs Superman"); //Respuesta correcta Justice league, sycniders cut, 3
		
		
		/*Implementaciones posteriores con ciclo for entrada de respuestas del usuario
		 * for(int cont=0; cont<=4;cont++) {
			
			res = Integer.parseInt(JOptionPane.showInputDialog(null, PreguntasC[cont], "Pregunta de Cine " + (cont+1),JOptionPane.PLAIN_MESSAGE)); //Obtener respuesta de usuario
			JOptionPane.showMessageDialog(null, res);
		
		}*/
	}
	
	
	public void revisarRespuestasH() { 
		
		tituloDR = "Puntaje de Historia";
		
		//Ciclo for para verificar si la respuesta que selecciono el usuario al pulsar el boton es igual a la respuesta del arreglo de respuestas de Historia
		 for(int cont=0; cont<=4;cont++) {
				
			if(RespuestasH[cont] == ResCorrectasH[cont]) {
				contAcertadas = contAcertadas + 1;
				puntos = puntos + 10;
			}
		}
	}
	
	public void revisarRespuestasG() {
		
		tituloDR = "Puntaje de Georgrafía";
		
		//Ciclo for para verificar si la respuesta que selecciono el usuario al pulsar el boton es igual a la respuesta del arreglo de respuestas de Geografia
		 for(int cont=0; cont<=4;cont++) {
				
			if(RespuestasG[cont] == ResCorrectasG[cont]) {
				contAcertadas = contAcertadas + 1;
				puntos = puntos + 10;
			}
		}
	}
	
	public void revisarRespuestasC() {
		
		tituloDR = "Puntaje de Cine";
		
		//Ciclo for para verificar si la respuesta que selecciono el usuario al pulsar el boton es igual a la respuesta del arreglo de respuestas de Cine
		
		 for(int cont=0; cont<=4;cont++) {
				
			if(RespuestasC[cont] == ResCorrectasC[cont]) {
				contAcertadas = contAcertadas + 1;
				puntos = puntos + 10;
			}
		}
	}
	
	public void reiniciarVariables() {
		
		//Metodo para reiniciar variables para cada vez que vuelva a jugar de nuevo el jugador
		contAcertadas = 0;
		puntos = 0;
		
	}
	
	public void desplegarResultado() {
		 
		JOptionPane.showMessageDialog(null, nombre + " acertaste " + contAcertadas + " preguntas" + "\nTienes un total de " + puntos + " puntos", tituloDR, JOptionPane.PLAIN_MESSAGE, new ImageIcon("src/principal/imagenes/resultado.png"));
	
	}
	
	
}

