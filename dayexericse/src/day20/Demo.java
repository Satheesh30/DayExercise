package day20;

public class Demo {

	static SevaDepartment myGovernment=new SevaDepartment();
	static {
		
		PoliceDepartment police=new PoliceDepartment();
		MedicalDepartment md=new MedicalDepartment();
		Corporation c=new Corporation();
		HealthDepartment hd=new HealthDepartment();
		
		DeathCertificate dc=new DeathCertificate(md,police,c);
		HotelOpeningCertificate hc=new HotelOpeningCertificate(hd, police, c);
		
		myGovernment.setCommand(dc, 0);
		myGovernment.setCommand(hc, 1);
		
		
	}
	
	public static void main(String[] args) {
		//this is what the citizen does...
		myGovernment.executeCommand(0);
	}
}

