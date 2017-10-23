package stuSystem.web;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import stuSystem.entity.TbClass;
import stuSystem.services.ClassService;

@Controller("clsAction")
@Scope("prototype")
public class ClassAction {

	private TbClass cls;
	@Resource(name="clsService")
	private ClassService clsService;
	private int res;
	//添加班级
	public String addClass() {
		
		if(clsService.addClass(cls)) {
		   res=1;	
		}else {
			res=2;
		}
		
		return "addClass";
	}

	//根据Id查询出班级
	
	public String toUpdate() {
		cls=clsService.findClassById(cls);
		return "toUpdate";
	}
	
	
	//修改班级
	public String updateClass() {
		if(clsService.updateClass(cls)) {
			res=1;
			
		}else {
			res=2;
		}
		
		return "updateClass";
		
	}
	
	//删除班级
	public String  deleteClass() {
		if(clsService.deleteClass(cls)) {
			res=1;
		}else {
			res=2;
		}
		
		return "deleteClass";
	}
	
	
	public void setClsService(ClassService clsService) {
		this.clsService = clsService;
	}

	public TbClass getCls() {
		return cls;
	}

	public void setCls(TbClass cls) {
		this.cls = cls;
	}

	public int getRes() {
		return res;
	}

	public void setRes(int res) {
		this.res = res;
	}
	

	
	
}
