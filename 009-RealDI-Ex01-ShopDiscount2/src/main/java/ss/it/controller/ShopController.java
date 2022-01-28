package ss.it.controller;

import ss.it.dto.ShopDto;
import ss.it.service.IShopService;
import ss.it.vo.ShopVo;

public class ShopController {
	// Has-A property
	private IShopService service;

	public ShopController(IShopService service) {
		super();
		this.service = service;
	}

	public String processBill(ShopVo vo) throws Exception {
		// convert employee vo to dto
		ShopDto dto = new ShopDto();
//		dto.setId(Integer.parseInt(vo.getId()));
		dto.setName(vo.getName());
		dto.setBill(Double.parseDouble(vo.getBill()));
		// dto.setDiscount(Double.parseDouble(vo.getDiscount()));

		// use service
		String res = service.generateDiscount(dto);

		return res;
	}

}
