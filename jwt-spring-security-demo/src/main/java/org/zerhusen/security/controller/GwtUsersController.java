package org.zerhusen.security.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.zerhusen.model.aml.hib.*;
import org.zerhusen.security.repository.UserRepository;
import org.zerhusen.security.repository.hib.HibAuthorityRepository;
import org.zerhusen.security.repository.hib.HibUserAuthorityRepository;
import org.zerhusen.security.repository.hib.HibUsersRepository;
import org.zerhusen.security.repository.hib.dto.HibAuthorityDto;
import org.zerhusen.security.repository.hib.dto.HibUsersDto;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value="Aml Users and their Authorities", description="User and Authorities of all Users")
@RequestMapping("protectedusers")
public class GwtUsersController {

	@Autowired
	private HibUsersRepository hibuserRepository;

	@Autowired
	private HibAuthorityRepository hibAuthorityRepository;

	@Autowired
	private HibUserAuthorityRepository hibUserAuthorityRepository;

	/**
	 * This is an example of some different kinds of granular restriction for
	 * endpoints. You can use the built-in SPEL expressions in @PreAuthorize such as
	 * 'hasRole()' to determine if a user has access. Remember that the hasRole
	 * expression assumes a 'ROLE_' prefix on all role names. So 'ADMIN' here is
	 * actually stored as 'ROLE_ADMIN' in database!
	 **/
	@RequestMapping(method = RequestMethod.GET)
	  @ApiOperation(value = "Aml User Rules List(USERS/AUTHORITY/USER_AUTHORITY tables)", response = String.class )
	@PreAuthorize("hasRole('ROLE_USERS')")
	public ResponseEntity<?> getProtectedGreeting() {
		List<HibUser> allHibUsers = hibuserRepository.findAll();
		List<HibAuthority> allHibAuthorities = hibAuthorityRepository.findAll();
		List<HibUserAuthority> allHibUserAuthorities = hibUserAuthorityRepository.findAll();

		List<HibUsersDto> hibUsersDto = new ArrayList<HibUsersDto>();

		for (HibUser hibUser : allHibUsers) {
			HibUsersDto hibUserDto = new HibUsersDto();
			hibUserDto.setId(hibUser.getId());
			hibUserDto.setEmail(hibUser.getEmail());
			hibUserDto.setEnabled(hibUser.getEnabled());
			hibUserDto.setFirstname(hibUser.getFirstname());
			hibUserDto.setLastname(hibUser.getLastname());
			hibUserDto.setLastpasswordresetdate(hibUser.getLastpasswordresetdate());
			hibUserDto.setUsername(hibUser.getUsername());

			// Get All Authorities pf the User
			List<HibUserAuthority> allUserAuthorities = allHibUserAuthorities.stream()
					.filter(auth -> Long.compare(auth.getId().getUserId(), hibUser.getId()) == 0)
					.collect(Collectors.toList());
			List<HibAuthorityDto> hibAuthoritiesDto = new ArrayList<HibAuthorityDto>();

			// Find the relevant roles in allHibAuthorities
			for (HibUserAuthority hibAuthority : allUserAuthorities) {
				Long authorityId = hibAuthority.getId().getAuthorityId();
				List<HibAuthority> hibAuthorities = allHibAuthorities.stream()
						.filter(allAuths -> Long.compare(allAuths.getId(), hibAuthority.getId().getAuthorityId()) == 0)
						.collect(Collectors.toList());

				for (HibAuthority hibAuth : hibAuthorities) {
					HibAuthorityDto hibAuthDto = new HibAuthorityDto();
					hibAuthDto.setId(hibAuth.getId());
					hibAuthDto.setName(hibAuth.getName());
					hibAuthoritiesDto.add(hibAuthDto);
				}

				hibUserDto.setHibAuthorities(hibAuthoritiesDto);
			}
			hibUsersDto.add(hibUserDto);
		}

		return ResponseEntity.ok(hibUsersDto);
	}

}