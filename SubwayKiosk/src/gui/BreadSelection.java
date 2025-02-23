package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BreadSelection extends JFrame {
    public BreadSelection() {
        setTitle("빵 선택");
        setBounds(600, 50, 500, 900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // 라벨 추가
        JLabel label = new JLabel("빵을 선택하세요");
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
        buttonPanel.setLayout(new GridLayout(3, 2, 10, 10)); // 3행 2열, 버튼 간격 10px
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // 여백 추가

        String[] breads = {"허니오트", "위트", "파마산 오레가노", "화이트", "하티", "플랫브레드"};

        // 빵 버튼 생성 및 추가
        for (String bread : breads) {
            JButton bread_btn = new JButton(bread);
            bread_btn.setPreferredSize(new Dimension(100, 100));
            bread_btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int result = JOptionPane.showConfirmDialog(
                            BreadSelection.this, // 부모 컴포넌트 지정
                            bread + "을(를) 선택하시겠습니까?", "확인", JOptionPane.YES_NO_OPTION);

                    if (result == JOptionPane.YES_OPTION) {
                        new CheeseSelection().setVisible(true);
                        dispose();
                    }
                }
            });

            buttonPanel.add(bread_btn); // 버튼 패널에 추가
        }

        wrapperPanel.add(buttonPanel, BorderLayout.CENTER); // 버튼 패널을 감싸는 패널에 추가
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new BreadSelection().setVisible(true));
    }
}
