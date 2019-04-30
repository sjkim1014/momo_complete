package dao.schedule;

import java.util.List;

import dto.Faq;
import dto.Schedule;

public interface ScheduleDao {

	// faq ��ü ��ȸ
	public List<Schedule> selectAll();

	// faq �������� ����ȸ ��ȯ
	public Schedule selectScheByScheno(Schedule faqview);

	// faq ���� ��ȯ
	public int delectFaqByFaqno(Schedule faqdel);

	// �� �Խñ� �� ��ȯ
	public int selectCntFaq();

	// FAQ ���
	public void scheInsert(Schedule scheinsert);

	// FAQ ����
	public void update(Schedule faqup);
	
	// FAQ ����
	public int delectScheByFaqdno(Schedule faqdel);

}
