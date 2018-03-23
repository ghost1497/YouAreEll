public class ID {
    private String userid;
    private String github;
    private String name;

    public ID( String githubid, String name) {
        this.userid = "0";
        this.github = githubid;
        this.name = name;
    }

    public String getUserid() {
        return userid;
    }

    public String getGithub() {
        return github;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ID{" +

                "github='" + github + '\'' +
                ", name='" + name + '\'' +
                ",userid='" + userid + '\'' +
                '}';
    }
}
