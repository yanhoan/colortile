

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Animation
 */
@WebServlet("/Animation")
public class Animation extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Animation() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//リクエストする文字コードを変換
		request.setCharacterEncoding("UTF-8");
		//結果オブジェクトを生成
		TestAnim anim = new TestAnim();
		//結果オブジェクトをスコープに保存
		request.setAttribute("anim", anim);

		//リクエスト内容を別のjspに送る(準備)
		RequestDispatcher dispatch = request.getRequestDispatcher("/WEB-INF/jsp/inline.html");
		//フォワード先に返す
		dispatch.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
