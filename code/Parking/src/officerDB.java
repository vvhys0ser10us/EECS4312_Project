
import javax.swing.JOptionPane;

public class officerDB {
	

public officerDB() {
	}

public void register(officerAccount account) {
	if (welcome.officerlist.contains(account.getEmail())) {
	welcome.officer.add(account);
	for (int i =0;i < welcome.db.size();i++) {
		System.out.println(welcome.db.get(i).getEmail());
		System.out.println(welcome.db.get(i).getPassword());
	}
	System.out.println(welcome.db);
	}
	else JOptionPane.showMessageDialog(null, "Unauthrized");
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
	for (int i=0;i < welcome.db.size();i++) {
		if (welcome.officer.get(i).getEmail().equals(email) && welcome.db.get(i).getPassword().equals(psd)) return true;
	}
	return false;
}
public void add_officer(String email) {
	welcome.officerlist.add(email);
}

}
