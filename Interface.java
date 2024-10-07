
package projectjava;

import java.awt.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

//CALCULATOR
class Subjectdemo implements ActionListener {

    double number, answer;
    int calculation;

    JFrame frame;
    JLabel label = new JLabel();
    JTextField textField = new JTextField();
    JRadioButton onRadioButton = new JRadioButton("on");
    JRadioButton offRadioButton = new JRadioButton("off");
    JButton buttonZero = new JButton("0");
    JButton buttonOne = new JButton("1");
    JButton buttonTwo = new JButton("2");
    JButton buttonThree = new JButton("3");
    JButton buttonFour = new JButton("4");
    JButton buttonFive = new JButton("5");
    JButton buttonSix = new JButton("6");
    JButton buttonSeven = new JButton("7");
    JButton buttonEight = new JButton("8");
    JButton buttonNine = new JButton("9");
    JButton buttonDot = new JButton(".");
    JButton buttonClear = new JButton("C");
    JButton buttonDelete = new JButton("DEL");
    JButton buttonEqual = new JButton("=");
    JButton buttonMul = new JButton("x");
    JButton buttonDiv = new JButton("/");
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonSquare = new JButton("x\u00B2");
    JButton buttonReciprocal = new JButton("1/x");
    JButton buttonSqrt = new JButton("\u221A");


    Subjectdemo() {
        prepareGUI();
        addComponents();
        addActionEvent();
    }

    public void prepareGUI() {
        frame = new JFrame();
        frame.setTitle("Calculator");
        frame.setSize(300, 490);
        frame.getContentPane().setLayout(null);
//        frame.getContentPane().setBackground(Color.black);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // Thêm listener để xử lý sự kiện đóng cửa sổ
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Hành động khi cửa sổ Calculator đóng lại
                frame.dispose(); // Đóng cửa sổ calculator
            }
        });
    }

    public void addComponents() {
        label.setBounds(250, 0, 50, 50);
        label.setForeground(Color.white);
        frame.add(label);

        textField.setBounds(10, 40, 270, 40);
        textField.setFont(new Font("Arial", Font.BOLD, 20));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);

        onRadioButton.setBounds(10, 95, 60, 40);
        onRadioButton.setSelected(true);
        onRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
//        onRadioButton.setBackground(Color.black);
        onRadioButton.setForeground(Color.white);
        frame.add(onRadioButton);

        offRadioButton.setBounds(10, 120, 60, 40);
        offRadioButton.setSelected(false);
        offRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
//        offRadioButton.setBackground(Color.black);
        offRadioButton.setForeground(Color.white);
        frame.add(offRadioButton);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(onRadioButton);
        buttonGroup.add(offRadioButton);

        buttonSeven.setBounds(10, 230, 60, 40);
        buttonSeven.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonSeven);

        buttonEight.setBounds(80, 230, 60, 40);
        buttonEight.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonEight);

        buttonNine.setBounds(150, 230, 60, 40);
        buttonNine.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonNine);

        buttonFour.setBounds(10, 290, 60, 40);
        buttonFour.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonFour);

        buttonFive.setBounds(80, 290, 60, 40);
        buttonFive.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonFive);

        buttonSix.setBounds(150, 290, 60, 40);
        buttonSix.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonSix);

        buttonOne.setBounds(10, 350, 60, 40);
        buttonOne.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonOne);

        buttonTwo.setBounds(80, 350, 60, 40);
        buttonTwo.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonTwo);

        buttonThree.setBounds(150, 350, 60, 40);
        buttonThree.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonThree);

        buttonDot.setBounds(150, 410, 60, 40);
        buttonDot.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonDot);

        buttonDiv.setBounds(220, 110, 60, 40);
        buttonDiv.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonDiv);

        buttonSqrt.setBounds(10, 170, 60, 40);
        buttonSqrt.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonSqrt);

        buttonMul.setBounds(220, 230, 60, 40);
        buttonMul.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonMul);

        buttonMinus.setBounds(220, 170, 60, 40);
        buttonMinus.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonMinus);

        buttonPlus.setBounds(220,290,60,40);
        buttonPlus.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonPlus);
        
        buttonSquare.setBounds(80,170,60,40);
        buttonSquare.setFont(new Font("Arial", Font.BOLD,20));
        frame.add(buttonSquare);
        
        buttonReciprocal.setBounds(150,170,60,40);
        buttonReciprocal.setFont(new Font("Arial", Font.BOLD,15));
        frame.add(buttonReciprocal);
        
        buttonDelete.setBounds(150,110,60,40);
        buttonDelete.setFont(new Font("Arial", Font.BOLD,12));
        buttonDelete.setForeground(Color.white);
        frame.add(buttonDelete);
        
        buttonClear.setBounds(80,110,60,40);
        buttonClear.setFont(new Font("Arial", Font.BOLD,12));
        buttonClear.setForeground(Color.white);
        frame.add(buttonClear);

        buttonEqual.setBounds(220, 350, 60, 100); // 
        buttonEqual.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonEqual);

        
    }

    private void addActionEvent() {
        onRadioButton.addActionListener(this);
        offRadioButton.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonDelete.addActionListener(this);
        buttonDiv.addActionListener(this);
        buttonSqrt.addActionListener(this);
        buttonSquare.addActionListener(this);
        buttonReciprocal.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonSeven.addActionListener(this);
        buttonEight.addActionListener(this);
        buttonNine.addActionListener(this);
        buttonMul.addActionListener(this);
        buttonFour.addActionListener(this);
        buttonFive.addActionListener(this);
        buttonSix.addActionListener(this);
        buttonPlus.addActionListener(this);
        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);
        buttonThree.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonZero.addActionListener(this);
        buttonDot.addActionListener(this);
    }

    @Override
public void actionPerformed(ActionEvent e) {
    Object source = e.getSource();

    if (source == onRadioButton) {
        enable();
    } else if (source == offRadioButton) {
        disable();
    } else if (source == buttonClear) {
        textField.setText("");
        label.setText("");
    } else if (source == buttonDelete) {
        int length = textField.getText().length();
        int number = length - 1;

        if (length > 0) {
            StringBuilder back = new StringBuilder(textField.getText());
            back.deleteCharAt(number);
            textField.setText(back.toString());
        }
        if(textField.getText().endsWith("")){
            label.setText("");
        }
    } else if (source == buttonZero) {
        if(textField.getText().equals("0")){
            return;
        } else {
            textField.setText(textField.getText() + "0");
        }
    } else if (source == buttonOne) {
        textField.setText(textField.getText() + "1");
    } else if (source == buttonTwo) {
        textField.setText(textField.getText() + "2");
    } else if (source == buttonThree) {
        textField.setText(textField.getText() + "3");
    } else if (source == buttonFour) {
        textField.setText(textField.getText() + "4");
    } else if (source == buttonFive) {
        textField.setText(textField.getText() + "5");
    } else if (source == buttonSix) {
        textField.setText(textField.getText() + "6");
    } else if (source == buttonSeven) {
        textField.setText(textField.getText() + "7");
    } else if (source == buttonEight) {
        textField.setText(textField.getText() + "8");
    } else if (source == buttonNine) {
        textField.setText(textField.getText() + "9");
    } else if (source == buttonDot) {
       if( textField.getText().contains( ".")){
           return;
       } else{ 
           textField.setText(textField.getText()+" ");

       }
    } 
    

    else if (source == buttonPlus) {
        number = Double.parseDouble(textField.getText());
        calculation = 1; 
        textField.setText("");
        label.setText(number + "+");
    } else if (source == buttonMinus) {
        number = Double.parseDouble(textField.getText());
        calculation = 2; 
        textField.setText("");
        label.setText(number + "-");
    } else if (source == buttonMul) {
        number = Double.parseDouble(textField.getText());
        calculation = 3;
        textField.setText("");
        label.setText(number + "x");
    } else if (source == buttonDiv) {
        number = Double.parseDouble(textField.getText());
        calculation = 4; 
        textField.setText("");
        label.setText(number + "/");
    } else if (source == buttonEqual) {
        performCalculation();
        label.setText("");
    }

    // Handling special operations like square, square root, etc.
    else if (source == buttonSquare) {
        number = Double.parseDouble(textField.getText());
        double square = Math.pow(number, 2);
        textField.setText(Double.toString(square));
    } else if (source == buttonSqrt) {
        number = Double.parseDouble(textField.getText());
        Double sqrt = Math.sqrt(number);
        textField.setText(Double.toString(sqrt));
    }
}

public void performCalculation() {
    switch (calculation) {
        case 1: // Addition
            answer = number + Double.parseDouble(textField.getText());
            textField.setText(Double.toString(answer));
            break;
        case 2: // Subtraction
            answer = number - Double.parseDouble(textField.getText());
            textField.setText(Double.toString(answer));
            break;
        case 3: // Multiplication
            answer = number * Double.parseDouble(textField.getText());
            textField.setText(Double.toString(answer));
            break;
        case 4: // Division
            answer = number / Double.parseDouble(textField.getText());
            textField.setText(Double.toString(answer));
            break;
    }
}

public void enable() {
    textField.setEnabled(true);
    buttonZero.setEnabled(true);
    buttonOne.setEnabled(true);
    onRadioButton.setEnabled(false);
    offRadioButton.setEnabled(true);
    label.setEnabled(true);
    buttonClear.setEnabled(true);
    buttonDelete.setEnabled(true);
    buttonDiv.setEnabled(true);
    buttonSqrt.setEnabled(true);
    buttonSquare.setEnabled(true);
    buttonReciprocal.setEnabled(true);
    buttonMinus.setEnabled(true);
    buttonSeven.setEnabled(true);
    buttonEight.setEnabled(true);
    buttonNine.setEnabled(true);
    buttonMul.setEnabled(true);
    buttonFour.setEnabled(true);
    buttonFive.setEnabled(true);
    buttonSix.setEnabled(true);
    buttonPlus.setEnabled(true);
    buttonTwo.setEnabled(true);
    buttonThree.setEnabled(true);
    buttonEqual.setEnabled(true);
    
}

public void disable() {
    textField.setText(" ");
    buttonZero.setEnabled(false);
    buttonOne.setEnabled(false);
  // onRadioButton.setEnabled(true);
    offRadioButton.setEnabled(false);
    label.setText(" ");
    buttonClear.setEnabled(false);
    buttonDelete.setEnabled(false);
    buttonDiv.setEnabled(false);
    buttonSqrt.setEnabled(false);
    buttonSquare.setEnabled(false);
    buttonReciprocal.setEnabled(false);
    buttonMinus.setEnabled(false);
    buttonSeven.setEnabled(false);
    buttonEight.setEnabled(false);
    buttonNine.setEnabled(false);
    buttonMul.setEnabled(false);
    buttonFour.setEnabled(false);
    buttonFive.setEnabled(false);
    buttonSix.setEnabled(false);
    buttonPlus.setEnabled(false);
    buttonTwo.setEnabled(false);
    buttonThree.setEnabled(false);
    buttonEqual.setEnabled(false);
}

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}


//INTERFACE 
 class Interface {
    JFrame frame;
    JPanel panel;
    JButton button1;
    JButton button2;
    JButton button3;

    Interface() {
        frame = new JFrame("hello");
        panel = new JPanel();

        // Thêm màu nền cho JPanel
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(new GridLayout(3, 1, 10, 10));
        button1 = new JButton("Open Calculator");
        
        // Thêm màu cho button
        button1.setBackground(Color.BLUE); // Màu nền
        button1.setForeground(Color.WHITE); // Màu chữ
        button1.setBounds(50, 20, 200, 40);
        button1.setFont(new Font("Arial", Font.BOLD, 16));

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Mở cửa sổ máy tính (Calculator) khi nhấn nút
                Subjectdemo subjectdemo = new Subjectdemo();
                subjectdemo.setVisible(true); // Hiển thị cửa sổ calculator
            }
        });
        
        button2 = new JButton("Open Caro Game");
        button2.setBackground(Color.GREEN); 
        button2.setForeground(Color.BLACK); 
        button2.setFont(new Font("Arial", Font.BOLD, 16));
         button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Mở trò chơi Caro khi nhấn nút
                CaroGame caroGame = new CaroGame();
            }
        });
    
        
        button3 = new JButton("Oẳn Tù Tì");
        button3.setBackground(Color.YELLOW); 
        button3.setForeground(Color.BLACK); 
        button3.setFont(new Font("Arial", Font.BOLD, 16));
        button3.setBounds(50, 120, 200, 40);
       // button3.setFont(new Font("Arial", Font.BOLD, 14));
        button3.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
        new OanTuTiGame();
         }
      });
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}


//CARO GAME
 class CaroGame extends JFrame {
    private final int SIZE = 15; // Kích thước bảng 15x15
    private final JButton[][] buttons = new JButton[SIZE][SIZE];
    private boolean playerTurn = true; // true nếu lượt người chơi 1, false nếu lượt người chơi 2
    
    public CaroGame() {
        setTitle("Caro Game");
        setSize(600, 600);
        setLayout(new GridLayout(SIZE, SIZE));

        // Tạo bảng Caro
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                buttons[i][j] = new JButton();
                buttons[i][j].setFont(new Font("Arial", Font.PLAIN, 20));
                buttons[i][j].setFocusPainted(false);
                buttons[i][j].setBackground(Color.WHITE);
                buttons[i][j].addActionListener(new ButtonClickListener(i, j));
                add(buttons[i][j]);
            }
        }

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Đóng cửa sổ mà không thoát chương trình
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {
        private final int row;
        private final int col;

        public ButtonClickListener(int row, int col) {
            this.row = row;
            this.col = col;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (buttons[row][col].getText().equals("")) {
                // Đặt dấu và đổi màu
                buttons[row][col].setText(playerTurn ? "X" : "O");
                buttons[row][col].setForeground(playerTurn ? Color.RED : Color.BLUE);
                // Kiểm tra người chiến thắng
                if (checkWin(row, col)) {
                    JOptionPane.showMessageDialog(null, "Player " + (playerTurn ? "1 (X)" : "2 (O)") + " wins!");
                    resetGame();
                } else {
                    playerTurn = !playerTurn; // Đổi lượt
                }
            }
        }
    }

    // Kiểm tra người chiến thắng
    private boolean checkWin(int row, int col) {
        String currentPlayer = buttons[row][col].getText();
        return (checkDirection(row, col, 1, 0, currentPlayer) || // Horizontal
                checkDirection(row, col, 0, 1, currentPlayer) || // Vertical
                checkDirection(row, col, 1, 1, currentPlayer) || // Diagonal /
                checkDirection(row, col, 1, -1, currentPlayer)); // Diagonal \
    }

    // Kiểm tra theo hướng nhất định
    private boolean checkDirection(int row, int col, int rowDelta, int colDelta, String player) {
        int count = 1; // Đếm dấu hiện tại
        count += countInDirection(row, col, rowDelta, colDelta, player);
        count += countInDirection(row, col, -rowDelta, -colDelta, player);
        return count >= 5; // Nếu có ít nhất 5 dấu liên tiếp
    }

    // Đếm số lượng dấu liên tiếp
    private int countInDirection(int row, int col, int rowDelta, int colDelta, String player) {
        int count = 0;
        int r = row + rowDelta;
        int c = col + colDelta;
        while (r >= 0 && r < SIZE && c >= 0 && c < SIZE && buttons[r][c].getText().equals(player)) {
            count++;
            r += rowDelta;
            c += colDelta;
        }
        return count;
    }

    // Đặt lại trò chơi
    private void resetGame() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                buttons[i][j].setText("");
                buttons[i][j].setForeground(Color.BLACK); // Đặt lại màu sắc
            }
        }
        playerTurn = true; // Đặt lại lượt cho người chơi 1
    }

}
 class OanTuTiGame extends JFrame {
    private JLabel resultLabel;
    private JButton rockButton;
    private JButton paperButton;
    private JButton scissorsButton;
    private Random random;

    public OanTuTiGame() {
        setTitle("Oẳn Tù Tì Game");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Đóng cửa sổ mà không thoát chương trình
        setLayout(new FlowLayout());
        random = new Random();

        
        rockButton = new JButton("Bao");
        rockButton.addActionListener(new ButtonClickListener());

       
        paperButton = new JButton("Búa");
        paperButton.addActionListener(new ButtonClickListener());

        
        scissorsButton = new JButton("Kéo");
        scissorsButton.addActionListener(new ButtonClickListener());

        
        resultLabel = new JLabel("Chọn một tùy chọn");

        // Thêm các nút vào JFrame
        add(rockButton);
        add(paperButton);
        add(scissorsButton);
        add(resultLabel);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String playerChoice = e.getActionCommand();
            String computerChoice = getComputerChoice();
            String result = determineWinner(playerChoice, computerChoice);
            resultLabel.setText("Bạn chọn: " + playerChoice + " | Máy chọn: " + computerChoice + " | " + result);
        }

        // Lựa chọn ngẫu nhiên của máy tính
        private String getComputerChoice() {
            int choice = random.nextInt(3); // 0: Bao, 1: Búa, 2: Kéo
            switch (choice) {
                case 0:
                    return "Bao";
                case 1:
                    return "Búa";
                case 2:
                    return "Kéo";
                default:
                    return "";
            }
        }

        // Xác định người thắng
        private String determineWinner(String player, String computer) {
            if (player.equals(computer)) {
                return "Hòa!";
            } else if ((player.equals("Bao") && computer.equals("Búa")) ||
                       (player.equals("Búa") && computer.equals("Kéo")) ||
                       (player.equals("Kéo") && computer.equals("Bao"))) {
                return "Bạn thắng!";
            } else {
                return "Bạn thua!";
            }
        }
    }
}