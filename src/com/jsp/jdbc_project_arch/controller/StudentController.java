package com.jsp.jdbc_project_arch.controller;

import java.util.Scanner;

import com.jsp.jdbc_project_arch.dto.Student;
import com.jsp.jdbc_project_arch.service.StudentService;

public class StudentController {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentService ss = new StudentService();

		System.out.println("Enter your choice:");
		System.out.println("1. Insert  |  2. Update  |  3. Delete  |  4. Display");
		int ch = sc.nextInt();

		switch (ch) {
		case 1: {
			System.out.print("How many students do you want to insert? ");
			int n = sc.nextInt();
			for(int i = 1; i <= n; i++) {
				System.out.print("Enter student id: ");
				int id = sc.nextInt();
				System.out.print("Enter student name: ");
				String name = sc.next();
				System.out.print("Enter student email: ");
				String email = sc.next();
				System.out.print("Enter student phone: ");
				long phone = sc.nextLong();

				Student st = new Student(id, name, email, phone);
				ss.studentInsertService(st);
			}
		}
			break;
		case 2: {
			System.out.println("Enter student id to update: ");
			int id = sc.nextInt();
			System.out.println("Enter student detail to update: ");
			System.out.println("1. Name  |  2. Email  |  3. Phone");
			int ch1 = sc.nextInt();

			switch (ch1) {
			case 1: {
				System.out.println("Enter new name: ");
				String name = sc.nextLine();
			}
			}
		}
			break;
		case 4:
			ss.studentDisplayService();
			break;
		}
		sc.close();
	}

}
