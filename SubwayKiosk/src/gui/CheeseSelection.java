package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheeseSelection extends JFrame {
	public CheeseSelection() {
		setTitle("치즈 선택");
		setBounds(600, 50, 500, 900);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		// 라벨 추가
		JLabel label = new JLabel("치즈를 선택하세요");
		label.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setBounds(50, 50, 400, 50);
		add(label);
		
		// 버튼 패널을 감싸는 패널 (위치 조정용)
		JPanel wrapperPanel = new JPanel();
		wrapperPanel.setLayout(new BorderLayout());
		wrapperPanel.setBounds(50, 200, 400, 500);
		add(wrapperPanel);
		
		// 버튼 패널 (1열 3행)
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(3, 1, 20, 20));
		buttonPanel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));
		
		String[] cheeses = {"아메리칸치즈", "슈레드치즈", "모짜렐라치즈"};
		
		// 치즈 버튼 생성 및 추가
		for (String cheese : cheeses) {
			JButton cheese_btn = new JButton(cheese);
			cheese_btn.setPreferredSize(new Dimension(100, 100));
			cheese_btn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					int result = JOptionPane.showConfirmDialog(
							CheeseSelection.this,
							cheese + "을(를) 선택하시겠습니까?", "확인", JOptionPane.YES_NO_OPTION);
					
					if (result == JOptionPane.YES_OPTION) {
						new VegetableSelection().setVisible(true);
						dispose();
					}
				}
				
			});
			
			buttonPanel.add(cheese_btn);
		}
		
		wrapperPanel.add(buttonPanel, BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> new CheeseSelection().setVisible(true));
	}
}
