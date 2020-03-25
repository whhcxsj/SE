package com.tjl.jdbc;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtils {
	private static String driver;
	private static String url;
	private static String username;
	private static String password;
	// ��̬����
	static {
		InputStream is = JDBCUtils.class.getClassLoader().getResourceAsStream("db.properties");
//		����Property���͵Ķ���
		Properties p = new Properties();
//		�������ļ�
		try {
			p.load(is);
			driver = p.getProperty("driver");
			url = p.getProperty("url");
			username = p.getProperty("username");
			password = p.getProperty("password");
			// ����Mysql����
			Class.forName(driver);
//			System.out.println("�������سɹ�");
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}

	}

//	������Ӷ���ķ���
	public static Connection getConnection() {
		try {
//			System.out.println("���ݿ����ӳɹ�");
			return DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
			System.out.println("���ݿ�����ʧ��");
		}
		return null;
	}

//	�ͷ���Դ�ķ���
	public static void close(Connection con, Statement st, ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
				rs = null;
			}
			if (st != null) {
				st.close();
				st = null;
			}
			if (con != null) {
				con.close();
				con = null;
			}
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
}
