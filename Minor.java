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

private String[] biomed = {
    "BMES 2104 - Introduction to Biomedical Engineering",
    "BMES 4064 - Introduction to Medical Physiology",
    "BMES 3004 - Helmet Design: Biomechanics to Health & Social Disparities in Sports",
    "BMES 3124 - Introduction to Biomechanics",
    "BMES 3134 - Introduction to Biomedical Imaging",
    "BMES 3144 - Biomedical Devices",
    "BMES 3154 - Biosignal Processing and Classification",
    "BMES 3164 - Fundamentals of Regenerative Medicine and Tissue Engineering",
    "BMES 3224 - Automobile Safety",
    "BMES 3704 - Computer Aided Design for Biomedical Engineering Applications",
    "BMES 4034 - Wearable Bioinstrumentation",
    "BMES 4084 - Cellular and Molecular Technologies in Biomedical Engineering",
    "BMES 4134 - Global, Societal, and Ethical Considerations in Biomedical Engineering",
    "BMES 4154 - Commercialization of BME Res"
};


// computer science

private String[] cs = {
    "CS 1114 - Introduction to Software Design",
    "CS 2114 - Software Design and Data Structures",
    "MATH 2534 - Introduction to Discrete Mathematics",
    "CS 2505 - Introduction to Computer Organization",
    "CS 3114 - Data Structures and Algorithms",
    "CS 3214 - Computer Systems",
    "CS 4104 - Data and Algorithm Analysis"
};


// cybersecurity

private String[] cyber = {
    "ECE 4560 - Computer and Network Security Fundamentals",
    "CS 4264 - Principles of Computer Security",
    "ECE/CS 5560 - Fundamentals of Info Security",
    "ECE 3564 - Introduction to Computer Networking",
    "CS 3214 - Computer Systems",
    "ACIS 4684 - Information Systems Security and Assurance",
    "CS 4274 - Secure Computing Capstone",
    "ECE 4944 - Cybersecurity Seminar"
};


// human-computer interaction

private String[] hci = {
    "HIST/SOC/STS 2604 - Introduction to Data in Social Context",
    "COMM 2084 - Media and Society",
    "CS 3724 - Introduction to Human-Computer Interaction",
    "IDS 2214 - IDS Studio for Minors",
    "CS 3714 - Mobile Software Development",
    "CS 4774 - Human-Computer Interaction Design Experience"
};


// artificial intelligence

private String[] ai = {
    "CS 1114 - Introduction to Software Design",
    "CS 2104 - Introduction to Problem Solving in Computer Science",
    "CS 3804 - Foundations and Applications of Artificial Intelligence",
    "PHIL 3334 - Ethical Perspectives on Artificial Intelligence",
    "GEOG 4094 - Generative AI Applications in Social Science",
    "MKTG 4114 - Introduction to AI in Marketing"
};


// engineering science and mechanics

private String[] esm = {
    "ESM 2104 - Statics",
    "ESM 2204 - Mechanics of Deformable Bodies",
    "ESM 2304 - Dynamics",
    "ESM 3234 - Fluid Mechanics I-Control Volume Analysis",
    "ESM 3124 - Dynamics II - Analytical and 3-D Motion",
    "ESM 4105 - Engineering Analysis of Physiologic Systems",
    "AOE 4065 - Air Vehicle Design"
};


// green engineering

private String[] green = {
    "ENGR 3124 - Introduction to Green Engineering",
    "ENGR 4134 - Environmental Life Cycle Assessment",
    "BC 3014 - Building Physics and Environmental Systems",
    "CHE 3144 - Mass Transfer",
    "AAEC 3314 - Environmental Law",
    "ARCH 4055 - Environment and Building Systems"
};


// naval engineering

private String[] naval = {
    "AOE 2204 - Introduction to Ocean Engineering",
    "AOE 4264 - Principles of Naval Engineering",
    "AOE 4244 - Naval and Marine Engineering Systems Design",
    "AOE 3134 - Air Vehicle Dynamics",
    "AOE 3154 - Astromechanics",
    "ECE 3054 - Electrical Theory"
};


// nuclear engineering

private String[] nuclear = {
    "MATH 2214 - Introduction to Differential Equations",
    "NSEG 3145 - Fundamentals of Nuclear Engr",
    "NSEG 3146 - Fundamental of Nuclear Engr",
    "NSEG 3604 - Radiation Detection, Protection and Shielding",
    "NSEG 4204 - Nuclear Fuel Cycle",
    "NSEG 4974 - Independent Study"
};


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
