
public class Start {

	public static void main(String[] args) {


		//Team mit drei Spielern erstellen
		Team team1 = new Team();
		
		System.out.println(team1.toString());
		
		team1.getPlayers().get(0).birthday();
		team1.getPlayers().get(2).birthday();

		System.out.println(team1.toString());
		
		
	}

}
