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

	// Declaraci�n e Inicializaci�n de Variables Globales
	String PreguntasH[][] = new String[20][5];
	String PreguntasG[][] = new String[20][5];
	String PreguntasC[][] = new String[20][5];

	int RespuestasH[] = new int[20]; // Arreglos de 20 espacios para las respuestas del usuario
	int RespuestasG[] = new int[20];
	int RespuestasC[] = new int[20];

	int ResCorrectasH[] = new int[20]; // Arreglos de 20 espacios para respuestas correctas
	int ResCorrectasG[] = new int[20];
	int ResCorrectasC[] = new int[20];
	
	int Random = 0;
	int res = 0;
	int contAcertadas = 0;
	int puntos = 0;
	String tituloDR = "";

	String nombre = "";
	boolean encontrado;
	int totalP = (PreguntasH.length/2); //Variable para el total de preguntas a desplegar
	//String nombreArreglo;

	public void a�adirPreguntasYRespuestas() {

		// Arreglos con preguntas para desplegarlas proximamente en ciclo for

		a�adirPreguntasyResHistoria();
		a�adirPreguntasyResGeografia();
		a�adirPreguntasyResCine();

		// Arrelos con respuestas correctas seg�n indice regresado en la variable res de
		// los botones
		ResCorrectasH[0] = 0; //Respuesta correcta pregunta 1 Historia
		ResCorrectasH[1] = 2; //Respuesta correcta pregunta 2 Historia
		ResCorrectasH[2] = 1; //Respuesta correcta pregunta 3 Historia
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
		ResCorrectasH[18] = 1; //Respuesta correcta pregunta 19 Historia
		ResCorrectasH[19] = 1; //Respuesta correcta pregunta 20 Historia
	
		ResCorrectasG[0] = 2;
		ResCorrectasG[1] = 1;
		ResCorrectasG[2] = 0;
		ResCorrectasG[3] = 3;
		ResCorrectasG[4] = 2;
		ResCorrectasG[5] = 3;
		ResCorrectasG[6] = 0;
		ResCorrectasG[7] = 2;
		ResCorrectasG[8] = 1;
		ResCorrectasG[9] = 2;
		ResCorrectasG[10] = 3;
		ResCorrectasG[11] = 0;
		ResCorrectasG[12] = 2;
		ResCorrectasG[13] = 0;
		ResCorrectasG[14] = 2;
		ResCorrectasG[15] = 1;
		ResCorrectasG[16] = 3;
		ResCorrectasG[17] = 0;
		ResCorrectasG[18] = 2;
		ResCorrectasG[19] = 3;

		ResCorrectasC[0] = 1;
		ResCorrectasC[1] = 2;
		ResCorrectasC[2] = 3;
		ResCorrectasC[3] = 1;
		ResCorrectasC[4] = 3;
		ResCorrectasC[5] = 1;
		ResCorrectasC[6] = 0;
		ResCorrectasC[7] = 3;
		ResCorrectasC[8] = 1;
		ResCorrectasC[9] = 1;
		ResCorrectasC[10] = 3;
		ResCorrectasC[11] = 1;
		ResCorrectasC[12] = 2;
		ResCorrectasC[13] = 1;
		ResCorrectasC[14] = 2;
		ResCorrectasC[15] = 1;
		ResCorrectasC[16] = 0;
		ResCorrectasC[17] = 3;
		ResCorrectasC[18] = 0;
		ResCorrectasC[19] = 1;

	}

	public void a�adirPreguntasyResHistoria() {

		// Preguntas
		PreguntasH[0][0] = "Selecciona el a�o en que inicio la guerra de independencia de Mexico";
		PreguntasH[1][0] = "�Cuantos a�o duro la guerra de independencia de Mexico?";
		PreguntasH[2][0] = "�Quien fue el primer presidente de Mexico?";
		PreguntasH[3][0] = "�Cuando fue la batalla de Puebla?";
		PreguntasH[4][0] = "�Como se conocia anteriormente a la actual Ciudad de Mexico?";
		PreguntasH[5][0] = "Selecciona: la Deidad del Mexico antiguo conocido como \"La Serpiente Emplumada\"";
		PreguntasH[6][0] = "Selecciona: El mineral que m�s se extra�a en la Nueva Espa�a era:";
		PreguntasH[7][0] = "Selecciona: La Guerra de Reforma fue entre:";
		PreguntasH[8][0] = "Selecciona: Nombre asignado a Mexico durante la conquista espa�ola:";
		PreguntasH[9][0] = "�En que a�o se independizo Texas de Mexico?";
		PreguntasH[10][0]= "�Cuantos a�os duro \"El Porfiriato\" ?";
		PreguntasH[11][0] = "�Como murio Francisco Imadero?";
		PreguntasH[12][0] = "�En que a�o se firmo la actual constitucion de Mexico?";
		PreguntasH[13][0] = "�Como murio Pancho Villa?";
		PreguntasH[14][0] = "�Quien fue el primer emperador de Mexico?";
		PreguntasH[15][0] = "Selecciona: Partido politico fundado por Plutarco Elias Calles en 1929";
		PreguntasH[16][0] = "Selecciona: Conflicto que Plutarco El�as Calles enfrent� durante su gobierno:";
		PreguntasH[17][0] = "�En que gobierno se vendieron los bancos a la iniciativa privada?";
		PreguntasH[18][0] = "Recibieron ese nombre los hijos de padres espa�oles nacidos en la nueva Espa�a";
		PreguntasH[19][0] = "Es la ciudad de donde el cura Hidalgo llam� a la lucha por la Independencia.";

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
		PreguntasH[2][4] = "Agust�n de Iturbide";

		// Respuestas de Pregunta 4
		PreguntasH[3][1] = "5/05/1862"; //Res Correcta
		PreguntasH[3][2] = "5/05/1962";
		PreguntasH[3][3] = "5/05/1866";
		PreguntasH[3][4] = "5/05/1966";

		// Respuestas de Pregunta 5
		PreguntasH[4][1] = "M�xico Querido";
		PreguntasH[4][2] = "R�publica";
		PreguntasH[4][3] = "M�xico";
		PreguntasH[4][4] = "Distrito Federal"; //Res Correcta
		
		//Respuestas de Pregunta 6
		PreguntasH [5][1] = "Ometecuhtli"; 
		PreguntasH [5][2] = "Huitzilopochtli";
	    PreguntasH [5][3] = "Quetzalc�atl"; //Res Correcta
		PreguntasH [5][4] = "Ostoyollotzin";
				
		//Respuestas de Pregunta 7
	    PreguntasH [6][1] = "Diamante";
		PreguntasH [6][2] = "Oro";
		PreguntasH [6][3] = "Metal";
		PreguntasH [6][4] = "Plata"; //Res Correcta
				
		//Respuestas de Pregunta 8
		PreguntasH [7][1] = "Republicanos e ind�genas";
		PreguntasH [7][2] = "Liberales y Conservadores"; //Res Correcta;
		PreguntasH [7][3] = "Espa�oles y Mexicanos";
		PreguntasH [7][4] = "PRI vs PAN";
				
		//Respuestas de Pregunta 9
		PreguntasH [8][1] = "Nueva Espa�a"; //Res Correcta
		PreguntasH [8][2] = "Union Europea";
		PreguntasH [8][3] = "Conia Espa�ola";
		PreguntasH [8][4] = "Espa�a Unificada";
				
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
		PreguntasH [17][4] = "Enrique Pe�anieto";
				
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

	public void a�adirPreguntasyResGeografia() {

		// Preguntas Geografia
		PreguntasG[0][0] = "�Cu�l es el pa�s m�s grande del mundo?";
		PreguntasG[1][0] = "�Cu�ntos pa�ses hay en el mundo?";
		PreguntasG[2][0] = "�Cu�l es la ciudad m�s poblada del mundo?";
		PreguntasG[3][0] = "�Cu�l es el rio m�s largo del mundo?";
		PreguntasG[4][0] = "�Qu� pa�s es el segundo m�s grande del mundo en t�rminos de poblaci�n?";
		PreguntasG[5][0] = "�Qu� es Zelandia?";
		PreguntasG[6][0] = "�Cu�l es el pa�s de los 1,000 lagos?";
		PreguntasG[7][0] = "�D�nde est� la regi�n m�s pobre del mundo?";
		PreguntasG[8][0] = "El r�o m�s largo de Europa es...";
		PreguntasG[9][0] = "�A qu� pa�s pertenece esta bandera?";
		PreguntasG[10][0] = "�Sabes cu�l es la ciudad m�s antigua del mundo?";
		PreguntasG[11][0] = "�Cu�l es el desierto c�lido m�s grande de la tierra?";
		PreguntasG[12][0] = "�Cu�l es el pa�s m�s peque�o del mundo?";
		PreguntasG[13][0] =	"�Cu�l es la monta�a m�s alta del mundo?";
		PreguntasG[14][0] =	"�Qu� pa�s tiene el mayor n�mero de lagos naturales del planeta?";
		PreguntasG[15][0] =	"�Cu�l es la capital de China?";
		PreguntasG[16][0] =	"�En qu� pa�s se encuentra la Torre de Bel�m?";
		PreguntasG[17][0] =	"�Cu�l es el pa�s que tiene m�s pir�mides en el mundo?";
		PreguntasG[18][0] =	"�En qu� pa�s puedes visitar el Machu Picchu?";
		PreguntasG[19][0] =	"�Cu�l es el �nico continente que tiene tierra en cada uno de los 4 hemisferios?";
		
		// Respuestas de Pregunta 1
		PreguntasG[0][1] = "E.U.A";
		PreguntasG[0][2] = "M�xico";
		PreguntasG[0][3] = "Rusia"; //Res Correcta
		PreguntasG[0][4] = "Brasil";

		// Respuestas de Pregunta 2
		PreguntasG[1][1] = "200";
		PreguntasG[1][2] = "195"; //Res Correcta
		PreguntasG[1][3] = "179";
		PreguntasG[1][4] = "198";

		// Respuestas de Pregunta 3
		PreguntasG[2][1] = "Tokio, Jap�n"; //Res Correcta
		PreguntasG[2][2] = "Nueva York, USA";
		PreguntasG[2][3] = "Shangha�, China";
		PreguntasG[2][4] = "Ciudad de M�xico,\nM�xico";
		
		// Respuestas de Pregunta 4
		PreguntasG[3][1] = "R�o Bravo"; 
		PreguntasG[3][2] = "R�o Volga";
		PreguntasG[3][3] = "R�o Balsas";
		PreguntasG[3][4] = "R�o Nilo"; //Res Correcta
		
		// Respuestas de Pregunta 5
		PreguntasG[4][1] = "China"; 
		PreguntasG[4][2] = "Rusia";
		PreguntasG[4][3] = "India"; //Res Correcta
		PreguntasG[4][4] = "Indonesia"; 
		
		// Respuestas de Pregunta 6
		PreguntasG[5][1] = "Una ciudad \nislandesa"; 
		PreguntasG[5][2] = "Un parque \ntem�tico";
		PreguntasG[5][3] = "Un pa�s del \nhemisferio norte"; 
		PreguntasG[5][4] = "Un continente"; //Res Correcta
		
		// Respuestas de Pregunta 7
		PreguntasG[6][1] = "Finlandia"; //Res Correcta
		PreguntasG[6][2] = "Estados Unidos";
		PreguntasG[6][3] = "Canad�"; 
		PreguntasG[6][4] = "Brasil"; 
		
		// Respuestas de Pregunta 8
		PreguntasG[7][1] = "En Zimbabue"; 
		PreguntasG[7][2] = "En Honduras";
		PreguntasG[7][3] = "En Sahel"; //Res Correcta
		PreguntasG[7][4] = "En Nepal"; 
		
		// Respuestas de Pregunta 9
		PreguntasG[8][1] = "El Tajo"; 
		PreguntasG[8][2] = "El Volga"; //Res Correcta
		PreguntasG[8][3] = "El T�mesis"; 
		PreguntasG[8][4] = "El Ebro";
		
		// Respuestas de Pregunta 10
		PreguntasG[9][1] = "Mongolia"; 
		PreguntasG[9][2] = "Palaos"; 
		PreguntasG[9][3] = "Banglad�s"; //Res Correcta
		PreguntasG[9][4] = "Macedonia";
		
		// Respuestas de Pregunta 11
		PreguntasG[10][1] = "Luxor"; 
		PreguntasG[10][2] = "Ur"; 
		PreguntasG[10][3] = "Biblos";
		PreguntasG[10][4] = "Jeric�"; //Res Correcta
		
		// Respuestas de Pregunta 12
		PreguntasG[11][1] = "El S�hara"; //Res Correcta
		PreguntasG[11][2] = "Mota�as Flameantes"; 
		PreguntasG[11][3] = "El desierto de Lut";
		PreguntasG[11][4] = "Libia"; 
		
		// Respuestas de Pregunta 13
		PreguntasG[12][1] = "M�naco"; 
		PreguntasG[12][2] = "Maldivas"; 
		PreguntasG[12][3] = "El Vaticano"; //Res Correcta
		PreguntasG[12][4] = "Nauru"; 
		
		// Respuestas de Pregunta 14
		PreguntasG[13][1] = "Monte Everest"; //Res Correcta
		PreguntasG[13][2] = "Monto Fuji"; 
		PreguntasG[13][3] = "Makalu"; 
		PreguntasG[13][4] = "Cho Oyu"; 
		
		// Respuestas de Pregunta 15
		PreguntasG[14][1] = "Kenia, Uganda"; 
		PreguntasG[14][2] = "La Madre Rusia"; 
		PreguntasG[14][3] = "Can�da, USA"; //Res Correcta
		PreguntasG[14][4] = "Azerbaiy�n, Ir�n";
		
		// Respuestas de Pregunta 16
		PreguntasG[15][1] = "Shangh�i"; 
		PreguntasG[15][2] = "Pek�n"; //Res Correcta
		PreguntasG[15][3] = "Cant�n"; 
		PreguntasG[15][4] = "Shenzhen";
		
		// Respuestas de Pregunta 17
		PreguntasG[16][1] = "M�xico"; 
		PreguntasG[16][2] = "Jordania"; 
		PreguntasG[16][3] = "Italia"; 
		PreguntasG[16][4] = "Portugal"; //Res Correcta
		
		// Respuestas de Pregunta 18
		PreguntasG[17][1] = "Sud�n"; //Res Correcta
		PreguntasG[17][2] = "Egipto"; 
		PreguntasG[17][3] = "El Salvador"; 
		PreguntasG[17][4] = "Palaos"; 
		
		// Respuestas de Pregunta 19
		PreguntasG[18][1] = "Guatemala"; 
		PreguntasG[18][2] = "M�xico"; 
		PreguntasG[18][3] = "Per�"; //Res Correcta
		PreguntasG[18][4] = "Brasil"; 
		
		// Respuestas de Pregunta 20
		PreguntasG[19][1] = "�frica"; 
		PreguntasG[19][2] = "Europa"; 
		PreguntasG[19][3] = "Ocean�a"; 
		PreguntasG[19][4] = "Asia"; //Res Correcta
	}
	
	public void a�adirPreguntasyResCine() {

		// Preguntas Cine
		PreguntasC[0][0] = "�Pel�cula que casi le da un infarto a su director Brad Bird?";
		PreguntasC[1][0] = "�Palabra m�s conocida del Capit�n Am�rica de Los Vengadores?";
		PreguntasC[2][0] = "�Cu�l era la pel�cula con mas taquilla antes de ser Los Vengadores ENDGAME?";
		PreguntasC[3][0] = "Pel�cula de Disney que tuvo un uso del 2D y 3D en toda la pel�cula: ";
		PreguntasC[4][0] = "Pel�cula de DC que se volvi� a estrenar en el a�o 2021: ";
		PreguntasC[5][0] = "�Cuantos Oscars Consiguio Titanic?";
		PreguntasC[6][0] = "�Qu� actor no aparece en Pulp Fiction?";
		PreguntasC[7][0] = "�Qui�n dirigi� El Pianista?";
		PreguntasC[8][0] = "Written and Directed By:";
		PreguntasC[9][0] = "�Como se llama el horrible vecino de Andy en la pelicula de Toy Story?";
		PreguntasC[10][0] = "�Como se llamaban los ladrones de la pelicula \"Mi Pobre Angelito\"?";
		PreguntasC[11][0] = "Gracias a que pelicula se hicieron populares los dinosaurios";
		PreguntasC[12][0] = "Selecciona la Pelicula de Zombies por Excelencia";
		PreguntasC[13][0] = "�C�mo se llam� la pel�cula basada en la vida de Stephen Hawking?";
		PreguntasC[14][0] = "�En qu� a�o se estren� Star Wars: Episodio VII � El despertar de la Fuerza?";
		PreguntasC[15][0] = "�En qu� a�o se estren� El hobbit?";
		PreguntasC[16][0] = "�Qui�n protagoniz� Aquaman en 2018?";
		PreguntasC[17][0] = "�Quien fue la protagonista de Mujer Maravilla en 2017?";
		PreguntasC[18][0] = "�Qu� pel�cula de Disney se ubica en Escocia medieval?";
		PreguntasC[19][0] = "�Qu� pel�cula animada tiene como personaje principal un villano con una gran cabeza azul?";

		// Respuestas de Pregunta 1
		PreguntasC[0][1] = "Ratatoille";
		PreguntasC[0][2] = "El Gigante de Hierro"; //Res Correcta
		PreguntasC[0][3] = "El Pianista";
		PreguntasC[0][4] = "Cars";

		// Respuestas de Pregunta 2
		PreguntasC[1][1] = "Te Amo 3,000,000";
		PreguntasC[1][2] = "Entendi esa Referencia";
		PreguntasC[1][3] = "Vengadores Unidos"; //Res Correcta
		PreguntasC[1][4] = "Luchas o Mueres";

		// Respuestas de Pregunta 3
		PreguntasC[2][1] = "Entrenando a Papa";
		PreguntasC[2][2] = "No se Aceptan Devoluciones";
		PreguntasC[2][3] = "Avengers: Infinity War";
		PreguntasC[2][4] = "Avatar"; //Res Correcta
		
		// Respuestas de Pregunta 4
		PreguntasC[3][1] = "Atlantis";
		PreguntasC[3][2] = "El Planeta del Tesoro"; //Res Correcta
		PreguntasC[3][3] = "Toy Story";
		PreguntasC[3][4] = "Monster Inc.";
		
		// Respuestas de Pregunta 5
		PreguntasC[4][1] = "Batman vs Superman";
		PreguntasC[4][2] = "Wonder Woman";
		PreguntasC[4][3] = "Wonder Woman 1984";
		PreguntasC[4][4] = "Jusitice League: Snyder Cut"; //Res Correcta
		
		// Respuestas de Pregunta 6
		PreguntasC[5][1] = "9";
		PreguntasC[5][2] = "11"; //Res Correcta
		PreguntasC[5][3] = "10";
		PreguntasC[5][4] = "7";
		
		// Respuestas de Pregunta 7
		PreguntasC[6][1] = "Tom Hanks"; //Res Correcta
		PreguntasC[6][2] = "John Travolta";
		PreguntasC[6][3] = "Bruce Willis";
		PreguntasC[6][4] = "Uma Thurman"; 
		
		// Respuestas de Pregunta 8
		PreguntasC[7][1] = "Jonathan Demme";
		PreguntasC[7][2] = "Milos Forman";
		PreguntasC[7][3] = "Jhonny Deep";
		PreguntasC[7][4] = "Roman Polanski"; //Res Correcta
		
		// Respuestas de Pregunta 9
		PreguntasC[8][1] = "Tom Hanks";
		PreguntasC[8][2] = "Quentin Tarantino"; //Res Correcta
		PreguntasC[8][3] = "Guillermo del Toro";
		PreguntasC[8][4] = "Alfonso Cuaron";
		
		// Respuestas de Pregunta 10
		PreguntasC[9][1] = "Andy";
		PreguntasC[9][2] = "Sid"; //Res Correcta
		PreguntasC[9][3] = "Darla";
		PreguntasC[9][4] = "Tommy";
		
		// Respuestas de Pregunta 11
		PreguntasC[10][1] = "Luis y Miguel";
		PreguntasC[10][2] = "Harvey y Marvin";
		PreguntasC[10][3] = "Barry y Mark";
		PreguntasC[10][4] = "Harry y Marv"; //Res Correcta
		
		// Respuestas de Pregunta 12
		PreguntasC[11][1] = "ET";
		PreguntasC[11][2] = "Jurassic Park"; //Res Correcta
		PreguntasC[11][3] = "Godzilla";
		PreguntasC[11][4] = "King Konng";
		
		// Respuestas de Pregunta 13
		PreguntasC[12][1] = "ZombieLand";
		PreguntasC[12][2] = "28 Dias Despues";
		PreguntasC[12][3] = "La Noche de los Muertos Vivientes"; //Res Correcta
		PreguntasC[12][4] = "Re-Animator";
		
		// Respuestas de Pregunta 14
		PreguntasC[13][1] = "La teoria del Big Bang";
		PreguntasC[13][2] = "La teoria del todo"; //Res Correcta;
		PreguntasC[13][3] = "La teoria del Universo";
		PreguntasC[13][4] = "L vida de Stephen Hawking";
		
		// Respuestas de Pregunta 15
		PreguntasC[14][1] = "2014";
		PreguntasC[14][2] = "2016";
	        PreguntasC[14][3] = "2015"; //Res Correcta
		PreguntasC[14][4] = "2013";
		
		// Respuestas de Pregunta 16
		PreguntasC[15][1] = "2011";
		PreguntasC[15][2] = "2012"; //Res Correcta
		PreguntasC[15][3] = "2015";
		PreguntasC[15][4] = "2014";
		
		// Respuestas de Pregunta 17
		PreguntasC[16][1] = "Jason Momoa"; //Res Correcta
		PreguntasC[16][2] = "Robert Downey jr.";
		PreguntasC[16][3] = "Randall Park";
		PreguntasC[16][4] = "Tobey Maguire";
		
		// Respuestas de Pregunta 18
		PreguntasC[17][1] = "Robin Wright";
		PreguntasC[17][2] = "Marion Cotillard";
		PreguntasC[17][3] = "Michelle Pfeiffer";
		PreguntasC[17][4] = "Gal Gadot"; //Res Correcta
		
		// Respuestas de Pregunta 19
		PreguntasC[18][1] = "Valiente"; //Res Correcto
		PreguntasC[18][2] = "Moana";
		PreguntasC[18][3] = "Merida";
		PreguntasC[18][4] = "La Princesa y el Sapo";
		
		// Respuestas de Pregunta 20
		PreguntasC[19][1] = "Mi Villano Favorito";
		PreguntasC[19][2] = "Mega Mente"; //Res Correcta
		PreguntasC[19][3] = "Los increibles";
		PreguntasC[19][4] = "Los Minions";

	}

	public void desplegarPreguntasHistoria() {
		
		tituloDR = "Puntaje de Historia"; 
		int PreguntaRealizada[] = new int[totalP]; //Cambiar despues a int[PreguntasH.lenght] //PreguntaRealizada hasta 10 //Era antes [5]
		int cont = 0;
		encontrado = false;
		
		for (int i = 0; i < totalP; i++) { //Ciclo hasta 10 //Era antes [5]
			
			Random = (int) Math.floor(Math.random() * PreguntasH.length); //Random hasta 20 //Era antes * 5
			
			if(i==0) {
				PreguntaRealizada[cont] = Random;
				RespuestasH[Random] = JOptionPane.showOptionDialog(null, PreguntasH[Random][0], "Preguntas de Historia",
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
						new ImageIcon("src/paqueteDeProyecto/imagenes/Historia" + Random +".png"),
						new Object[] { PreguntasH[Random][1], PreguntasH[Random][2], PreguntasH[Random][3], PreguntasH[Random][4]},
						PreguntasH[Random][1]);
				
				//revisar respuestas de Preguntas de Historia
				revisarRespuestasH();
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
							new ImageIcon("src/paqueteDeProyecto/imagenes/Historia" + Random +".png"),
							new Object[] { PreguntasH[Random][1], PreguntasH[Random][2], PreguntasH[Random][3], PreguntasH[Random][4]},
							PreguntasH[Random][1]);
				}
			}
			cont++;
		}

	}

	public void desplegarPreguntasGeografia() {

		int PreguntaRealizada[] = new int[totalP]; //Cambiar despues a int[PreguntasH.lenght] //PreguntaRealizada hasta 10 //Era antes [5]
		int cont = 0;
		encontrado = false;
		
		for (int i = 0; i < totalP; i++) { //Ciclo hasta 10 //Era antes [5]
			
			int Random = (int) Math.floor(Math.random() * PreguntasG.length); //Random hasta 20 //Era antes * 5
			
			if(i==0) {
				PreguntaRealizada[cont] = Random;
				RespuestasG[Random] = JOptionPane.showOptionDialog(null, PreguntasG[Random][0], "Preguntas de Geograf�a",
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
						new ImageIcon("src/paqueteDeProyecto/imagenes/Geografia" + Random +".png"),
						new Object[] { PreguntasG[Random][1], PreguntasG[Random][2], PreguntasG[Random][3], PreguntasG[Random][4]},
						PreguntasG[Random][1]);
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
					RespuestasG[Random] = JOptionPane.showOptionDialog(null, PreguntasG[Random][0], "Preguntas de Geograf�a",
							JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
							new ImageIcon("src/paqueteDeProyecto/imagenes/Geografia" + Random +".png"),
							new Object[] { PreguntasG[Random][1], PreguntasG[Random][2], PreguntasG[Random][3], PreguntasG[Random][4]},
							PreguntasG[Random][1]);
				}
			}
			cont++;
		}

	}

	public void desplegarPreguntasCine() {

		RespuestasC[0] = JOptionPane.showOptionDialog(null,
				"�Pel�cula que casi le da un infarto a su director Brad Bierd?", "Preguntas de Cine",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
				new ImageIcon("src/principal/imagenes/Cine1.png"),
				new Object[] { "El gigante de Acero", "Los incre�bles", "Ratatoille", "Los Incre�bles 2" },
				"El gigante de Acero"); // Correcta respuesta El gigante de Acero 0

		RespuestasC[1] = JOptionPane.showOptionDialog(null,
				"�Palabra m�s conocida del Capit�n Am�rica de Los Vengadores?", "Preguntas de Cine",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
				new ImageIcon("src/principal/imagenes/Cine2.png"), new Object[] { "Si entend� la referencia",
						"�alguien quiere retirarse?", "Vengadores! Unidos!", "Puedo hacer esto todo el d�a" },
				"Si entend� la referencia"); // Respuesta correcta Vengadores Unidos!, 2

		RespuestasC[2] = JOptionPane.showOptionDialog(null,
				"�Cu�l era la pel�cula con mas taquilla antes de ser Los Vengadores ENDGAME?", "Preguntas de Cine",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
				new ImageIcon("src/principal/imagenes/Cine3.png"),
				new Object[] { "Avatar", "La cenicienta", "Ready player one", "Juego de tronos" }, "Avatar"); // Respuesta
																												// correcta
																												// Avatar,
																												// 0

		RespuestasC[3] = JOptionPane.showOptionDialog(null,
				"Pel�cula de Disney que tuvo un uso del 2D y 3D en toda la pel�cula: ", "Preguntas de Cine",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
				new ImageIcon("src/principal/imagenes/Cine4.png"),
				new Object[] { "Atlantis", "El planeta del tesoro", "Mosters Inc.", "Toys Story" }, "Atlantis"); // Respuesta
																													// correcta
																													// El
																													// planeta
																													// del
																													// tesoro,
																													// 1

		RespuestasC[4] = JOptionPane.showOptionDialog(null, "Pel�cula de DC que se volvi� a estrenar en el a�o 2021: ",
				"Preguntas de Cine", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
				new ImageIcon("src/principal/imagenes/Cine5.png"),
				new Object[] { "Batman Vs Superman", "Aquaman", "Wonder women 1884", "Justice league, sycniders cut" },
				"Batman Vs Superman"); // Respuesta correcta Justice league, sycniders cut, 3

	}

	public void revisarRespuestasH() {

			if (RespuestasH[Random] == ResCorrectasH[Random]) {
				contAcertadas = contAcertadas + 1;
				puntos = puntos + 10;
			}
	}

	public void revisarRespuestasG() {

		tituloDR = "Puntaje de Georgraf�a";

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
