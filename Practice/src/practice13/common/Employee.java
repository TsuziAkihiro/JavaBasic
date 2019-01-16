package practice13.common;

public class Employee extends Person{

	private String departmentNm;
	private int departmentCnt;

//	部署名のアクセサ(取得、セット)
	public void setDepartmentNm(String departmentNm){
		this.departmentNm = departmentNm;
	}

	String getDepartmentNm() {
		return this.departmentNm;
	}

	public void setDepartmentCnt(int departmentCnt){
		this.departmentCnt = departmentCnt;
	}

	int getDepartmentCnt() {
		return this.departmentCnt;
	}
}
