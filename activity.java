// The class Rule-Obj-Activity has 2 aspects.
// This rule therefore has multiple implementation classes.  The code for each one is given below.


// ********** Aspect Action **********

package com.pegarules.generated.testgen;

/*
 * Copyright (c) 2023 Pegasystems Inc.
 * All rights reserved.
 *
 * This software is governed by a License Agreement that restricts its
 * use.  The software contains valuable trade secrets and proprietary
 * information of Pegasystems Inc and is protected by federal copyright
 * law.  It may not be copied, modified, translated or distributed in any
 * form or medium, disclosed to third parties or used in any manner not
 * expressly provided for in said License Agreement except with written
 * authorization from Pegasystems Inc.
 */
import Pega.*;
import com.pega.ibm.icu.math.BigDecimal;
import com.pega.pegarules.priv.*;
import com.pega.pegarules.priv.clipboard.PegaClipboardPage;
import com.pega.pegarules.priv.database.*;
import com.pega.pegarules.priv.generator.DependentRuleInfo;
import com.pega.pegarules.pub.*;
import com.pega.pegarules.pub.clipboard.*;
import com.pega.pegarules.pub.context.*;
import com.pega.pegarules.pub.database.*;
import com.pega.pegarules.pub.dictionary.*;
import com.pega.pegarules.pub.infengine.*;
import com.pega.pegarules.pub.presence.*;
import com.pega.pegarules.pub.runtime.*;
import com.pega.pegarules.pub.services.*;
import com.pega.pegarules.pub.util.*;
import com.pega.platform.clipboard.query.PageListQuery;
import com.pega.platform.clipboard.query.PageQuery;
import com.pega.platform.clipboard.query.PropertyQuery;
import com.pega.platform.clipboard.query.ScalarListQuery;
import com.pega.platform.clipboard.query.ScalarValueQuery;
import com.pega.platform.executionengine.runtime.Loadtime;
import com.pegarules.generated.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Rule_Obj_Activity_SRC_EPC_Data_Program_CreateProgramSpendPlanConfig_Action_20231205T182203_914_GMT
        extends com.pega.pegarules.pub.runtime.AbstractActivity implements
        com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport,
        WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
    private static final LogHelper oLog = new LogHelper(
            "Rule_Obj_Activity.CreateProgramSpendPlanConfig.SRC_EPC_Data_Program.Action");

    public Rule_Obj_Activity_SRC_EPC_Data_Program_CreateProgramSpendPlanConfig_Action_20231205T182203_914_GMT(
            PegaAPI aContext) {
        cleanForReuse(aContext);
    }

    public void perform() {
        try {
            pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY SRC-EPC-DATA-PROGRAM CREATEPROGRAMSPENDPLANCONFIG #20231205T182203.914 GMT";
            pz_CurrentCircumstance = "0";
            pz_CurrentTraceInfo = oTraceInfo_0;
            if (pega.activityProlog(snapshotLocalVariables(),
                    pz_CurrentTraceInfo)) {
                ClipboardProperty pageRef = null;
                ClipboardProperty nextPage = null;
                java.util.Iterator myPageList = null;
                ClipboardPage thisStepPage = null;
                pz_Dictionary = tools.getThread().getDictionary();

                // Code to call step 1_circum0
                pz_Status = true;
                if (nextBlock.equals("")) {
                    pz_methodStatusUpdated = false;
                    pz_CurrentStepNum = "1";
                    if (oLog.isDebugEnabled()) {
                        oLog.debug("Running step 1_circum0");
                    }
                    ClipboardPage myStepPage = tools.getStepPage();
                    String pz_1 = "spConfig";
                    thisStepPage = tools.findPage(pz_1, true);
                    PRStackFrame pz_StackFrame1_circum0 = pega
                            .pushStackFrame(
                                    null,
                                    thisStepPage,
                                    false,
                                    false,
                                    PRStackFrame.Type.ACTIVITY_STEP,
                                    "RULE-OBJ-ACTIVITY SRC-EPC-DATA-PROGRAM CREATEPROGRAMSPENDPLANCONFIG #20231205T182203.914 GMT Step: 1 Circum: 0");
                    try {
                        pz_Status = step1_circum0();
                    } finally {
                        pega.popStackFrame(pz_StackFrame1_circum0, false);
                        pz_methodStatusUpdated = true;
                    }
                } // end of if(pz_Status = true and/or nextBlock

                // Code to call step 2_circum0
                pz_Status = true;
                if (nextBlock.equals("")) {
                    pz_methodStatusUpdated = false;
                    pz_CurrentStepNum = "2";
                    if (oLog.isDebugEnabled()) {
                        oLog.debug("Running step 2_circum0");
                    }
                    PRStackFrame pz_StackFrame2_circum0 = pega
                            .pushStackFrame(
                                    null,
                                    false,
                                    false,
                                    PRStackFrame.Type.ACTIVITY_STEP,
                                    "RULE-OBJ-ACTIVITY SRC-EPC-DATA-PROGRAM CREATEPROGRAMSPENDPLANCONFIG #20231205T182203.914 GMT Step: 2 Circum: 0");
                    try {
                        pz_Status = step2_circum0();
                    } finally {
                        pega.popStackFrame(pz_StackFrame2_circum0, false);
                        pz_methodStatusUpdated = true;
                    }
                } // end of if(pz_Status = true and/or nextBlock

                // Code to call step 3_circum0
                pz_Status = true;
                if (nextBlock.equals("")) {
                    pz_methodStatusUpdated = false;
                    pz_CurrentStepNum = "3";
                    if (oLog.isDebugEnabled()) {
                        oLog.debug("Running step 3_circum0");
                    }
                    ClipboardPage myStepPage = tools.getStepPage();
                    String pz_8 = "spConfig";
                    thisStepPage = tools.findPage(pz_8, true);
                    PRStackFrame pz_StackFrame3_circum0 = pega
                            .pushStackFrame(
                                    null,
                                    thisStepPage,
                                    false,
                                    false,
                                    PRStackFrame.Type.ACTIVITY_STEP,
                                    "RULE-OBJ-ACTIVITY SRC-EPC-DATA-PROGRAM CREATEPROGRAMSPENDPLANCONFIG #20231205T182203.914 GMT Step: 3 Circum: 0");
                    try {
                        pz_Status = step3_circum0();
                    } finally {
                        pega.popStackFrame(pz_StackFrame3_circum0, false);
                        pz_methodStatusUpdated = true;
                    }
                } // end of if(pz_Status = true and/or nextBlock

                // Code to call step 4_circum0
                pz_Status = true;
                if ((nextBlock.equals("") || nextBlock.equals("ERR"))) {
                    nextBlock = "";
                    pz_methodStatusUpdated = false;
                    pz_CurrentStepNum = "4";
                    if (oLog.isDebugEnabled()) {
                        oLog.debug("Running step 4_circum0");
                    }
                    PRStackFrame pz_StackFrame4_circum0 = pega
                            .pushStackFrame(
                                    null,
                                    false,
                                    false,
                                    PRStackFrame.Type.ACTIVITY_STEP,
                                    "RULE-OBJ-ACTIVITY SRC-EPC-DATA-PROGRAM CREATEPROGRAMSPENDPLANCONFIG #20231205T182203.914 GMT Step: 4 Circum: 0");
                    try {
                        pz_Status = step4_circum0();
                    } finally {
                        pega.popStackFrame(pz_StackFrame4_circum0, false);
                        pz_methodStatusUpdated = true;
                    }
                } // end of if(pz_Status = true and/or nextBlock

                // Code to call step 5_circum0
                pz_Status = true;
                if (nextBlock.equals("")) {
                    pz_methodStatusUpdated = false;
                    pz_CurrentStepNum = "5";
                    if (oLog.isDebugEnabled()) {
                        oLog.debug("Running step 5_circum0");
                    }
                    PRStackFrame pz_StackFrame5_circum0 = pega
                            .pushStackFrame(
                                    null,
                                    false,
                                    false,
                                    PRStackFrame.Type.ACTIVITY_STEP,
                                    "RULE-OBJ-ACTIVITY SRC-EPC-DATA-PROGRAM CREATEPROGRAMSPENDPLANCONFIG #20231205T182203.914 GMT Step: 5 Circum: 0");
                    try {
                        pz_Status = step5_circum0();
                    } finally {
                        pega.popStackFrame(pz_StackFrame5_circum0, false);
                        pz_methodStatusUpdated = true;
                    }
                } // end of if(pz_Status = true and/or nextBlock

                // Code to call step 6_circum0
                pz_Status = true;
                if ((nextBlock.equals("") || nextBlock.equals("CL"))) {
                    nextBlock = "";
                    pz_methodStatusUpdated = false;
                    pz_CurrentStepNum = "6";
                    if (oLog.isDebugEnabled()) {
                        oLog.debug("Running step 6_circum0");
                    }
                    ClipboardPage myStepPage = tools.getStepPage();
                    String pz_13 = "spConfig";
                    thisStepPage = tools.findPage(pz_13, true);
                    PRStackFrame pz_StackFrame6_circum0 = pega
                            .pushStackFrame(
                                    null,
                                    thisStepPage,
                                    false,
                                    false,
                                    PRStackFrame.Type.ACTIVITY_STEP,
                                    "RULE-OBJ-ACTIVITY SRC-EPC-DATA-PROGRAM CREATEPROGRAMSPENDPLANCONFIG #20231205T182203.914 GMT Step: 6 Circum: 0");
                    try {
                        pz_Status = step6_circum0();
                    } finally {
                        pega.popStackFrame(pz_StackFrame6_circum0, false);
                        pz_methodStatusUpdated = true;
                    }
                } // end of if(pz_Status = true and/or nextBlock
            }
        } catch (ActivityTerminateException ate) {
            throw ate; // Terminate all activity processing
        } catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
            throw arte;
        } catch (PRRuntimeException prre) {
            if (!pz_methodStatusUpdated) {
                pega.setThreadPropertyValue(".pxMethodStatus", prre.toString());
            }
            pega.activityStepExceptionHandler(prre, snapshotLocalVariables(),
                    pz_CurrentTraceInfo, pz_CurrentStepNum);
            throw prre;
        } catch (RuntimeException re) {
            pega.setThreadPropertyValue(".pxMethodStatus", re.toString());
            pega.activityStepExceptionHandler(re, snapshotLocalVariables(),
                    pz_CurrentTraceInfo, pz_CurrentStepNum);
            throw re;
        } finally {
            pega.activityEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo);
        }
    } // end of perform definition

    public void fuaInit() {
    }

    public void fuaDestroy() {
    }

    public boolean isAllowedInWeb() {
        return isAllowedInWeb;
    }

    private static final String oDependencies[] = {};

    public String[] getUsedRules() {
        return oDependencies;
    }

    private static final DependentRuleInfo[] oDependentRuleInfos = {};

    /**
    * This method returns the set of dependent rules required to build
    * the generated code and (possibly) whole classes that the rules assembler declared.
    * @return array of <code>DependentRuleInfo</code> objects.
    */
    public DependentRuleInfo[] getDependentRuleInfos() {
        return oDependentRuleInfos;
    }

    //	Rules used in this assembly (order and duplicates ARE significant to hash code) :

    /*	 *** Generated for use in a INTRANET Node	*/
    /**
     * provides a stand-in for uniqueness tests for the
     * content of this stream. Created from list of rules
     * and dates listed in the comment above this declaration.
     * @return	32 byte hash of that list using MD5
     */
    public static String getFUAContentHash() {
        return "9d17101d3c7205be20d7589b7b1696ab";
    }

    public String getDefinitionAppliesToClass() {
        return "SRC-EPC-Data-Program";
    }

    public String getAspect() {
        return "Action";
    }

    /**
     * Step 1 <code>Page-New</code> [on page spConfig] <br>
     */
    public boolean step1_circum0() {
        ClipboardPage myStepPage = tools.getStepPage();
        boolean pz_StepStat = true;
        boolean pz_CheckMessage = true;
        boolean pz_AttemptedStep = false;
        pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo,
                pz_CurrentStepNum, "Page-New");
        try {
            final PRStackFrame methodFrame = pega.pushStackFrame("Page-New",
                    null, false, true);
            pz_AttemptedStep = true;
            try { // Method:  Page-New
                String pz_2 = "spConfig";
                myStepPage = tools.findPage(pz_2, true);
                myStepPage = ((com.pega.pegarules.priv.context.PegaThread) tools
                        .getThread()).createPageForPageNew(
                        "SRC-EPC-Data-SpendPlanConfig", "spConfig", false);
                // primary page will not be added to PageList
                pega.setStepPage("spConfig", myStepPage);
            } finally {
                try {
                    infEngine.forwardChain(tools);
                } finally {
                    pega.unwind(methodFrame, true);
                }
            }
        } catch (ActivityTerminateException ate) {
            throw ate;
        } catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
            throw arte;
        } catch (RuntimeException re) {
            FUAUtil.activityStepStatusUpdateForException(pega, re);
            pega.activityStepExceptionHandler(re, snapshotLocalVariables(),
                    pz_CurrentTraceInfo, pz_CurrentStepNum);
            throw re;
        } finally {
            pz_CurrentStepNum = "1";
            pega.activityStepEpilog(snapshotLocalVariables(),
                    pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New",
                    pz_AttemptedStep);
        } // end try block for prolog/epilog
        return pz_StepStat;
    } // end of step1_circum0 definition

    /**
     * Set props.
     * <p>
     * Step 2 <code>Property-Set</code><br>
     */
    public boolean step2_circum0() {
        ClipboardPage myStepPage = tools.getStepPage();
        boolean pz_StepStat = true;
        boolean pz_CheckMessage = true;
        boolean pz_AttemptedStep = false;
        pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo,
                pz_CurrentStepNum, "Property-Set");
        try {
            final PRStackFrame methodFrame = pega.pushStackFrame(
                    "Property-Set", null, false, true);
            pz_AttemptedStep = true;
            try { // Method:  Property-Set
                {
                    pega.setViaPropRef(".ProgramID", pRef_3, pega
                            .findPageWithException("spConfig",
                                    "SRC-EPC-Data-SpendPlanConfig"),
                            scalarValueQuery_4.resolveToString(tools,
                                    tools.getPrimaryPage(),
                                    ImmutablePropertyInfo.TYPE_TEXT), "sIN40",
                            false, true);
                }
                {
                    pega.setViaPropRef(".LeverageExternalID", pRef_5, pega
                            .findPageWithException("spConfig",
                                    "SRC-EPC-Data-SpendPlanConfig"), tools
                            .interpretBoolean(pega.<String> resolveMethodCall(
                                    "getDataSystemSetting--(String,String)",
                                    "getDataSystemSetting", null, null,
                                    new Object[] { "EPC",
                                            "LeverageExternalSPIDDefault" })),
                            "sSN", false, true);
                }
                {
                    pega.setViaPropRef(".EnforceApproval", pRef_6, pega
                            .findPageWithException("spConfig",
                                    "SRC-EPC-Data-SpendPlanConfig"), tools
                            .interpretBoolean(pega.<String> resolveMethodCall(
                                    "getDataSystemSetting--(String,String)",
                                    "getDataSystemSetting", null, null,
                                    new Object[] { "EPC",
                                            "EnforceApprovalSPDefault" })),
                            "sSN", false, true);
                }
                {
                    pega.setViaPropRef(".EnforceInvWorkflow", pRef_7, pega
                            .findPageWithException("spConfig",
                                    "SRC-EPC-Data-SpendPlanConfig"), tools
                            .interpretBoolean(pega.<String> resolveMethodCall(
                                    "getDataSystemSetting--(String,String)",
                                    "getDataSystemSetting", null, null,
                                    new Object[] { "EPC",
                                            "BypassInvestmentWorkFlow" })),
                            "sSN", false, true);
                }
            } finally {
                try {
                    infEngine.forwardChain(tools);
                } finally {
                    pega.unwind(methodFrame, true);
                }
            }
        } catch (ActivityTerminateException ate) {
            throw ate;
        } catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
            throw arte;
        } catch (RuntimeException re) {
            FUAUtil.activityStepStatusUpdateForException(pega, re);
            pega.activityStepExceptionHandler(re, snapshotLocalVariables(),
                    pz_CurrentTraceInfo, pz_CurrentStepNum);
            throw re;
        } finally {
            pz_CurrentStepNum = "2";
            pega.activityStepEpilog(snapshotLocalVariables(),
                    pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",
                    pz_AttemptedStep);
        } // end try block for prolog/epilog
        return pz_StepStat;
    } // end of step2_circum0 definition

    /**
     * Save entry.
     * <p>
     * Step 3 <code>Call Save</code> [on page spConfig] <br>
     */
    public boolean step3_circum0() {
        ClipboardPage myStepPage = tools.getStepPage();
        boolean pz_StepStat = true;
        boolean pz_CheckMessage = true;
        boolean pz_AttemptedStep = false;
        pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo,
                pz_CurrentStepNum, "Call Save");
        try {
            try {
                final PRStackFrame methodFrame = pega.pushStackFrame(
                        "Call Save", null, false, true);
                pz_AttemptedStep = true;
                try { // Method:  Call Save
                    if (myStepPage == null) {
                        String pz_9 = "spConfig";
                        myStepPage = tools.findPage(pz_9, true);
                        if (myStepPage == null) {
                            myStepPage = tools.findPage(pz_9, false);
                            myStepPage.putString("pxObjClass",
                                    "SRC-EPC-Data-SpendPlanConfig");
                        }
                    }
                    // Calling Activity : Save

                    // processScalarParameters
                    ParameterPage newParamsPage = new ParameterPage();
                    // Expression: false
                    String pz_10 = String.valueOf(false);
                    newParamsPage.putParamValue("SkipHistory",
                            PropertyInfo.TYPE_TRUEFALSE, pz_10);
                    newParamsPage.putParamValue("HistoryMemo",
                            PropertyInfo.TYPE_TEXT, "");
                    newParamsPage.putParamValue("pxObjClass",
                            PropertyInfo.TYPE_TEXT, "");
                    // Expression: false
                    String pz_11 = String.valueOf(false);
                    newParamsPage.putParamValue("SkipValidation",
                            PropertyInfo.TYPE_TRUEFALSE, pz_11);
                    // Expression: TempPlaceHolder
                    newParamsPage.putParamValue("pyTempPlaceHolder",
                            PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
                    // Expression: false
                    String pz_12 = String.valueOf(false);
                    newParamsPage.putParamValue("SkipDateCheck",
                            PropertyInfo.TYPE_TRUEFALSE, pz_12);

                    pega.invokeActivity(myStepPage, newParamsPage, "Save",
                            "SRC-EPC-Data-Program", "");
                } finally {
                    try {
                        infEngine.forwardChain(tools);
                    } finally {
                        pega.unwind(methodFrame, true);
                    }
                }
            } catch (ActivityTerminateException ate) {
                throw ate;
            } catch (com.pega.pegarules.pub.generator.RuleNotFoundException rnf) {
                // Handle RuleNotFoundException via pyOnException block defined for this step
                FUAUtil.activityStepStatusUpdateForException(pega, rnf);
                nextBlock = "ERR";
                return true;
            } catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
                throw arte;
            } catch (RuntimeException re) {
                FUAUtil.activityStepStatusUpdateForException(pega, re);
                // OnException block defined for this step
                nextBlock = "ERR";
                return true;
            } // end try block for step body
            PRStackFrame pz_tranStackFrame = pega.pushStackFrame(null, false,
                    true, PRStackFrame.Type.TRANSITIONS);
            try { // Transitions
                boolean pz__1 = pega.invokeWhen("StepStatusFail",
                        "SRC-EPC-Data-Program", "SRC-EPC-Data-SpendPlanConfig");
                if (pz__1) {
                    // branch to block ERR
                    nextBlock = "ERR";
                    return false;
                } else {
                    // branch to block CL
                    nextBlock = "CL";
                    return false;
                }
            } finally {
                FUAUtil.activityPreTranIndeterminateConditionalCheck(pega,
                        pz_CheckMessage, pz_tranStackFrame);
            }
        } finally {
            pz_CurrentStepNum = "3";
            pega.activityStepEpilog(snapshotLocalVariables(),
                    pz_CurrentTraceInfo, pz_CurrentStepNum, "Call Save",
                    pz_AttemptedStep);
        } // end try block for prolog/epilog
    } // end of step3_circum0 definition

    /**
     * *** Error Handling Steps ***.
     * <p>
     * Step 4 [ERR] <code>Property-Set</code><br>
     */
    public boolean step4_circum0() {
        ClipboardPage myStepPage = tools.getStepPage();
        boolean pz_StepStat = true;
        boolean pz_CheckMessage = true;
        boolean pz_AttemptedStep = false;
        pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo,
                pz_CurrentStepNum, "Property-Set");
        try {
            final PRStackFrame methodFrame = pega.pushStackFrame(
                    "Property-Set", null, false, true);
            pz_AttemptedStep = true;
            try { // Method:  Property-Set
                {
                    tools.putParamValue("FailMessage", PropertyInfo.TYPE_TEXT,
                            pega.<String> resolveMethodCall(
                                    "getWorstMessage--(PublicAPI)",
                                    "getWorstMessage", null, null,
                                    new Object[] { tools }));
                }
            } finally {
                try {
                    infEngine.forwardChain(tools);
                } finally {
                    pega.unwind(methodFrame, true);
                }
            }
        } catch (ActivityTerminateException ate) {
            throw ate;
        } catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
            throw arte;
        } catch (RuntimeException re) {
            FUAUtil.activityStepStatusUpdateForException(pega, re);
            pega.activityStepExceptionHandler(re, snapshotLocalVariables(),
                    pz_CurrentTraceInfo, pz_CurrentStepNum);
            throw re;
        } finally {
            pz_CurrentStepNum = "4";
            pega.activityStepEpilog(snapshotLocalVariables(),
                    pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",
                    pz_AttemptedStep);
        } // end try block for prolog/epilog
        return pz_StepStat;
    } // end of step4_circum0 definition

    /**
     * Set activity status.
     * <p>
     * Step 5 <code>Activity-Set-Status</code><br>
     */
    public boolean step5_circum0() {
        ClipboardPage myStepPage = tools.getStepPage();
        boolean pz_StepStat = true;
        boolean pz_CheckMessage = true;
        boolean pz_AttemptedStep = false;
        pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo,
                pz_CurrentStepNum, "Activity-Set-Status");
        try {
            final PRStackFrame methodFrame = pega.pushStackFrame(
                    "Activity-Set-Status", null, false, true);
            pz_AttemptedStep = true;
            try { // Method:  Activity-Set-Status
            // Expression: Param.FailMessage
                tools.getActivityStatus().add(
                        30,
                        "(SRC-EPC-Data-Program)"
                                + tools.getParamValue("FailMessage"), null);
            } finally {
                try {
                    infEngine.forwardChain(tools);
                } finally {
                    pega.unwind(methodFrame, true);
                }
            }
        } catch (ActivityTerminateException ate) {
            throw ate;
        } catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
            throw arte;
        } catch (RuntimeException re) {
            FUAUtil.activityStepStatusUpdateForException(pega, re);
            pega.activityStepExceptionHandler(re, snapshotLocalVariables(),
                    pz_CurrentTraceInfo, pz_CurrentStepNum);
            throw re;
        } finally {
            pz_CurrentStepNum = "5";
            pega.activityStepEpilog(snapshotLocalVariables(),
                    pz_CurrentTraceInfo, pz_CurrentStepNum,
                    "Activity-Set-Status", pz_AttemptedStep);
        } // end try block for prolog/epilog
        return pz_StepStat;
    } // end of step5_circum0 definition

    /**
     * Cleanup steps.
     * <p>
     * Step 6 [CL] <code>Page-Remove</code> [on page spConfig] <br>
     */
    public boolean step6_circum0() {
        ClipboardPage myStepPage = tools.getStepPage();
        boolean pz_StepStat = true;
        boolean pz_CheckMessage = true;
        boolean pz_AttemptedStep = false;
        pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo,
                pz_CurrentStepNum, "Page-Remove");
        try {
            final PRStackFrame methodFrame = pega.pushStackFrame("Page-Remove",
                    null, false, true);
            pz_AttemptedStep = true;
            try { // Method:  Page-Remove
                pageRemove(myStepPage);
            } finally {
                try {
                    infEngine.forwardChain(tools);
                } finally {
                    pega.unwind(methodFrame, true);
                }
            }
        } catch (ActivityTerminateException ate) {
            throw ate;
        } catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
            throw arte;
        } catch (RuntimeException re) {
            FUAUtil.activityStepStatusUpdateForException(pega, re);
            pega.activityStepExceptionHandler(re, snapshotLocalVariables(),
                    pz_CurrentTraceInfo, pz_CurrentStepNum);
            throw re;
        } finally {
            pz_CurrentStepNum = "6";
            pega.activityStepEpilog(snapshotLocalVariables(),
                    pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",
                    pz_AttemptedStep);
        } // end try block for prolog/epilog
        return pz_StepStat;
    } // end of step6_circum0 definition

    public String nextBlock = "";
    boolean pz_Status = true;
    boolean pz_methodStatusUpdated = false;
    private boolean debugIsOn = false;
    private int forEachCounter = 0;
    private int pz_forEachSkipClass = 0;
    private InfEngUtils infEngine = null;
    ClipboardProperty nextProperty = null;
    String pz_CurrentRuleKey = "";
    String pz_CurrentCircumstance = "";
    String pz_CurrentStepNum = "";
    com.pega.pegarules.priv.tracer.ActivityTraceInfo pz_CurrentTraceInfo = null;
    String pz_thisPageClass = "";
    Dictionary pz_Dictionary = null;
    private static final boolean isAllowedInWeb = true;
    String statusReturnedFromNestedLoop = "";

    public void initializeStandardLocalVariables() {
        nextBlock = "";
        pz_Status = true;
        pz_methodStatusUpdated = false;
        debugIsOn = false;
        forEachCounter = 0;
        pz_forEachSkipClass = 0;
        infEngine = null;
        nextProperty = null;
        pz_CurrentRuleKey = "";
        pz_CurrentCircumstance = "";
        pz_CurrentStepNum = "";
        pz_CurrentTraceInfo = null;
        pz_thisPageClass = "";
        pz_Dictionary = null;
        statusReturnedFromNestedLoop = "";
    }

    public void initializeUserLocalVariables() {
    }

    public StringMap snapshotLocalVariables() {
        return null;
    }

    public void cleanForReuse(PegaAPI aContext) {
        tools = (PublicAPI) aContext;
        pega = aContext;
        initializeStandardLocalVariables();
        initializeUserLocalVariables();
        infEngine = pega == null ? null : pega.getInfEngUtils();
    }

    public static final String[] pRef_7 = new String[] { "", "",
            "EnforceInvWorkflow", "" };
    public static final String[] pRef_3 = new String[] { "", "", "ProgramID",
            "" };
    public static final String[] pRef_5 = new String[] { "", "",
            "LeverageExternalID", "" };
    public static final String[] pRef_6 = new String[] { "", "",
            "EnforceApproval", "" };
    private static final ScalarValueQuery scalarValueQuery_4 = FUAUtil
            .createQueryBuilder().scalarProperty("ProgramID")
            .buildScalarValueQuery();

    private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo(
            "RULE-OBJ-ACTIVITY SRC-EPC-DATA-PROGRAM CREATEPROGRAMSPENDPLANCONFIG #20231205T182203.914 GMT",
            "SRC-EPC-Data-Program CreateProgramSpendPlanConfig", "EPC",
            "02-02-50", false, true, "", "UTILITY", "20231205T182203.914 GMT",
            "Rule-Obj-Activity");
}
