package insuranceManagementSystem;

import java.util.Date;

class TravelInsurance extends Insurance {
    public TravelInsurance(String name, double fee, Date startDate, Date endDate) {
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
