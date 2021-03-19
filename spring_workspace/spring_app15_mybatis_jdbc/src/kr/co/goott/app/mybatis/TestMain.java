package kr.co.goott.app.mybatis;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext context = 
				new GenericXmlApplicationContext("app.xml");
		
		DAO d = context.getBean("dao", DAO.class);
		
//		System.out.println("d :" + d );
		
		//��ü��ȸ
		List<DeptDTO> list = d.selectAll();
		for(DeptDTO dto : list) {
			System.out.println(dto.getDname());
		}
		System.out.println("-----------------------------------------");
	
		
		// ������ȸ
//		DeptDTO dto1 = d.selectOne(20);
//		System.out.println(dto1.getDeptno());
		
		System.out.println("-------------------------");
		
		//������ ����
//		DeptDTO dto2 = new DeptDTO(70, "QA", "���ǵ�" );
//		d.insertOne(dto2);
		
		System.out.println("------------------------");
		
		// �����ͼ���
//		DeptDTO dto3 = new DeptDTO();
//		dto3.setDname("HQ");
//		dto3.setLoc("�������ý���");
//		dto3.setDeptno(70);
//	
//		d.updateOne(dto3);
		
		System.out.println("----------------------------");
		
		//�����ͻ���
		//d.deleteOne(70);
		
	}
}
