import java.util.ArrayList;




public class userDB {
public static ArrayList<userAccount> db = new ArrayList<>();
public userDB() {
	}

public void register(userAccount account) {
	db.add(account);
	for (int i =0;i < db.size();i++) {
		System.out.println(db.get(i).getEmail());
		System.out.println(db.get(i).getPassword());
	}
	System.out.println(db);
}
public void delete(userAccount account) {
	if (db.contains(account)) db.remove(account);
}
public boolean login(String email,String psd) {
	for (int i=0;i < db.size();i++) {
		if (db.get(i).getEmail().equals(email) && db.get(i).getPassword().equals(psd)) return true;
		
	}
	return false;
}

}
