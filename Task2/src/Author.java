public class Author {
    private String name;
    private String email;
    private boolean isMale;
    public Author(String name, String email, boolean isMale){
        this.name = name;
        setEmail(email);
        this.isMale = isMale;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setEmail(String email) {
        if(email.length()>5) {
            this.email = email;
        }
        else System.out.println("You typed something wrong");
    }
    @Override
    public String toString(){
        return name + " " + "(is male?:" + isMale + ") " + email;
    }
}

