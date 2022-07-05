package rest.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rest.api.model.User;

public interface UserRepository extends JpaRepository<User, Long> {


}
