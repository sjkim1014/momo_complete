package service.schedule;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.Faq;
import dto.Report;
import dto.Schedule;

public interface ScheduleService {

	//요청파라미터 데이터를 객체화하여 반환
	public Schedule getParam(HttpServletRequest req, HttpServletResponse resp);
	
	// faq 전체 조회
	public List<Schedule> selectAll();

	// faq 공지사항 상세조회 반환
	public Schedule selectScheByScheno(Schedule faqview);

	// faq 삭제 반환
	public int delectFaqByFaqno(Schedule faqdel);
	
	

	// 총 게시글 수 반환
	public int selectCntFaq();

	// 일정 등록
	public void Insert(Schedule scheinsert);

	// FAQ 수정
	public void update(Schedule faqup);
	
	// FAQ 삭제
	public int delectScheByFaqdno(Schedule faqdel);

}
