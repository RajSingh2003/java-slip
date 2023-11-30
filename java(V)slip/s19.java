import javax.swing.*;
import java.awt.event.*;

public class s19 extends JFrame implements ActionListener {
    JComboBox<String> subjectComboBox;
    JTextField selectedSubjectTextField;

    s19() {
        String[] subjects = {"Data Structures", "Operating Systems", "Database Management Systems", "Computer Networks", "Software Engineering"};

        subjectComboBox = new JComboBox<>(subjects);
        subjectComboBox.setBounds(50, 50, 200, 30);

        selectedSubjectTextField = new JTextField();
        selectedSubjectTextField.setBounds(50, 100, 200, 30);
        selectedSubjectTextField.setEditable(false);

        subjectComboBox.addActionListener(this);

        add(subjectComboBox);
        add(selectedSubjectTextField);

        setTitle("Subject Selection");
        setSize(300, 200);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == subjectComboBox) {
            String selectedSubject = (String) subjectComboBox.getSelectedItem();
            selectedSubjectTextField.setText(selectedSubject);
        }
    }

    public static void main(String[] args) {
        new s19();
    }
}