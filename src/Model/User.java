package Model;
/**This class creates a User object as well as getters.*/
public class User {
    private final int id;
    private final String name;
    private final String password;
    /**This method constructs a user object.
     * @param id User ID.
     * @param name User Name.
     * @param password User password. */
    public User(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }
    /**Getter for User ID.
     * Gets the User ID.
     * @return id.*/
    public int getId() {
        return id;
    }
    /**Getter for Username.
     * Gets the Username.
     * @return name.*/
    public String getName(){
        return name;
    }
    /**Getter for User Password.
     * Gets the User Password.
     * @return password.*/
    public String getPassword() {
        return password;
    }
    /**This method returns a string used for formatting the combo boxes.
     * @return String*/
    @Override
    public String toString() {
        return ("[" + getId() + "] " + getName());
    }
}

