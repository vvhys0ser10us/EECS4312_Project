
import javax.swing.JOptionPane;

public class officerDB {
	

public officerDB() {
	}

public void register(officerAccount account) {
	welcome.officer.add(account);
}
public void delete(String email) {
	for (int i =0;i < welcome.db.size();i++) {
		if (welcome.officer.get(i).getEmail().equals(email)) {
			welcome.officer.remove(i);
			welcome.officerlist.remove(email);
		}
	}
}
public boolean login(String email,String psd) {
	for (int i=0;i < welcome.officer.size();i++) {
		if (welcome.officer.get(i).getEmail().equals(email) && welcome.officer.get(i).getPassword().equals(psd)) {
			officerIn a = new officerIn();
			a.run();
			return true;
		}
	}
	return false;
}
public void add_officer(String email) {
	welcome.officerlist.add(email);
}

}
