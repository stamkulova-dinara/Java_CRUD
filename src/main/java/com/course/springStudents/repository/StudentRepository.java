package com.course.springStudents.repository;

import com.course.springStudents.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

//Репозиторий в Spring Data JPA расширяет интерфейс JpaRepository,
// чтобы автоматически получить стандартные методы для работы с сущностями.
//расширяя(extends) JpaRepository, вы получаете доступ к встроенным CRUD-методам, таким как save(), findById(), findAll(),
// deleteById(), и count(). Эти методы предоставляются автоматически и позволяют легко работать с сущностя
public interface StudentRepository extends JpaRepository<Student, Long> {
//    можем добавить пользовательские методы в интерфейс репозитория,
//    и Spring Data JPA автоматически сгенерирует их реализацию на основе названия метода.
    void deleteByEmail(String email);
    Student findStudentByEmail(String email);
}
