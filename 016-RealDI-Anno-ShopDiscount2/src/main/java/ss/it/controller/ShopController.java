package ss.it.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import ss.it.dto.ShopDto;
import ss.it.service.IShopService;
import ss.it.service.ShopServiceImpl;
import ss.it.vo.ShopVo;

@Controller("controller")
public class ShopController {
	// Has-A property
	@Autowired
	private IShopService service;

	public String processBill(ShopVo vo) throws Exception {
		// convert employee vo to dto
		ShopDto dto = new ShopDto();
//		dto.setId(Integer.parseInt(vo.getId()));
		dto.setName(vo.getName());
		dto.setBill(Double.parseDouble(vo.getBill()));
		// dto.setDiscount(Double.parseDouble(vo.getDiscount()));

		// use service
		service=new ShopServiceImpl();
		String res = service.generateDiscount(dto);

		return res;
	}

}
