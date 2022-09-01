package br.com.pamela.userapi.repositories;

import br.com.pamela.userapi.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
