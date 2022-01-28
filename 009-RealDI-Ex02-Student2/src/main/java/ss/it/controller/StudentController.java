package ss.it.controller;

import ss.it.dto.StudentDto;
import ss.it.service.IStudentService;
import ss.it.vo.StudentVo;

public class StudentController {

	// HAS-A relation
	private IStudentService service;

	public StudentController(IStudentService service) {
		System.out.println("StudentController()-1-param");
		this.service = service;
	}
	
	public String processData(StudentVo vo) throws Exception{
		
		//get the data from vo and send the data to dto
		StudentDto dto=new StudentDto();
		dto.setName(vo.getName());
		dto.setTotal(Integer.parseInt(vo.getTotal()));		
		
		String result=service.generateResult(dto);
		return result;
	}

}
