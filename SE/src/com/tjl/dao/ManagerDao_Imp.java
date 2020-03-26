package com.tjl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.tjl.bean.Manager;
import com.tjl.bean.User;
import com.tjl.jdbc.JDBCUtils;
import com.tjl.view.View;

public class ManagerDao_Imp implements ManagerDao {

	private static final String SQL_Manager_LOGIN = "select type from info where uname=? and upass=?";
	private static final String SQL_Manager_INSERT = "insert into user values(?,?,?,?,?,?,?,?,?,?,?)";
	private static final String SQL_Manager_DELETE = "delete from user where phone=?";
	private static final String SQL_Manager_SELECTACADEMY = "select * from user where academy = ?";
	private static final String SQL_Manager_SELECTCITY = "select * from USER where city = ?";
	private static final String SQL_Manager_SELECTIsReturn = "select * from USER where ISReturn=?";
	private static final String SQL_Manager_SELECTIsSuspect = "select * from USER where IsSuspect=?";

	@Override
//	����Ա��¼��ʵ��
	public int login(Manager manager) {
		Connection con = JDBCUtils.getConnection();
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			pst = con.prepareStatement(SQL_Manager_LOGIN);
			pst.setString(1, manager.getUname());
			pst.setString(2, manager.getUpass());
			rs = pst.executeQuery();
			while (rs.next()) {
				int type = rs.getInt("type");
				return type;
			}
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} finally {
			JDBCUtils.close(con, pst, rs);
		}
		return -1;
	}

//  ����Ա����û���Ϣ
	@Override
	public boolean insert(User user) {
		Connection con = JDBCUtils.getConnection();
		PreparedStatement pst = null;
		try {
			pst = con.prepareStatement(SQL_Manager_INSERT);
			pst.setString(1, user.getAcademy());
			pst.setString(2, user.getGrade());
			pst.setString(3, user.getDate());
			pst.setString(4, user.getName());
			pst.setString(5, user.getPhone());
			pst.setString(6, user.getProvince());
			pst.setString(7, user.getCity());
			pst.setString(8, user.getRegion());
			pst.setString(9, user.getIsReturn());
			pst.setString(10, user.getIsSuspect());
			pst.setString(11, user.getIsInfect());
			int line = pst.executeUpdate();
			if (line > 0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} finally {
			JDBCUtils.close(con, pst, null);
		}
		return false;
	}

	@Override
//	����Աɾ���û���Ϣ
	public boolean delete(String phone) {
		Connection con = JDBCUtils.getConnection();
		PreparedStatement pst = null;
		try {
			pst = con.prepareStatement(SQL_Manager_DELETE);
			pst.setString(1, phone);
			int line = pst.executeUpdate();
			if (line > 0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} finally {
			JDBCUtils.close(con, pst, null);
		}
		return false;
	}

//    ��ѯ�˵��и���ѧԺ���в�ѯ��ʵ��
	public User select(String academy) {
		Connection con = JDBCUtils.getConnection();
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			pst = con.prepareStatement(SQL_Manager_SELECTACADEMY);
			pst.setString(1, academy);
			rs = pst.executeQuery();
			System.out.println("ѧԺ  �꼶  �ϱ�����  ����  ��ϵ�绰  �Ƿ�������ط�У  �Ƿ�������֢״  �Ƿ��Ѿ�ȷ��");
			while (rs.next()) {
				academy = rs.getString("academy");
				String grade = rs.getString("grade");
				String date = rs.getString("date");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				String province = rs.getString("province");
				String city = rs.getString("city");
				String region = rs.getString("region");
				String IsReturn = rs.getString("IsReturn");
				String IsSuspect = rs.getString("IsSuspect");
				String IsInfect = rs.getString("IsInfect");
				System.out.println(academy + "," + grade + "," + date + "," + name + "," + phone + "," + province + ","
						+ city + "," + region + "," + IsReturn + "," + IsSuspect + "," + IsInfect);
			}
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} finally {
			JDBCUtils.close(con, pst, rs);
		}
		return null;
	}

	@Override
//	��ѯ�˵��и����û������н��в�ѯ��ʵ��
	public User selectCity(String city) {
		Connection con = JDBCUtils.getConnection();
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			pst = con.prepareStatement(SQL_Manager_SELECTCITY);
			pst.setString(1, city);
			rs = pst.executeQuery();
			System.out.println("ѧԺ  �꼶  �ϱ�����  ����  ��ϵ�绰  �Ƿ�������ط�У  �Ƿ�������֢״  �Ƿ��Ѿ�ȷ��");
			while (rs.next()) {
				String academy = rs.getString("academy");
				String grade = rs.getString("grade");
				String date = rs.getString("date");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				String province = rs.getString("province");
				city = rs.getString("city");
				String region = rs.getString("region");
				String IsReturn = rs.getString("IsReturn");
				String IsSuspect = rs.getString("IsSuspect");
				String IsInfect = rs.getString("IsInfect");

				System.out.println(academy + "," + grade + "," + date + "," + name + "," + phone + "," + province + ","
						+ city + "," + region + "," + IsReturn + "," + IsSuspect + "," + IsInfect);
			}
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} finally {
			JDBCUtils.close(con, pst, rs);
		}
		return null;
	}

	@Override
//	��ѯ�˵��и����û��Ƿ�У��ѯ��ʵ��
	public User selectIsReturn(String IsReturn) {
		Connection con = JDBCUtils.getConnection();
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			pst = con.prepareStatement(SQL_Manager_SELECTIsReturn);
			pst.setString(1, IsReturn);
			rs = pst.executeQuery();
			System.out.println("ѧԺ  �꼶  �ϱ�����  ����  ��ϵ�绰  �Ƿ�������ط�У  �Ƿ�������֢״  �Ƿ��Ѿ�ȷ��");
			while (rs.next()) {
				String academy = rs.getString("academy");
				String grade = rs.getString("grade");
				String date = rs.getString("date");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				String province = rs.getString("province");
				String city = rs.getString("city");
				String region = rs.getString("region");
				IsReturn = rs.getString("IsReturn");
				String IsSuspect = rs.getString("IsSuspect");
				String IsInfect = rs.getString("IsInfect");

				System.out.println(academy + "," + grade + "," + date + "," + name + "," + phone + "," + province + ","
						+ city + "," + region + "," + IsReturn + "," + IsSuspect + "," + IsInfect);
			}
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} finally {
			JDBCUtils.close(con, pst, rs);
		}
		return null;
	}

	@Override
//	��ѯ�˵��и����û��Ƿ�������֢״�Ĳ�ѯ��ʵ��
	public User selectIsSuspect(String IsSuspect) {
		Connection con = JDBCUtils.getConnection();
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			pst = con.prepareStatement(SQL_Manager_SELECTIsSuspect);
			pst.setString(1, IsSuspect);
			rs = pst.executeQuery();
			System.out.println("ѧԺ  �꼶  �ϱ�����  ����  ��ϵ�绰  �Ƿ�������ط�У  �Ƿ�������֢״  �Ƿ��Ѿ�ȷ��");
			while (rs.next()) {
				String academy = rs.getString("academy");
				String grade = rs.getString("grade");
				String date = rs.getString("date");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				String province = rs.getString("province");
				String city = rs.getString("city");
				String region = rs.getString("region");
				String IsReturn = rs.getString("IsReturn");
				IsSuspect = rs.getString("IsSuspect");
				String IsInfect = rs.getString("IsInfect");
				System.out.println(academy + "," + grade + "," + date + "," + name + "," + phone + "," + province + ","
						+ city + "," + region + "," + IsReturn + "," + IsSuspect + "," + IsInfect);
			}
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} finally {
			JDBCUtils.close(con, pst, rs);
		}
		return null;
	}
}