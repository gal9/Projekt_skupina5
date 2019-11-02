import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class UporabnikiZrno {

    @PersistenceContext(unitName = "razpisovanje-tem-jpa")
    private EntityManager em;

    public List<Student> getStudenti() {

        // implementacija

    }
}