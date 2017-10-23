package stuSystem.dao;

import java.util.List;

import stuSystem.entity.TbClass;

public interface ClassDao {
    
	//添加班级
	public boolean addClass(TbClass cls);
	
	//查询班级
	public List findTbClassList(String sql);
	//修改班级
	public boolean updateClass(TbClass cls);
	//根据ID查询出班级
	public TbClass findClassById(TbClass cls);
	
	//删除班级
	public boolean deleteClass(TbClass cls);
	
	
}
