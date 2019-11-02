import java.util.List;

@Entity(name = "profesor")
@NamedQueries(value =
        {
                @NamedQuery(name = "Profesor.getAll", query = "SELECT p FROM profesor p")
        })

public class Profesor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_profesor;

    private String ime;

    private String priimek;

    private String katedra;

    @OneToMany
    private List<Tema> teme;

    public Integer getId_profesor() {
        return id_profesor;
    }

    public String getIme() {
        return ime;
    }

    public String getPriimek() {
        return priimek;
    }

    public String getKatedra() {
        return katedra;
    }

    public List<Tema> getTeme() {
        return teme;
    }

    public void setId_profesor(Integer id_profesor) {
        this.id_profesor = id_profesor;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPriimek(String priimek) {
        this.priimek = priimek;
    }

    public void setKatedra(String katedra) {
        this.katedra = katedra;
    }

    public void setTeme(List<Tema> teme) {
        this.teme = teme;
    }
}
