package br.com.augustocorreia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.augustocorreia.domain.*;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

	
}
