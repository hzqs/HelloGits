package stuSystem.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;

import stuSystem.entity.Stu;
import stuSystem.services.ClassService;
import stuSystem.services.StuService;

@Controller("stuAction")
@Scope("prototype")
public class StuAction {

	private int res;
	private Stu stu;
	private List clsList;
	
	@Resource(name = "stuService")
	private StuService stuService;
	
	@Resource(name = "clsService")
	private ClassService clsService;
	

	// 添加学生
	public String addStu() {
		if (stuService.addStu(stu)) {
			res = 1;
		} else {                     
			res = 2;
		}
		return "addStu";
	}

	// 查询出班级
	public String findTbClassList() {
		clsList = clsService.findClassList();
		return "findClass";
	}
    
	//查询出学生
	public String findStuList() {
		
		ActionContext.getContext().put("stulist",stuService.findStuList());
		
		return "findStu";
	}
	
	//删除学生
	public String deleteStu() {
		
		if(stuService.deleteStu(stu)) {
			res=1;
			
		}else {
			res=2;
		}
		
		return "deleteStu";
		
	}
	
	//根据Id查询出学生
	public String toupdateStu() {
		
		stu=stuService.findStuById(stu);
		
		return "toupdate";
	}
	
	//修改学生
	public String updateStu() {
		if(stuService.updateStu(stu)) {
			res=1;
			
		}else {
			res=2;
		}
		
		
		return "updateStu";
	}
	
	
	
	//
	public Stu getStu() {
		return stu;
	}

	public void setStu(Stu stu) {
		this.stu = stu;
	}

	public int getRes() {
		return res;
	}

	public void setRes(int res) {
		this.res = res;
	}

	public List getClsList() {
		return clsList;
	}

	public void setClsList(List clsList) {
		this.clsList = clsList;
	}

	public void setStuService(StuService stuService) {
		this.stuService = stuService;
	}

	public void setClsService(ClassService clsService) {
		this.clsService = clsService;
	}
}
