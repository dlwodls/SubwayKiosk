package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Join extends JFrame {
	public Join() {
		setTitle("회원가입");
        setBounds(600, 50, 500, 900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        // join 라벨
        JLabel join = new JLabel("회원가입");
        join.setBounds(140, 200, 200, 80);
        join.setFont(new Font("맑은 고딕", Font.BOLD, 18));
        join.setHorizontalAlignment(JLabel.CENTER);
        add(join);
        
        // id 라벨
        JLabel ids = new JLabel("아이디");
        ids.setBounds(80, 280, 100, 30);
        ids.setHorizontalAlignment(JLabel.LEFT);
        add(ids);
        
        // id 텍스트
        JTextField id = new JTextField();
        id.setBounds(80, 310, 300, 40);
        id.setHorizontalAlignment(JTextField.LEFT);
        add(id);
        
        // repeat 버튼
        JButton repeat = new JButton("중복확인");
        repeat.setBounds(290, 355, 90, 30);
        repeat.setHorizontalAlignment(JButton.CENTER);
        add(repeat);
        
        // pw 라벨
        JLabel pws = new JLabel("비밀번호");
        pws.setBounds(80, 395, 100, 30);
        pws.setHorizontalAlignment(JLabel.LEFT);
        add(pws);
        
        // pw 텍스트
        JTextField pw = new JTextField();
        pw.setBounds(80, 425, 300, 40);
        pw.setHorizontalAlignment(JTextField.LEFT);
        add(pw);
        
        // check 버튼
        JButton check = new JButton("확인");
        check.setBounds(135, 485, 80, 30);
        check.setHorizontalAlignment(JButton.CENTER);
        add(check);
        
        // cancel 버튼
        JButton cancel = new JButton("취소");
        cancel.setBounds(220, 485, 80, 30);
        cancel.setHorizontalAlignment(JButton.CENTER);
        add(cancel);
        
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> new Join().setVisible(true)); 
	}
}
