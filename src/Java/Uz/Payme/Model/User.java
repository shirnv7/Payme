package Java.Uz.Payme.Model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class User {
    private String id;
    private String fullName;
    private String phoneNumber;
    private String password;
    private double balance;
}
