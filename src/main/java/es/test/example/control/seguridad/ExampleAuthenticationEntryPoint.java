package es.test.example.control.seguridad;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.AuthenticationException;
import org.springframework.security.ui.webapp.AuthenticationProcessingFilterEntryPoint;

public class ExampleAuthenticationEntryPoint extends AuthenticationProcessingFilterEntryPoint{
	
	private boolean forceHttps = false;
    private boolean serverSideRedirect = false;

	    //~ Methods ================================================================
    	@Override
	    public void commence(ServletRequest request, ServletResponse response, AuthenticationException authException)
	        throws IOException, ServletException {
	    	
	    	// codigo pruebas
	    	
	        HttpServletRequest httpRequest = (HttpServletRequest) request;
	        HttpServletResponse httpResponse = (HttpServletResponse) response;
	        

	        String redirectUrl = null;

	        if (serverSideRedirect) {
	            if (forceHttps && "http".equals(request.getScheme())) {
	                redirectUrl = buildHttpsRedirectUrlForRequest(httpRequest);
	            }

	            if (redirectUrl == null) {
	                String loginForm = determineUrlToUseForThisRequest(httpRequest, httpResponse, authException);

	                RequestDispatcher dispatcher = httpRequest.getRequestDispatcher(loginForm);
	                dispatcher.forward(request, response);

	                return;
	            }
	        } else {
	            // redirect to login page. Use https if forceHttps true
	            redirectUrl = buildRedirectUrlToLoginPage(httpRequest, httpResponse, authException);
	        }
	        httpResponse.sendRedirect(httpResponse.encodeRedirectURL(redirectUrl));
	        	        
	    }

}
