
package dao;

import controller.Domain.domain;
import org.springframework.data.repository.CrudRepository;

public interface estadoDao extends CrudRepository<domain, Long>{
    
}