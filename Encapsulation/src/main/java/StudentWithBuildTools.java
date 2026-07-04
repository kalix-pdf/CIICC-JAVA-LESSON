import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter

public class StudentWithBuildTools {
    private long id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;

}