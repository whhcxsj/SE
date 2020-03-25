package com.tjl.dao;

import com.tjl.bean.Manager;
import com.tjl.bean.User;

public interface ManagerDao {
//	��֤��¼
	int login(Manager manager);

//	�����û���Ϣ
	boolean insert(User user);

//	ɾ���û���Ϣ
	boolean delete(String phone);

//	��ѯ�û���Ϣ
//	����ѧԺ���в�ѯ
	User select(String academy);

//	 �����û������н��в�ѯ
	User selectCity(String city);

//	 �����û��Ƿ�У��ѯ
	User selectIsReturn(String IsReturn);

//	 �����û��Ƿ�������֢״��ѯ
	User selectIsSuspect(String IsSuspect);

}
