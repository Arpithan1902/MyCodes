package com.cg.studentapp.dao;

import com.cg.studentapp.entities.StudentEntity;

public interface StudentDao {

	public abstract StudentEntity getStudentById(int id);

	public abstract void addStudent(StudentEntity student);

	// public abstract void removeStudent(StudentEntity student);

	public abstract void updateStudent(StudentEntity student);

	public abstract void commitTransaction();

	public abstract void beginTransaction();
}