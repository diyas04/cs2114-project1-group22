public class Schedule {
  
import java.awt.Color;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

  public static void main(String[] args) {



    // DROPDOWN
    Frame frame = new JFrame("Engineering Schedule Maker");
        JPanel panel = new JPanel();

        // greyed out first selection
        DefaultListCellRenderer grayPlaceholderRenderer =
            new DefaultListCellRenderer() {
                @Override
                public java.awt.Component getListCellRendererComponent(
                    JList<?> list,
                    Object value,
                    int index,
                    boolean isSelected,
                    boolean cellHasFocus) {

                    super.getListCellRendererComponent(list, value, index,
                        isSelected, cellHasFocus);

                    if (index == 0) {
                        setForeground(Color.GRAY);
                    }

                    return this;
                }
            };

        // the "choose minor" label
        JLabel mLabel = new JLabel("Choose Minor:");

        // Year dropdown
        String[] yearChoices = { "Select...", "First Year", "Second Year",
            "Third Year", "Fourth Year" };

        JComboBox<String> yearDropdown = new JComboBox<>(yearChoices);
        yearDropdown.setRenderer(grayPlaceholderRenderer);

        // Major dropdown
        String[] majorChoices = { "Select...", "Aerospace and Ocean",
            "Biological Systems", "Biomedical", "Building Construction",
            "Chemical", "Civil", "Computer Engineering", "Computer Science",
            "Construction", "Electrical", "Industrial and Systems",
            "Materials Science", "Mechanical", "Mining" };

        JComboBox<String> majorDropdown = new JComboBox<>(majorChoices);
        majorDropdown.setRenderer(grayPlaceholderRenderer);

        // Minor? dropdown
        String[] minorQuestionChoices = { "Select...", "Yes", "No" };

        JComboBox<String> minorQuestionDropdown = new JComboBox<>(
            minorQuestionChoices);
        minorQuestionDropdown.setRenderer(grayPlaceholderRenderer);

        // Minor dropdown
        String[] minorChoices = { "Select...", "Biomedical Engineering",
            "Computer Science", "Cybersecurity", "Human-Computer Interaction",
            "Artificial Intelligence", "Engineering Science and Mechanics",
            "Green Engineering", "Naval Engineering", "Nuclear Engineering" };

        JComboBox<String> minorDropdown = new JComboBox<>(minorChoices);
        minorDropdown.setRenderer(grayPlaceholderRenderer);

        JButton enterButton = new JButton("Enter");

        // Initially hide the minor selection
        minorDropdown.setVisible(false);
        mLabel.setVisible(true);

        // Add components to panel
        panel.add(new JLabel("Year:"));
        panel.add(yearDropdown);

        panel.add(new JLabel("Major:"));
        panel.add(majorDropdown);

        panel.add(new JLabel("Take a Minor?"));
        panel.add(minorQuestionDropdown);

        panel.add(enterButton);

        // Minor question listener
        minorQuestionDropdown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (minorQuestionDropdown.getSelectedIndex() == 0) {
                    return;
                }

                String selected = (String)minorQuestionDropdown
                    .getSelectedItem();

                if (selected.equals("Yes")) {
                    panel.remove(enterButton);
                    panel.add(mLabel);
                    panel.add(minorDropdown);
                    panel.add(enterButton);

                    mLabel.setVisible(true);
                    minorDropdown.setVisible(true);

                }
                else {
                    mLabel.setVisible(false);
                    minorDropdown.setVisible(false);
                }

                // Resize the window to fit the now visible component
                frame.pack();
            }
        });
        
        
         // Where the inputs of the dropdowns are actually recorded
         
        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (yearDropdown.getSelectedIndex() == 0 || majorDropdown
                    .getSelectedIndex() == 0 || minorQuestionDropdown
                        .getSelectedIndex() == 0) {

                    JOptionPane.showMessageDialog(frame,
                        "Please complete all required selections.");
                    return;
                }

                if (minorQuestionDropdown.getSelectedItem().equals("Yes")
                    && minorDropdown.getSelectedIndex() == 0) {

                    JOptionPane.showMessageDialog(frame,
                        "Please select a minor.");
                    return;
                }

              //test code to see if everything is selected
               // System.out.println("Everything is selected!");

              /*
              * HOW TO ACCESS DROPDOWN OUTPUTS
              * for the console outputs below, they just take the String 
              * value from the dropdown and output that. If you want to
              * use a .equals("") to designate majors that could work.
              * You can also use .getSelectedIndex() which will give
              * you the index of the user selected item. Note that if 
              * you are using this, the "Select..." item is at index 0
              * then the actual majors and minors are at index 1 and up
              */
                String year = (String)yearDropdown.getSelectedItem();
                System.out.println("Year selected: " + year);

                String major = (String)majorDropdown.getSelectedItem();
                System.out.println("Major selected: " + major);

                String minorQuestion = (String)minorQuestionDropdown
                    .getSelectedItem();
                System.out.println("Minor? " + minorQuestion);

                if (minorQuestionDropdown.getSelectedIndex() == 2) {
                    System.out.println("No minor selected");
                }
                else if (minorQuestionDropdown.getSelectedIndex() == 1) {
                    String minor = (String)minorDropdown.getSelectedItem();
                    System.out.println("Minor selected: " + minor);
                }

            }
        });

        // JFrame setup
        frame.add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    
  }

  public String mainExecution() {
    if (minorQuestion.equals("Yes")) {
      return minorScheculeMake();
    }
    else {
      return scheduleMake();
    }
  }
  
  public String scheduleMake() {
    String[] courses = {};
    if (year.equals("First Year")) {
      FirstYear first = new FirstYear();
      first.sortMajor(major);
      courses = first.getCourses();
    }
    else if (year.equals("Second Year")) {
      SecondYear second = new SecondYear();
      second.sortMajor(major);
      courses = second.getCourses();
    }
    else if (year.equals("Third Year")) {
      ThirdYear third = new ThirdYear();
      third.sortMajor(major);
      courses = third.getCourses();
    }
    else if (year.equals("Fourth Year")) {
      FourthYear fourth = new FourthYear();
      fourth.sortMajor(major);
      courses = fourth.getCourses();
    }
    String timetable = "";
    for (String course : courses) {
      timetable += course + "\n";
    }
    return timetable;
  }
  
  public String minorScheduleMake() {
    timetable = scheduleMake();
    Minor min = new Minor();
    courses = min.includeMinor(courses);
    for (String course : courses) {
      timetable += course + "\n";
    }
    return timetable;
  }

  /**
  * Validation for the dropdown menus. If entry is null or still on "Select", an InvalidDropdownException is thrown.
  *
  * @param yearDropdown The input from the dropdown for the year selection
  * @param majorDropdown The input from the dropdown for the major selection
  * @param minorQuestionDropdown The input from the dropdown for the minor question selection
  * @param minorDropdown The input from the dropdown for the minor selection
  */
  public void dropDownValid(JComboBox<String> yearDropdown, 
                               JComboBox<String> majorDropdown, 
                               JComboBox<String> minorQuestionDropdown, 
                               JComboBox<String> minorDropdown) throws InvalidDropdownException{
    if (yearDropdown.getSelectedItem() == null || yearDropdown.getSelectedIndex() == 0) {
      throw new InvalidDropdownException("Please select a year");
    }
    if (majorDropdown.getSelectedItem() == null || majorDropdown.getSelectedIndex() == 0) {
      throw new InvalidDropdownException("Please select a major");
    }
    if (minorQuestionDropdown.getSelectedItem() == null || minorQuestionDropdown.getSelectedIndex() == 0) {
       throw new InvalidDropdownException("Please select if you want a minor.");
    }
    if (minorDropdown.getSelectedItem() == null || minorDropdown.getSelectedIndex() == 0) {
       throw new InvalidDropdownException("Please select a minor");
    }
    year = (String) yearDropdown.getSelectedItem();
    major = (String) majorDropdown.getSelectedItem();
    minorQuestion = (String) minorQuestionDropdown.getSelectedItem();
    if (minorQuestion().equals("Yes")) {
      minor = (String) minorDropdown.getSelectedItem();
    }
  }

}
