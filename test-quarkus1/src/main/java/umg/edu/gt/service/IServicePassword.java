package umg.edu.gt.service;

import umg.edu.gt.dto.PasswordDto;
import umg.edu.gt.dto.PolicyDomainDto;

public interface IServicePassword {
	
	PasswordDto generatePassword(PolicyDomainDto policy);

}
