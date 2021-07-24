import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static char player = 'X';
    public static int x = 0;
    public static int o = 0;

    public static void showMenu(){
        JFrame menu = new JFrame("OX GAME");
        JLabel label = new JLabel();
        JButton btn_start = new JButton("Start");

        // btn_start
        btn_start.setBounds(200,180,100,60);
        btn_start.setFont(new Font(btn_start.getFont().getName(), btn_start.getFont().getStyle(), 15));
        btn_start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                menu.setVisible(false);
                showBoard();
//                System.exit(0);
            }
        });

        //label
        label.setText("Welcome to OX GAME");
        label.setBounds(60,30,500,50);
        label.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 30));

        // menu
        menu.add(label, BorderLayout.NORTH);
        menu.add(btn_start);
        menu.setSize(500,500);
        menu.setLayout(null);
        menu.setVisible(true);
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static JButton btn_0 = new JButton(" ");
    public static JButton btn_1 = new JButton(" ");
    public static JButton btn_2 = new JButton(" ");
    public static JButton btn_3 = new JButton(" ");
    public static JButton btn_4 = new JButton(" ");
    public static JButton btn_5 = new JButton(" ");
    public static JButton btn_6 = new JButton(" ");
    public static JButton btn_7 = new JButton(" ");
    public static JButton btn_8 = new JButton(" ");
    public static JLabel score;
    public static JLabel x_score;
    public static JLabel o_score;
    public static void showBoard(){
        JFrame display = new JFrame("OX GAME");
        JLabel X_label = new JLabel();
        JLabel O_label = new JLabel();
         x_score = new JLabel();
         o_score = new JLabel();
        score = new JLabel();
        JLabel x_turn = new JLabel();
        JLabel o_turn = new JLabel();
//        JButton btn_0 = new JButton("0");
//        JButton btn_1 = new JButton("1");
//        JButton btn_2 = new JButton("2");
//        JButton btn_3 = new JButton("3");
//        JButton btn_4 = new JButton("4");
//        JButton btn_5 = new JButton("5");
//        JButton btn_6 = new JButton("6");
//        JButton btn_7 = new JButton("7");
//        JButton btn_8 = new JButton("8");
        JButton play_again = new JButton("Play Again");
        JButton reset_score = new JButton("Reset Score");
        JButton exit = new JButton("Exit");

        // X_label
        X_label.setText("X");
        X_label.setBounds(35,50,30,30);
        X_label.setFont(new Font(X_label.getFont().getName(), X_label.getFont().getStyle(), 30));

        // x_score
        x_score.setText(String.valueOf(x));
        x_score.setBounds(36,90,30,30);
        x_score.setFont(new Font(X_label.getFont().getName(), X_label.getFont().getStyle(), 30));

        // x_turn
        x_turn.setText("It's your turn.");
        x_turn.setBounds(10,25,500,30);
        x_turn.setFont(new Font(x_turn.getFont().getName(), x_turn.getFont().getStyle(), 13));
        x_turn.setVisible(true);

        // score
        score.setText(" ");
        score.setBounds(130,50,500,30);
        score.setFont(new Font(score.getFont().getName(), score.getFont().getStyle(), 17));

        // O_label
        O_label.setText("O");
        O_label.setBounds(430,50,30,30);
        O_label.setFont(new Font(O_label.getFont().getName(), O_label.getFont().getStyle(), 30));

        // o_score
        o_score.setText(String.valueOf(o));
        o_score.setBounds(432,90,30,30);
        o_score.setFont(new Font(X_label.getFont().getName(), X_label.getFont().getStyle(), 30));

        // o_turn
        o_turn.setText("It's your turn.");
        o_turn.setBounds(400,25,500,30);
        o_turn.setFont(new Font(o_turn.getFont().getName(), o_turn.getFont().getStyle(), 13));
        o_turn.setVisible(false);

        //btn_0
        btn_0.setText("0");
        btn_0.setBounds(100,100,100,100);
        btn_0.setFont(new Font(btn_0.getFont().getName(), btn_0.getFont().getStyle(), 70));
        btn_0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                btn_0.setText(String.valueOf(player));
                btn_0.setEnabled(false);
                checkWin();
                changePlayer();
                x_score.setText(String.valueOf(x));
                o_score.setText(String.valueOf(o));
                if (player == 'X'){
                    x_turn.setVisible(true);
                    o_turn.setVisible(false);
                }
                else if(player == 'O'){
                    x_turn.setVisible(false);
                    o_turn.setVisible(true);
                }
            }
        });

        //btn_1
        btn_1.setText("1");
        btn_1.setBounds(200,100,100,100);
        btn_1.setFont(new Font(btn_1.getFont().getName(), btn_1.getFont().getStyle(), 70));
        btn_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                btn_1.setText(String.valueOf(player));
                btn_1.setEnabled(false);
                checkWin();
                changePlayer();
                x_score.setText(String.valueOf(x));
                o_score.setText(String.valueOf(o));
                if (player == 'X'){
                    x_turn.setVisible(true);
                    o_turn.setVisible(false);
                }
                else if(player == 'O'){
                    x_turn.setVisible(false);
                    o_turn.setVisible(true);
                }
            }
        });


        //btn_2
        btn_2.setText("2");
        btn_2.setBounds(300,100,100,100);
        btn_2.setFont(new Font(btn_2.getFont().getName(), btn_2.getFont().getStyle(), 70));
        btn_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                btn_2.setText(String.valueOf(player));
                btn_2.setEnabled(false);
                checkWin();
                changePlayer();
                x_score.setText(String.valueOf(x));
                o_score.setText(String.valueOf(o));
                if (player == 'X'){
                    x_turn.setVisible(true);
                    o_turn.setVisible(false);
                }
                else if(player == 'O'){
                    x_turn.setVisible(false);
                    o_turn.setVisible(true);
                }
            }
        });

        //btn_3
        btn_3.setText("3");
        btn_3.setBounds(100,200,100,100);
        btn_3.setFont(new Font(btn_3.getFont().getName(), btn_3.getFont().getStyle(), 70));
        btn_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                btn_3.setText(String.valueOf(player));
                btn_3.setEnabled(false);
                checkWin();
                changePlayer();
                x_score.setText(String.valueOf(x));
                o_score.setText(String.valueOf(o));
                if (player == 'X'){
                    x_turn.setVisible(true);
                    o_turn.setVisible(false);
                }
                else if(player == 'O'){
                    x_turn.setVisible(false);
                    o_turn.setVisible(true);
                }
            }
        });

        //btn_4
        btn_4.setText("4");
        btn_4.setBounds(200,200,100,100);
        btn_4.setFont(new Font(btn_4.getFont().getName(), btn_4.getFont().getStyle(), 70));
        btn_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                btn_4.setText(String.valueOf(player));
                btn_4.setEnabled(false);
                checkWin();
                changePlayer();
                x_score.setText(String.valueOf(x));
                o_score.setText(String.valueOf(o));
                if (player == 'X'){
                    x_turn.setVisible(true);
                    o_turn.setVisible(false);
                }
                else if(player == 'O'){
                    x_turn.setVisible(false);
                    o_turn.setVisible(true);
                }
            }
        });

        //btn_5
        btn_5.setText("5");
        btn_5.setBounds(300,200,100,100);
        btn_5.setFont(new Font(btn_5.getFont().getName(), btn_5.getFont().getStyle(), 70));
        btn_5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                btn_5.setText(String.valueOf(player));
                btn_5.setEnabled(false);
                checkWin();
                changePlayer();
                x_score.setText(String.valueOf(x));
                o_score.setText(String.valueOf(o));
                if (player == 'X'){
                    x_turn.setVisible(true);
                    o_turn.setVisible(false);
                }
                else if(player == 'O'){
                    x_turn.setVisible(false);
                    o_turn.setVisible(true);
                }
            }
        });

        //btn_6
        btn_6.setText("6");
        btn_6.setBounds(100,300,100,100);
        btn_6.setFont(new Font(btn_6.getFont().getName(), btn_6.getFont().getStyle(), 70));
        btn_6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                btn_6.setText(String.valueOf(player));
                btn_6.setEnabled(false);
                checkWin();
                changePlayer();
                x_score.setText(String.valueOf(x));
                o_score.setText(String.valueOf(o));
                if (player == 'X'){
                    x_turn.setVisible(true);
                    o_turn.setVisible(false);
                }
                else if(player == 'O'){
                    x_turn.setVisible(false);
                    o_turn.setVisible(true);
                }
            }
        });

        //btn_7
        btn_7.setText("7");
        btn_7.setBounds(200,300,100,100);
        btn_7.setFont(new Font(btn_7.getFont().getName(), btn_7.getFont().getStyle(), 70));
        btn_7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                btn_7.setText(String.valueOf(player));
                btn_7.setEnabled(false);
                checkWin();
                changePlayer();
                x_score.setText(String.valueOf(x));
                o_score.setText(String.valueOf(o));
                if (player == 'X'){
                    x_turn.setVisible(true);
                    o_turn.setVisible(false);
                }
                else if(player == 'O'){
                    x_turn.setVisible(false);
                    o_turn.setVisible(true);
                }
            }
        });

        //btn_8
        btn_8.setText("8");
        btn_8.setBounds(300,300,100,100);
        btn_8.setFont(new Font(btn_8.getFont().getName(), btn_8.getFont().getStyle(), 70));
        btn_8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                btn_8.setText(String.valueOf(player));
                btn_8.setEnabled(false);
                checkWin();
                changePlayer();
                x_score.setText(String.valueOf(x));
                o_score.setText(String.valueOf(o));
                if (player == 'X'){
                    x_turn.setVisible(true);
                    o_turn.setVisible(false);
                }
                else if(player == 'O'){
                    x_turn.setVisible(false);
                    o_turn.setVisible(true);
                }
            }
        });

        //play_again
        play_again.setBounds(100,420,150,30);
        play_again.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                btn_0.setText("0");btn_1.setText("1");btn_2.setText("2");
                btn_3.setText("3");btn_4.setText("4");btn_5.setText("5");
                btn_6.setText("6");btn_7.setText("7");btn_8.setText("8");
                btn_0.setEnabled(true);btn_1.setEnabled(true);btn_2.setEnabled(true);
                btn_3.setEnabled(true);btn_4.setEnabled(true);btn_5.setEnabled(true);
                btn_6.setEnabled(true);btn_7.setEnabled(true);btn_8.setEnabled(true);
                score.setText(" ");
                count = 0;
            }
        });

        //reset_score
        reset_score.setBounds(250,420,150,30);
        reset_score.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                x = 0;
                o = 0;
                x_score.setText(String.valueOf(x));
                o_score.setText(String.valueOf(o));
                score.setText(" ");
                count = 0;
            }
        });

        //Exit
        exit.setBounds(420,420,60,30);
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });

        //display
        display.add(x_turn);display.add(o_turn);
        display.add(X_label);display.add(O_label);
        display.add(x_score);display.add(score);display.add(o_score);
        display.add(btn_0);display.add(btn_1);display.add(btn_2);
        display.add(btn_3);display.add(btn_4);display.add(btn_5);
        display.add(btn_6);display.add(btn_7);display.add(btn_8);
        display.add(play_again);display.add(reset_score);display.add(exit);

        display.setSize(500,500);
        display.setLayout(null);
        display.setVisible(true);
        display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void changePlayer(){
//        JLabel score = new JLabel();
        if(player == 'X'){
            player = 'O';
        }
        else if(player == 'O'){
            player = 'X';
        }
        else{
            score.setText("Don't Cheat.");
        }
    }
    public static int count = 0;
    public static void checkWin(){
        // score text
//        String text_score = score.getText();
        // text button
        String text_0 = btn_0.getText();
        String text_1 = btn_1.getText();
        String text_2 = btn_2.getText();
        String text_3 = btn_3.getText();
        String text_4 = btn_4.getText();
        String text_5 = btn_5.getText();
        String text_6 = btn_6.getText();
        String text_7 = btn_7.getText();
        String text_8 = btn_8.getText();
        if(((text_0.equals(text_1) && text_1.equals(text_2)) ||
                (text_3.equals(text_4) && text_4.equals(text_5)) ||
                (text_6.equals(text_7) && text_7.equals(text_8)) ||
                (text_0.equals(text_3) && text_3.equals(text_6)) ||
                (text_1.equals(text_4) && text_4.equals(text_7)) ||
                (text_2.equals(text_5) && text_5.equals(text_8)) ||
                (text_0.equals(text_4) && text_4.equals(text_8)) ||
                (text_2.equals(text_4) && text_4.equals(text_6)) )){
            if(player == 'O'){
                o += 1;
//                System.out.println(o);
                score.setText("This round Player O Win!");
                btn_0.setEnabled(false);btn_1.setEnabled(false);btn_2.setEnabled(false);
                btn_3.setEnabled(false);btn_4.setEnabled(false);btn_5.setEnabled(false);
                btn_6.setEnabled(false);btn_7.setEnabled(false);btn_8.setEnabled(false);
            }
            else if(player == 'X'){
                x += 1;
//                System.out.println(x);
                score.setText("This round Player X Win!");
                btn_0.setEnabled(false);btn_1.setEnabled(false);btn_2.setEnabled(false);
                btn_3.setEnabled(false);btn_4.setEnabled(false);btn_5.setEnabled(false);
                btn_6.setEnabled(false);btn_7.setEnabled(false);btn_8.setEnabled(false);
            }
        }
        else{
            count+=1;
        }
        if(count == 9){
            score.setText("                 Draw!");
        }

    }

    public static void main(String[] args){
        showMenu();
    }
}