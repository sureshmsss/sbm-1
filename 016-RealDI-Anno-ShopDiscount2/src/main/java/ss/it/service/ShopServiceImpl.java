package ss.it.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ss.it.bo.ShopBo;
import ss.it.dao.IShopDao;
import ss.it.dao.ShopDaoMysqlImpl;
import ss.it.dto.ShopDto;

@Service("service")
public class ShopServiceImpl implements IShopService {
	// Has-a relation
	// private IShopDao dao;
	@Autowired
	@Qualifier("dbopt")
	private IShopDao dao;

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
		dao=new ShopDaoMysqlImpl();
		int res = dao.insertBill(bo);

		if (res == 0) {
			return "discount not generated";
		} else {
			return "discount generated";
		}

	}
}
