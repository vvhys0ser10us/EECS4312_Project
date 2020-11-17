import java.util.ArrayList;




public class userDB {

public userDB() {
	}

public void register(userAccount account) {
	welcome.db.add(account);
	for (int i =0;i < welcome.db.size();i++) {
		System.out.println(welcome.db.get(i).getEmail());
		System.out.println(welcome.db.get(i).getPassword());
	}
	System.out.println(welcome.db);
}
public void delete(userAccount account) {
	if (welcome.db.contains(account)) welcome.db.remove(account);
}
public boolean login(String email,String psd) {
	for (int i=0;i < welcome.db.size();i++) {
		if (welcome.db.get(i).getEmail().equals(email) && welcome.db.get(i).getPassword().equals(psd)) return true;
		
	}
	return false;
}

}
