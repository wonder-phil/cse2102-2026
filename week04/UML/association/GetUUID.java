import java.util.UUID;

public class GetUUID {
    
    public static void main(String[] args) {
        // Generate a random UUID object
        UUID uuid = UUID.randomUUID();
        
        String uuidString = uuid.toString();
        
        System.out.println("UUID String: " + uuidString);
    }

    public String getUUID() {

        UUID uuid = UUID.randomUUID();
        String uuidString = uuid.toString();

        return uuidString;
    }
}
