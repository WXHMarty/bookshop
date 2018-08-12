package com.dao;

import java.util.List;
import com.entity.User;

/**
 * �û�DAO��ӿ�
 */
public interface UserDao {
	
	//�����û�id��ѯ
	public User findById(int id) throws Exception;
	
	//�����û�����ѯ�û�
	public User findByUsername(String username) throws Exception;
	
	//��ѯȫ���û�
	public List<User> findAll() throws Exception;
	
	//���Ʋ�ѯ�û�
	public List<User> limitfindAll(int begin, int size) throws Exception;

	//�����û�
	public void save(User u) throws Exception;
	
	//�����û���Ϣ
	public void update(User u) throws Exception;
}
