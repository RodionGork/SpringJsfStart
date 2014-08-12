package none.rg.springstart.web;

import javax.annotation.*;
import none.rg.springstart.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.*;


@Component("personBean")
@Scope("request")
public class PersonBean {
    
    private String value;
    
    private String name;
    
    @Autowired
    private PersonService personService;
    
    public PersonBean() {
        value = ":" + Math.random();
    }
    
    @PostConstruct
    public void init() {
        System.err.println("PERSON BEAN POST_CONSTRUCT");
    }
    
    public String getValue() {
        return value;
    }
    
    public void surprize() {
        System.err.println("SURPRIZE!!! " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
