
public class Robot {
 
	Capteur capteur;
	Moteur moteur;
	
	public void avancer(){
		
		Avancer a = new Avancer();
		a.run();
		
	}
	
public void tourner(){
		
		Tourner a = new Tourner();
		a.run();
		
	}
}
