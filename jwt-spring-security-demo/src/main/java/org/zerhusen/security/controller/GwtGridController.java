package org.zerhusen.security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.zerhusen.model.aml.grid.GridProperty;
import org.zerhusen.security.repository.grid.GridRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value="Aml Grid Settings", description="Aml Grid Settings")
@RequestMapping("protectedgrid")
public class GwtGridController {
	
	
	@Autowired
	private GridRepository gridRepository;

    /**
     * This is an example of some different kinds of granular restriction for endpoints. You can use the built-in SPEL expressions
     * in @PreAuthorize such as 'hasRole()' to determine if a user has access. Remember that the hasRole expression assumes a
     * 'ROLE_' prefix on all role names. So 'ADMIN' here is actually stored as 'ROLE_ADMIN' in database!
     **/
    @RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Aml Grid settings", response = String.class )
    @PreAuthorize("hasRole('ROLE_GRID')")
    public ResponseEntity<?> getProtectedGreeting() {
    	List<GridProperty> findAll = gridRepository.findAll();
    	 return ResponseEntity.ok(findAll);
    }

}