package stuSystem.dao.impi;

import java.util.List;

import org.springframework.stereotype.Repository;

import stuSystem.dao.ClassDao;
import stuSystem.entity.TbClass;

@Repository("clsDao")
public class ClassDaoimpi extends BaseDao implements ClassDao {
    
	
	//添加班级
	@Override
	public boolean addClass(TbClass cls) {
		
		 getSession().save(cls);
		 return true;
	}
    
	//查询班级
	@Override
	public List findTbClassList(String sql) {
		
		return getSession().createQuery(sql).list();
	}
     //修改班级
	@Override
	public boolean updateClass(TbClass cls) {
	    getSession().update(cls);
		return true;
	}
     
	//根据Id查询出班级
	@Override
	public TbClass findClassById(TbClass cls) {
		
		return getSession().get(TbClass.class,cls.getCno());
		
	}
    //删除班级
	@Override
	public boolean deleteClass(TbClass cls) {
		getSession().delete(cls);
		return true;
		
	}
	

}
