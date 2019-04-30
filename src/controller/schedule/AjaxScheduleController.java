package controller.schedule;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.Schedule;
import service.schedule.ScheduleService;
import service.schedule.ScheduleServiceImpl;

@WebServlet("/ajax/schedule")
public class AjaxScheduleController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ScheduleService scheService = new ScheduleServiceImpl();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");

	    System.out.println(req.getParameter("title"));
		Schedule sche = new Schedule();
		
//		int no = Integer.parseInt(req.getParameter("calendar_no"));
		String title =(String) req.getParameter("title");
		String content =(String) req.getParameter("content");
		
		String start= (String) req.getParameter("start");
		String end= (String)req.getParameter("end");

//		System.out.println(no);
		System.out.println(title);
		System.out.println(content);
		System.out.println(start);
		System.out.println(end);
		
		sche.setS_title(title);
		sche.setS_content(content);
		sche.setS_start(start);
		sche.setS_end(end);
		
		scheService.Insert(sche);
		
		
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("/ajax/schedule [GET] ?èô?ûë");
		 
		doPost(req, resp);
		
	}
	
}












