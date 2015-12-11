package Bean;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Max
 */
@ManagedBean
@RequestScoped
public class beanRegistro {
    @EJB
    private SessionBeanRegistroLocal sessionBeanRegistro;

  
    
    public beanRegistro() {
    }

    public String teste() {
        return "Deu mais um certo:"+sessionBeanRegistro.listRegistro();
    }

}
