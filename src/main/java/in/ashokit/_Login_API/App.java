package in.ashokit._Login_API;

import in.ashokit.security.service.PasswordService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    PasswordService service = new PasswordService();
    String encrypted = service.encrypt("Chandana@1234");
    System.out.println("Encrypted: " + encrypted);
    String decrypted = service.decrypt(encrypted);
    System.out.println("Decrypted: "+ decrypted);
    }
}
