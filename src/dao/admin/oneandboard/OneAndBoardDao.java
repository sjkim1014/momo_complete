package dao.admin.oneandboard;

import java.util.List;

import dto.NoticeBoard;
import dto.OneAndBoard;
import dto.Users;
import util.Paging;

public interface OneAndBoardDao {

	//1��1 ��ü ��ȸ
	public List selectAll();


	//1��1 ����ȸ ��ȯ
	public OneAndBoard selectOneBoardByOneno(OneAndBoard oboardview);
	
	//�� �Խñ� �� ��ȯ
	public int selectCntOneBoard();
	
	//����¡ ó�� �Խñ� ��ȯ
	public List selectPaginglist(Paging paging);
		

	//�亯 ��� 
	public void oneAndBoardUpdate(OneAndBoard oboardUpdate);
	
	//1��1���� �˻�
	public List<OneAndBoard> search(String type, String word);
	
}


















