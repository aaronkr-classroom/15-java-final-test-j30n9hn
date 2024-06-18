import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class cal extends JFrame {
    Object result = null;
    String num = "";

    public cal() {
        setTitle("계산기 화면");
        setSize(410, 500);
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");
        


       
        
        JPanel resultPanel = new JPanel();
        resultPanel.setBounds(360, 0, 40, 40);
        resultPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        add(resultPanel);
        JLabel label01 = new JLabel("0");
        label01.setFont(new Font("함초롬돋음", Font.BOLD, 30));
        //JLabel label02 = new JLabel();
        resultPanel.add(label01);
        //resultPanel.add(label02);

        JPanel btPanel = new JPanel();
        btPanel.setBounds(0, 50, 400, 410);
        btPanel.setLayout(new GridLayout(4, 4));
        add(btPanel);
        JButton seven = new JButton("7");
        btPanel.add(seven);
        seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label01.setText("7");
                num.concat("7");
			}
		});
        JButton eight = new JButton("8");
        btPanel.add(eight);
        eight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label01.setText("8");
                num.concat("8");
			}
		});
        JButton nine = new JButton("9");
        btPanel.add(nine);
        nine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label01.setText("9");
                num.concat("9");
			}
		});
        JButton plus = new JButton("+");
        btPanel.add(plus);
        plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label01.setText("+");
                num.concat("+");
			}
		});
        JButton four = new JButton("4");
        btPanel.add(four);
        four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label01.setText("4");
                num.concat("4");
			}
		});
        JButton five = new JButton("5");
        btPanel.add(five);
        five.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label01.setText("5");
                num.concat("5");
			}
		});
        JButton six = new JButton("6");
        btPanel.add(six);
        six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label01.setText("6");
                num.concat("6");
			}
		});
        JButton minus = new JButton("-");
        btPanel.add(minus);
        minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label01.setText("-");
                num.concat("-");
			}
		});
        JButton one = new JButton("1");
        btPanel.add(one);
        one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label01.setText("1");
                num.concat("1");
			}
		});
        JButton two = new JButton("2");
        btPanel.add(two);
        two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label01.setText("2");
                num.concat("2");
			}
		});
        JButton three = new JButton("3");
        btPanel.add(three);
        three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label01.setText("3");
                num.concat("3");
			}
		});
        JButton mult = new JButton("*");
        btPanel.add(mult);
        mult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label01.setText("*");
                num.concat("*");
			}
		});
        JButton zero = new JButton("0");
        btPanel.add(zero);
        zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label01.setText("0");
                num.concat("0");
			}
		});
        JButton ac = new JButton("AC");
        btPanel.add(ac);
        ac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label01.setText("0");
			}
		});
        JButton equ = new JButton("=");
        btPanel.add(equ);
        equ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                try {
                    result = engine.eval(num);
                } catch (ScriptException e1) {
                    e1.printStackTrace();
                }
				label01.setText(String.valueOf(result));
			}
		});
        JButton divide = new JButton("/");
        btPanel.add(divide);
        divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label01.setText("/");
                num.concat("/");
			}
		});

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new cal();
    }
}
