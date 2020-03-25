package com.tjl.view;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.tjl.bean.Manager;
import com.tjl.bean.User;

public class View {

	private static Scanner input = new Scanner(System.in);

//	��ҳ��ͼ
	public static Manager indexView() {
		System.out.println("********************************************************");
		System.out.println("********\t����ʦ����ѧ�������ϵͳ\t\t********");
		System.out.println("********\t�������ʾ���в���\t\t\t********");
		System.out.println("********\t�������˺�\t\t\t********");
		String uname = input.nextLine();
		System.out.println("********\t����������\t\t\t********");
		String upass = input.nextLine();
		System.out.println("********************************************************");
		return new Manager(uname, upass);
	}

//  ����Ա�˵���ͼ
	public static int managerMenuView() {
		System.out.println("********************************************************");
		System.out.println("********\t��ӭ����ϵͳ\t\t\t********");
		System.out.println("********\t�������ʾ���в���\t\t\t********");
		System.out.println("********\t0.�˳�\t\t\t\t********");
		System.out.println("********\t1.�����Ϣ\t\t\t********");
		System.out.println("********\t2.ɾ����Ϣ\t\t\t********");
		System.out.println("********\t3.��ѯĳ����ĳһ����������\t********");
		System.out.println("********\t4.�鿴�������ݵ���״ͼ\t\t********");
		String type = input.nextLine();
		int item = Integer.parseInt(type);
		if (item < 0 || item > 4) {
			System.out.println("�����������������");
			return managerMenuView();
		}
		System.out.println("********************************************************");
		return item;
	}

//  �����û���Ϣ��ͼ

	public static User addMenuView() {
		System.out.println("********************************************************");
		System.out.println("********\t�������ʾ���в���\t\t\t********");
		System.out.println("********\t������ѧԺ\t\t\t********");
		String academy = input.nextLine();
		System.out.println("********\t������༶\t\t\t********");
		String grade = input.nextLine();
		System.out.println("********\t�������ϱ�����\t\t\t********");
		String date = input.nextLine();
		System.out.println("********\t����������\t\t\t********");
		String name = input.nextLine();
		System.out.println("********\t��������ϵ�绰\t\t\t********");
		String phone = input.nextLine();
		System.out.println("********\t����������ʡ\t\t\t********");
		String province = input.nextLine();
		System.out.println("********\t������������\t\t\t********");
		String city = input.nextLine();
		System.out.println("********\t������������\t\t\t********");
		String region = input.nextLine();
		System.out.println("********\t�������Ƿ�У\t\t\t********");
		String IsReturn = input.nextLine();
		System.out.println("********\t�������Ƿ�������֢״\t\t********");
		String IsSuspect = input.nextLine();
		System.out.println("********\t�������Ƿ�ȷ��\t\t\t********");
		String IsInfect = input.nextLine();
		System.out.println("********************************************************");
		return new User(academy, grade, date, name, phone, province, city, region, IsReturn, IsSuspect, IsInfect);
	}
//  ɾ��ѧ����Ϣ��ͼ

	public static String deleteMenuView() {
		System.out.println("********************************************************");
		System.out.println("********\t�������ʾ���в���\t\t\t********");
		System.out.println("********\t������Ҫɾ���绰����\t\t\t********");
		String phone = input.nextLine();
		System.out.println("********************************************************");
		return phone;
	}

//  ��ѯѧ����Ϣ��ͼ

	public static int selectMenuView() {
		System.out.println("********************************************************");
		System.out.println("********\t�������ʾ���в���\t\t\t********");
		System.out.println("********\t0.�˳�\t\t\t********");
		System.out.println("********\t1.����ѧԺ���в�ѯ\t\t\t********");
		System.out.println("********\t2.�������ڵز�ѯ\t\t\t********");
		System.out.println("********\t3.�����Ƿ�������֢״��ѯ\t\t\t********");
		System.out.println("********\t4.�����Ƿ�У��ѯ\t\t\t********");
		String a = input.nextLine();
		int a1 = Integer.parseInt(a);
		if (a1 < 0 || a1 > 4) {
			System.out.println("�����������������");
			return selectMenuView();
		}
		System.out.println("********************************************************");
		return a1;
	}

//	����ѧԺ��ѯ
	public static String select() {
		System.out.println("********************************************************");
		System.out.println("********\t�������ʾ���в���\t\t\t********");
		System.out.println("********\t������Ҫ��ѯ��ѧԺ\t\t\t********");
		String academy = input.nextLine();
		System.out.println("********************************************************");
		return academy;
	}

////	���������в�ѯ
	public static String selectCity() {
		System.out.println("********************************************************");
		System.out.println("********\t�������ʾ���в���\t\t\t********");
		System.out.println("********\t������Ҫ��ѯ����\t\t\t********");
		String city = input.nextLine();
		System.out.println("********************************************************");
		return city;
	}

////	�����Ƿ�У��ѯ
	public static String selectIsReturn() {
		System.out.println("********************************************************");
		System.out.println("********\t�������ʾ���в���\t\t\t********");
		System.out.println("********\t�������Ƿ�������֢״\t\t\t********");
		String IsReturn = input.nextLine();
		System.out.println("********************************************************");
		return IsReturn;
	}

//	�����Ƿ�������֢״��ѯ
	public static String selectIsSuspect() {
		System.out.println("********************************************************");
		System.out.println("********\t�������ʾ���в���\t\t\t********");
		System.out.println("********\t�������Ƿ�У\t\t\t********");
		String IsSuspect = input.nextLine();
		System.out.println("********************************************************");
		return IsSuspect;
	}

//�鿴��״ͼ
	public static int barMenuView() {
		System.out.println("********************************************************");
		System.out.println("********\t�������ʾ���в���\t\t\t********");
		System.out.println("********\t0.�˳�\t\t\t\t********");
		System.out.println("********\t1.�鿴ȷ֢��Ա����״ͼ\t\t********");
		System.out.println("********\t2.�鿴�人��������Ա\t\t********");
		String b = input.nextLine();
		int b1 = Integer.parseInt(b);
		if (b1 < 0 || b1 > 2) {
			System.out.println("�����������������");
			return barMenuView();
		}
		System.out.println("********************************************************");
		return b1;
	}

}
