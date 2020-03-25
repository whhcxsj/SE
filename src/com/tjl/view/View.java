package com.tjl.view;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.tjl.bean.Manager;
import com.tjl.bean.User;

public class View {

	private static Scanner input = new Scanner(System.in);

//	首页视图
	public static Manager indexView() {
		System.out.println("********************************************************");
		System.out.println("********\t西北师范大学疫情管理系统\t\t********");
		System.out.println("********\t请根据提示进行操作\t\t\t********");
		System.out.println("********\t请输入账号\t\t\t********");
		String uname = input.nextLine();
		System.out.println("********\t请输入密码\t\t\t********");
		String upass = input.nextLine();
		System.out.println("********************************************************");
		return new Manager(uname, upass);
	}

//  管理员菜单视图
	public static int managerMenuView() {
		System.out.println("********************************************************");
		System.out.println("********\t欢迎进入系统\t\t\t********");
		System.out.println("********\t请根据提示进行操作\t\t\t********");
		System.out.println("********\t0.退出\t\t\t\t********");
		System.out.println("********\t1.添加信息\t\t\t********");
		System.out.println("********\t2.删除信息\t\t\t********");
		System.out.println("********\t3.查询某人在某一天的疫情情况\t********");
		System.out.println("********\t4.查看各种数据的柱状图\t\t********");
		String type = input.nextLine();
		int item = Integer.parseInt(type);
		if (item < 0 || item > 4) {
			System.out.println("输入错误，请重新输入");
			return managerMenuView();
		}
		System.out.println("********************************************************");
		return item;
	}

//  增加用户信息视图

	public static User addMenuView() {
		System.out.println("********************************************************");
		System.out.println("********\t请根据提示进行操作\t\t\t********");
		System.out.println("********\t请输入学院\t\t\t********");
		String academy = input.nextLine();
		System.out.println("********\t请输入班级\t\t\t********");
		String grade = input.nextLine();
		System.out.println("********\t请输入上报日期\t\t\t********");
		String date = input.nextLine();
		System.out.println("********\t请输入姓名\t\t\t********");
		String name = input.nextLine();
		System.out.println("********\t请输入联系电话\t\t\t********");
		String phone = input.nextLine();
		System.out.println("********\t请输入所在省\t\t\t********");
		String province = input.nextLine();
		System.out.println("********\t请输入所在市\t\t\t********");
		String city = input.nextLine();
		System.out.println("********\t请输入所在区\t\t\t********");
		String region = input.nextLine();
		System.out.println("********\t请输入是否返校\t\t\t********");
		String IsReturn = input.nextLine();
		System.out.println("********\t请输入是否有疑似症状\t\t********");
		String IsSuspect = input.nextLine();
		System.out.println("********\t请输入是否确诊\t\t\t********");
		String IsInfect = input.nextLine();
		System.out.println("********************************************************");
		return new User(academy, grade, date, name, phone, province, city, region, IsReturn, IsSuspect, IsInfect);
	}
//  删除学生信息视图

	public static String deleteMenuView() {
		System.out.println("********************************************************");
		System.out.println("********\t请根据提示进行操作\t\t\t********");
		System.out.println("********\t请输入要删除电话号码\t\t\t********");
		String phone = input.nextLine();
		System.out.println("********************************************************");
		return phone;
	}

//  查询学生信息视图

	public static int selectMenuView() {
		System.out.println("********************************************************");
		System.out.println("********\t请根据提示进行操作\t\t\t********");
		System.out.println("********\t0.退出\t\t\t********");
		System.out.println("********\t1.按照学院进行查询\t\t\t********");
		System.out.println("********\t2.按照所在地查询\t\t\t********");
		System.out.println("********\t3.按照是否有疑似症状查询\t\t\t********");
		System.out.println("********\t4.按照是否返校查询\t\t\t********");
		String a = input.nextLine();
		int a1 = Integer.parseInt(a);
		if (a1 < 0 || a1 > 4) {
			System.out.println("输入错误，请重新输入");
			return selectMenuView();
		}
		System.out.println("********************************************************");
		return a1;
	}

//	根据学院查询
	public static String select() {
		System.out.println("********************************************************");
		System.out.println("********\t请根据提示进行操作\t\t\t********");
		System.out.println("********\t请输入要查询的学院\t\t\t********");
		String academy = input.nextLine();
		System.out.println("********************************************************");
		return academy;
	}

////	根据所在市查询
	public static String selectCity() {
		System.out.println("********************************************************");
		System.out.println("********\t请根据提示进行操作\t\t\t********");
		System.out.println("********\t请输入要查询的市\t\t\t********");
		String city = input.nextLine();
		System.out.println("********************************************************");
		return city;
	}

////	根据是否返校查询
	public static String selectIsReturn() {
		System.out.println("********************************************************");
		System.out.println("********\t请根据提示进行操作\t\t\t********");
		System.out.println("********\t请输入是否有疑似症状\t\t\t********");
		String IsReturn = input.nextLine();
		System.out.println("********************************************************");
		return IsReturn;
	}

//	根据是否有疑似症状查询
	public static String selectIsSuspect() {
		System.out.println("********************************************************");
		System.out.println("********\t请根据提示进行操作\t\t\t********");
		System.out.println("********\t请输入是否返校\t\t\t********");
		String IsSuspect = input.nextLine();
		System.out.println("********************************************************");
		return IsSuspect;
	}

//查看柱状图
	public static int barMenuView() {
		System.out.println("********************************************************");
		System.out.println("********\t请根据提示进行操作\t\t\t********");
		System.out.println("********\t0.退出\t\t\t\t********");
		System.out.println("********\t1.查看确症人员的柱状图\t\t********");
		System.out.println("********\t2.查看武汉地区的人员\t\t********");
		String b = input.nextLine();
		int b1 = Integer.parseInt(b);
		if (b1 < 0 || b1 > 2) {
			System.out.println("输入错误，请重新输入");
			return barMenuView();
		}
		System.out.println("********************************************************");
		return b1;
	}

}
