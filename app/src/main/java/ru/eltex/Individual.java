package ru.eltex;

/**
 * The class Individual (person).
 */
class Individual {
    private int id;
    private String surname;
    private String name;
    private String phone;
    private String job;

    /**
     * Instantiates a new Individual.
     */
    Individual(){
        this.id = ENV.INDIVIDUAL_ID;
        ENV.INDIVIDUAL_ID++;
        this.surname = "Timofeev";
        this.name = "Timofei";
        this.phone = "2111111";
        this.job = "Cooker";
    }

    /**
     * Instantiates a new Individual.
     *
     * @param id      the id
     * @param surname the surname
     * @param name    the name
     * @param phone   the phone
     * @param job     the job
     */
    Individual(int id,
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
     * To string string.
     *
     * @return the string
     */
    public String toString(){
        return "individual person - " + surname + " " + name + " " + phone + " " + job;
    }
}
