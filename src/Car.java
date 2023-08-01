public   class Car  {
    private long id;
    private String number_auto;

    public Car(long id, String number_auto) {
        this.id = id;
        this.number_auto = number_auto;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumber_auto() {
        return number_auto;
    }

    public void setNumber_auto(String number_auto) {
        this.number_auto = number_auto;
    }

    @Override
    public String toString() {
        return "Car:" +
                "id:" + id +
                ", number_auto:" +
                number_auto;
    }
}
