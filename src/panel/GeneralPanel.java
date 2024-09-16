package panel;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import funciones.FuntionController;
import pojo.GameData;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GeneralPanel extends JPanel {

	private JPanel panel = null;
	ArrayList<GameData> datas = null;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField localGroupFiled;
	private JTextField visitorGroupFiled;
	private JTextField localGoalFiled;
	private JTextField visitorGoalFiled;
	private JTextField placeFiled;
	private JTextField dateFiled;
	private JTable tableView;


	public GeneralPanel(ArrayList<JPanel> panels, ArrayList<GameData> gameData) {
		FuntionController funtionController = new FuntionController();
		panel = new JPanel();
		panel.setBounds(0, 0, 478, 517);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Equipo Local");
		lblNewLabel.setBounds(26, 25, 69, 20);
		panel.add(lblNewLabel);
		
		JLabel lblEquipoVisitante = new JLabel("Equipo Visitante");
		lblEquipoVisitante.setBounds(26, 67, 82, 20);
		panel.add(lblEquipoVisitante);
		
		JLabel lblGolesLocal = new JLabel("Goles Local");
		lblGolesLocal.setBounds(26, 106, 82, 20);
		panel.add(lblGolesLocal);
		
		JLabel lblGolesVisitante = new JLabel("Goles Visitante");
		lblGolesVisitante.setBounds(26, 148, 82, 20);
		panel.add(lblGolesVisitante);
		
		JLabel lblLugar = new JLabel("Lugar");
		lblLugar.setBounds(26, 190, 82, 20);
		panel.add(lblLugar);
		
		JLabel lblLugar_1 = new JLabel("Fecha");
		lblLugar_1.setBounds(26, 235, 82, 20);
		panel.add(lblLugar_1);
		
		localGroupFiled = new JTextField();
		localGroupFiled.setBounds(122, 25, 222, 20);
		panel.add(localGroupFiled);
		localGroupFiled.setColumns(10);
		
		visitorGroupFiled = new JTextField();
		visitorGroupFiled.setColumns(10);
		visitorGroupFiled.setBounds(122, 67, 222, 20);
		panel.add(visitorGroupFiled);
		
		localGoalFiled = new JTextField();
		localGoalFiled.setColumns(10);
		localGoalFiled.setBounds(122, 106, 222, 20);
		panel.add(localGoalFiled);
		
		visitorGoalFiled = new JTextField();
		visitorGoalFiled.setColumns(10);
		visitorGoalFiled.setBounds(122, 148, 222, 20);
		panel.add(visitorGoalFiled);
		
		placeFiled = new JTextField();
		placeFiled.setColumns(10);
		placeFiled.setBounds(122, 190, 222, 20);
		panel.add(placeFiled);
		
		dateFiled = new JTextField();
		dateFiled.setColumns(10);
		dateFiled.setBounds(122, 235, 222, 20);
		panel.add(dateFiled);
		
		JButton btnNewButton = new JButton("Añadir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				GameData data = new GameData(localGroupFiled.getText(),visitorGroupFiled.getText(),Integer.parseInt(localGoalFiled.getText()),
						Integer.parseInt(visitorGoalFiled.getText()),placeFiled.getText(),dateFiled.getText());
				gameData.add(data);
				System.out.println(data);
				
				
				JOptionPane.showMessageDialog(null,
						"Se ha añadido el mensaje correctamente.",
						"OK!", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnNewButton.setBounds(26, 285, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnCargar = new JButton("Cargar");
		btnCargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				funtionController.writeFile(gameData);
				
			}
		});
		btnCargar.setBounds(144, 285, 89, 23);
		panel.add(btnCargar);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(255, 285, 89, 23);
		panel.add(btnGuardar);
		
		tableView = new JTable();
		tableView.setBounds(26, 334, 313, 144);
		panel.add(tableView);

		
	}

	public JPanel getPanel() {
		return panel;
	}

}
