package day20;

public interface Command {

	public void execute();
	}class DeathCertificate implements Command{
		MedicalDepartment hospital;PoliceDepartment police;Corporation coporation;
		public DeathCertificate(MedicalDepartment md,PoliceDepartment pd,Corporation c) {
			this.hospital=md;
			this.police=pd;
			this.coporation=c;
		}
		@Override
		public void execute() {
			System.out.println("set of instruction to carry out the command death certificate....");
			System.out.println("started the work....to get death certif");
			//here i will write the logic....
			police.enquiry();
			hospital.doPostMortem();
			hospital.deathDeclaration();
			coporation.deathCertificate();
			System.out.println("Take the death certificate..");
		}
	}class HotelOpeningCertificate implements Command{
		HealthDepartment health;PoliceDepartment police;Corporation coporation;
		public HotelOpeningCertificate(HealthDepartment md,PoliceDepartment pd,Corporation c) {
			this.health=md;
			this.police=pd;
			this.coporation=c;
		}
		@Override
		public void execute() {
			System.out.println("set of instruction to carry out the command open hotel certificate....");
			System.out.println("started the work....to get open hotel certi..");
			//here i will write the logic....
			health.healthCertificate();
			police.clearance();
			coporation.hotelCertificate();
			System.out.println("Take the open hotal  certificate..");
		}
	}
