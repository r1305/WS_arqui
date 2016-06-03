/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arqui.sw;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Julian
 */
@WebService(serviceName = "Compara")
public class Compara {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "comparar")
    public String comparar(@WebParam(name = "texto1") String texto1, @WebParam(name = "texto2") String texto2) {
        //TODO write your implementation code here:
        String mayor="";
        
        if(texto1.length()>texto2.length()){
            mayor=texto1;
        }else if(texto1.length()<texto2.length()){
            mayor=texto2;
        }else{
            mayor=texto1;
        }
        
        return mayor;
    }
}
