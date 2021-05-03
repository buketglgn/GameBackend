
public interface GameService extends BaseService<Game>{

	public void sell(Gamer gamer, Game game);
	
	public void sell(Gamer gamer, Game game, Campaign camgaign);
}
