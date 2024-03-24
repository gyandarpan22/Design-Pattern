package com.gyan.darpan.recruitment.process.impl;

import com.gyan.darpan.recruitment.process.RecruitmentProcess;

public class SalesRecruitment implements RecruitmentProcess {
    @Override
    public void assessSkills() {
        System.out.println("Evaluating sales skills and market knowledge.");
    }

    @Override
    public void conductInterview() {
        System.out.println("Conducting interview focusing on communication and negotiation skills.");
    }
}
