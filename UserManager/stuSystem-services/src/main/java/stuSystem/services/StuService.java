package stuSystem.services;

import java.util.List;

import stuSystem.entity.Stu;

public interface StuService {
  
	//添加学生
	public boolean addStu(Stu stu);
	//查询学生
	public List findStuList();
	//删除学生
	public boolean deleteStu(Stu stu);
	//修改学生
	public boolean updateStu(Stu stu);
	//根据Id查询出学生
	public Stu findStuById(Stu stu);
	
}
