package stuSystem.services;

import java.util.List;

import stuSystem.entity.TbClass;

public interface ClassService {
      
	//添加班级
	public boolean addClass(TbClass cls);
	
	//查询班级
	public List findClassList();
	//根据id查询班级
	public TbClass findClassById(TbClass cls);
	//更新班级
	public boolean updateClass(TbClass cls);
	//删除班级
	public boolean deleteClass(TbClass cls);
	
	
	
	
	
	
	
}
