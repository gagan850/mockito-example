package com.example.mockito.mockitoexample;

import org.springframework.stereotype.Service;

@Service
public class StudentService implements IStudentService {

	@Override
	public void format(Student student) {
		String[] arr = student.getUnformattedData().split(";");
		student.setAddress(arr[3]);
		student.setName(arr[0]);
		student.setStandard(arr[1]);
		student.setRollNumber(Integer.parseInt(arr[2]));
	}

}
