package com.gyan.darpan.recruitment.factory;

import com.gyan.darpan.recruitment.enums.Department;
import com.gyan.darpan.recruitment.process.RecruitmentProcess;

public interface RecruitmentAgency {

    RecruitmentProcess createRecruitmentProcess(Department department);
}
