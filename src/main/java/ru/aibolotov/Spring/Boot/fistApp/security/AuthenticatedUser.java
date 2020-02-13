package ru.aibolotov.Spring.Boot.fistApp.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import ru.aibolotov.Spring.Boot.fistApp.model.Role;
import ru.aibolotov.Spring.Boot.fistApp.model.User;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Ramesh Fadatare
 *
 */
public class AuthenticatedUser extends org.springframework.security.core.userdetails.User
{


	private User user;
	
	public AuthenticatedUser(User user)
	{
		super(user.getName(), user.getPassword(), getAuthorities(user));
		this.user = user;
	}
	
	public User getUser()
	{
		return user;
	}
	
	private static Collection<? extends GrantedAuthority> getAuthorities(User user)
	{
		Set<String> roleAndPermissions = new HashSet<>();
		Set<Role> roles = user.getRoles();
		
		for (Role role : roles)
		{
			roleAndPermissions.add(role.getRole());
		}
		String[] roleNames = new String[roleAndPermissions.size()];
		return AuthorityUtils.createAuthorityList(roleAndPermissions.toArray(roleNames));
	}
}
