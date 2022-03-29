package ro.ase.cst.g1099.clean.code.stage6;

import ro.ase.cst.g1099.clean.code.stage6.exceptions.MissingMarketingStrategyException;

//stage 6
// - Single Responsability (S) at class level
// - Outsource the way we compute the account discount
//SOLID

public class DiscountStrategy {
	
	MarketingStrategy marketingStrategy;
	
	public float getDiscountValue(ProductType productType, float productPrice) {
		return productType.getDiscount() * productPrice;
	}
	
	public float getPriceWithDiscount(ProductType productType, float productPrice) {
		return productPrice - this.getDiscountValue(productType, productPrice);
	}
	
	public float getFinalPrice(ProductType productType, float productPrice, int accountAgeInYears)
	{
		if(this.marketingStrategy == null) {
			throw new MissingMarketingStrategyException();
		}
		
	    float accountDiscount = (productType != ProductType.NEW) ?
	    		marketingStrategy.getAccountDiscount(accountAgeInYears) : 0;
	    
	    float finalPrice = this.getPriceWithDiscount(productType, productPrice) * (1 - accountDiscount);
	    
	    return finalPrice;
	}
}