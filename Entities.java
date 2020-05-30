import java.io.Serializable;
import java.util.Date;

public class Entities implements Serializable {
    private Integer Id;
    private String Code;
    private Date RegisterDate;
    private transient Double Salary;

    public Entities(Integer id, String code, Date registerDate, Double salary) {
        Id = id;
        Code = code;
        RegisterDate = registerDate;
        Salary = salary;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public Date getRegisterDate() {
        return RegisterDate;
    }

    public void setRegisterDate(Date registerDate) {
        RegisterDate = registerDate;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }
}

