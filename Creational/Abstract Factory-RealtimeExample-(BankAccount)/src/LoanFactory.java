
public class LoanFactory implements AbstractFactory {

	@Override
	public Account getAccount(String type) {
		Account account = null;

		if ("Home".equalsIgnoreCase(type)) {
			account = new HomeLoan();
		} else if ("Education".equalsIgnoreCase(type)) {
			account = new EducationalLoan();
		}

		return account;
	}

}
