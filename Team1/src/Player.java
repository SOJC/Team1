import java.util.Random;
import java.util.Scanner;

public class Player {
	
	private String name;
	private int alter;
	private int rating;


	//Konstruktor, wenn noch nichts bekannt
	public Player(){
		
		//Scanner Objekt erstellen um Benutereingaben zu lesen
		Scanner scan = new Scanner(System.in);  
		
		//Namen auslesen
		System.out.println("Geben Sie einen Namen ein: ");
		this.name = scan.nextLine();
		
		//Alter abfragen
		System.out.println("Geben Sie das Alter ein: ");
		this.alter = scan.nextInt();
		
		//Rating setzen
		Random rand = new Random();
		//Rating zwischen 1 und 100 ... rand.nextInt(100) generiert eine Zufallszahl 
		//zwischen 0 und der angegebenen Zahl -1 --> desswegen +1
		this.rating = rand.nextInt(100)+1;
		
	}
	
	//Konstruktor, wenn name und alter schon bekannt
		public Player(String name, int alter){
			
			this.name=name;
			this.alter=alter;	
			
			//Rating setzen
			Random rand = new Random();
			//Rating zwischen 1 und 100 ... rand.nextInt(100) generiert eine Zufallszahl 
			//zwischen 0 und der angegebenen Zahl -1 --> desswegen +1
			this.rating = rand.nextInt(100)+1;
		}
	/**
	 * Player hat Geburtstag und wird 1 Jahr älter.
	 */
	public void birthday(){
		
		this.alter++;
		
	}	
		

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
	public String toString(){	
				
		return "Name: "+name+" Alter: "+alter+" Rating: "+rating;
	}
}
