package service.schedule;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.schedule.ScheduleDao;
import dao.schedule.ScheduleDaoImpl;
import dto.Schedule;

public class ScheduleServiceImpl implements ScheduleService {

	private ScheduleDao schedao = new ScheduleDaoImpl();
	
	
	@Override
	public Schedule getParam(HttpServletRequest req, HttpServletResponse resp) {
		
		//��û�Ķ���� ������ ������ DTO��ü
		Schedule sche = new Schedule();
		
		//��û�Ķ���� �ޱ�
		String s_no= req.getParameter("s_no");
		
		//null�̳� ""�� �ƴϸ� int�� ��ȯ�Ͽ� DTO�� ����
		if( s_no!= null && !"".equals(s_no) ) {
			sche.setS_no((Integer.parseInt(s_no)));
		}

		//��û�Ķ���Ͱ� ��ü�� ��ȯ�� DTO ��ȯ
		return sche;
	}

	@Override
	public List<Schedule> selectAll() {
		
		return schedao.selectAll();
	}

	@Override
	public Schedule selectScheByScheno(Schedule faqview) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delectFaqByFaqno(Schedule faqdel) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int selectCntFaq() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void Insert(Schedule scheinsert) {
		
		schedao.scheInsert(scheinsert);
	}

	@Override
	public void update(Schedule faqup) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int delectScheByFaqdno(Schedule faqdel) {
		// TODO Auto-generated method stub
		return 0;
	}


}
