@Entity(name = "prijava")
@NamedQueries(value =
        {
                @NamedQuery(name = "Prijava.getAll", query = "SELECT p FROM prijava p")
        })

public class Prijava {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_prijava;

    private String datum;

    @ManyToOne
    @JoinColumn(name = "id_tema")
    private Tema tema;

    @ManyToOne
    @JoinColumn(name = "vpisna_st")
    private Student student;

    public Integer getId_prijava() {
        return id_prijava;
    }

    public String getDatum() {
        return datum;
    }

    public Tema getTema() {
        return tema;
    }

    public Student getStudent() {
        return student;
    }

    public void setId_prijava(Integer id_prijava) {
        this.id_prijava = id_prijava;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public void setTema(Tema tema) {
        this.tema = tema;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
