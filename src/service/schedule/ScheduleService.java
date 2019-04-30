package service.schedule;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.Faq;
import dto.Report;
import dto.Schedule;

public interface ScheduleService {

	//��û�Ķ���� �����͸� ��üȭ�Ͽ� ��ȯ
	public Schedule getParam(HttpServletRequest req, HttpServletResponse resp);
	
	// faq ��ü ��ȸ
	public List<Schedule> selectAll();

	// faq �������� ����ȸ ��ȯ
	public Schedule selectScheByScheno(Schedule faqview);

	// faq ���� ��ȯ
	public int delectFaqByFaqno(Schedule faqdel);
	
	

	// �� �Խñ� �� ��ȯ
	public int selectCntFaq();

	// ���� ���
	public void Insert(Schedule scheinsert);

	// FAQ ����
	public void update(Schedule faqup);
	
	// FAQ ����
	public int delectScheByFaqdno(Schedule faqdel);

}
