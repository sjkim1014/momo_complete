package controller.admin.banners;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.Banners;
import service.admin.banners.BannersService;
import service.admin.banners.BannersServiceImpl;
import util.Paging;

@WebServlet("/banners/mainlist")
public class BannersMainImageController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private BannersService banService = new BannersServiceImpl();
		
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//	
		//�Խñ۸�� MODEL�� �߰�
		List<Banners> bannerslist =  banService.getList();
		req.setAttribute("bannerslist", bannerslist);
		System.out.println(bannerslist);
		
		
		//VIEW����
		req.getRequestDispatcher("/view/mainBanner.jsp")
			.forward(req, resp);
		
	}
	
}









