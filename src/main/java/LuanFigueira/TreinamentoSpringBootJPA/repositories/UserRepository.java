package LuanFigueira.TreinamentoSpringBootJPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import LuanFigueira.TreinamentoSpringBootJPA.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
