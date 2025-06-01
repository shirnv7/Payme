package Java.Uz.Payme.Service;

import Java.Uz.Payme.Data.Database;
import Java.Uz.Payme.Model.User;
import Java.Uz.Payme.Util.Input;

public class AuthService {
    private static int idCounter = 1;

    public static void CreateUser() {
        String fullName = Input.str("Ismingizni kiriting: ");
        String phone = Input.str("Telefon raqamingizni kiriting: ");
        String password = Input.str("Parolingizni kiriting: ");
        int balance = Input.num("Hisobingiz balansini kiriting: ");

        Database.USERS.add(
                new User(
                        String.valueOf(idCounter++),
                        fullName,
                        phone,
                        password,
                        balance
                )
        );
        System.out.println("✅ Foydalanuvchi muvaffaqiyatli yaratildi!");
        PaymentService.PaymentMenu();
    }

    public static void Login() {
        String phone = Input.str("Telefon raqamingizni kiriting: ");
        String password = Input.str("Parolingizni kiriting: ");

        boolean found = false;
        for (User user : Database.USERS) {
            if (user.getPhoneNumber().equals(phone) && user.getPassword().equals(password)) {
                System.out.println("✅ Xush kelibsiz, " + user.getFullName() + "!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("❌ Telefon raqami yoki parol xato!");
        }
    }
}
