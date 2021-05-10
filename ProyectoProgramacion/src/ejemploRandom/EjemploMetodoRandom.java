package ejemploRandom;

import javax.swing.JOptionPane;

public class EjemploMetodoRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] Nombres = new String[] { "Juan,", "Valeria", "Jesus", "Manuel", "Raul" };

		int Random = (int) Math.floor(Math.random() * 5);

		System.out.println(Random);

		JOptionPane.showMessageDialog(null, Nombres[Random]);

	}

}
