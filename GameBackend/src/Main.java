
public class Main {

	public static void main(String[] args) {
		
		Gamer gamer1=new Gamer();
		Gamer gamer2=new Gamer();
		Game game1=new Game();
		Game game2=new Game();
		Campaign campaign1=new Campaign();	
		
		GamerManager gameRManager=new GamerManager(new GamerCheckManager());
		GameManager gameManager= new GameManager();
		CampaignManager campaignManager= new CampaignManager();
		
		gamer1.setId(1);
		gamer1.setNationaltyIdentity("12345678");
		gamer1.setFirstName("Buket");
		gamer1.setLastName("Gülgün");
		gamer1.setDatetime("23.12.1996");
		
		gamer2.setId(2);
		gamer2.setNationaltyIdentity("987535362");
		gamer2.setFirstName("Ceylin");
		gamer2.setLastName("Gülgün");
		gamer2.setDatetime("23.12.2007");
		
		
		game1.setId(1);
		game1.setGameName("Pubg");
		game1.setGamePrice(50);
		
		game2.setId(2);
		game2.setGameName("Valorant");
		game2.setGamePrice(100);
	
		campaign1.setId(1);
		campaign1.setCampaignName("ögrenci kampanyasý");
		campaign1.setDiscount(20);
		
		gameRManager.add(gamer1);
		gameRManager.update(gamer1);
		System.out.println("**********************************");
		campaignManager.add(campaign1);
		System.out.println("**********************************");
		
		gameManager.add(game1);
		System.out.println("**********************************");
		gameManager.sell(gamer1,game1);
		gameManager.sell(gamer2,game2,campaign1);
		
		
	
		
	

	}

}
