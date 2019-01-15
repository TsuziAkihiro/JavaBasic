/*
 * Student.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice12.common;

/**
 * 受講生の情報を格納します
 * @author Rhizome
 *
 */
public class Student {
	/** 受講生ID */
	private int studentId;

	/** 受講生氏名 */
	private String studentName;

	/** 会社名 */
	private String companyName;

	/** 教室名 */
	private String className;

	/** メールアドレス */
	private String Mail;

	/** パスワード */
	private String password;

	public int getStudentId() {
		return studentId;
	}
	public void SetStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void SetStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void SetCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getClassName() {
		return className;
	}
	public void SetClassName(String className) {
		this.className = className;
	}
	public String getMail() {
		return Mail;
	}
	public void SetMail(String Mail) {
		this.Mail = Mail;
	}
	public String getPassword() {
		return password;
	}
	public void SetPassword(String password) {
		this.password = password;
	}
}
