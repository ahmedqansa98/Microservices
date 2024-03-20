package com.ahmedSirAcademy.accounts.constant;

import lombok.Data;

@Data
public class GlobalConstant {
    public static final String SAVING_ACCOUNT = "SAVING_ACCOUNT account is created successfully";
    public static final String CURRENT_ACCOUNT = "CURRENT_ACCOUNT account is created successfully";
    public static final String RECURRING_ACCOUNT = "RECURRING_ACCOUNT account is created successfully";
    public static final String DEMET_ACCOUNT = "DEMET_ACCOUNT account is created successfully";
    public static final String JOINT_ACCOUNT = "JOINT_ACCOUNT account is created successfully";
    public static final String BRANCH_ADDRESS = "7M, 308, 80 Ft Rd, 1st Stage, HRBR Layout, Kalyan Nagar, Bengaluru, Karnataka 560043";
    private GlobalConstant() {
        // restrict instantiation;
    /*means no one should pollute this class by creating any methods and all inside this class and
     no one should create the object of this class*/
    }

}
