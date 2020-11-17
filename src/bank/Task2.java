package bank;
import javax.swing.JOptionPane;

	public class Task2 {
		//поля
		private double balans=0;
		private double fine=0;
		//конструкторы
		
		public Task2 (double aBalans){
			balans=aBalans;
			
		}
		public void deposite(double aMoney){
			if(aMoney>0)
			balans=balans+aMoney;
			else
				JOptionPane.showMessageDialog(null,"Cумма должна быть больше 0");
		} 
		public void snatie(double aMount){
			if (aMount>0)
			
			if(balans<0){
				balans=balans-5;
				fine+=5;
			}
			else 
				balans=balans-aMount;
			
			else
				JOptionPane.showMessageDialog(null,"Cумма должна быть больше 0");
		}
		public double getBalans(){
			return balans;
		
		}
		public double getFine(){
			return fine;
		}
		
			
	}	

