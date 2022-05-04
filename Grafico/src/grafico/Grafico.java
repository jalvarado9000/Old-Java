package grafico;
//import javax.swing.*;

public class Grafico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int biologia;
		int mathematica;
		float promedio;
		Jframe frame = new Jframe("JOptionPane showMessageDialog example");
		
		biologia = Integer.parseInt(JOptionPne.showInputDialog("Nota de Biologia"));
		
		mateamtica = Integer.parseInt(JOptionPne.showInputDialog("Nota de Matematica"));
		
		arte = Integer.parseInt(JOptionPane.showInputDialog("Nota de Arte"));
		
		promedio = (biologia + matematica + arte)/3;
		
		if (promedio >=6) {
			
			JOptionPane.showMessageDialog(frame, "El alumno aprobo" + promedio, "Aprobado", JOptionPane.INFORMATION_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(fram, "El alumno reprobo" + promedio, "No aprovado", JOptionPane.WARNING_MESSAGE);
		}
		}
		
		
		
		
		
		
		
	}


