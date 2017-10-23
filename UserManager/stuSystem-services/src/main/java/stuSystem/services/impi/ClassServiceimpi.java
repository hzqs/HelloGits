package stuSystem.services.impi;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import stuSystem.dao.ClassDao;
import stuSystem.entity.TbClass;
import stuSystem.services.ClassService;

@Service("clsService")
@Transactional(propagation=Propagation.REQUIRED)
public class ClassServiceimpi implements ClassService {
    
	@Resource(name="clsDao")
	private ClassDao clsDao;
	
	//添加班级
	@Override
	public boolean addClass(TbClass cls) {
		
		return clsDao.addClass(cls);
		
	}
    //查询班级      
	@Override
	public List findClassList() {
		
		return clsDao.findTbClassList("from TbClass");
		
	}
	//根据ID查询出班级
	@Override
	public TbClass findClassById(TbClass cls) {
		
		return clsDao.findClassById(cls);
	}
    
	//修改班级
	@Override
	public boolean updateClass(TbClass cls) {
		
		return clsDao.updateClass(cls);
	}
	//删除班级
	@Override
	public boolean deleteClass(TbClass cls) {
		
		return clsDao.deleteClass(cls);
		
	}

	//
	public void setClsDao(ClassDao clsDao) {
		this.clsDao = clsDao;
	}
}
