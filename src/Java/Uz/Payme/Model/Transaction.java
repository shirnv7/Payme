package Java.Uz.Payme.Model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Transaction {
    private String id;
    private String fromUserPhone;
    private String toUserPhone;
    private double amount;
    private String type;
    private String date;
}
