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

	// Declaración e Inicialización de Variables Globales
	String PreguntasH[][] = new String[20][5];
	String PreguntasG[][] = new String[20][5];
	String PreguntasC[] = new String[5];

	int RespuestasH[] = new int[5]; // Arreglos de 5 espacios para las respuestas del usuario
	int RespuestasG[] = new int[5];
	int RespuestasC[] = new int[5];

	int ResCorrectasH[] = new int[5]; // Arreglos de 5 espacios para respuestas correctas
	int ResCorrectasG[] = new int[5];
	int ResCorrectasC[] = new int[5];
	

	int res = 0;
	int contAcertadas = 0;
	int puntos = 0;
	String tituloDR = "";

	String nombre = "";
	boolean encontrado;

	public void añadirPreguntasYRespuestas() {

		// Arreglos con preguntas para desplegarlas proximamente en ciclo for

		añadirPreguntasyResHistoria();
		añadirPreguntasyResGeografia();

		PreguntasC[0] = "¿Película que casi le da un infarto a su director Brad Bierd?";
		PreguntasC[1] = "¿Palabra más conocida del Capitán América de Los Vengadores?";
		PreguntasC[2] = "¿Cuál era la película con mas taquilla antes de ser Los Vengadores ENDGAME?";
		PreguntasC[3] = "Película de Disney que tuvo un uso del 2D y 3D en toda la película: ";
		PreguntasC[4] = "Película de DC que se volvió a estrenar en el año 2021: ";

		// Arrelos con respuestas correctas según indice regresado en la variable res de
		// los botones
		ResCorrectasH[0] = 0;
		ResCorrectasH[1] = 2;
		ResCorrectasH[2] = 1;
		ResCorrectasH[3] = 0;
		ResCorrectasH[4] = 3;
		ResCorrectasH[5] = 2;
		ResCorrectasH[6] = 3;
		ResCorrectasH[7] = 1;
		ResCorrectasH[8] = 0;
		ResCorrectasH[9] = 1;
		ResCorrectasH[10] = 3;
		ResCorrectasH[11] = 2;
		ResCorrectasH[12] = 0;
		ResCorrectasH[13] = 1;
		ResCorrectasH[14] = 1;
		ResCorrectasH[15] = 3;
		ResCorrectasH[16] = 1;
		ResCorrectasH[17] = 2;
		ResCorrectasH[18] = 1;
		ResCorrectasH[19] = 1;
		
		

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

		// Preguntas
		PreguntasH[0][0] = "Selecciona el año en que inicio la guerra de independencia de Mexico";
		PreguntasH[1][0] = "¿Cuantos año duro la guerra de independencia de Mexico?";
		PreguntasH[2][0] = "¿Quien fue el primer presidente de Mexico?";
		PreguntasH[3][0] = "¿Cuando fue la batalla de Puebla?";
		PreguntasH[4][0] = "¿Como se conocia anteriormente a la actual Ciudad de Mexico?";
		PreguntasH[5][0] = "Selecciona: la Deidad del Mexico antiguo conocido como \"La Serpiente Emplumada\"";
		PreguntasH[6][0] = "Selecciona: El mineral que más se extraía en la Nueva España era:";
		PreguntasH[7][0] = "Selecciona: La Guerra de Reforma fue entre:";
		PreguntasH[8][0] = "Selecciona: Nombre asignado a Mexico durante la conquista española:";
		PreguntasH[9][0] = "¿En que año se independizo Texas de Mexico?";
		PreguntasH[10][0]= "¿Cuantos años duro \"El Porfiriato\" ?";
		PreguntasH[11][0] = "¿Como murio Francisco Imadero?";
		PreguntasH[12][0] = "¿En que año se firmo la actual constitucion de Mexico?";
		PreguntasH[13][0] = "¿Como murio Pancho Villa?";
		PreguntasH[14][0] = "¿Quien fue el primer emperador de Mexico?";
		PreguntasH[15][0] = "Selecciona: Partido politico fundado por Plutarco Elias Calles en 1929";
		PreguntasH[16][0] = "Selecciona: Conflicto que Plutarco Elías Calles enfrentó durante su gobierno:";
		PreguntasH[17][0] = "¿En que gobierno se vendieron los bancos a la iniciativa privada?";
		PreguntasH[18][0] = "Recibieron ese nombre los hijos de padres españoles nacidos en la nueva España";
		PreguntasH[19][0] = "Es la ciudad de donde el cura Hidalgo  llamó a la lucha por la Independencia.";

		// Respuestas de Pregunta 1
		PreguntasH[0][1] = "1810"; //Res Correcta
		PreguntasH[0][2] = "1821";
		PreguntasH[0][3] = "1921";
		PreguntasH[0][4] = "1841";

		// Respuestas de Pregunta 2
		PreguntasH[1][1] = "10";
		PreguntasH[1][2] = "12";
		PreguntasH[1][3] = "11"; //Res Correcta
		PreguntasH[1][4] = "13";

		// Respuestas de Pregunta 3
		PreguntasH[2][1] = "Porfirio Diaz";
		PreguntasH[2][2] = "Guadalupe Victoria"; //Res Correcta
		PreguntasH[2][3] = "Ignacio Allende";
		PreguntasH[2][4] = "Agustín de Iturbide";

		// Respuestas de Pregunta 4
		PreguntasH[3][1] = "5/05/1862"; //Res Correcta
		PreguntasH[3][2] = "5/05/1962";
		PreguntasH[3][3] = "5/05/1866";
		PreguntasH[3][4] = "5/05/1966";

		// Respuestas de Pregunta 5
		PreguntasH[4][1] = "México Querido";
		PreguntasH[4][2] = "Républica";
		PreguntasH[4][3] = "México";
		PreguntasH[4][4] = "Distrito Federal"; //Res Correcta
		
		//Respuestas de Pregunta 6
		PreguntasH [5][1] = "Ometecuhtli"; 
		PreguntasH [5][2] = "Huitzilopochtli";
	    PreguntasH [5][3] = "Quetzalcóatl"; //Res Correcta
		PreguntasH [5][4] = "Ostoyollotzin";
				
		//Respuestas de Pregunta 7
	    PreguntasH [6][1] = "Diamante";
		PreguntasH [6][2] = "Oro";
		PreguntasH [6][3] = "Metal";
		PreguntasH [6][4] = "Plata"; //Res Correcta
				
		//Respuestas de Pregunta 8
		PreguntasH [7][1] = "Republicanos e indigenas";
		PreguntasH [7][2] = "Liberales y Conservadores"; //Res Correcta;
		PreguntasH [7][3] = "Españoles y Mexicanos";
		PreguntasH [7][4] = "PRI vs PAN";
				
		//Respuestas de Pregunta 9
		PreguntasH [8][1] = "Nueva España"; //Res Correcta
		PreguntasH [8][2] = "Union Europea";
		PreguntasH [8][3] = "Conia Española";
		PreguntasH [8][4] = "España Unificada";
				
		//Respuestas de Preguntas 10
		PreguntasH [9][1] = "1810";
		PreguntasH [9][2] = "1836"; //Res Correcta
		PreguntasH [9][3] = "1832";
		PreguntasH [9][4] = "1998";
				
		//Respuestas de Preguntas 11
		PreguntasH [10][1] = "32";
		PreguntasH [10][2] = "25";
		PreguntasH [10][3] = "45";
		PreguntasH [10][4] = "35"; //Res Correcta
				
		//Respuestas de Preguntas 12
		PreguntasH [11][1] = "Asesinado"; 
		PreguntasH [11][2] = "Muerte Natural";
		PreguntasH [11][3] = "Fusilado"; //Res Correcta
		PreguntasH [11][4] = "Suicidio";
				
		//Respuestasd e Preguntas 13
		PreguntasH [12][1] = "1917"; //Res Correcta
		PreguntasH [12][2] = "1832";
		PreguntasH [12][3] = "1927";
		PreguntasH [12][4] = "2000";
				
		//Respuestas de Preguntas 14
		PreguntasH [13][1] = "Muerte Natural";
		PreguntasH [13][2] = "Asesinado"; //Res Correcta
		PreguntasH [13][3] = "Fusilado";
		PreguntasH [13][4] = "Suicido";
				
		//Respuestas de Preguntas 15
		PreguntasH [14][1] = "Miguel Allende";
		PreguntasH [14][2] = "Agustin de Iturbide"; //Res Correcta
		PreguntasH [14][3] = "Nicolas Bravo";
		PreguntasH [14][4] = "Pedro de Garibay";
				
		//Respuestas de Preguntas 16
		PreguntasH [15][1] = "Partido Comunista Mexicano (PCM)";
		PreguntasH [15][2] = "Partido Revolucionario Institucional (PRI) ";
		PreguntasH [15][3] = "Partido Accion Nacional (PAN)";
		PreguntasH [15][4] = "Partido Nacional Revolucionario (PNR)"; //Res Correcta
				
		//Respuestas de Preguntas 17
		PreguntasH [16][1] = "Guerra de los Pasteles";
		PreguntasH [16][2] = "Guerra Cristera"; //Res Correcta
		PreguntasH [16][3] = "2da Guerra Mundial";
		PreguntasH [16][4] = "Invasion Norte Americana";
				
		//Respuestas de Preguntas 18
		PreguntasH [17][1] = "Luis Echeverria";
		PreguntasH [17][2] = "Vicente Fox";
		PreguntasH [17][3] = "Carlos Salinas"; //Res Correcta
		PreguntasH [17][4] = "Enrique Peñanieto";
				
		//Respuestas de Pregunta 19
		PreguntasH [18][1] = "Mestizo";
		PreguntasH [18][2] = "Criollo"; //Res Correcta
		PreguntasH [18][3] = "Mexica";
		PreguntasH [18][4] = "Jesuita";
				
		//Respuestas de Pregunta 20
		PreguntasH [19][1] = "Tijuana B.C";
		PreguntasH [19][2] = "Dolores, Guanajuato"; //Res Correcta
		PreguntasH [19][3] = "Atotonilco";
		PreguntasH [19][4] = "Queretaro";

	}

	public void añadirPreguntasyResGeografia() {

		// Preguntas Geografia
		PreguntasG[0][0] = "¿Cuál es el país más grande del mundo?";
		PreguntasG[0][1] = "¿Cuántos países hay en el mundo?";
		PreguntasG[0][2] = "¿Cuál es la ciudad más poblada del mundo?";
		PreguntasG[0][3] = "¿Cuál es el rio más largo del mundo?";
		PreguntasG[0][4] = "¿Qué país es el segundo más grande del mundo en términos de población?";

		// Respuestas de Pregunta 1
		PreguntasH[0][1] = "1810";
		PreguntasH[0][2] = "1821";
		PreguntasH[0][3] = "1921";
		PreguntasH[0][4] = "1841";

		// Respuestas de Pregunta 2
		PreguntasH[1][1] = "10";
		PreguntasH[1][2] = "12";
		PreguntasH[1][3] = "11";
		PreguntasH[1][4] = "13";

		// Respuestas de Pregunta 3
		PreguntasH[1][1] = "10";
		PreguntasH[1][2] = "12";
		PreguntasH[1][3] = "11";
		PreguntasH[1][4] = "13";

	}

	public void desplegarPreguntasHistoria() {

		int PreguntaRealizada[] = new int[5]; //Cambiar despues a int[PreguntasH.lenght] //PreguntaRealizada hasta 10
		int cont = 0;
		encontrado = false;
		
		for (int i = 0; i < 5; i++) { //Ciclo hasta 10 
			
			int Random = (int) Math.floor(Math.random() * 5); //Random hasta 20
			
			if(i==0) {
				PreguntaRealizada[cont] = Random;
				RespuestasH[Random] = JOptionPane.showOptionDialog(null, PreguntasH[Random][0], "Preguntas de Historia",
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
						new ImageIcon("src/paqueteDeProyecto/imagenes/Historia" + i +".png"),
						new Object[] { PreguntasH[Random][1], PreguntasH[Random][2], PreguntasH[Random][3], PreguntasH[Random][4]},
						PreguntasH[Random][1]);
			}
			else {
				for(int j=0; j<cont; j++) {
					if(PreguntaRealizada[j]==Random) {
						encontrado = true;
						break;
					} 
				}
				
				if(encontrado) {
					i--;
					cont--;
					encontrado = false;
				}else {
					PreguntaRealizada[cont] = Random;
					RespuestasH[Random] = JOptionPane.showOptionDialog(null, PreguntasH[Random][0], "Preguntas de Historia",
							JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
							new ImageIcon("src/paqueteDeProyecto/imagenes/Historia" + i +".png"),
							new Object[] { PreguntasH[Random][1], PreguntasH[Random][2], PreguntasH[Random][3], PreguntasH[Random][4]},
							PreguntasH[Random][1]);
				}
			}
			cont++;
		}

	}

	public void desplegarPreguntasGeografia() {

		// res = Integer.parseInt(JOptionPane.showInputDialog(null, PreguntasG[cont],
		// "Pregunta de Geografía " + (cont+1),JOptionPane.PLAIN_MESSAGE)); //Obtener
		// respuesta de usuario
		RespuestasG[0] = JOptionPane.showOptionDialog(null, "¿Cuál es el país más grande del mundo?",
				"Preguntas de Geografía", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
				new ImageIcon("src/principal/imagenes/Geografia1.png"),
				new Object[] { "E.U.A", "México", "Rusia", "Brasil" }, "E.U.A"); // Respuesta correcta Rusia, 2

		RespuestasG[1] = JOptionPane.showOptionDialog(null, "¿Cuántos países hay en el mundo?",
				"Preguntas de Geografía", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
				new ImageIcon("src/principal/imagenes/Geografia2.png"), new Object[] { "200", "195", "179", "198" },
				"200"); // Respuesta correcta 195, 1

		RespuestasG[2] = JOptionPane.showOptionDialog(null, "¿Cuál es la ciudad más poblada del mundo?",
				"Preguntas de Geografía", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
				new ImageIcon("src/principal/imagenes/Geografia3.png"),
				new Object[] { "Japón", "Francia", "España", "Alemania" }, "Japón"); // Respuesta correcta Japón, 0

		RespuestasG[3] = JOptionPane.showOptionDialog(null, "¿Cuál es el río más largo del mundo?",
				"Preguntas de Geografía", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
				new ImageIcon("src/principal/imagenes/Geografia4.png"),
				new Object[] { "Río Bravo", "Río Volga", "Río Balsas", "Río Nilo" }, "Río Nilo"); // Respuesta correcta
																									// Río Nilo, 3

		RespuestasG[4] = JOptionPane.showOptionDialog(null,
				"¿Qué país es el segundo más grande del mundo \nen términos de población?", "Preguntas de Geografía",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
				new ImageIcon("src/principal/imagenes/Geografia5.png"),
				new Object[] { "China", "Rusia", "India", "Indonesia" }, "China"); // Respuesta correcta India, 2

	}

	public void desplegarPreguntasCine() {

		RespuestasC[0] = JOptionPane.showOptionDialog(null,
				"¿Película que casi le da un infarto a su director Brad Bierd?", "Preguntas de Cine",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
				new ImageIcon("src/principal/imagenes/Cine1.png"),
				new Object[] { "El gigante de Acero", "Los increíbles", "Ratatoille", "Los Increíbles 2" },
				"El gigante de Acero"); // Correcta respuesta El gigante de Acero 0

		RespuestasC[1] = JOptionPane.showOptionDialog(null,
				"¿Palabra más conocida del Capitán América de Los Vengadores?", "Preguntas de Cine",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
				new ImageIcon("src/principal/imagenes/Cine2.png"), new Object[] { "Si entendí la referencia",
						"¿alguien quiere retirarse?", "Vengadores! Unidos!", "Puedo hacer esto todo el día" },
				"Si entendí la referencia"); // Respuesta correcta Vengadores Unidos!, 2

		RespuestasC[2] = JOptionPane.showOptionDialog(null,
				"¿Cuál era la película con mas taquilla antes de ser Los Vengadores ENDGAME?", "Preguntas de Cine",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
				new ImageIcon("src/principal/imagenes/Cine3.png"),
				new Object[] { "Avatar", "La cenicienta", "Ready player one", "Juego de tronos" }, "Avatar"); // Respuesta
																												// correcta
																												// Avatar,
																												// 0

		RespuestasC[3] = JOptionPane.showOptionDialog(null,
				"Película de Disney que tuvo un uso del 2D y 3D en toda la película: ", "Preguntas de Cine",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
				new ImageIcon("src/principal/imagenes/Cine4.png"),
				new Object[] { "Atlantis", "El planeta del tesoro", "Mosters Inc.", "Toys Story" }, "Atlantis"); // Respuesta
																													// correcta
																													// El
																													// planeta
																													// del
																													// tesoro,
																													// 1

		RespuestasC[4] = JOptionPane.showOptionDialog(null, "Película de DC que se volvió a estrenar en el año 2021: ",
				"Preguntas de Cine", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
				new ImageIcon("src/principal/imagenes/Cine5.png"),
				new Object[] { "Batman Vs Superman", "Aquaman", "Wonder women 1884", "Justice league, sycniders cut" },
				"Batman Vs Superman"); // Respuesta correcta Justice league, sycniders cut, 3

		/*
		 * Implementaciones posteriores con ciclo for entrada de respuestas del usuario
		 * for(int cont=0; cont<=4;cont++) {
		 * 
		 * res = Integer.parseInt(JOptionPane.showInputDialog(null, PreguntasC[cont],
		 * "Pregunta de Cine " + (cont+1),JOptionPane.PLAIN_MESSAGE)); //Obtener
		 * respuesta de usuario JOptionPane.showMessageDialog(null, res);
		 * 
		 * }
		 */
	}

	public void revisarRespuestasH() {

		tituloDR = "Puntaje de Historia";

		// Ciclo for para verificar si la respuesta que selecciono el usuario al pulsar
		// el boton es igual a la respuesta del arreglo de respuestas de Historia
		for (int cont = 0; cont <= 4; cont++) {

			if (RespuestasH[cont] == ResCorrectasH[cont]) {
				contAcertadas = contAcertadas + 1;
				puntos = puntos + 10;
			}
		}
	}

	public void revisarRespuestasG() {

		tituloDR = "Puntaje de Georgrafía";

		// Ciclo for para verificar si la respuesta que selecciono el usuario al pulsar
		// el boton es igual a la respuesta del arreglo de respuestas de Geografia
		for (int cont = 0; cont <= 4; cont++) {

			if (RespuestasG[cont] == ResCorrectasG[cont]) {
				contAcertadas = contAcertadas + 1;
				puntos = puntos + 10;
			}
		}
	}

	public void revisarRespuestasC() {

		tituloDR = "Puntaje de Cine";

		// Ciclo for para verificar si la respuesta que selecciono el usuario al pulsar
		// el boton es igual a la respuesta del arreglo de respuestas de Cine

		for (int cont = 0; cont <= 4; cont++) {

			if (RespuestasC[cont] == ResCorrectasC[cont]) {
				contAcertadas = contAcertadas + 1;
				puntos = puntos + 10;
			}
		}
	}

	public void reiniciarVariables() {

		// Metodo para reiniciar variables para cada vez que vuelva a jugar de nuevo el
		// jugador
		contAcertadas = 0;
		puntos = 0;

	}

	public void desplegarResultado() {

		JOptionPane.showMessageDialog(null,
				nombre + " acertaste " + contAcertadas + " preguntas" + "\nTienes un total de " + puntos + " puntos",
				tituloDR, JOptionPane.PLAIN_MESSAGE, new ImageIcon("src/principal/imagenes/resultado.png"));

	}

}
