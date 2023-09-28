package controller;

import dao.SearchDoctorDao;
import domain.SearchDoctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("doctorsSearchBar")
public class SearchDocHospitalsController {


    //this is my controller page

    //I am trying to merge 2 branches using command prompt
    SearchDoctorDao searchDoctorDao;

    @Autowired
    public SearchDocHospitalsController(SearchDoctorDao searchDoctorDao){
        this.searchDoctorDao = searchDoctorDao;

    }
    @ModelAttribute("doctorsSearchBar")
    public SearchDoctor getSearchDoctors(){
        return  new SearchDoctor();
    }

    //for searching doctors  for respective hospitals

    @RequestMapping("/searchdoctorsfromhospital")
    public  String searchDoctorsFromHospital(Model model){
        model.addAttribute("command" ,new SearchDoctor());
        return "searchdoctorsfromhospital";
    }

    //it provides the facility to check how many doctors are available

    @RequestMapping(value="/checkdoctorsonlineavailability",method= RequestMethod.POST)

    public ModelAndView howManyDoctorsAreThereInUnits(@ModelAttribute("doctors") SearchDoctor searchDoctor){

        ModelAndView modelAndView = null;
        SearchDoctor searchDoctor1 = null;

        try {
            if(searchDoctor.getDoctorName() != null && searchDoctor.getDoctorName() !=""){
                searchDoctor1 = searchDoctor.getDoctorsByName(searchDoctor.getDoctorName());
            }
            if(searchDoctor.getDoctorName() != null && searchDoctor.getDoctorRegistrationNumber() !=""){
                searchDoctor1 = searchDoctor.getdoctorByRegistrationNumber(searchDoctor.getDoctorName());
            }

            modelAndView = new ModelAndView();
            if(null != searchDoctor1){
                System.out.println(searchDoctor1.getDoct_id() + "......" + searchDoctor1.getDoctorName()
                        +"....."+searchDoctor1.getDoctorRegistrationNumber()+"......"+
                        searchDoctor1.getCity()+"....."+ searchDoctor1.getGender());

                boolean isAvailable = false;

                modelAndView.addObject("DoctorName", searchDoctor1.getDoctorName());
                modelAndView.addObject("DoctorRegistrationNumber",searchDoctor1.getDoctorRegistrationNumber());
                modelAndView.addObject("DoctorsCity", searchDoctor1.getCity());
                modelAndView.addObject("DoctorsGender",searchDoctor1.getGender());

            }else {
                modelAndView.addObject("DoctorName",searchDoctor1.getDoctorName());
                modelAndView.addObject("DoctorRegistrationNumber", "Doctor is not available online for this time");
            }


        }catch (Exception exception){
            exception.printStackTrace();
        }
        return modelAndView;
    }
}
