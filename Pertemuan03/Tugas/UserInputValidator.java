public class UserInputValidator {
    public static void validateUsername(String username) {
        assert (username.length() >= 5 && username.length() <= 20) : "Panjang username harus antara 5 dan 20 karakter";
        assert (username.matches("^[a-zA-Z][a-zA-Z0-9_]*$")) : "Username harus diawali huruf dan hanya boleh mengandung huruf, angka, dan underscore";
    }

    public static void validateEmail(String email) {
        assert (email.matches("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$")) : "Format email tidak valid";
    }

    public static void validateAge(int age) {
        assert (age >= 17 && age <= 99) : "Usia harus diantara 17 dan 99 tahun";
    }
}

