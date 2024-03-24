package com.gyan.darpan.recruitment.factory.impl;

import com.gyan.darpan.recruitment.enums.Department;
import com.gyan.darpan.recruitment.factory.RecruitmentAgency;
import com.gyan.darpan.recruitment.process.RecruitmentProcess;
import com.gyan.darpan.recruitment.process.impl.DesignRecruitment;
import com.gyan.darpan.recruitment.process.impl.SalesRecruitment;
import com.gyan.darpan.recruitment.process.impl.SoftwareEngineeringRecruitment;

public class Agency implements RecruitmentAgency {
    @Override
    public RecruitmentProcess createRecruitmentProcess(Department department) {
        return switch (department){
            case SOFTWARE_ENGINEERING -> new SoftwareEngineeringRecruitment();
            case SALES -> new SalesRecruitment();
            case DESIGN -> new DesignRecruitment();
            default -> throw new IllegalArgumentException("Unknown department");
        };
    }
}
