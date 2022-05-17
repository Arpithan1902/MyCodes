import javax.persistence.Entity;
import javax.persistence.*;

@Entity
public class CustomerMaven {
	
@Id	
private int custId;

private String custName;
private long custPhn;
private String custEmail;
public int getCustId() {
	return custId;
}
public void setCustId(int custId) {
	this.custId = custId;
}
public String getCustName() {
	return custName;
}
public void setCustName(String custName) {
	this.custName = custName;
}
public long getCustPhn() {
	return custPhn;
}
public void setCustPhn(long custPhn) {
	this.custPhn = custPhn;
}
public String getCustEmail() {
	return custEmail;
}
public void setCustEmail(String custEmail) {
	this.custEmail = custEmail;
}

}
