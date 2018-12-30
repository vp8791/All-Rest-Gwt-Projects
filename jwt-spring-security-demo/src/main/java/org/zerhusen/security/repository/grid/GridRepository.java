package org.zerhusen.security.repository.grid;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerhusen.model.aml.grid.GridProperty;


/**
 * Created by stephan on 20.03.16.
 */
public interface GridRepository extends JpaRepository<GridProperty, String> {

}
