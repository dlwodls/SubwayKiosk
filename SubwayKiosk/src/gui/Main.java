package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
	public Main() {
		setTitle("subway");
		setBounds(600, 50, 500, 900);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// order 버튼
		JButton order = new JButton("주문하기");
		order.setLocation(80, 270);
		order.setSize(150, 150);
		order.setHorizontalAlignment(JButton.CENTER);
		order.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new MenuSelection().setVisible(true);
				dispose();
			}
		});
		add(order);
	
		// shoplist 버튼
		JButton shoplist = new JButton("장바구니");
		shoplist.setLocation(250, 270);
		shoplist.setSize(150, 150);
		shoplist.setHorizontalAlignment(JButton.CENTER);
		add(shoplist);
	
		// etc 버튼
		JButton etc = new JButton("더보기");
		etc.setLocation(80, 450);
		etc.setSize(150, 150);
		etc.setHorizontalAlignment(JButton.CENTER);
		add(etc);
		
		// mysub 버튼
		JButton mysub = new JButton("MY-SUB");
		mysub.setLocation(250, 450);
		mysub.setSize(150, 150);
		mysub.setHorizontalAlignment(JButton.CENTER);
		add(mysub);
	}
	
	public static void main(String[] args) {		
		SwingUtilities.invokeLater(() -> new Main().setVisible(true));
	}
}
