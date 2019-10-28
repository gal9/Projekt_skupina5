@Entity(name = "tema")
@NamedQueries(value =
        {
                @NamedQuery(name = "Tema.getAll", query = "SELECT t FROM tema t")
        })

public class Tema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_tema;

    private String naslov;

    private String opis;

    @ManyToOne
    @JoinColumn(name = "id_profesor")
    private Profesor profesor;

    public void setId_tema(Integer id_tema) {
        this.id_tema = id_tema;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Integer getId_tema() {
        return id_tema;
    }

    public String getNaslov() {
        return naslov;
    }

    public String getOpis() {
        return opis;
    }

    public Profesor getProfesor() {
        return profesor;
    }
}
