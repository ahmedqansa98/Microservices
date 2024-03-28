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

    public static final String  SAVINGS = "Savings";
    public static final String  ADDRESS = "123 Main Street, New York";
    public static final String  STATUS_201 = "201";
    public static final String  MESSAGE_201 = "Account created successfully";
    public static final String  STATUS_200 = "200";
    public static final String  MESSAGE_200 = "Request processed successfully";
    public static final String  STATUS_417 = "417";
    public static final String  MESSAGE_417_UPDATE= "Update operation failed. Please try again or contact Dev team";
    public static final String  MESSAGE_417_DELETE= "Delete operation failed. Please try again or contact Dev team";
    // public static final String  STATUS_500 = "500";
    // public static final String  MESSAGE_500 = "An error occurred. Please try again or contact Dev team";

    private GlobalConstant() {
        // restrict instantiation;
    /*means no one should pollute this class by creating any methods and all inside this class and
     no one should create the object of this class*/
    }

}
