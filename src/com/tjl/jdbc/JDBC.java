package com.tjl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC {

	public static void main(String[] args) {
		// ��������
		try {
			Class.forName("com.mysql.jdbc.Driver");
//			System.out.println("�������سɹ�");
			// �������ݿ�
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data", "root", "123456");
//			System.out.println("���ӳɹ�");
			Statement st = con.createStatement();
			// ִ��sql��䣬�õ������
			ResultSet rs = st.executeQuery("select * from user");
			while (rs.next()) {
				System.out.print(rs.getString("academy") + " ");
				System.out.print(rs.getString("grade") + " ");
				System.out.print(rs.getString("date") + " ");
				System.out.print(rs.getString("name") + " ");
				System.out.print(rs.getString("phone") + " ");
				System.out.print(rs.getString("province") + " ");
				System.out.print(rs.getString("city") + " ");
				System.out.print(rs.getString("region") + " ");
				System.out.print(rs.getString("IsReturn") + " ");
				System.out.print(rs.getString("IsSuspect") + " ");
				System.out.println(rs.getString("IsInfect") + " ");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("��������ʧ��");
			System.out.println("����ʧ��");
		}

	}

}
