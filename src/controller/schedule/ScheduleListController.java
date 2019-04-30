package controller.schedule;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.Schedule;
import service.schedule.ScheduleService;
import service.schedule.ScheduleServiceImpl;

@WebServlet("/schedule/list")
public class ScheduleListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ScheduleService scheService = new ScheduleServiceImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

     
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	      //게시글목록 MODEL로 추가
		
			req.setCharacterEncoding("utf-8");

			
			List<Schedule> schedulelist = scheService.selectAll();
			req.setAttribute("schedulelist", schedulelist);
			
			System.out.println(schedulelist);
			
			
			//VIEW지정
			req.getRequestDispatcher("/fullcalendar/fullcalendar.jsp")
				.forward(req, resp);
			
	}
	
}









