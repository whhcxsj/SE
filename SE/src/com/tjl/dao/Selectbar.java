//package com.tjl.dao;
//
//import java.awt.Color;
//import java.awt.Font;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import javax.swing.JFrame;
////import org.jfree.chart.ChartFactory;
////import org.jfree.chart.ChartPanel;
////import org.jfree.chart.JFreeChart;
////import org.jfree.chart.axis.CategoryAxis;
////import org.jfree.chart.axis.NumberAxis;
////import org.jfree.chart.axis.NumberTickUnit;
////import org.jfree.chart.axis.ValueAxis;
////import org.jfree.chart.plot.CategoryPlot;
////import org.jfree.chart.plot.PlotOrientation;
////import org.jfree.data.category.DefaultCategoryDataset;
//
//import com.tjl.jdbc.JDBCUtils;
//
//public class Selectbar {
//	// ȷ������
//	public void Selectbar1() throws SQLException {
//		Connection con = JDBCUtils.getConnection();
//		PreparedStatement pst = null;
//		ResultSet rs = null;
//		try {
//			String sql = "select academy,date,count(phone) as total from user where IsInfect='��' group by academy,date";
//			pst = con.prepareStatement(sql);
//			rs = pst.executeQuery(sql);
//			// �������ݼ�
//			DefaultCategoryDataset dataset = new DefaultCategoryDataset();
//			while (rs.next()) {
//				dataset.setValue(rs.getInt("total"), rs.getString("academy"), rs.getString("date"));
//			}
//			// �����򵥵�����ͼ
//			JFreeChart freeChart = ChartFactory.createBarChart("ȷ����Ϣ", // ͼ�����
//					"ʱ��", "����", dataset, // Ҫ��ʾ��ͼ���ϵ�����
//					PlotOrientation.VERTICAL, true, // �Ƿ���ʾͼ��
//					false, // �Ƿ���ʾ��ʾ
//					false// �Ƿ�����URL����
//			);
//			SHOW(freeChart, 1500, 600);
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			JDBCUtils.close(con, pst, rs);
//		}
//	}
//
//	// �人��������
//	public void selectbar2() throws SQLException {
//		Connection con = JDBCUtils.getConnection();
//		PreparedStatement pst = null;
//		ResultSet rs = null;
//		try {
//			String sql = "select city,date,count(phone) as total from user where city='�人��' group by city,date";
//			pst = con.prepareStatement(sql);
//			rs = pst.executeQuery(sql);
//
//			rs = pst.executeQuery(sql);
//			// �������ݼ�
//			DefaultCategoryDataset dataset = new DefaultCategoryDataset();
//			while (rs.next()) {
//				dataset.addValue(rs.getInt("total"), rs.getString("city"), rs.getString("date")
//
//				);
//			}
//			// �����򵥵�����ͼ
//			JFreeChart freeChart = ChartFactory.createBarChart("�人��������ͳ��", // ͼ�����
//					"����", "����", dataset, // Ҫ��ʾ��ͼ���ϵ�����
//					PlotOrientation.VERTICAL, true, // �Ƿ���ʾͼ��
//					false, // �Ƿ���ʾ��ʾ
//					false// �Ƿ�����URL����
//			);
//			SHOW(freeChart, 1800, 800);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			JDBCUtils.close(con, pst, rs);
//		}
//	}
//
//	// ��״ͼ��ʾ����
//	public void SHOW(JFreeChart freeChart, int width, int height) {
//		// �������ʾ������һ��ͼ�����
//		ChartPanel chartPanel = new ChartPanel(freeChart);
//		// ���ô�С
//		chartPanel.setPreferredSize(new java.awt.Dimension(560, 400));
//		// ����һ������������ʾ���
//		JFrame frame = new JFrame("��״ͼ");
//		frame.setLocation(500, 400);
//		frame.setSize(width, height);
//		// ��ͼ���������Ϊ�����ڵ��������
//		frame.setContentPane(chartPanel);
//		// ��ʾ������
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setVisible(true);
//
//		// ����ͼ��
//		freeChart.getTitle().setFont(new Font("����", Font.ITALIC, 15));// ���ñ���
//		// ����ͼ���������
//		freeChart.getLegend().setItemFont(new Font("����", Font.BOLD, 15));
//		freeChart.setBackgroundPaint(Color.WHITE);
//		CategoryPlot categoryPlot = freeChart.getCategoryPlot();// ����������ʾ����
//		categoryPlot.setBackgroundPaint(Color.WHITE);
//		categoryPlot.setDomainGridlinePaint(Color.BLACK);// ����������������ɫ
//		categoryPlot.setDomainGridlinesVisible(true);
//		categoryPlot.setRangeGridlinePaint(Color.GREEN);// ����������������ɫ
//
//		CategoryAxis domainAxis = categoryPlot.getDomainAxis(); // ˮƽ�ײ��б�
//		domainAxis.setLabelFont(new Font("����", Font.BOLD, 14)); // ˮƽ�ײ�����
//		domainAxis.setTickLabelFont(new Font("����", Font.BOLD, 12)); // ��ֱ����
//		ValueAxis rangeAxis = categoryPlot.getRangeAxis();// ��ȡ��״
//		rangeAxis.setLabelFont(new Font("����", Font.BOLD, 15)); // ������״����
//
//		CategoryAxis axis = categoryPlot.getDomainAxis(); // x��
//		axis.setMaximumCategoryLabelLines(10); // ����������ÿ������ʾһ��
//		axis.setMaximumCategoryLabelWidthRatio(0.5f); // ÿ�������ȣ�����Ϊ1���ֵĿ��
//
//		NumberAxis axis1 = (NumberAxis) freeChart.getCategoryPlot().getRangeAxis();
//		axis1.setTickUnit(new NumberTickUnit(1D));// 1Ϊһ�������λ
//	}
//}
