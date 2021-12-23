
package com.TugasAssessment.DataMahasiswa;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 *
 * @author Yapart
 */

@Controller
@XmlRootElement
public class XmlController {
    @CrossOrigin
    @GetMapping(value = "/mahasiswaxml", produces = {MediaType.APPLICATION_XML_VALUE})
    @ResponseBody
  
    public List<Mahasiswa> getMahasiswaXML(){
        List<Mahasiswa> mhs = new ArrayList<>();
        MahasiswaJpaController controller = new MahasiswaJpaController();
        try{
            mhs = controller.findMahasiswaEntities();
        }
        catch(Exception e){
        }
        return mhs;
    }
}
