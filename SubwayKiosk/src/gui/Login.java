package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {
	public Login() {
		setTitle("subway 로그인");
		setBounds(600, 50, 500, 900);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// login 라벨
		JLabel login = new JLabel("로그인");
		login.setBounds(140, 230, 200, 100);
        login.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		login.setHorizontalAlignment(JLabel.CENTER);
		add(login);
		
		// id 라벨
		JLabel ids = new JLabel("아이디");
		ids.setBounds(50, 350, 100, 50);
		ids.setHorizontalAlignment(JLabel.LEFT);
		add(ids);
		
		// id 텍스트
		JTextField id = new JTextField();
		id.setBounds(100, 350, 350, 50);
		id.setHorizontalAlignment(JTextField.LEFT);
		add(id);
		
		// pw 라벨
		JLabel pws = new JLabel("비밀번호");
		pws.setBounds(45, 410, 100, 50);
		pws.setHorizontalAlignment(JLabel.LEFT);
		add(pws);
		
		// pw 텍스트
		JPasswordField pw = new JPasswordField();
		pw.setBounds(100, 410, 350, 50);
		pw.setHorizontalAlignment(JPasswordField.LEFT);
		add(pw);
		
		// login 버튼
		JButton click = new JButton("login");
		click.setBounds(60, 480, 180, 50);
		click.setHorizontalAlignment(JButton.CENTER);
		add(click);
		
		// join 버튼
		JButton join = new JButton("join");
		join.setBounds(260, 480, 180, 50);
		join.setHorizontalAlignment(JButton.CENTER);
		join.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Join().setVisible(true);
				dispose();
			}
		});
		add(join);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> new Login().setVisible(true));
	}
}
