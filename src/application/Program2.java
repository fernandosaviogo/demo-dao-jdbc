package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		Scanner sc = new Scanner(System.in);
					
		System.out.println("=== Test 1: Department findById ===");
		Department department = departmentDao.findById(3);
		System.out.println(department);
		
		System.out.println();
				
		System.out.println("=== Test 2: Department findAll ===");
		List<Department> list = departmentDao.findAll();
		for (Department d : list) {
			System.out.println(d);
		}
		
		System.out.println();
		
		System.out.println("=== Test 3: Department insert ===");
		Department newDepartment = new Department(null, "Music");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());
		
		System.out.println();
		
		System.out.println("=== Test 4: Department update ===");
		Department dep = departmentDao.findById(1);
		dep.setName("Food");
		departmentDao.update(dep);
		System.out.println("Update completed!!!");
		
		System.out.println();
		
		System.out.println("=== Test 6: Seller delete ===");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.print("Delete completed");
		
		sc.close();
	}

}


;