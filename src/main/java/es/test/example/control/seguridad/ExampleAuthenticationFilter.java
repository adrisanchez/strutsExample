package es.test.example.control.seguridad;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.Authentication;
import org.springframework.security.AuthenticationException;
import org.springframework.security.providers.UsernamePasswordAuthenticationToken;
import org.springframework.security.ui.webapp.AuthenticationProcessingFilter;

public class ExampleAuthenticationFilter extends AuthenticationProcessingFilter{
	
	@Resource
	private ExampleAuthenticationProvider exampleAuthenticationProvider;
	
	@Override
	public Authentication attemptAuthentication(HttpServletRequest request)
			throws AuthenticationException {	
		
        //codigo pruebas
		UsernamePasswordAuthenticationToken authRequest = new UsernamePasswordAuthenticationToken(request.getParameter("j_username"),request.getParameter("j_password"));
		Object user = exampleAuthenticationProvider.authenticate(authRequest);		
		
		return (Authentication) user;
	}
	
	@Override
	protected void onSuccessfulAuthentication(HttpServletRequest request,
			HttpServletResponse response, Authentication authResult)
			throws IOException {
		super.onSuccessfulAuthentication(request, response, authResult);
		
		request.getSession().setAttribute("ROLE_ADMIN", authResult);
	}


}
