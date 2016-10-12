package es.test.example.control.seguridad;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.security.Authentication;
import org.springframework.security.AuthenticationException;
import org.springframework.security.BadCredentialsException;
import org.springframework.security.GrantedAuthority;
import org.springframework.security.GrantedAuthorityImpl;
import org.springframework.security.providers.AuthenticationProvider;
import org.springframework.security.providers.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Component;

import es.test.example.commons.utils.Utils;

@Component
public class ExampleAuthenticationProvider implements AuthenticationProvider{

	// Logger
	private static String className = ExampleAuthenticationProvider.class.getName();
	private static Logger logger = Logger.getLogger(className);

	@Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		
		GrantedAuthority[] authoritiesa = null;
        authoritiesa = new GrantedAuthority[] {new GrantedAuthorityImpl("ROLE_ADMIN")};

        return new UsernamePasswordAuthenticationToken(authentication, null, authoritiesa);        
    }
	
	@Override
	public boolean supports(Class arg0) {
		// TODO Auto-generated method stub
		return true;
	}

}
