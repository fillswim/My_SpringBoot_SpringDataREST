package com.fillswim.spring.springboot.my_springboot_springdatarest.DAO;


import com.fillswim.spring.springboot.my_springboot_springdatarest.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // Метод GET        http://localhost:8080/employees                     Получение всех работников
    // Метод GET        http://localhost:8080/employees{employeeID}         Получение одного работника
    // Метод POST       http://localhost:8080/employees                     Добавление работника
    // Метод PUT        http://localhost:8080/employees{employeeID}         Изменение работника
    // Метод DELETE     http://localhost:8080/employees{employeeID}         Удаление работника


}
