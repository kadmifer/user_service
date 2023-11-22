package ru.kadmifer.user_service.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import ru.kadmifer.user_service.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findByLastName(String lastName);
    List<User> findAll();

}
