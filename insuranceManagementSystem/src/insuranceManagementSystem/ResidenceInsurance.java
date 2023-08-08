package insuranceManagementSystem;

import java.util.Date;

class ResidenceInsurance extends Insurance {
    public ResidenceInsurance(String name, double fee, Date startDate, Date endDate) {
        super(name, fee, startDate, endDate);
    }

    @Override
    public void calculate() {
        
    }

	@Override
	protected void setFee() {
		// TODO Auto-generated method stub
		
	}
}
