package bank;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Task1 extends JFrame {
	private JButton jbtn1;
	private JButton jbtn2;
	private JButton jbtn3;
	private JButton jbtn4;
	private JButton jbtn5;
	private JPanel jpnl;
	private GridLayout grid;
	
	public Task1(){
		initComponent();
	}
	
	public Task1(String title){
		initComponent();
		this.setTitle(title);
	}
	private void initComponent(){
		double summ=Double.parseDouble(JOptionPane.showInputDialog("Здравствуйте, вы создаете счет, какую сумму вы хотели бы внести на счет?\n Введите сумму: "));
		while (summ<=0){
			JOptionPane.showMessageDialog(null,"Сумма должна быть больше 0");
			summ=Double.parseDouble(JOptionPane.showInputDialog("Здравствуйте, вы создаете счет, какую сумму вы хотели бы внести на счет?\n Введите сумму: "));
		}
		Task2 sc = new Task2(summ);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		jpnl= new JPanel();
		grid= new GridLayout(5,1,10,10);
		jbtn1= new JButton("Пополнить счет");
		jbtn2= new JButton("Снять наличные");
		jbtn3= new JButton("Штраф");
		jbtn4= new JButton("Проверить баланс");
		jbtn5= new JButton("Выйти");
		jpnl.add(jbtn1);
		jpnl.add(jbtn2);
		jpnl.add(jbtn3);
		jpnl.add(jbtn4);
		jpnl.add(jbtn5);
		jpnl.setLayout( grid);
		add(jpnl);
		pack();
	
	jbtn1.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e) {
			sc.deposite(Double.parseDouble(JOptionPane.showInputDialog("Введите сумму, которую вы хотели бы внести на счет: ")));
		}
		
	});
	
	jbtn2.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent arg0) {
			sc.snatie(Double.parseDouble(JOptionPane.showInputDialog("Введите какую сумму вы хотите снять со счета: ")));
		}
		
	});
	
	jbtn4.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent arg0) {
			JOptionPane.showMessageDialog(null,"Баланс равен: "+sc.getBalans()+"руб.");
		}
		
	});
	
	jbtn3.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent arg0) {
			JOptionPane.showMessageDialog(null,"Сумма штрафов равна: "+sc.getFine()+"руб.");
		}
		
	});
	
	jbtn5.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent arg0) {
			JOptionPane.showMessageDialog(null,"Спасибо за визит!");
			System.exit(0);
		}
		
	});
		
}
} 

		
		

