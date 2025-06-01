package Java.Uz.Payme;

import Java.Uz.Payme.Service.AuthService;
import Java.Uz.Payme.Service.PaymentService;
import Java.Uz.Payme.Service.PaymetService;
import Java.Uz.Payme.Service.Service;
import Java.Uz.Payme.Util.Input;

public class Main {
    public static void main(String[] args) {
        System.out.println("Assalamu alaykum Payme tizimiga xush kelibsiz! 🙂");
        while (true) {
            System.out.println("""
                    1. Ro'yxatdan o'tish
                    2. Kirish
                    
                    3. Biz haqqimizda 🚀
                    4. To'lovlar 💳
                    5. Yordam 🎧
                    0. Chiqish ❌
                    """);

            switch (Input.num("Bolimlardan birini tanlang: ")) {
                case 1 -> AuthService.CreateUser();
                case 2 -> AuthService.Login();
                case 3 -> Service.Information();
                case 4 -> PaymentService.PaymentMenu();
                case 5 -> Service.Help();
                case 0 -> {
                    return;
                }
                default -> System.out.println("Noto'g'ri tanlov, qaytadan urinib ko'ring.🤖");
            }
        }
    }
}
