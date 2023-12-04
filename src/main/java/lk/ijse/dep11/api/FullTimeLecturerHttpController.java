package lk.ijse.dep11.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/lecturers/full-time")
@CrossOrigin
public class FullTimeLecturerHttpController {

    @PatchMapping("/ranks")
    public void arrangeFullTimeLecturerOrder(){
        System.out.println("arrangeFullTimeLecturerOrder()");
    }

    public void getAllFullTimeLecturers(){
        System.out.println("getFullTimeLecturers");
    }
}
