import java.time.LocalDate;

public class Human {
    private String name;

    private LocalDate birthDate;

    private String cityOfResidence;

    private String position;

    public String getName() {
        return name;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
    public String getCityOfResidence() {
        return cityOfResidence;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
    public void setCityOfResidence(String cityOfResidence) {
        this.cityOfResidence = cityOfResidence;
    }
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Human(String name, LocalDate birthDate, String cityOfResidence,String position) {
        this.name = name;
        this.birthDate = birthDate;
        this.cityOfResidence = cityOfResidence;
        this.position = position;
    }
    @Override
    public String toString() {
        return "Human{" +
                "name'" + name + '\'' +
                ", birthDate=" + birthDate +
                ", cityOfResidence='" + cityOfResidence + '\'' +
                "}";
    }
}
