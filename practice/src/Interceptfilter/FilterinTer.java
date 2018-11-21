package Interceptfilter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
@WebFilter("/*")
public class FilterinTer implements Filter {

	@Override
	public void doFilter(ServletRequest reg, ServletResponse resp, FilterChain f)
			throws IOException, ServletException {
			reg.setCharacterEncoding("utf-8");
			resp.setCharacterEncoding("utf-8");
			f.doFilter(reg, resp);
	}

}
