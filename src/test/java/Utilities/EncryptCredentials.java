package Utilities;

public class EncryptCredentials {
	public static void main(String[] args) throws Exception {
        String username = "";
        String password = "";
        String encryptedUsername = EncryptionUtil.encrypt(username);
        String encryptedPassword = EncryptionUtil.encrypt(password);
        System.out.println("Encrypted Username: " + encryptedUsername);
        System.out.println("Encrypted Password: " + encryptedPassword);
    }
}
