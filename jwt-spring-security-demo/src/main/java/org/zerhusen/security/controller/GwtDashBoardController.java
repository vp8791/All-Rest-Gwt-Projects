package org.zerhusen.security.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value="Aml DashBoard Settings", description="Aml DashBoard Settings")
@RequestMapping("protecteddashboard")
public class GwtDashBoardController {

    /**
     * This is an example of some different kinds of granular restriction for endpoints. You can use the built-in SPEL expressions
     * in @PreAuthorize such as 'hasRole()' to determine if a user has access. Remember that the hasRole expression assumes a
     * 'ROLE_' prefix on all role names. So 'ADMIN' here is actually stored as 'ROLE_ADMIN' in database!
     **/
    @RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Aml Dashboard settings", response = String.class )
    @PreAuthorize("hasRole('ROLE_DASHBOARD')")
    public ResponseEntity<?> getProtectedGreeting() {
    	 return ResponseEntity.ok("Greetings from DashBoard!");
    }

}