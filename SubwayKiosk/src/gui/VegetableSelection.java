package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VegetableSelection extends JFrame {
	public VegetableSelection() {
		setTitle("야채 선택");
		setBounds(600, 50, 500, 900);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		// 라벨 추가
		JLabel label = new JLabel("제외할 야채를 선택하세요");
		label.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setBounds(50, 50, 400, 50);
		
		// 버튼 패널을 감싸는 패널 (위치 조정용)
		JPanel wrapperPanel = new JPanel();
        wrapperPanel.setLayout(new BorderLayout());
        wrapperPanel.setBounds(50, 200, 400, 500);
        add(wrapperPanel);

        // 버튼 패널 (2열 4행)
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 2, 10, 10)); // 4행 2열, 버튼 간격 10px
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // 여백 추가

        String[] vegetables = {"양상추", "토마토", "양파", "피망", "오이", "피클", "올리브", "할라피뇨"};

        // 빵 버튼 생성 및 추가
        for (String vegetable : vegetables) {
            JButton vegetable_btn = new JButton(vegetable);
            vegetable_btn.setPreferredSize(new Dimension(100, 100));
            vegetable_btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int result = JOptionPane.showConfirmDialog(
                            VegetableSelection.this, // 부모 컴포넌트 지정
                            vegetable + "을(를) 제외하시겠습니까?", "확인", JOptionPane.YES_NO_OPTION);

                    if (result == JOptionPane.YES_OPTION) {
                        new SourceSelection().setVisible(true);
                        dispose();
                    }
                }
            });

            buttonPanel.add(vegetable_btn); // 버튼 패널에 추가
        }

        wrapperPanel.add(buttonPanel, BorderLayout.CENTER); // 버튼 패널을 감싸는 패널에 추가
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new VegetableSelection().setVisible(true));
	}
}
