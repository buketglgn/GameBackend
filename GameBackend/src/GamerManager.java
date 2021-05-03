
public class GamerManager implements GamerService{

	private GamerCheckService _gamerCheckService;
	
	public GamerManager(GamerCheckService gamerCheckService) {
		this._gamerCheckService=gamerCheckService;
	}
	
	@Override
	public void add(Gamer gamer) {
		if(_gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println("Oyuncu sisteme E-devlet do�rulamas� ile eklendi: "+gamer.getFirstName()+" "+gamer.getLastName());
		}
		else {
			System.out.println("Oyuncu EKLENEMED�.. E-DEVLET DOGRULAMA HATASI.");
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" adl� oyuncu silindi.");
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" adl� oyuncu g�ncellendi.");
		
	}

}
