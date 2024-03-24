package com.gyan.darpan.recruitment.process.impl;

import com.gyan.darpan.recruitment.process.RecruitmentProcess;

public class DesignRecruitment implements RecruitmentProcess {

    @Override
    public void assessSkills() {
        System.out.println("Reviewing design portfolio.");
    }

    @Override
    public void conductInterview() {
        System.out.println("Creative interview with the design team.");
    }
}
