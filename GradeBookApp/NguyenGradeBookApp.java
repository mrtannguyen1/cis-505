/**
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
 	Comprehensive Version (12th ed.). Pearson Education, Inc.
 Nguyen, T. (2023). CIS 505 Intermediate Java Programming. Bellevue University
 **/

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

// Class representing the Grade Book application UI
class GradeBookAppUI extends JFrame {
    // UI components
    private JTextField firstNameField;
    private JTextField lastNameField;
    private JTextField courseField;
    private JComboBox<String> gradeComboBox;
    private JTable gradesTable;
    private DefaultTableModel tableModel;

    private List<Student> students; // List to store student data

    // Constructor
    public GradeBookAppUI() {
        super("Grade Book App");

        students = new ArrayList<>(); // Initialize student list

        // Create form fields and labels
        JLabel firstNameLabel = new JLabel("First Name:");
        firstNameField = new JTextField(20);
        JLabel lastNameLabel = new JLabel("Last Name:");
        lastNameField = new JTextField(20);
        JLabel courseLabel = new JLabel("Course:");
        courseField = new JTextField(20);
        JLabel gradeLabel = new JLabel("Grade:");
        gradeComboBox = new JComboBox<>(new String[]{"A", "B", "C", "D", "F"});

        // Create buttons and attach event listeners
        JButton clearButton = new JButton("Clear Form");
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearForm();
            }
        });

        JButton saveButton = new JButton("Save Entry");
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveGradeEntry();
            }
        });

        JButton viewButton = new JButton("View Grades");
        viewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewGrades();
            }
        });

        // Create table and table model
        tableModel = new DefaultTableModel();
        tableModel.addColumn("FirstName");
        tableModel.addColumn("LastName");
        tableModel.addColumn("Course");
        tableModel.addColumn("Grade");
        gradesTable = new JTable(tableModel);

        // Create layout using GridBagLayout and BorderLayout
        JPanel formPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5, 5, 5, 5);

        // Add form fields and labels to the form panel
        formPanel.add(firstNameLabel, gbc);
        gbc.gridx++;
        formPanel.add(firstNameField, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        formPanel.add(lastNameLabel, gbc);
        gbc.gridx++;
        formPanel.add(lastNameField, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        formPanel.add(courseLabel, gbc);
        gbc.gridx++;
        formPanel.add(courseField, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        formPanel.add(gradeLabel, gbc);
        gbc.gridx++;
        formPanel.add(gradeComboBox, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        formPanel.add(clearButton, gbc);
        gbc.gridx++;
        formPanel.add(saveButton, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        gbc.gridwidth = 2;
        formPanel.add(viewButton, gbc);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(formPanel, BorderLayout.NORTH);
        mainPanel.add(new JScrollPane(gradesTable), BorderLayout.CENTER);

        getContentPane().add(mainPanel); // Add main panel to the frame
        pack(); // Pack components tightly
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set close operation
        setLocationRelativeTo(null); // Center the frame on the screen
    }

    // Clear the form fields
    private void clearForm() {
        firstNameField.setText("");
        lastNameField.setText("");
        courseField.setText("");
        gradeComboBox.setSelectedIndex(0);
    }

    // Save the grade entry to a CSV file
    private void saveGradeEntry() {
        String firstName = firstNameField.getText().trim();
        String lastName = lastNameField.getText().trim();
        String course = courseField.getText().trim();
        String grade = (String) gradeComboBox.getSelectedItem();

        // Validate that all fields are filled
        if (firstName.isEmpty() || lastName.isEmpty() || course.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields.");
            return;
        }

        Student student = new Student(firstName, lastName, course, grade);
        students.add(student);

        // Write to CSV file
        try (FileWriter writer = new FileWriter("grades.csv", true)) {
            // Check if the file is empty
            if (Files.size(Paths.get("grades.csv")) == 0) {
                writer.write("FirstName,LastName,Course,Grade\n"); // Header row
            }
            writer.write(firstName + "," + lastName + "," + course + "," + grade + "\n");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        clearForm(); // Clear the form fields
        JOptionPane.showMessageDialog(this, "Grade entry saved successfully!");
    }

    // View grades by reading from the CSV file
    private void viewGrades() {
        try {
            List<String> lines = Files.readAllLines(Paths.get("grades.csv"));
            tableModel.setRowCount(0); // Clear existing table data

            // Check if the file has any lines
            if (!lines.isEmpty()) {
                String[] columnNames = lines.get(0).split(",");
                tableModel.setColumnIdentifiers(columnNames); // Set column names

                for (int i = 1; i < lines.size(); i++) {
                    String line = lines.get(i);
                    String[] parts = line.split(",");

                    if (parts.length == columnNames.length) {
                        tableModel.addRow(parts);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// Main class to run the Grade Book application
public class NguyenGradeBookApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                GradeBookAppUI app = new GradeBookAppUI();
                app.setVisible(true);
            }
        });
    }
}
