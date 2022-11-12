package ru.eltex;

/**
 * The class User.
 */
public class User {
    private int id;
    private String surname;
    private String name;
    private String phone;
    private String job;

    /**
     * Instantiates a new User.
     */
    User(){
        this.id = ENV.USER_ID;
        ENV.USER_ID++;
        this.surname = "Ivanov";
        this.name = "Ivan";
        this.phone = "2000000";
        this.job = "Janitor";
    }

    /**
     * Instantiates a new User.
     *
     * @param id      the id
     * @param surname the surname
     * @param name    the name
     * @param phone   the phone
     * @param job     the job
     */
    User(int id,
         String surname,
         String name,
         String phone,
         String job){
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.phone = phone;
        this.job = job;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Gets surname.
     *
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets phone.
     *
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Gets job.
     *
     * @return the job
     */
    public String getJob() {
        return job;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Sets surname.
     *
     * @param surname the surname
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets phone.
     *
     * @param phone the phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Sets job.
     *
     * @param job the job
     */
    public void setJob(String job) {
        this.job = job;
    }
    /**
     * To string String.
     *
     * @return the string
     */
    @Override
    public String toString() {
        return id + " " + surname + " " + name + " " + phone + " " + job;
    }
}
