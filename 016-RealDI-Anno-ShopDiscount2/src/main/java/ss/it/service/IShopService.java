package ss.it.service;

import ss.it.dto.ShopDto;

public interface IShopService {

	public String generateDiscount(ShopDto dto) throws Exception;

}
