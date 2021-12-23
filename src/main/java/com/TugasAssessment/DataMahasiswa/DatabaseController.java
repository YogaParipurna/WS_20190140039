
package com.TugasAssessment.DataMahasiswa;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 *
 * @author Yapart
 */
@Controller
public class DatabaseController {
    @CrossOrigin
    @GetMapping(value = "/mahasiswajson", produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public List<Mahasiswa> getMahasiswa(){
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
