package com.Timesheet.timesheet.repositories;

import com.Timesheet.timesheet.entities.TimeSheetDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TimesheetRepository  extends CrudRepository<TimeSheetDetails,Long> {
}
