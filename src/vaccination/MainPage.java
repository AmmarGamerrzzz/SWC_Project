package vaccination;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.Label;
import java.awt.ScrollPane;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class MainPage extends JFrame {

	private JPanel contentPane;

	private DefaultTableModel model1;
	private DefaultTableModel model2;
	private DefaultTableModel model3;
	private DefaultTableModel model4;
	private DefaultTableModel model5;
	private DefaultTableModel model6;
	
	Citizen Citizen;
	
	private LinkedList<Citizen> CitizenList = new LinkedList<Citizen>();
    private LinkedList<Citizen> dCitizenList = new LinkedList<Citizen>();
    private LinkedList<Citizen> dCitizenList1 = new LinkedList<Citizen>();
    private LinkedList<Citizen> completedList = new LinkedList<Citizen>();
    private LinkedList<Citizen> testFirstDoseStatus = new LinkedList<Citizen>();
    private LinkedList<Citizen> testSecondDoseStatus = new LinkedList<Citizen>();
    
    private Stack<Citizen> stCenter1 = new Stack<Citizen>();
    private Stack<Citizen> stCenter2 = new Stack<Citizen>();
    private Stack<Citizen> stCenter3 = new Stack<Citizen>();
    private Stack<Citizen> sStack1 = new Stack<Citizen>();
    private Stack<Citizen> sStack2 = new Stack<Citizen>();
    private Stack<Citizen> sStack3 = new Stack<Citizen>();
    private Stack<Citizen> dStack1 = new Stack<Citizen>();
    private Stack<Citizen> dStack2 = new Stack<Citizen>();
    private Stack<Citizen> dStack3 = new Stack<Citizen>();
    
    private Queue<Citizen> qCenter1 = new LinkedList<Citizen>();
    private Queue<Citizen> qCenter2 = new LinkedList<Citizen>();
    private Queue<Citizen> qCenter3 = new LinkedList<Citizen>();
    private Queue<Citizen> dQueue1 = new LinkedList<Citizen>();
    private Queue<Citizen> dQueue2 = new LinkedList<Citizen>();
    private Queue<Citizen> dQueue3 = new LinkedList<Citizen>();
    private Queue<Citizen> sQueue1 = new LinkedList<Citizen>();
    private Queue<Citizen> sQueue2 = new LinkedList<Citizen>();
    private Queue<Citizen> sQueue3 = new LinkedList<Citizen>();
	
	String name;
	String IC;
	String state;
	int age;
	String category;
	String firstDoseStatus = null;
	String secondDoseStatus = null;
	String certificate = null;
	
	private JTable table1;
	private JTable table2;
	private JTable table3;
	private JTable table4;
	private JTable table5;
	private JTable table6;
    
	public MainPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1053, 675);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 1019, 618);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(10, 10, 999, 155);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.GRAY);
		panel_2.setBounds(10, 10, 135, 135);
		panel_1.add(panel_2);
		
		JLabel lblNewLabel = new JLabel("VACCINATION SYSTEM");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 60));
		lblNewLabel.setBounds(155, 10, 834, 135);
		panel_1.add(lblNewLabel);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 175, 277, 76);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(10, 261, 277, 76);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Welcome, User...");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(10, 10, 257, 56);
		panel_4.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("ADDED");
		lblNewLabel_3_1.setVisible(false);
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_1.setBounds(10, 10, 257, 56);
		panel_4.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("DELETED");
		lblNewLabel_3_2.setVisible(false);
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_2.setBounds(10, 10, 257, 56);
		panel_4.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Update 1st Dose");
		lblNewLabel_3_3.setVisible(false);
		lblNewLabel_3_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_3.setBounds(10, 10, 257, 56);
		panel_4.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("Update 2nd Dose");
		lblNewLabel_3_4.setVisible(false);
		lblNewLabel_3_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_4.setBounds(10, 10, 257, 56);
		panel_4.add(lblNewLabel_3_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(10, 347, 277, 261);
		panel.add(panel_5);
		panel_5.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.GRAY);
		panel_6.setBounds(10, 10, 146, 207);
		panel_5.add(panel_6);
		panel_6.setLayout(null);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(10, 10, 126, 26);
		panel_6.add(panel_7);
		panel_7.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("EDIT");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, 0, 126, 26);
		panel_7.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("ADD");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_1.setBounds(10, 63, 126, 26);
		panel_6.add(btnNewButton_1);
		
		JButton btnNewButton_4 = new JButton("DELETE");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_4.setBounds(10, 99, 126, 26);
		panel_6.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Update 1st \r\nDose");
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_5.setBounds(10, 135, 126, 26);
		panel_6.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Update 2nd Dose");
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_6.setBounds(10, 171, 126, 26);
		panel_6.add(btnNewButton_6);
		
		JPanel panel_6_1 = new JPanel();
		panel_6_1.setBackground(Color.GRAY);
		panel_6_1.setBounds(159, 10, 108, 207);
		panel_5.add(panel_6_1);
		panel_6_1.setLayout(null);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(10, 10, 88, 26);
		panel_6_1.add(panel_8);
		panel_8.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("DISPLAY");
		lblNewLabel_2.setBounds(0, 0, 85, 26);
		panel_8.add(lblNewLabel_2);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JButton btnNewButton_2 = new JButton("1st Dose");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_2.setBounds(10, 123, 88, 26);
		panel_6_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Complete");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_3.setBounds(10, 159, 88, 26);
		panel_6_1.add(btnNewButton_3);
		
		JButton btnNewButton_2_1 = new JButton("BY AGE");
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_2_1.setBounds(10, 87, 88, 26);
		panel_6_1.add(btnNewButton_2_1);
		
		JButton btnNewButton = new JButton("EXIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int exit = JOptionPane.showConfirmDialog(null,"Are You Sure?","EXIT",JOptionPane.YES_NO_OPTION);
				if(exit == JOptionPane.YES_OPTION)
					System.exit(0);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(83, 227, 108, 24);
		panel_5.add(btnNewButton);
		
		JLabel lblAge18 = new JLabel("AGE 18 - 30");
		lblAge18.setHorizontalAlignment(SwingConstants.CENTER);
		lblAge18.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAge18.setBounds(297, 175, 712, 27);
		lblAge18.setVisible(false);
		panel.add(lblAge18);
		
		JLabel lblAge31 = new JLabel("AGE 31 - 49");
		lblAge31.setHorizontalAlignment(SwingConstants.CENTER);
		lblAge31.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAge31.setBounds(297, 325, 712, 27);
		lblAge31.setVisible(false);
		panel.add(lblAge31);
		
		JLabel lblAge50 = new JLabel("AGE 50 AND ABOVE");
		lblAge50.setHorizontalAlignment(SwingConstants.CENTER);
		lblAge50.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAge50.setBounds(297, 475, 712, 27);
	    lblAge50.setVisible(false);
		panel.add(lblAge50);
		
		// AGE 18 - 30
		
		JScrollPane Panel1 = new JScrollPane();
		Panel1.setVisible(false);
		Panel1.setBounds(297, 212, 712, 103);
		panel.add(Panel1);
		
		Object [] columns1 = {"NAME","IC NUMBER","STATE","AGE","CATEGORY","1st DOSE"};
		
		model1 = new DefaultTableModel();
		model1.setColumnIdentifiers(columns1);
		
		table1 = new JTable();
		table1.setModel(model1);
		table1.setRowHeight(20);
		table1.setAutoCreateRowSorter(true);
		Panel1.setViewportView(table1);
		
		// AGE 31 - 49
		JScrollPane Panel2 = new JScrollPane();
		Panel2.setVisible(false);
		Panel2.setBounds(297, 362, 712, 103);
		panel.add(Panel2);
		
		Object [] columns2 = {"NAME","IC NUMBER","STATE","AGE","CATEGORY","1st DOSE"};
		
		model2 = new DefaultTableModel();
		model2.setColumnIdentifiers(columns2);
		
		table2 = new JTable();
		table2.setModel(model2);
		table2.setRowHeight(20);
		table2.setAutoCreateRowSorter(true);
		Panel2.setViewportView(table2);
		
		// AGE 50 AND ABOVE
		
		JScrollPane Panel3 = new JScrollPane();
		Panel3.setVisible(false);
		Panel3.setBounds(297, 505, 712, 103);
		panel.add(Panel3);
		
        Object [] columns3 = {"NAME","IC NUMBER","STATE","AGE","CATEGORY","1st DOSE"};
		
		model3 = new DefaultTableModel();
		model3.setColumnIdentifiers(columns3);
		
		table3 = new JTable();
		table3.setModel(model3);
		table3.setRowHeight(20);
		table3.setAutoCreateRowSorter(true);
		Panel3.setViewportView(table3);
		
		// Display 1st Dose
		
		JScrollPane Panel4 = new JScrollPane();
		Panel4.setVisible(false);
		Panel4.setBounds(297, 175, 712, 433);
		panel.add(Panel4);
		
        Object [] columns4 = {"NAME","IC NUMBER","STATE","AGE","CATEGORY","1st DOSE"};
		
		model4 = new DefaultTableModel();
		model4.setColumnIdentifiers(columns4);
		
		table4 = new JTable();
		table4.setModel(model4);
		table4.setRowHeight(20);
		table4.setAutoCreateRowSorter(true);
		Panel4.setViewportView(table4);
		
		//Display Complete
		
		JScrollPane Panel5 = new JScrollPane();
		Panel5.setVisible(false);
		Panel5.setBounds(297, 175, 712, 433);
		panel.add(Panel5);
		
		Object [] columns5 = {"NAME","IC NUMBER","STATE","AGE","CATEGORY","1st DOSE","2nd DOSE","CERTIFICATE"};
		
		model5 = new DefaultTableModel();
		model5.setColumnIdentifiers(columns5);
		
		table5 = new JTable();
		Panel5.setViewportView(table5);
		table5.setModel(model5);
		table5.setRowHeight(20);
		table5.setAutoCreateRowSorter(true);
		
		// Display
		
        Object [] columns6 = {"NAME","IC NUMBER","STATE","AGE","CATEGORY","1st DOSE","2nd DOSE","CERTIFICATE"};
		
		model6 = new DefaultTableModel();
		model6.setColumnIdentifiers(columns6);
		
		JScrollPane Panel6 = new JScrollPane();
		Panel6.setVisible(true);
		Panel6.setBounds(297, 175, 712, 433);
		panel.add(Panel6);
		
		table6 = new JTable();
		Panel6.setViewportView(table6);
		table6.setModel(model6);
		table6.setRowHeight(20);
		table6.setAutoCreateRowSorter(true);
		
		Object[] row1 = new Object[6]; //Age 18 - 30
		Object[] row2 = new Object[6]; //Age 31 - 49
		Object[] row3 = new Object[6]; //Age 50 - Above
		Object[] row4 = new Object[6]; //Display 1 Dose
		Object[] row5 = new Object[8]; //Display Complete
		Object[] row6 = new Object[8]; //Display ALL
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Ammar Haikal\\eclipse-workspace\\SWC_Project\\src\\vaccination\\CitizenList"));
			
			String indata = null;
			int index = 0;
			while ((indata = br.readLine())!= null)
			{
				StringTokenizer st = new StringTokenizer(indata,";");
				name = st.nextToken();
				IC = st.nextToken();
				state = st.nextToken();
				age = Integer.parseInt(st.nextToken());
				category = st.nextToken();
				
				row6 [0] = name;
				row6 [1] = IC;				
				row6 [2] = state;
				row6 [3] = age;
				row6 [4] = category;
				row6 [5] = firstDoseStatus;
				row6 [6] = secondDoseStatus;
				row6 [7] = certificate;
				
				model6.addRow(row6);
				table6.enable(false);
				
				Citizen = new Citizen(name,IC,state,age,category,firstDoseStatus,secondDoseStatus,certificate);
				Citizen.setInformationCitizen(name,IC,state,age,category,firstDoseStatus,secondDoseStatus,certificate);
				CitizenList.add(Citizen);
				dCitizenList.add(Citizen);
				dCitizenList1.add(Citizen);
				
				index++;
			}
			
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					name = JOptionPane.showInputDialog("Citizen Name :");
					IC = JOptionPane.showInputDialog("Citizen IC :");
					state = JOptionPane.showInputDialog("Citizen State :");
					age = Integer.parseInt(JOptionPane.showInputDialog("Citizen Age :"));
					category = JOptionPane.showInputDialog("Citizen Category :");
					
					row6 [0] = name;
					row6 [1] = IC;				
					row6 [2] = state;
					row6 [3] = age;
					row6 [4] = category;
					row6 [5] = firstDoseStatus;
					row6 [6] = secondDoseStatus;
					row6 [7] = certificate;
					
					model6.addRow(row6);
					table6.enable(false);
					
					Citizen = new Citizen(name,IC,state,age,category,firstDoseStatus,secondDoseStatus,certificate);
					Citizen.setInformationCitizen(name,IC,state,age,category,firstDoseStatus,secondDoseStatus,certificate);
					CitizenList.add(Citizen);
					dCitizenList.add(Citizen);
					dCitizenList1.add(Citizen);
					
					for(int x=0; x<CitizenList.size(); x++) {
						Citizen = CitizenList.get(x);
						if(Citizen.getAge(x) >=18 && 30 >= Citizen.getAge(x)) {
							stCenter1.push(Citizen);
							dStack1.push(Citizen);
							dCitizenList.addLast(Citizen);
							dCitizenList1.addLast(Citizen);
						}
						else if(Citizen.getAge(x) >=31 && 49 >= Citizen.getAge(x)) {
							stCenter2.push(Citizen);
							dStack2.push(Citizen);
							dCitizenList.addLast(Citizen);
							dCitizenList1.addLast(Citizen);
						}
						else if(Citizen.getAge(x) >=31 && 49 >= Citizen.getAge(x)) {
							stCenter3.push(Citizen);
							dStack3.push(Citizen);
							dCitizenList.addLast(Citizen);
							dCitizenList1.addLast(Citizen);
						}
					}
					CitizenList.clear();
				}
			});
			
			for(int x=0; x<CitizenList.size(); x++) {
				Citizen = CitizenList.get(x);
				if(Citizen.getAge(x) >=18 && 30 >= Citizen.getAge(x)) {
					stCenter1.push(Citizen);
					dStack1.push(Citizen);
					dCitizenList.addLast(Citizen);
					dCitizenList1.addLast(Citizen);
				}
				else if(Citizen.getAge(x) >=31 && 49 >= Citizen.getAge(x)) {
					stCenter2.push(Citizen);
					dStack2.push(Citizen);
					dCitizenList.addLast(Citizen);
					dCitizenList1.addLast(Citizen);
				}
				else if(Citizen.getAge(x) >=31 && 49 >= Citizen.getAge(x)) {
					stCenter3.push(Citizen);
					dStack3.push(Citizen);
					dCitizenList.addLast(Citizen);
					dCitizenList1.addLast(Citizen);
				}
		}
			
			CitizenList.clear();
			
			btnNewButton_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					String ICN = JOptionPane.showInputDialog("Enter Citizen IC for Delete");
					
					// Remove From LinkedList
					for(int x=0; x<dCitizenList.size(); x++) {
						Citizen = dCitizenList.get(x);
						if(Citizen.getIC(ICN).equalsIgnoreCase(ICN)) {
							model6.removeRow(x);
						}
					}
					//Remove From Stack
					for(int x=0; x<stCenter1.size(); x++) {
						Citizen = stCenter1.get(x);
						if(Citizen.getIC(ICN).equalsIgnoreCase(ICN)) {
							stCenter1.remove(Citizen);
							sStack1.remove(Citizen);
							dStack1.remove(Citizen);
						}
					}
					for(int x=0; x<stCenter2.size(); x++) {
						Citizen = stCenter2.get(x);
						if(Citizen.getIC(ICN).equalsIgnoreCase(ICN)) {
							stCenter2.remove(Citizen);
							sStack2.remove(Citizen);
							dStack2.remove(Citizen);
						}
					}
					for(int x=0; x<stCenter3.size(); x++) {
						Citizen = stCenter3.get(x);
						if(Citizen.getIC(ICN).equalsIgnoreCase(ICN)) {
							stCenter3.remove(Citizen);
							sStack3.remove(Citizen);
							dStack3.remove(Citizen);
						}
					}
					System.out.println("\n\nLinkedList : " + CitizenList.toString());
					System.out.println("\n\nStack 1: " + stCenter1);
					System.out.println("\n\nStack 2 : " + stCenter2);
					System.out.println("\n\nStack 3: " + stCenter3);
				}
			});
			btnNewButton_5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
                    int Confirm = JOptionPane.showConfirmDialog(null,"UPDATE ALL CITIZEN 1st DOSE?","UPDATE",JOptionPane.YES_NO_OPTION);
    				
    				if(Confirm==1) {
    					
    					
    					if(testFirstDoseStatus.isEmpty()==false) {
    						
    						Citizen Patient;
    						
    						Patient = testFirstDoseStatus.getFirst();
    						
    						if(Patient.getFirstDoseStatus("").equals("")) {
    							firstDoseStatus = "Done";
		    				
							for(int x=0; x<sStack1.size(); x++) {
		    					Citizen = stCenter1.get(x);
		    					
		    			        Citizen.setFirstDoseStatus(firstDoseStatus);
		    					stCenter1.set(x, Citizen);
		    					
		    					dStack1.add(Citizen);
		    					qCenter1.add(Citizen);
		    					sQueue1.add(Citizen);
		    					
		    					if(x<1) {
		    						testFirstDoseStatus.add(Citizen);
		    					}
		    					
		    				}
		    				
		                    for(int x=0; x<sStack2.size(); x++) {
		                    	Citizen = stCenter2.get(x);
		    					
		    					Citizen.setFirstDoseStatus(firstDoseStatus);
		    					stCenter2.set(x, Citizen);
		    					
		    					dStack2.add(Citizen);
		    					qCenter2.add(Citizen);
		    					sQueue2.add(Citizen);
		    					
		    				}
		                    
		                    for(int x=0; x<sStack3.size(); x++) {
		                    	Citizen = stCenter3.get(x);
		    					
		    					Citizen.setFirstDoseStatus(firstDoseStatus);
		    					stCenter3.set(x, Citizen);
		    					
		    					dStack3.add(Citizen);
		    					qCenter3.add(Citizen);
		    					sQueue3.add(Citizen);
		    					
		    				}
		                    
		                    stCenter1.clear();
		                    stCenter2.clear();
		                    stCenter3.clear();
		                    
		    				System.out.println("\n\nStack 1 : " +dStack1);
		    				System.out.println("\n\nStack 2 : " +dStack2);
		    				System.out.println("\n\nStack 3 : " +dStack3);
		    				
		    				for(int x=0; x<sStack1.size(); x++) {
		    					
		    	            	Citizen = dStack1.get(x);
		    	            	
		    	            	row1[0] = Citizen.getName(name);
	        	            	row1[1] = Citizen.getIC(IC);
	        	            	row1[2] = Citizen.getState(state);
	        	            	row1[3] = Citizen.getAge(age);
	        	            	row1[4] = Citizen.getCategory(category);
	        	            	row1[5] = Citizen.getFirstDoseStatus(firstDoseStatus);
		    					
		    					model1.addRow(row1);
		    					
		    				}
		    				
		    	            System.out.print(dQueue1);
		    	            
		    	            for(int x=0; x<sStack2.size(); x++) {
		    					
		    	            	Citizen = dStack2.get(x);
		    	            	
		    	            	row2[0] = Citizen.getName(name);
	        	            	row2[1] = Citizen.getIC(IC);
	        	            	row2[2] = Citizen.getState(state);
	        	            	row2[3] = Citizen.getAge(age);
	        	            	row2[4] = Citizen.getCategory(category);
	        	            	row2[5] = Citizen.getFirstDoseStatus(firstDoseStatus);
		    					
		    					model2.addRow(row2);
		    					
		    				}
		    				
		    	            System.out.print(dQueue2);
		    	            
		    	            for(int x=0; x<sStack3.size(); x++) {
		    					
		    	            	Citizen = dStack3.get(x);
		    	            	
		    	            	row3[0] = Citizen.getName(name);
	        	            	row3[1] = Citizen.getIC(IC);
	        	            	row3[2] = Citizen.getState(state);
	        	            	row3[3] = Citizen.getAge(age);
	        	            	row3[4] = Citizen.getCategory(category);
	        	            	row3[5] = Citizen.getFirstDoseStatus(firstDoseStatus);
	        	            	
		    					model3.addRow(row3);
		    					
		    				}
		    				
		    	            System.out.print(dQueue3);
    					}
    					else {
    							JOptionPane.showMessageDialog(null, "You already update the citizen First Dose Status!!!", "" , JOptionPane.ERROR_MESSAGE);
    					}
        			}
        			else if(testFirstDoseStatus.isEmpty()==true) {
        						
		    				firstDoseStatus = "Done";
		    				
		    					for(int x=0; x<sStack1.size(); x++) {
		        					Citizen = stCenter1.get(x);
		        					
		        			        Citizen.setFirstDoseStatus(firstDoseStatus);
		        					stCenter1.set(x, Citizen);
		        					
		        					dStack1.add(Citizen);
		        					qCenter1.add(Citizen);
		        					sQueue1.add(Citizen);
		        					
		        					if(x<1) {
		        						testFirstDoseStatus.add(Citizen);
		        					}
		        					
		        				}
		        				
		                        for(int x=0; x<sStack2.size(); x++) {
		                        	Citizen = stCenter2.get(x);
		        					
		        					Citizen.setFirstDoseStatus(firstDoseStatus);
		        					stCenter2.set(x, Citizen);
		        					
		        					dStack2.add(Citizen);
		        					qCenter2.add(Citizen);
		        					sQueue2.add(Citizen);
		        					
		        				}
		                        
		                        for(int x=0; x<sStack3.size(); x++) {
		                        	Citizen = stCenter3.get(x);
		        					
		        					Citizen.setFirstDoseStatus(firstDoseStatus);
		        					stCenter3.set(x, Citizen);
		        					
		        					dStack3.add(Citizen);
		        					qCenter3.add(Citizen);
		        					sQueue3.add(Citizen);
		        					
		        				}
		                        
		                        stCenter1.clear();
		                        stCenter2.clear();
		                        stCenter3.clear();
		                        
		        				System.out.println("\n\nStack 1 : " +dStack1);
		        				System.out.println("\n\nStack 2 : " +dStack2);
		        				System.out.println("\n\nStack 3 : " +dStack3);
		        				
		        				for(int x=0; x<sStack1.size(); x++) {
		        					
		        	            	Citizen = dStack1.get(x);
		        	            	
		        	            	row1[0] = Citizen.getName(name);
		        					row1[1] = Citizen.getIC(IC);
		        					row1[2] = Citizen.getState(state);
		        					row1[3] = Citizen.getAge(age);
		        					row1[4] = Citizen.getCategory(category);
		        					row1[5] = Citizen.getFirstDoseStatus(firstDoseStatus);
		        					
		        					model1.addRow(row1);
		        					
		        				}
		        				
		        	            System.out.print(dQueue1);
		        	            
		        	            for(int x=0; x<sStack2.size(); x++) {
		        					
		        	            	Citizen = dStack2.get(x);
		        	            	
		        	            	row2[0] = Citizen.getName(name);
		        	            	row2[1] = Citizen.getIC(IC);
		        	            	row2[2] = Citizen.getState(state);
		        	            	row2[3] = Citizen.getAge(age);
		        	            	row2[4] = Citizen.getCategory(category);
		        	            	row2[5] = Citizen.getFirstDoseStatus(firstDoseStatus);
		        					
		        					model2.addRow(row2);
		        					
		        				}
		        				
		        	            System.out.print(dQueue2);
		        	            
		        	            for(int x=0; x<sStack3.size(); x++) {
		        					
		        	            	Citizen = dStack3.get(x);
		        	            	
		        	            	row3[0] = Citizen.getName(name);
		        	            	row3[1] = Citizen.getIC(IC);
		        	            	row3[2] = Citizen.getState(state);
		        	            	row3[3] = Citizen.getAge(age);
		        	            	row3[4] = Citizen.getCategory(category);
		        	            	row3[5] = Citizen.getFirstDoseStatus(firstDoseStatus);
		        					
		        					model3.addRow(row3);
		        					
		        				}
		        				
		        	            System.out.print(dQueue3);
		    					
		    				
        					}
    					
    				}
    				else if(Confirm==2) {
    					
    					if(testFirstDoseStatus.isEmpty()==false) {
        					JOptionPane.showMessageDialog(null, "You already update the citizen 1st Dose Status!!!", "" , JOptionPane.ERROR_MESSAGE);
        				}
        				else if(testFirstDoseStatus.isEmpty()==true) {
        					
        					for(int x=0; x<stCenter1.size(); x++) {
            					Citizen = stCenter1.get(x);
            					
            			        Citizen.setFirstDoseStatus("");
            					stCenter1.set(x, Citizen);
            					
            					if(x<1) {
            						testFirstDoseStatus.add(Citizen);
            					}
            					
            				}
        					
        					for(int x=0; x<stCenter2.size(); x++) {
        		            	Citizen = stCenter2.get(x);
                					
                					Citizen.setFirstDoseStatus("");
                					stCenter2.set(x, Citizen);
                					
                			}
        		            
        		            for(int x=0; x<stCenter3.size(); x++) {
        		            	Citizen = stCenter3.get(x);
                					
                					Citizen.setFirstDoseStatus("");
                					stCenter3.set(x, Citizen);	
                			}
        		        }
    			    }
    				
    			}
    		});
			
			btnNewButton_6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
                
					int Confirm = JOptionPane.showConfirmDialog(null,"UPDATE ALL CITIZEN 2nd DOSE?","",JOptionPane.YES_NO_OPTION);
    				
    				if(Confirm == 0) {
    					
    					if(testSecondDoseStatus.isEmpty()==false) {
        					
    						JOptionPane.showMessageDialog(null, "You already update the citizen 2nd Dose Status!!!", "" , JOptionPane.ERROR_MESSAGE);
    					
    				}
    				else if(testSecondDoseStatus.isEmpty()==true) {
    					
    						if(qCenter1.isEmpty()==true) {
            					if(qCenter2.isEmpty()==true) {
            						if(qCenter3.isEmpty()==true) {
            							JOptionPane.showMessageDialog(null, "Cannot update 2nd dose cause you does not update the citizen 1st dose status!!!", "" , JOptionPane.ERROR_MESSAGE);
            						}
            					}
            				}
    						else {
    							if(qCenter1.isEmpty()==false) {
    	        					if(qCenter2.isEmpty()==false) {
    	        						if(qCenter3.isEmpty()==false) {
    	        							
    	        		    				secondDoseStatus = "Done";
    	        		    				
    	        		    				for(int x=0; x<sQueue1.size(); x++) {
	        		        					Citizen = qCenter1.element();
	        		        					
	        		        			        Citizen.setSecondDoseStatus(secondDoseStatus);
	        		        					Citizen.setCertificate("Completed");
	        		        			        
	        		        			        
	        		        			        testSecondDoseStatus.addFirst(Citizen);
	        		        			        
	        		        			        completedList.add(Citizen);
	        		        					qCenter1.remove(Citizen);
	        		        				}
	        		        				
	        		    					
	        		                        for(int x=0; x<sQueue2.size(); x++) {
	        		                        	Citizen = qCenter2.element();
	        		        					
	        		        					Citizen.setSecondDoseStatus(secondDoseStatus);
	        		        					Citizen.setCertificate("Completed");
	        		        					
	        		        					completedList.add(Citizen);
	        		        					qCenter2.remove(Citizen);
	        		        					
	        		        				}
	        		                        
	        		                        for(int x=0; x<sQueue3.size(); x++) {
	        		                        	Citizen = qCenter3.element();
	        		        					
	        		        					Citizen.setSecondDoseStatus(secondDoseStatus);
	        		        					Citizen.setCertificate("Completed");
	        		        					
	        		        					completedList.add(Citizen);
	        		        					qCenter3.remove(Citizen);
	        		        				}
	        		        				
	        		        				for(int x=0; x<completedList.size(); x++) {
	        		        					
	        		        					row5[0] = completedList.get(x).getName(name);
	        		        					row5[1] = completedList.get(x).getIC(IC);
	        		        					row5[2] = completedList.get(x).getState(state);
	        		        					row5[3] = completedList.get(x).getAge(age);
	        		        					row5[4] = completedList.get(x).getCategory(category);
	        		        					row5[5] = completedList.get(x).getFirstDoseStatus(firstDoseStatus);
	        		        					row5[6] = completedList.get(x).getSecondDoseStatus(secondDoseStatus);
	        		        					row5[7] = completedList.get(x).getCertificate(certificate);
	        		        					
	        		        					model5.addRow(row5);
	        		        				}		
    	        						}
    	        					}
    	        				}
    					    }
    					}
    				}
    			}
    		});
			
			btnNewButton_2_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(dStack1.isEmpty()==true) {
						if(dStack2.isEmpty()==true) {
							if(dStack3.isEmpty()==true) {
								JOptionPane.showMessageDialog(null, "There's no have a 1st dose citizen!!!", "" , JOptionPane.ERROR_MESSAGE);
							}
						}
					}
					else {
						table1.enable(false);
						table2.enable(false);
						table3.enable(false);
						
						Panel1.setVisible(true);
						Panel2.setVisible(true);
						Panel3.setVisible(true);
						Panel6.setVisible(false);
					}
				}
			});
			
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
		}
		catch (Exception p)
		{
			System.out.println(p.getMessage());
		}
		
	}
}
