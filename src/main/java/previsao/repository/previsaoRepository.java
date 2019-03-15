package previsao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import previsao.model.previsao;

public interface previsaoRepository extends JpaRepository<previsao, Long>{
}
