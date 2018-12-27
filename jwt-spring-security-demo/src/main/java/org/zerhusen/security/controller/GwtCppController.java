package org.zerhusen.security.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.zerhusen.pojos.Cpp;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("protectedcpp")
public class GwtCppController {

    /**
     * This is an example of some different kinds of granular restriction for endpoints. You can use the built-in SPEL expressions
     * in @PreAuthorize such as 'hasRole()' to determine if a user has access. Remember that the hasRole expression assumes a
     * 'ROLE_' prefix on all role names. So 'ADMIN' here is actually stored as 'ROLE_ADMIN' in database!
     **/
    @RequestMapping(method = RequestMethod.GET)
    @PreAuthorize("hasRole('ROLE_CPP')")
    public ResponseEntity<?> getProtectedGreeting() {
    	Cpp cpp = new Cpp();

 	
    	 return ResponseEntity.ok("Hellp from Cpp");
    }

}