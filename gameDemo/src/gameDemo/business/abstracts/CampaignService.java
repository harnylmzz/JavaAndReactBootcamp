package gameDemo.business.abstracts;

import gameDemo.entitiy.Campaing;

public interface CampaignService {
	void startACampaign(Campaing campaing);

	void deleteCampaign(Campaing campaing);
	
	void updateCampaign(Campaing campaing);
}
