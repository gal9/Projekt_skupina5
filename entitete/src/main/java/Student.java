import java.util.List;

@Entity(name = "student")
@NamedQueries(value =
        {
                @NamedQuery(name = "Student.getAll", query = "SELECT s FROM student s")
        })

public class Student {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer vpisna_st;

    private String ime;

    private String priimek;

    @OneToMany
    private List<Prijava> prijave;

    public Integer getVpisna_st() {
        return vpisna_st;
    }

    public String getIme() {
        return ime;
    }

    public String getPriimek() {
        return priimek;
    }

    public List<Prijava> getPrijave() {
        return prijave;
    }

    public void setVpisna_st(Integer vpisna_st) {
        this.vpisna_st = vpisna_st;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPriimek(String priimek) {
        this.priimek = priimek;
    }

    public void setPrijave(List<Prijava> prijave) {
        this.prijave = prijave;
    }
}