package dao.schedule;

import java.util.List;

import dto.Faq;
import dto.Schedule;

public interface ScheduleDao {

	// faq 전체 조회
	public List<Schedule> selectAll();

	// faq 공지사항 상세조회 반환
	public Schedule selectScheByScheno(Schedule faqview);

	// faq 삭제 반환
	public int delectFaqByFaqno(Schedule faqdel);

	// 총 게시글 수 반환
	public int selectCntFaq();

	// FAQ 등록
	public void scheInsert(Schedule scheinsert);

	// FAQ 수정
	public void update(Schedule faqup);
	
	// FAQ 삭제
	public int delectScheByFaqdno(Schedule faqdel);

}
