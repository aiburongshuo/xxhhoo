package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class Studentser {
		
	@Autowired(required=false)
	
	Iteacher teac;
	
	@Autowired(required=false)
	Itea tea;
			
	public void setTeac(Iteacher teac) {
		this.teac =teac;
	}



	public void add(){
			
			System.out.println("≈Ù∏Á∫√Àß");
			//teac.su();
		}
}
