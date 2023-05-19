package pracitce.practice;

import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Student {
    @Value("${student.name}")
    private String name;
    @Value("${student.last_name}")
    private String lastName;
    @Value("${student.group}")
    private String group;

    @PreDestroy
    public void printInfo() {
        System.out.println("\nStudent{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", group='" + group + '\'' +
                '}');
    }
}
