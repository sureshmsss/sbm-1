package ss.it.service;

import ss.it.bo.StudentBo;
import ss.it.dao.IStudentDao;
import ss.it.dao.IStudentMysqlDao;
import ss.it.dto.StudentDto;

public class StudentServiceImpl implements IStudentService {
	// Has-A relation
	private IStudentDao dao;

	public StudentServiceImpl(IStudentDao dao) {
		System.out.println("StudentServiceImpl()-1");
		this.dao = dao;
	}

	@Override
	public String generateResult(StudentDto dto) throws Exception {
		String result = null;

		// get the data from dto and generate logic

		Float percentage = (dto.getTotal() / 300) * 100f;
		Float average = dto.getTotal() / 3f;

		if (percentage > 95) {
			result = "A";
		} else if (percentage > 65) {
			result = "B";
		} else if (percentage > 50) {
			result = "C";
		} else if (percentage > 35) {
			result = "D";
		} else {
			result = "F";
		}
		// set the data to bo from dto
		StudentBo bo = new StudentBo();

		bo.setName(dto.getName());
		bo.setTotal(dto.getTotal());
		bo.setAverage(average);
		bo.setResult(result);

		// use dao
		int count = dao.insertRecord(bo);
		if (count != 0)
			System.out.println("record is inserted");

		return "the result is " + result + " and inserted records are " + count;
	}

}
