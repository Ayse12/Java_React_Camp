package game.Concrete;

import game.Entities.Campaign;
import game.Entities.Selling;
import game.Entities.User;

public class SellingManager extends CampaignManager {
	
	public void Sell(User user , Selling game , Campaign campaign) {
		
		System.out.println(" " + user.getFirstName() + " isimli kullanıcı " + game.getGameName() + " isimli oyunu " + campaign.getName() + " isimli kampanya ile yüzde " + campaign.getPrice() + " indirim oranıyla " + game.getGamePriceAfterDiscount() + " TL fiyatýna aldı." );
	}
}
