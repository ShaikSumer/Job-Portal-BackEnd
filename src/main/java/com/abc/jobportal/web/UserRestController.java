package com.abc.jobportal.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.jobportal.dto.loginDTO;
import com.abc.jobportal.dto.loginResponseDTO;
import com.abc.jobportal.exceptions.InvalidUserException;
import com.abc.jobportal.exceptions.WrongUserOrPasswordException;
import com.abc.jobportal.service.UserService;
import com.abc.jobportal.validate.ValidateEntry;


@RestController
@RequestMapping("/home")
public class UserRestController {
	@Autowired
	UserService userService;
	
	@PostMapping("/user/login")
	public loginResponseDTO doLogin(@RequestBody loginDTO loginObj,HttpServletRequest req) throws InvalidUserException,WrongUserOrPasswordException{
		String username = loginObj.getUsername();
		String password = loginObj.getPassword();
		if(ValidateEntry.validateNullEntry(username)&&ValidateEntry.validateNullEntry(password)) {
			
			String role =  userService.login(username, password);
			
				if(role.equalsIgnoreCase("User"))
				{
				
					// generate new session 
					HttpSession session = req.getSession(true);
					
					session.setAttribute("role", role);
					session.setAttribute("username",username);
					session.setAttribute("password",password);
					loginResponseDTO loginResponse = new loginResponseDTO(username,password,role,true);
					return loginResponse;
					
				
				
				}
				else
				{
			
				throw new InvalidUserException("","");
				}
			
			  }
			else
			{
			
			throw new InvalidUserException("","");
			}
			
			
		}
	@GetMapping("/user/logout")
	public boolean doLogout(HttpServletRequest req)
	{
		HttpSession session = req.getSession(false);
		String role = (String)session.getAttribute("role");
		if(role.equalsIgnoreCase("User"))
		{
			session.invalidate(); // to logout
			return true;
		}
		else return false;
	}
	}

	
	


