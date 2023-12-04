package lk.ijse.dep11.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/lecturers/part-time")
@CrossOrigin
public class PartTimeLecturerHttpController {
    @PatchMapping("/ranks")
    public void arrangePartTimeLecturerOrder(){
        System.out.println("arrangePartTimeLecturerOrder()");
    }

    public void getAllPartTimeLecturers(){
        System.out.println("getPartTimeLecturers");
    }
}

