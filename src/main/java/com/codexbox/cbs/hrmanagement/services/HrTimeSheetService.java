package com.codexbox.cbs.hrmanagement.services;


import com.codexbox.cbs.hrmanagement.entities.TimeSheetDetails;
import com.codexbox.cbs.hrmanagement.models.TimesheetDTO;
import com.codexbox.cbs.hrmanagement.repositories.TimesheetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HrTimeSheetService {
    @Autowired
    private TimesheetRepository timesheetRepository;
    public String hrTimeSheetServiceDetails(TimesheetDTO timesheetDTO) {
        String status = "SUCCESSFUL";
        TimeSheetDetails timeSheetDetails = new TimeSheetDetails();
        mapModelToEntity(timesheetDTO, timeSheetDetails);
        timeSheetDetails= timesheetRepository.save(timeSheetDetails);

        if (timeSheetDetails == null) {
            status = "unsuccessfull";
        }
        return status;
    }
    public void mapModelToEntity(TimesheetDTO timesheetDTO, TimeSheetDetails timeSheetDetails) {
        timeSheetDetails.setLogInTime(timesheetDTO.getLogInTime());
        timeSheetDetails.setLogOutTime(timesheetDTO.getLogOutTime());
        timeSheetDetails.setHolidaysOrClientCalender(timesheetDTO.getHolidaysOrClientCalender());
        timeSheetDetails.setNumberOfWorkingDaysInWeek(timesheetDTO.getNumberOfWorkingDaysInWeek());
    }

}
