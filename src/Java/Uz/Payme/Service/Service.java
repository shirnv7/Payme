package Java.Uz.Payme.Service;

import Java.Uz.Payme.Util.Input;

public class Service {
    public static void Information() {
        while (true) {
            System.out.println("""
                    1. Habarlar
                    2. Hujatlar
                    3. Tenderlar

                    0. Orqaga 🔙
                    """);
            int choice = Input.num("Bo'limlardan birini tanlang: ");
            switch (choice) {
                case 1 -> showHabarlar();
                case 2 -> showHujjatlar();
                case 3 -> {
                    System.out.println("Hali tenderlar mavjud emas, keyinroq qaytib keling.🙂");
                }
                case 0 -> {
                    return;
                }
                default -> System.out.println("Noto'g'ri tanlov, qaytadan urinib ko'ring.🤖");
            }
        }
    }

    private static void showHabarlar() {
        while (true) {
            System.out.println("""
                    1. 7-maydan payme card ishlatishda cheklovlar paydo bo'ladi
                    2. Payme’da identifikatsiyadan o‘ting va o‘nta iPhone 15 Pro dan birini yutib olish imkoniyatini qo‘lga kiriting
                    3. Shaq-Shaq o‘ynang va iPhone 15 Pro yutib oling!
                    4. Bu kimning avtomobili? Balki siznikidir? Payme bilan orzungizdagi avtomobilni yutib oling!
                    5. Payme Salom - birinchi pul o'tkazmasi yoki to'lovingiz bilan pul mukofotini yutib oling!

                    0. Orqaga 🔙
                    """);
            int choice = Input.num("Bo'limlardan birini tanlang: ");
            switch (choice) {
                case 1 -> System.out.println("""
                        \n
                        E CARD tizimida elektron pullarni chiqarishni to‘xtatish va payme card (elektron hamyon) ni yopish to‘g‘risida xabarnoma
                        Hurmatli mijozlar,
                        2025-yil 7-maydan boshlab elektron pullar chiqarilishi to‘xtatiladi.
                        Shu munosabat bilan payme card (elektron hamyon) hamyonlarini ochish va to‘ldirish to‘xtatiladi.
                        Payme card hamyonidan pul mablag‘larini bank kartalariga yechib olish funksiyasi 2025-yil 30-avgust kunining oxirigacha mavjud bo‘ladi.
                        Iltimos, elektron hamyonlardan mablag‘larni oldindan yechib oling.
                        2025-yil 30-avgust kuni kun oxirigacha elektron hamyonlarda saqlanayotgan va talab qilib olinmagan pul mablag‘larini olish bo‘yicha alohida bog‘lanish amalga oshiriladi.
                        """);
                case 2 -> System.out.println("""
                        \n
                        Yangi iPhone 15 Pro egasi bo‘lishni istaysizmi?
                        Payme sizga shunday imkoniyatni taqdim etadi! Buning uchun o‘yinda ishtirok eting.
                        Ishtirok etish shartlari:
                        Ishtirok etish uchun 6-iyulga qadar payme ilovasida identifikatsiyadan o‘ting.
                        Tayyor, tabriklaymiz, shundan so‘ng siz o‘yin ishtirokchisiga aylanasiz!
                        Agar siz avval identifikatsiyadan o‘tgan bo‘lsangiz, avtomatik ravishda aksiyada ishtirok etasiz.
                        """);
                case 3 -> System.out.println("""
                        \n
                        20-apreldan boshlab sizda iPhone 15 Pro, turli promokodlar va ko‘plab pul mukofotlarini yutib olish imkoniyati mavjud!
                        Qanday ishtirok etish mumkin?
                        Shaq-Shaq bo‘limiga o‘ting, haftalik vazifa haqida bilib oling va uni hafta davomida bajaring.
                        Vazifa har bir ishtirokchi uchun individual bo‘lib, unga pul o‘tkazmasi, xizmatlar uchun to‘lov va identifikatsiyadan o‘tish kiradi.
                        Har shanba kuni soat 18:00 da Shaq-Shaq bo‘limida turli sovrinlar o‘ynaladi,
                        Unda siz turli qimmatbaho sovg‘alar va bosh sovrin – iPhone 15 Pro o‘yinida ishtirok etish uchun ishtirokchi raqamini qo‘lga kiritishingiz mumkin.
                        """);
                case 4 -> System.out.println("""
                        \n
                        Payme yangi aksiyani e’lon qiladi:
                        4-apreldan ilovaning har bir foydalanuvchisi — BYD Han avtomobili bosh sovrinini yutib olish imkoniyatiga ega.
                        Qanday ishtirok etish mumkin?
                        Aksiyada ishtirok etish uchun Payme ilovasi orqali pul o‘tkazmalarini amalga oshirish kifoya.
                        100 000 so‘m va undan ortiq pul o‘tkazmalari uchun foydalanuvchi oltin chiptaga ega bo‘ladi.
                        Uch oylik muddat yakunida barcha to‘plangan chiptalar bosh sovrin - avtomobil o‘yinida ishtirok etadi.
                        """);
                case 5 -> System.out.println("""
                        \n
                        Payme Salom - birinchi pul o'tkazmasi yoki to'lovingiz bilan pul mukofotini yutib oling!
                        26-fevral kuni soat 15:30 dan 28-martgacha (shu jumladan) siz oddiy amallarni bajarib,
                        Pul mukofotlarini yutib olish imkoniyatiga egasiz – kartani biriktiring va to‘lovlarni amalga oshiring!
                        Bu qanday ishlaydi?
                        Aksiya vaqtida kartangizni qo‘shib, birinchi pul o‘tkazmangiz yoki to‘lovni amalga oshiring.
                        Qanchaligi muhim emas - siz amalga oshiradigan har qanday to‘lov sizga avtomatik ravishda g‘alaba qozonish imkoniyatini beradi!
                        """);
                case 0 -> {
                    return;
                }
                default -> System.out.println("Noto'g'ri tanlov, qaytadan urinib ko'ring.🤖");
            }
        }
    }

    private static void showHujjatlar() {
        while (true) {
            System.out.println("""
                    1. 02.07.2024 yildagi 25-sonli muhim faktlar
                    2. 23.08.2024 yildagi 20-sonli muhim faktlar
                    3. 24.09.2024 yildagi 20-sonli muhim faktlar
                    4. 15.10.2024 yildagi 21-sonli muhim faktlar
                    5. 15.10.2024 yildagi 21-sonli muhim faktlar
                    6. 04.11.2024 yildagi 21-sonli muhim faktlar

                    0. Orqaga 🔙
                    """);
            int choice = Input.num("Bo'limlardan birini tanlang: ");
            if (choice == 0) {
                return;
            } else if (choice >= 1 && choice <= 6) {
                System.out.println("Hujjatlar hali tayyor emas, keyinroq qaytib keling.🙂");
            } else {
                System.out.println("Noto'g'ri tanlov, qaytadan urinib ko'ring.🤖");
            }
        }
    }

    public static void Help() {
        System.out.println("""
                Qo’llab quvvatlash markazining telefon raqami:
                1350

                Jismoniy va yuridik shaxslarning murojaatlari uchun:
                Fidokor, 10B
                """);
    }
}
