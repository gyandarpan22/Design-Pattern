package com.gyan.darpan;

import com.gyan.darpan.recruitment.enums.Department;
import com.gyan.darpan.recruitment.factory.RecruitmentAgency;
import com.gyan.darpan.recruitment.factory.impl.Agency;
import com.gyan.darpan.recruitment.process.RecruitmentProcess;

public class Main {
    public static void main(String[] args) {
        RecruitmentAgency recruitmentAgency = new Agency();

        RecruitmentProcess recruitmentProcess = recruitmentAgency.createRecruitmentProcess(Department.DESIGN);

        recruitmentProcess.assessSkills();
        recruitmentProcess.conductInterview();

    }
}