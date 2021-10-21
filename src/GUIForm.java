import javax.swing.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

public class GUIForm {
    private JLabel Name;

    public static void main(String[] args) {
        JFrame frame = new JFrame("MainGUI");
        frame.setContentPane(new GUIForm().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);



    }

    private JTextField txtName;
    private JLabel Age;
    private JTextField txtAge;
    private JPanel mainPanel;
    private JLabel test;
    private JButton btn;
    private JTextField txtEmail;
    private JTextField txtHeight;
    private JTextField txtWeight;
    private JLabel Email;
    private JLabel Height;
    private JLabel Weight;
    private JButton btnHeight;
    private JLabel lableHeight;
    private JRadioButton rdbFile;
    private JRadioButton rdbDB;
    private JButton saveButton;
    PersonHandler handler = new PersonHandler();
    private Person person;

    public GUIForm() {
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = txtName.getText();
                String email = txtEmail.getText();
                int age = Integer.parseInt(txtAge.getText());
                int height = Integer.parseInt(txtHeight.getText());
                int weight = Integer.parseInt(txtWeight.getText());

                person = handler.createPerson(name, age, email, height, weight);

                person.toString();
                System.out.println(person.toString());
            }
        });
        btnHeight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = txtName.getText();
                String email = txtEmail.getText();
                int age = Integer.parseInt(txtAge.getText());
                int height = Integer.parseInt(txtHeight.getText());
                int weight = Integer.parseInt(txtWeight.getText());

                person = handler.createPerson(name, age, email, height, weight);

                Float h = handler.getHeightInInches(person);
                lableHeight.setText(String.valueOf(h) + " inches");
            }
        });
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handler.savePerson(rdbDB.isSelected(), person);
            }
        });
    }
}
