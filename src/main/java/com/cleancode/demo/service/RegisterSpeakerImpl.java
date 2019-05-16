/*##################################################################
 *#SOVOSSOVOSSOVOSSOVOSSOVOSSOVOSSOVOSSOVOSSOVOSSOVOSSOVOSSOVOSSOVOS#
 *#O                                                               O#
 *#V  Author:  Sovos Compliance, LLC                               V#
 *#O  Address: 200 Ballardvale St., Building 1, 4th Floor          O#
 *#S           Wilmington, MA 01887,   USA                         S#
 *#S           www.sovos.com <http://www.sovos.com/>               S#
 *#O  Contact: Tel 978-527-0000                                    O#
 *#V                                                               V#
 *#O  THIS PROGRAM IS A PROPRIETARY PRODUCT AND MAY NOT BE USED    O#
 *#S  WITHOUT WRITTEN PERMISSION FROM Sovos Compliance             S#
 *#S                                                               S#
 *#O      (c)2017 Sovos Compliance, LLC, All rights reserved.      O#
 *#V        THE INFORMATION CONTAINED HEREIN IS CONFIDENTIAL       V#
 *#O                     ALL RIGHTS RESERVED                       O#
 *#SOVOSSOVOSSOVOSSOVOSSOVOSSOVOSSOVOSSOVOSSOVOSSOVOSSOVOSSOVOSSOVOS#
 *###################################################################
 *###################################################################
 *# Source File :- com/cleancode/demo/service/RegisterSpeakerImpl.java  #
 *###################################################################
 */
package com.cleancode.demo.service;

import com.cleancode.demo.dto.Speaker;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class RegisterSpeakerImpl implements RegisterSpeaker {
    @Override
    public Boolean registerAndValidateSpeaker(Speaker s) {

        //JUST IN CASE... LOL
       /* for (int i =0; i< 3; i++){
            d = d+1;
        }
        if(d>1){
            b=true;
        }else{
            b=false;
        }*/
        Boolean b = false;
        boolean val = false;
        int d=0;
        int c =0;
        boolean theReturn=true;
        //If the user is user name is empty
        if (!s.getName().isEmpty()) { // principal IF
            if (!s.getLastName().isEmpty()) {
                if (s.getYearsOfExperience() >= 10) {
                    if (!s.getEmailAddress().contains("@")) {
                        throw new RuntimeException("error");
                    }
                    b = true;
                }
            }
        } //End of principal IF


        for (int i =0; i< s.getDegrees().size(); i++){
            d = d+1;
        }
        if(d>1){
            val=true;
        }else{
            val=false;
        }

        for (int i =0; i< s.getCertifications().size(); i++){
            c = c+1;
        }
        if(d>1 || c>1){
            val=true;
        }else{
            val=false;
        }

        theReturn = b&&val;
        return theReturn;
    }
}
