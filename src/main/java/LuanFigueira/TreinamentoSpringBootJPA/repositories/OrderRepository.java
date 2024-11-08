package LuanFigueira.TreinamentoSpringBootJPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import LuanFigueira.TreinamentoSpringBootJPA.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
