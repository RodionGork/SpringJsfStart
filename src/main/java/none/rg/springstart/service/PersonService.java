package none.rg.springstart.service;

import org.springframework.stereotype.*;


@Service
public class PersonService {
    
    public PersonService() {
        System.err.println("PERSON SERVICE CONSTRUCTOR");
    }
    
    public int getVersion() {
        return 195;
    }
    
}
