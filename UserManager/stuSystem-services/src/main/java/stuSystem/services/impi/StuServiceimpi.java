package stuSystem.services.impi;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import stuSystem.dao.StuDao;
import stuSystem.entity.Stu;
import stuSystem.services.StuService;

@Service("stuService")
@Transactional(propagation=Propagation.REQUIRED)
public class StuServiceimpi implements StuService {
    
	@Resource(name="stuDao")
	private StuDao stuDao;
	
	//添加学生
	@Override
	public boolean addStu(Stu stu) {
		return stuDao.addStu(stu);
	}
	
	//查询学生
	@Override
	public List findStuList() {
		
		return stuDao.findStuList(" from Stu s");
	}
	
	
	 //删除学生
	@Override
	public boolean deleteStu(Stu stu) {
		
		return stuDao.deleteStu(stu);
		
	}

	//修改学生
	@Override
	public boolean updateStu(Stu stu) {
		
		return stuDao.updateStu(stu);
		
	}
    //根据Id查询学生
	@Override
	public Stu findStuById(Stu stu) {
		
		return stuDao.findStuById(stu);
		
	}
	
	
	//
	public void setStuDao(StuDao stuDao) {
		this.stuDao = stuDao;
	}

	
   
}
