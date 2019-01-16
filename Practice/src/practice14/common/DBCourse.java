package practice14.common;

public class DBCourse implements Course{

	public String getCourseName() {
	return "【Eラーニング】DB基礎";
	}
	public String[] getCourseUnit() {
		String[] getCourseUnit = {"DB基礎","SQL応用","正規化","SQL応用"};
		return getCourseUnit;
	}
}
