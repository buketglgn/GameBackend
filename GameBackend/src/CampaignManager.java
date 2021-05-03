
public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign entity) {
		System.out.println("kampanya sisteme eklendi.: "+entity.getCampaignName());
		
	}

	@Override
	public void delete(Campaign entity) {
		System.out.println("kampanya sistemden silindi.: "+entity.getCampaignName());
		
	}

	@Override
	public void update(Campaign entity) {
		System.out.println("kampanya güncellendi.: "+entity.getCampaignName());
		
	}

	

}
