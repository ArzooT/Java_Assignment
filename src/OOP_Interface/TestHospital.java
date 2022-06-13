package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FortisHospital fh=new FortisHospital();
		fh.cardioServices();
		fh.detalServices();

		fh.EmergencyServices();
		fh.MedicalTraining();
		fh.oncologyServices();
		fh.optClininc();
		
		
		
		//top casting
		
		UKMedical ukm=new FortisHospital();
		ukm.oncologyServices();
		ukm.pediaServices();
		
		
	}

}
