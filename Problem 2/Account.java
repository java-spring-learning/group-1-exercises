public class Account {

    public String firstName;
    public String lastName;
    public String acctNumber;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String setAcctNumber(String acctNumber) {
        this.acctNumber = acctNumber;
        return acctNumber;
    }
}
