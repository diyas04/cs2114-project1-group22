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
  private String[] biomed = {"BMES 2104", "BMES 4064", "BMES 3004", "BMES 3124", "BMES 3134", "BMES 3144", "BMES 3154", "BMES 3164", "BMES 3224", "BMES 3704", "BMES 4034", "BMES 4084", "BMES 4134", "BMES 4154"};
  // cs
  private String[] cs = {"CS 1114", "CS 2114", "MATH 2534", "CS 2505", "CS 3114", "CS 3214", "CS 4104"};
  // cybersecurity
  private String[] cyber = {"ECE 4560", "CS 4264", "ECE/CS 5560", "ECE 3564", "CS 3214", "ACIS 4684", "CS 4274", "ECE 4944"};
  // human-computer interactions
  private String[] hci = {"HIST/SOC/STS 2604", "COMM 2084", "CS 3724", "IDS 2214", "CS 3714", "CS 4774"};
  // ai
  private String[] ai = {"CS 1114", "CS 2104", "CS 3804", "PHIL 3334", "GEOG 4094", "MKTG 4114"};
  // engineering science and mechanics
  private String[] esm = {"ESM 2104", "ESM 2204", "ESM 2304", "ESM 3234", "ESM 3124", "ESM 4105", "AOE 4065"};
  // green engineering
  private String[] green = {"ENGR 3124", "ENGR 4134", "BC 3014", "CHE 3144", "AAEC 3314", "ARCH 4055"};
  // naval
  private String[] naval = {"AOE 2204", "AOE 4264", "AOE 4244", "AOE 3134", "AOE 3154", "ECE 3054"};
  // nuclear
  private String[] nuclear = {"MATH 2214", "NSEG 3145", "NSEG 3146", "NSEG 3604", "NSEG 4204", "NSEG 4974"};

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
    * Adds courses from minor to the schedule.
    *
    * @param minor String array of the courses for the major
    * @return String array of the combined major and minor courses
    */
  public String[] includeMinor(String[] majorCourses) {
    if (majorCourses.equals(null)) {
      return;
    }
    for (String minorCourse : courses) {
      for (String majorCourse : majorCourses) {
        String course = majorCourse;
        if (course.startsWith("Fall: ")) {
          course = course.substring(6);
        }
        else if (course.startsWith("Spring: ")) {
          course = course.substring(8);
        }
        if (course.equalsIgnoreCase(minorCourse)) {
          break;
        }
      }
      String[] withMinor = new String[majorCourses.length + 1];
      for (int i = 0; i < majorCourses.length; i++) {
        withMinor[i] = majorCourses[i];
      }
      withMinor[withMinor.length - 1] = "Minor: " + minorCourse;
    }
    return withMinor;
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
     * @param courseName String name of the course
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
     * @param courseName String name of the course
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
