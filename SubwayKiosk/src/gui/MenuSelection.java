package gui;

//import database.JDBConnection;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.*;

public class MenuSelection extends JFrame {
	public MenuSelection() {
		setTitle("메뉴 주문");
		setBounds(600, 50, 500, 900);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// '메뉴선택' 라벨
		JLabel label = new JLabel("메뉴선택");
		label.setBounds(190, 0, 100, 80);
		label.setHorizontalAlignment(JLabel.CENTER);
		add(label);
		
		// (이전) 버튼
		JButton back = new JButton("뒤로");
		back.setBounds(0, 20, 60, 40);
		back.setHorizontalAlignment(JButton.CENTER);
		add(back);
		
		JPanel menu_panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		// menu 버튼
		String menu[] = {"menu1", "menu2"};
		for (int i = 0; i < menu.length; i++) {
			JButton menu_btn_15 = new JButton(menu[i] + " 15cm");
			JButton menu_btn_30 = new JButton(menu[i] + " 30cm");
			menu_btn_15.setBounds(0, 80*(i+1), 220, 80);
			menu_btn_30.setBounds(220, 80*(i+1), 220, 80);
			menu_btn_15.setHorizontalAlignment(JButton.CENTER);
			menu_btn_30.setHorizontalAlignment(JButton.CENTER);
			add(menu_btn_15);
			add(menu_btn_30);
		}
		
		add(menu_panel);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> new MenuSelection().setVisible(true));
	}
}
