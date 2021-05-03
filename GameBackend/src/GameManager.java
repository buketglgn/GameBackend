
public class GameManager implements GameService {

	@Override
	public void add(Game entity) {
		System.out.println("oyun sisteme eklendi: "+entity.getGameName());
		
	}

	@Override
	public void delete(Game entity) {
		System.out.println("oyun sistemden silindi: "+entity.getGameName());
		
	}

	@Override
	public void update(Game entity) {
		System.out.println("oyun g�ncellendi: "+entity.getGameName());
		
	}

	@Override
	public void sell(Gamer gamer, Game game) {
		System.out.println(game.getGameName()+" adl� oyun "+game.getGamePrice()+ " TL ye sat�ld�. Sat�n alan oyuncu : "+gamer.getFirstName()+" "+gamer.getLastName());
		
	}
	@Override
	public void sell(Gamer gamer, Game game, Campaign camgaign) {
		double newPrice= game.getGamePrice() - (game.getGamePrice() *(camgaign.getDiscount()/ 100));
		System.out.println(game.getGameName()+" adl� oyun "+camgaign.getCampaignName()+"  ile "+
		newPrice+ " TL ye sat�ld�. Sat�n alan oyuncu : "+gamer.getFirstName()+" "+gamer.getLastName());
		
	}

}
