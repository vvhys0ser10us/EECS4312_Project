
import java.util.HashMap;

public class adminDB {
private HashMap<String,String> admin;
public adminDB() {
	admin = new HashMap<>();
	admin.put("admin", "123");
}
public void add_admin(String username, String password) {
	admin.put(username, password);
}
public void delete_admin(String username, String password) {
	if (admin.containsKey(username)) admin.remove(username);
}
public boolean check(String username,String password) {
	if (admin.containsKey(username) && admin.get(username).equals(password)) return true;
	else return false;
}

}
