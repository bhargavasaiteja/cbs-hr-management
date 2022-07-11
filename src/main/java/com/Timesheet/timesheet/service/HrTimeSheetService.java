package com.Timesheet.timesheet.service;


import com.Timesheet.timesheet.entities.TimeSheetDetails;
import com.Timesheet.timesheet.model.TimesheetDTO;
import com.Timesheet.timesheet.repositories.TimesheetRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.parser.Entity;

@Service
public class HrTimeSheetService {
    @Autowired
    private TimesheetRepository timesheetRepository;

    public String hrTimeSheetService(TimesheetDTO timesheetDTO) {
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
        timeSheetDetails.setLoginTime(timesheetDTO.getLoginTime());
        timeSheetDetails.setLogouttime(timesheetDTO.getLogoutime());
        timeSheetDetails.setHolidaysOrClientCalender(timesheetDTO.getHolidaysOrClientCalender());
        timeSheetDetails.setTotalHoursInMonth(timesheetDTO.getTotalHoursInMonth());
        timeSheetDetails.setTotalHoursInWeek(timesheetDTO.getTotalHoursInWeek());
        timeSheetDetails.setNumberOfworkingDaysInaWeek(timesheetDTO.getNumberOfworkingDaysInaWeek());
        timeSheetDetails.setLeavesManagement(timesheetDTO.getLeavesManagement());
         //timeSheetDetails.setEmpId(100);


    }

}
