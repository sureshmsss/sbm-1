package ss.it.service;

import ss.it.bo.ShopBo;
import ss.it.dao.IShopDao;
import ss.it.dao.IShopDaoMysql;
import ss.it.dto.ShopDto;

public class ShopServiceImpl implements IShopService {

	// Has-a relation
	//private IShopDao dao;
	private IShopDaoMysql dao;

	public ShopServiceImpl(IShopDaoMysql dao) {
		System.out.println("ShopServiceImpl.ShopServiceImpl()");
		this.dao = dao;
	}

	@Override
	public String generateDiscount(ShopDto dto) throws Exception {
		// collect dto values and generate discount
		Double discount = dto.getBill() - (dto.getBill() / 100) * 90;

		// prepare bo
		ShopBo bo = new ShopBo();

		bo.setId(dto.getId());
		bo.setName(dto.getName());
		bo.setBill(dto.getBill());
		bo.setDiscount(discount);

		// use dao
		int res = dao.insertBill(bo);

		if (res == 0) {
			return "discount not generated";
		} else {
			return "discount generated";
		}

	}
}
