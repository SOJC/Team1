import java.util.ArrayList;
import java.util.Scanner;

public class Team {

	private String name;
	private final int AMOUNTOFPLAYERS=3;
	
	//3 Spieler
	private ArrayList<Player> players = new ArrayList<Player>();
	
	public Team(){
		
		//Namen setzen
		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte Team-Namen eingeben: ");
		this.name = scan.nextLine();
		
		for(int i=0;i<AMOUNTOFPLAYERS;i++){
				
			Player p = new Player();
			players.add(p);
		}
		
	}
	public String toString(){
		String teamname="Team-Name: "+this.name+"\n";
		String spieler="";
		for(int i=0;i<AMOUNTOFPLAYERS;i++){
			spieler=spieler+players.get(i).toString()+"\n";
			/*
			  Alternative:
			  spieler=spieler+"Spielername: "+players.get(i).getName();
			  spieler=spieler+"Spieleralter: "+players.get(i).getAlter();
			  spieler=spieler+"Spieler-Rating: "+players.get(i).getRating();
			 */
		}
		return teamname+spieler;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Player> getPlayers() {
		return players;
	}
	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}
	
	
}
