package ru.eltex;

/**
 * The class Company.
 */
class Company extends Individual{
    private int id;
    private String companyName;
    private String surname;
    private String name;
    private String phone;
    private String job;

    /**
     * Instantiates a new Company.
     */
    Company(){
        super();
        this.id = ENV.COMPANY_ID;
        ENV.COMPANY_ID++;
        this.companyName = "Eltex";
    }

    /**
     * Instantiates a new Company.
     *
     * @param id          the id
     * @param companyName the company name
     * @param surname     the surname
     * @param name        the name
     * @param phone       the phone
     * @param job         the job
     */
    Company(int id,
            String companyName,
            String surname,
            String name,
            String phone,
            String job){
        super(id, surname, name, phone, job);
        this.id = id;
        this.companyName = companyName;
    }

    /**
     * To string string.
     *
     * @return the string.
     */
    public String toString() {
        return this.id + " " + "company - " + this.companyName + ", " + super.toString();
    }
}
