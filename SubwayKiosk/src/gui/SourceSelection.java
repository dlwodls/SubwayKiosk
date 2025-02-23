package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SourceSelection extends JFrame {
    public SourceSelection() {
        setTitle("소스 선택");
        setBounds(600, 50, 500, 900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // 라벨 추가
        JLabel label = new JLabel("소스를  선택하세요");
        label.setFont(new Font("맑은 고딕", Font.BOLD, 15));
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(50, 50, 400, 50);
        add(label);

        // 버튼 패널을 감싸는 패널 (위치 조정용)
        JPanel wrapperPanel = new JPanel();
        wrapperPanel.setLayout(new BorderLayout());
        wrapperPanel.setBounds(50, 200, 400, 500);
        add(wrapperPanel);

        // 버튼 패널 (2열 3행)
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 3, 10, 10)); // 5행 3열, 버튼 간격 10px
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // 여백 추가

        String[] sources = {"랜치", "스위트어니언", "스위트칠리", "스모크바베큐", "마요네즈", "핫칠리", "허니머스타드", "머스타드", "홀스래디쉬", "사우스웨스트치폴레", "올리브오일", "레드와인식초", "소금", "후추"};

        // 빵 버튼 생성 및 추가
        for (String source : sources) {
            JButton source_btn = new JButton(source);
            source_btn.setPreferredSize(new Dimension(150, 150));
            source_btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int result = JOptionPane.showConfirmDialog(
                            SourceSelection.this, // 부모 컴포넌트 지정
                            source + "을(를) 선택하시겠습니까?", "확인", JOptionPane.YES_NO_OPTION);

                    if (result == JOptionPane.YES_OPTION) {
                        new AddTopping().setVisible(true);
                        dispose();
                    }
                }
            });

            buttonPanel.add(source_btn); // 버튼 패널에 추가
        }

        wrapperPanel.add(buttonPanel, BorderLayout.CENTER); // 버튼 패널을 감싸는 패널에 추가
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SourceSelection().setVisible(true));
    }
}
