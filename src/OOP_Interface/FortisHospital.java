package OOP_Interface;

public class FortisHospital implements USMedical,UKMedical,IndianMedical{

	@Override
	public void physioServices() {
		// TODO Auto-generated method stub
	       System.out.println("FH-physioServices");		

	}

	@Override
	public void cardioServices() {
       System.out.println("FH-cardioServices");		
	}

	@Override
	public void ENTServices() {
		// TODO Auto-generated method stub
	       System.out.println("FH-ENTServices");		

	}

	@Override
	public void EmergencyServices() {
		// TODO Auto-generated method stub
	       System.out.println("FH-EmergencyServices");		

		
	}

	@Override
	public void oncologyServices() {
		// TODO Auto-generated method stub
	       System.out.println("FH-oncologyServices");		

		
	}

	@Override
	public void pediaServices() {
		// TODO Auto-generated method stub
	       System.out.println("FH-pediaServices");		

		
	}

	@Override
	public void neuroServices() {
		// TODO Auto-generated method stub
	       System.out.println("FH-neuroServices");		

		
	}

	@Override
	public void detalServices() {
		// TODO Auto-generated method stub
	       System.out.println("FH-detalServices");		

		
	}
	
	//indivisual
	
	public void MedicalTraining()
	{
	       System.out.println("FH-MedicalTraining");		

		
	}
	
	public void optClininc()
	{
	       System.out.println("FH-optClininc");		

	}

}
