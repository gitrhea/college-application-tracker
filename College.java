public class College{
    private String name;
    private String publicOrPrivate;
    private String size;
    private String location;
    /**private int deadlineMonth;
    private int deadlineDay;
    private String SATorACT;
    private boolean requiresEssays;
    private boolean requiresInterview;
    **/

    public College(String name, String publicOrPrivate, String size, String location){
        this.name = name;
        this.publicOrPrivate = publicOrPrivate;
        this.size = size;
        this.location = location;
    }

    public String toString(){
        return name + " is a " + size + " " + publicOrPrivate + " institution located in " + location + ".";
    }

}
