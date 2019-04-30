package controller.admin.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.Board;
import service.admin.board.BoardService;
import service.admin.board.BoardServiceImpl;

@WebServlet("/admin/board/view")
public class BoardViewController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private BoardService boardService = new BoardServiceImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//��û�Ķ���� -> MODEL
		Board board = boardService.getParam(req, resp);
		
		//�Խñ� ��ȸ����
		Board boardview = boardService.view(board);
		
		//MODEL ����
		req.setAttribute("boardview", boardview);
		
		//VIEW����
		req.getRequestDispatcher("/view/admin/board/view.jsp")
			.forward(req, resp);
		
	}
	
}







