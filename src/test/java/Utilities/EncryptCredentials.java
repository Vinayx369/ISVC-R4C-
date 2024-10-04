package Utilities;

public class EncryptCredentials {
	public static void main(String[] args) throws Exception {
        String username = "r4cl1agent02@intel.com.isvcqa24";
        String password = "Intel@369";

        String encryptedUsername = EncryptionUtil.encrypt(username);
        String encryptedPassword = EncryptionUtil.encrypt(password);

        System.out.println("Encrypted Username: " + encryptedUsername);
        System.out.println("Encrypted Password: " + encryptedPassword);
    }
}
