import java.util.*;

public class College{
    private String formalName = "";
    private String abbrevName = "";
    private String publicOrPrivate = "";
    private String size = ""; //small, medium, large
    private String location = "";
    private String applicationType = "";
    private Date deadline = ""; //import Date class
    private String SATorACT = "";
    private boolean requiresSuppEssays = false;
    private boolean requiresInterview = false;
    private boolean scholarshipOpportunities = false;
    private String extraNotes = "";

    public College(String formalName, String abbrevName, String publicOrPrivate, String size, String location, String applicationType, String SATorACT, boolean requiresSuppEssays, boolean requiresInterview, boolean scholarshipOpportunities, String extraNotes){
        this.formalName = formalName;
        this.abbrevName = abbrevName;
        this.publicOrPrivate = publicOrPrivate;
        this.size = size;
        this.location = location;
        this.applicationType = applicationType;
        this.SATorACT = SATorACT;
        this.requiresSuppEssays = requiresSuppEssays;
        this.requiresInterview = requiresInterview;
        this.scholarshipOpportunities = scholarshipOpportunities;
        this.extraNotes = extraNotes;
    }

    public String toString(){
        return formalName + " is a " + size + " " + publicOrPrivate + " institution located in " + location + ".";
    }

}
