package com.example.demo;
import com.example.demo.Entity.Employee;
import com.example.demo.Entity.Person;
import com.example.demo.Repository.AddressRepository;
import com.example.demo.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	private PersonRepository personRepository;

	@Autowired
	private AddressRepository addressRepository;

	@Override
	public void run(String... args) throws Exception {
     Person person= new Person();
     person.setName("Shubham");

     Employee employee= new Employee();
        employee.setCity("Pune");
        employee.setState("Maharashtra");
        employee.setAddressLine("Near Temple");

        employee.setPerson(person);
     person.setEmployee(employee);

     addressRepository.save(employee);
     personRepository.save(person);

	}
}
