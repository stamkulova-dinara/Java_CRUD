package com.course.springStudents.service.impl;

import com.course.springStudents.model.Student;
import com.course.springStudents.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//аннотация бины; @Component, @Service, @Repository и @Controller
@Service //класс как компонент уровня сервиса, содержащий бизнес-логику. Это специализированный вариант
// @Component, который помогает структурировать приложение, разделяя слои, и позволяет Spring
// автоматически регистрировать такие классы как бины для инъекции зависимостей.
@AllArgsConstructor
@Primary
public class StudentServiceImple implements com.course.springStudents.service.StudentService {
    private final StudentRepository repository;
    @Override
    public List<Student> findAllStudent() {
        return repository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public Student findByEmail(String email) {
        return repository.findStudentByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.save(student);
    }

    @Override
    @Transactional
    public void deleteStudent(String email) {
        repository.deleteByEmail(email);
    }
}

