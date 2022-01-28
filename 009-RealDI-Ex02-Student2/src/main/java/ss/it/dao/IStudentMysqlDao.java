package ss.it.dao;

import ss.it.bo.StudentBo;

public interface IStudentMysqlDao {
	public int insertRecord(StudentBo bo)throws Exception;
}
