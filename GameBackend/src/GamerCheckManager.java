
public class GamerCheckManager implements GamerCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		if(!gamer.getNationaltyIdentity().isEmpty()) {
			
			return true;
		}
		else {
			return false;
		}
		
	}

}
