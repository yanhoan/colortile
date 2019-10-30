package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet implementation class cfFilter
 */
/*
@WebFilter("/WEB-INF/jsp/num.jsp")
*/
public class cfFilter implements Filter {

	@Override
	public void destroy() {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	//文字化け防止
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		//なんのファイル形式で返すか
	  	response.setContentType("text/html; charset=UTF-8");
		//文字エンコード
		request.setCharacterEncoding("UTF-8");

		/*--ここまで前処理--*/
		chain.doFilter(request, response);
		/*--ここから後処理--*/

	}

	@Override
	//使用していない
	public void init(FilterConfig arg0) throws ServletException {
		// TODO 自動生成されたメソッド・スタブ

	}


}
