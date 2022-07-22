package io.spring.pma;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.spring.pma.dao.EmployeeRepository;
import io.spring.pma.dao.ProjectRepository;
import io.spring.pma.entity.Employee;

@SpringBootApplication
public class PmaApplication {

	@Autowired
	EmployeeRepository empRepo;
	@Autowired
	ProjectRepository projRepo;

	public static void main(String[] args) {
		SpringApplication.run(PmaApplication.class, args);
	}

	public void run(){
		Employee em1 = new Employee("hoge", "hoge", "hoge@hoge.com");

		empRepo.save(em1);
	}

}
