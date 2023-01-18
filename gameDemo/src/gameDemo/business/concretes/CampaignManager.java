package gameDemo.business.concretes;

import gameDemo.business.abstracts.CampaignService;
import gameDemo.entitiy.Campaing;

public class CampaignManager implements CampaignService {

	@Override
	public void startACampaign(Campaing campaing) {
		System.out.println(campaing.getCampaignName() + " tum oyunlarda basari ile uygulandi!");
		
	}

	@Override
	public void deleteCampaign(Campaing campaing) {
		System.out.println(campaing.getCampaignName() + " kaldirildi!");
		
	}

	@Override
	public void updateCampaign(Campaing campaing) {
		
		System.out.println(campaing.getCampaignName() + " orani guncellendi! ");
	}

}
