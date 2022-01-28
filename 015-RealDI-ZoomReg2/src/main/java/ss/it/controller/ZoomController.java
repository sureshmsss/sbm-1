package ss.it.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import ss.it.dto.ZoomDto;
import ss.it.service.IZoomService;
import ss.it.vo.ZoomVo;

@Controller("cnt")
public class ZoomController {
	@Autowired
	// HAS-A property
	private IZoomService sevice;

	public String processDetails(ZoomVo vo) throws Exception {

		System.out.println("ZoomController.processDetails()");
		// convert vo to dto
		ZoomDto dto = new ZoomDto();

		dto.setName(vo.getName());
		dto.setMobNo(vo.getMobNo());
		dto.setCourse(vo.getCourse());
		dto.setMailId(vo.getMailId());
		dto.setFee(Double.parseDouble(vo.getFee()));

		String result = sevice.processData(dto);

		return result;
	}
}
