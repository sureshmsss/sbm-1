package ss.it.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ss.it.bo.ZoomBo;
import ss.it.dao.IZoomDao;
import ss.it.dao.ZoomDaoMysql;
import ss.it.dto.ZoomDto;

@Service("service")
public class ZoomServiceMysql implements IZoomService {
	@Autowired
	// has a property
	private IZoomDao dao;

	@Override
	public String processData(ZoomDto dto) throws Exception {

		System.out.println("ZoomServiceMysql.processData()");

		int count = 0;
		int refId = 0;
		// write b.logic to process the data
		if (dto.getFee() > 1000) {
			System.out.println("data has been processed");
		}
		ZoomBo bo = new ZoomBo();
		bo.setName(dto.getName());
		bo.setMobNo(dto.getMobNo());
		bo.setCourse(dto.getCourse());
		bo.setMailId(dto.getCourse());
		bo.setFee(dto.getFee());
		// create and use dao
		dao = new ZoomDaoMysql();

		count = dao.insertData(bo);

		return count == 1 ? "Data is registered ::" + new Random().nextInt()
				: "on the date : " + System.currentTimeMillis(); // ternary opeartor;
		// return count==1?"Employee registered with netSalary::"+netSalary:"Employee
		// not registered with netSalary::"+netSalary; //ternary opeartor
	}// method

}// class
