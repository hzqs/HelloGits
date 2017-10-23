package stuSystem.dao;

import java.util.List;

import stuSystem.entity.Stu;

/*
 * 学生dao层
 * */
public interface StuDao {
      
	//添加学生
	public boolean addStu(Stu stu);
	//查询学生
	public List findStuList(String sql);
	
	//删除学生
	public boolean deleteStu(Stu stu);
	
	//修改学生
	public boolean updateStu(Stu stu);
	
	//根据ID查询出学生
	public Stu findStuById(Stu stu);
	
}
