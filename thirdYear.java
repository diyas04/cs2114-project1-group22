import java.util.Arrays;

public class thirdYear {

    // aero + ocean

    private String[] aerospaceAndOceanFall = {
        "AOE 3014 - Fluid Dynamics for Aerospace and Ocean Engineers",
        "AOE 3034 - System Dynamics and Control",
        "AOE 3124 - Aerospace Structures", "AOE 3154 - Astromechanics",
        "MATH 4564 - Operational Methods for Engineers" };

    private String[] aerospaceAndOceanSpring = {
        "AOE 3054 - Experimental Methods",
        "AOE 3114 - Aerodynamics & Compressibility",
        "AOE 3134 or AOE 3144 - Air Vehicle Dynamics or Space Vehicle Dynamics",
        "AOE 3164 - Aerothermodynamics and Propulsion Systems",
        "Track Technical Elective" };

    // biological systems

    private String[] biologicalSystemsFall = {
        "BSE Fundamental Course or Technical Elective",
        "BSE 3154 - Thermodynamics of Biological Systems",
        "STAT 3704 - Statistics for Engineering Applications",
        "ESM 3024 - Introduction to Fluid Mechanics", "CHEM Elective",
        "Pathways Core Concept 2, 3, 6a, or 7" };

    private String[] biologicalSystemsSpring = {
        "BSE 3144 - Engineering Analysis for Biological Systems using Numerical Methods",
        "BSE 3504 - Transport Processes in Biological Systems",
        "BSE Technical/Fundamental Elective",
        "BSE Technical/Fundamental Elective",
        "Pathways Core Concept 2, 3, 6a, or 7" };

    // biomedical

    private String[] biomedicalFall = {
        "BMES 3024 - BME Cell Engineering Laboratory and Design",
        "ESM 3234 - Fluid Mechanics I - Control Volume Analysis",
        "ESM 2204 - Mechanics of Deformable Bodies",
        "STAT 3615 or STAT 4604 - Biological Statistics or Statistical Methods for Engineers",
        "BMES 4064 - Introduction to Medical Physiology",
        "ENGE 3900 - Bridge Experience" };

    private String[] biomedicalSpring = {
        "BMES 3034 - Bioinstrumentation Laboratory and Design for Living Systems",
        "BMES 3184 - Problem Solving in BME", "Technical Elective",
        "Technical Elective", "Pathways 2 or 3" };

    //building construction

    private String[] buildingConstructionFall = {
        "BC 3064 - Integrated Construction II",
        "BC 3114 - Building Systems Technology",
        "BC 3134 - Temporary Structures in Construction",
        "CEM 3084 - Construction Economy", "Free Elective" };

    private String[] buildingConstructionSpring = {
        "BC 4164 - Production Planning and Process Design for Construction",
        "MGT 3304 - Management Theory and Leadership Practice",
        "Business & Management Elective", "Technical Elective",
        "Technical Elective" };

    // chemical

    private String[] chemicalFall = { "CHE 3114 - Fluid Transport",
        "CHE 3124 - Chemical Engineering Simulations and Process Modeling",
        "CHE 3185 - Chemical Reactor Analysis and Design",
        "ENGL 3764 - Technical Writing",
        "Elective - Pathways Concept 2, 3, or 7" };

    private String[] chemicalSpring = {
        "CHEM 3625 - Physical Chemistry Laboratory",
        "CHE 3015 - Process Measurement & Control",
        "CHE 3154 - Heat Transfer Analysis", "CHE 3144 - Mass Transfer",
        "STAT 4604 or STAT 4705 - Statistics/Probability for Engineers" };

    // civil

    private String[] civilFall = {
        "CEE 3304 - Fluid Mechanics for Civil and Environmental Engineering",
        "ISE 2014 - Engineering Economy", "CEE Fundamental Elective with Lab",
        "CEE Fundamental Elective", "Pathways",
        "ENGE 3900 - Bridge Experience" };

    private String[] civilSpring = {
        "CEE 3814 - Analytical Tools in Civil and Environmental Engineering",
        "CEE Fundamental Elective with Lab", "CEE Fundamental Elective",
        "CEE Fundamental Elective",
        "CEE 4804 - Professional and Legal Issues in Civil Engineering" };

    // Comp Eng

    private String[] computerEngineeringFall = {
        "ECE 2714 - Signals and Systems",
        "ECE 3504 - Principles of Computer Architecture",
        "ECE 3514 - Data Structures & Algorithms",
        "ECE 3544 - Digital Design I",
        "STAT 4714 - Probability and Statistics for Electrical Engineers" };

    private String[] computerEngineeringSpring = {
        "ECE 3574 - Applied Software Design", "Secondary Focus Elective",
        "Technical Elective", "Pathways 2, 3, or 6a", "Free Elective" };

    // Comp sci

    private String[] computerScienceFall = {
        "CS 3114 - Data Structures and Algorithms",
        "CS 3/4/5XXX - Computer Science Elective",
        "MATH 3134 - Applied Combinatorics and Graph Theory",
        "Professional Writing Elective", "Pathways 2, 3, 6a, or 7" };

    private String[] computerScienceSpring = { "CS 3214 - Computer Systems",
        "CS 3604 - Professionalism in Computing",
        "ENGE 3900 - Bridge Experience", "Statistics Elective",
        "Pathways 2, 3, 6a, or 7", "Pathways 2, 3, 6a, or 7" };

    // Construction engineering and management

    private String[] constructionFall = {
        "BC 3114 - Building Systems Technology",
        "CEE 3404 - Introduction to Structural Engineering",
        "CEE 3684 - Civil Engineering Materials",
        "CEM 3024 - Construction Estimating and Scheduling",
        "CEM 3084 - Construction Economy", "ENGE 3900 - Bridge Experience" };

    private String[] constructionSpring = {
        "BC 3064 - Integrated Construction II",
        "CEE 3514 - Introduction to Geotechnical Engineering",
        "CEM 3134 - Temporary Structures in Construction",
        "ECON 2005 - Principles of Economics", "Pathway 2 or 7" };

    // electrical

    private String[] electricalFall = { "ECE 3004 - AC Circuit Analysis",
        "ECE 3074 - AC Circuit Design Laboratory",
        "ECE 3105 - Electromagnetic Fields",
        "STAT 4714 - Probability and Statistics for Electrical Engineers",
        "Secondary Focus Elective",
        "Pathways Concept 3 - Reasoning in the Social Sciences" };

    private String[] electricalSpring = { "ECE 3106 - Electromagnetic Fields",
        "ECE 3204 - Analog Electronics",
        "ECE 3274 - Analog Electronics Laboratory", "Secondary Focus Elective",
        "Pathways Concept 3 - Reasoning in the Social Sciences" };

    // industrial and systems

    private String[] industrialAndSystemsFall = {
        "ISE 3034 - Technical Communication for Engineers",
        "ISE 3214 - Facilities Planning and Logistics",
        "ISE 3414 - Probabilistic Operations Research",
        "STAT 4706 - Probability and Statistics for Engineers" };

    private String[] industrialAndSystemsSpring = {
        "ISE 3424 - Discrete-Event Computer Simulation",
        "ISE 3624 - Industrial Ergonomics",
        "ISE 4204 - Production Planning and Inventory Control",
        "ISE 4404 - Statistical Quality Control", "ISE Technical Elective" };

    // Materials sci

    private String[] materialsScienceFall = {
        "MSE 3114 - Mathematics Programming in Materials Science II",
        "MSE 3134 - Crystallography and Crystal Structures",
        "MSE 4034 - Thermodynamics of Materials Systems",
        "MSE 4424 - Materials Laboratory II",
        "ECON 2005 - Principles of Economics", "Physical Materials Course",
        "Physical Materials Course" };

    private String[] materialsScienceSpring = {
        "MSE 3044 - Transport Phenomena in MSE",
        "MSE 3054 - Mechanical Behavior of Materials",
        "MSE 3064 - Mechanical Behavior of Materials Laboratory",
        "MSE 3884 - Materials Engineering Professional Development II",
        "MSE 4644 - Materials Optimization Through Designed Experiments",
        "Physical Materials Course", "Technical Elective" };

    // MechE

    private String[] mechanicalFall = {
        "ME 3024 - Engineering Design and Economics",
        "ME 3414 - Fluid Dynamics", "ME 3524 - Mechanical Vibrations",
        "ME 3624 - Mechanical Design",
        "STAT 3704 - Statistics for Engineering Applications" };

    private String[] mechanicalSpring = { "ME 3304 - Heat and Mass Transfer",
        "ME 3534 - Controls Engineering I",
        "ME 4005 - Mechanical Engineering Lab", "Pathways 2, 3, 6a, or 7",
        "Pathways 2, 3, 6a, or 7" };

    // Mining

    private String[] miningFall = { "MINE 3604 - Mining Geomechanics",
        "MINE 3624 - Mineral Resource Project Management",
        "MINE 3634 - Fundamentals of Mineral Processing",
        "MINE 3664 - Fluids and Thermodynamics for Resources",
        "MINE 3674 - Explosives and Rock Fragmentation" };

    private String[] miningSpring = {
        "GEOS 3404 or GEOS 4824 - Structural Geology or Engineering Geology",
        "MINE 3644 - Applications in Mineral Processing",
        "MINE 3564 - Underground Mine Design",
        "MINE 3574 - Surface Mine and Quarry Design",
        "MINE 3584 - Ventilation Engineering", "Pathways Concept 6a" };


    private String[] courses = {};

    /**
     * Selects the third year schedule corresponding to the
     * engineering major entered by the user.
     */
    public void sortMajor(String major) {

        if (major == null) {
            return;
        }

        if (major.equals("Aerospace and Ocean")) {
            courses = combineSemesters(aerospaceAndOceanFall,
                aerospaceAndOceanSpring);

        }
        else if (major.equals("Biological Systems")) {
            courses = combineSemesters(biologicalSystemsFall,
                biologicalSystemsSpring);

        }
        else if (major.equals("Biomedical")) {
            courses = combineSemesters(biomedicalFall, biomedicalSpring);

        }
        else if (major.equals("Building Construction")) {
            courses = combineSemesters(buildingConstructionFall,
                buildingConstructionSpring);

        }
        else if (major.equals("Chemical")) {
            courses = combineSemesters(chemicalFall, chemicalSpring);

        }
        else if (major.equals("Civil")) {
            courses = combineSemesters(civilFall, civilSpring);

        }
        else if (major.equals("Computer Engineering")) {
            courses = combineSemesters(computerEngineeringFall,
                computerEngineeringSpring);

        }
        else if (major.equals("Computer Science")) {
            courses = combineSemesters(computerScienceFall,
                computerScienceSpring);

        }
        else if (major.equals("Construction")) {
            courses = combineSemesters(constructionFall, constructionSpring);

        }
        else if (major.equals("Electrical")) {
            courses = combineSemesters(electricalFall, electricalSpring);

        }
        else if (major.equals("Industrial and Systems")) {
            courses = combineSemesters(industrialAndSystemsFall,
                industrialAndSystemsSpring);

        }
        else if (major.equals("Materials Science")) {
            courses = combineSemesters(materialsScienceFall,
                materialsScienceSpring);

        }
        else if (major.equals("Mechanical")) {
            courses = combineSemesters(mechanicalFall, mechanicalSpring);

        }
        else if (major.equals("Mining")) {
            courses = combineSemesters(miningFall, miningSpring);
        }
    }


    /**
     * Combines Fall and Spring courses into one schedule array.
     */
    private String[] combineSemesters(String[] fall, String[] spring) {

        String[] combined = new String[fall.length + spring.length];

        for (int i = 0; i < fall.length; i++) {
            combined[i] = "Fall: " + fall[i];
        }

        for (int i = 0; i < spring.length; i++) {
            combined[fall.length + i] = "Spring: " + spring[i];
        }

        return combined;
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

        courses = Arrays.copyOf(courses, courses.length + 1);
        courses[courses.length - 1] = courseName;

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
