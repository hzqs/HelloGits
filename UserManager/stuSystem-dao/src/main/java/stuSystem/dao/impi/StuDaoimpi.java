package stuSystem.dao.impi;

import java.util.List;

import org.springframework.stereotype.Repository;

import stuSystem.dao.StuDao;
import stuSystem.entity.Stu;

@Repository("stuDao")
public class StuDaoimpi extends BaseDao implements StuDao {
    
	//添加学生
	@Override
	public boolean addStu(Stu stu) {
		getSession().save(stu);
		return true;
	}
    //查询学生
	@Override
	public List findStuList(String sql) {
		return getSession().createQuery(sql).list();
	}
	//删除学生
	@Override
	public boolean deleteStu(Stu stu) {
		getSession().delete(stu);
		return true;
	}
	//修改学生
	@Override
	public boolean updateStu(Stu stu) {
	    getSession().update(stu);
		return true;
		
	}
	//根据Id查询出学生
	@Override
	public Stu findStuById(Stu stu) {
		
		return getSession().get(Stu.class,stu.getSno());
	}
	
	

}
