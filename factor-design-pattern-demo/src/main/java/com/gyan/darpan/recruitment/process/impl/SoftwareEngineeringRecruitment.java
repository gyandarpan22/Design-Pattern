package com.gyan.darpan.recruitment.process.impl;

import com.gyan.darpan.recruitment.process.RecruitmentProcess;

public class SoftwareEngineeringRecruitment implements RecruitmentProcess {
    @Override
    public void assessSkills() {
        System.out.println("Conducting coding test.");
    }

    @Override
    public void conductInterview() {
        System.out.println("Technical interview with engineering team.");
    }
}
