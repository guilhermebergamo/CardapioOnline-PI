package EngenhariaDeSoftware.Cardapio.Repository;

import EngenhariaDeSoftware.Cardapio.Entity.Cardapio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CardapioRepository extends JpaRepository<Cardapio, Long>
{

}
