public class Minor {

  private String[] minors = {"Biomedical Engineering", 
                             "Computer Science", 
                             "Cybersecurity", 
                             "Human-Computer Interactions", 
                             "Artificial Intelligence", 
                             "Engineering Science and Mechanics", 
                             "Green Engineering", 
                             "Naval Engineering", 
                             "Nuclear Engineering"};
  // biomedical
  private String[] biomed = {"BMES 2104", "BMES 4064"};
  // cs
  private String[] cs = {"CS 1114", "CS 2114", "MATH 2534", "CS 2505", "CS 3114"};
  // cybersecurity
  private String[] cyber = {"ECE 4560", "CS 4264", "ECE/CS 5560"};
  // human-computer interactions
  private String[] hci = {"HIST/SOC/STS 2604", "COMM 2084", "CS 3724"};
  // ai
  private String[] ai = {"CS 1114", "CS 2104", "CS 3804"};
  // engineering science and mechanics
  private String[] esm = {"ESM 2104", "ESM 2204", "ESM 2304"};
  // green engineering
  private String[] green = {"ENGR 3124", "ENGR 4134"};
  // naval
  private String[] naval = {"AOE 2204", "AOE 4264", "AOE 4244"};
  // nuclear
  private String[] nuclear = {"MATH 2214", "NSEG 3145", "NSEG 3146", "NSEG 3604"};

  private String[] courses = {};

  /**
    * Adds minor classes 
    */
  public void includeMinor(String minor) {
    // uses the minor to find what classes need to be added, doesn't add classes already in array
    if (minor.equals(null)) {
      return;
    }
    if (minor.equals("Biomedical Engineering")) {
      courses = biomed;
    }
    else if (minor.equals("Computer Science")) {
      courses = cs;
    }
    else if (minor.equals("Cybersecurity")) {
      courses = cyber;
    }
    else if (minor.equals("Human-Computer Interactions")) {
      courses = hci;
    }
    else if (minor.equals("Artificial Intelligence")) {
      courses = ai;
    }
    else if (minor.equals("Engineering Science and Mechanics")) {
      courses = esm;
    }
    else if (minor.equals("Green Engineering")) {
      courses = green;
    }
    else if (minor.equals("Naval Engineering")) {
      courses = naval;
    }
    else if (minor.equals("Nuclear Engineering")) {
      courses = nuclear;
    }
  }

  /**
    *
    */
  public void addMinorCourses(String[] minor) {
    
  }

   /**
     * Returns the currently selected third-year courses.
     */
    public String[] getCourses() {
        return courses;
    }


    /**
     * Adds a course to the current schedule.
     *
     * @return true if the course was added, false otherwise
     */
    public boolean addCourse(String courseName) {

        if (courseName == null) {
            return false;
        }

        for (String course : courses) {
            if (course.equalsIgnoreCase(courseName)) {
                return false;
            }
        }

        String[] newCourses = new String[courses.length + 1];
        for (int i = 0; i < courses.length; i++) {
            newCourses[i] = courses[i];
        }
        newCourses[newCourses.length - 1] = courseName;
        courses = newCourses;

        return true;
    }


    /**
     * Removes a course from the current schedule.
     *
     * @return true if the course was removed, false otherwise
     */
    public boolean removeCourse(String courseName) {

        if (courseName == null) {
            return false;
        }

        for (int i = 0; i < courses.length; i++) {

            if (courses[i].equalsIgnoreCase(courseName)) {

                String[] newCourses = new String[courses.length - 1];

                for (int j = 0, k = 0; j < courses.length; j++) {

                    if (j != i) {
                        newCourses[k] = courses[j];
                        k++;
                    }
                }

                courses = newCourses;

                return true;
            }
        }

        return false;
    }
}
