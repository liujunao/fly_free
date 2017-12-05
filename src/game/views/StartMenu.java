package game.views;

import game.model.Resources;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 游戏开始的主界面
 *
 * @author lenovo
 * @date 2017/11/23
 */
public class StartMenu extends JFrame {

    Dimension frameSize = new Dimension(1000, 600);
    ImageIcon imageIcon = new ImageIcon(Resources.startGame);

    public StartMenu() {
        // 设置窗体属性
        setSize(frameSize);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setIconImage(imageIcon.getImage());
        setLayout(null);
        // 设置背景
        JLabel jLabel = new JLabel(imageIcon);
        jLabel.setBounds(0, 0, frameSize.width, frameSize.height);
        getContentPane().add(jLabel);
        addComponents();
        //设置窗口居中
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void addComponents() {
        //新游戏
        JButton btn1 = new JButton();
        //继续游戏
        JButton btn2 = new JButton();
        //排行榜
        JButton btn3 = new JButton();
        //退出游戏
        JButton btn4 = new JButton();
        btn1.setBounds(210, 140, 180, 50);
        btn2.setBounds(210, 240, 180, 50);
        btn3.setBounds(210, 340, 180, 50);
        btn4.setBounds(210, 440, 180, 50);
        btn1.setOpaque(false);
        btn2.setOpaque(false);
        btn3.setOpaque(false);
        btn4.setOpaque(false);
        //新游戏
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new StartPattern();
                dispose();
                repaint();
            }
        });
        //继续游戏
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        //排行榜
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Ranking();
            }
        });
        //退出游戏
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        this.getContentPane().add(btn1);
        this.getContentPane().add(btn2);
        this.getContentPane().add(btn3);
        this.getContentPane().add(btn4);
    }

    public static void main(String[] args) {
        new StartMenu();
    }

}
