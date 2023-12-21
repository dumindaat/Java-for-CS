// The class Rule-HTML-Section has 2 aspects.
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
import com.pega.ibm.icu.math.BigDecimal;
import com.pega.pegarules.priv.AbstractFUASupport;
import com.pega.pegarules.priv.FUAUtil;
import com.pega.pegarules.priv.LogHelper;
import com.pega.pegarules.priv.PegaAPI;
import com.pega.pegarules.priv.clipboard.PegaClipboardPage;
import com.pega.pegarules.priv.database.*;
import com.pega.pegarules.priv.generator.AssemblyParameters;
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
import java.net.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.simple.*;
import org.json.simple.parser.*;

public class Rule_HTML_Section_SRC_EPC_Data_Intake_Investment_InvestmentExtraActions_Action_20231215T160912_199_GMT
        extends com.pega.pegarules.priv.AbstractFUASupport implements Activity,
        FUASupport {
    private static final LogHelper oLog = new LogHelper(
            "Rule_HTML_Section.InvestmentExtraActions.SRC_EPC_Data_Intake_Investment.Action");

    public Rule_HTML_Section_SRC_EPC_Data_Intake_Investment_InvestmentExtraActions_Action_20231215T160912_199_GMT(
            PegaAPI aContext) {
        tools = aContext;
        pega = aContext;
    }

    private static Object deepCloneJson(Object jsonObj) {
        if (jsonObj == null || jsonObj instanceof String
                || jsonObj instanceof Long || jsonObj instanceof Double
                || jsonObj instanceof Integer || jsonObj instanceof Boolean)
            return jsonObj;

        if (jsonObj instanceof JSONObject) {
            JSONObject origObject = (JSONObject) jsonObj;
            JSONObject cloneObject = new JSONObject();
            for (Object key : origObject.keySet())
                cloneObject.put(key, deepCloneJson(origObject.get(key)));
            return cloneObject;
        }

        if (jsonObj instanceof JSONArray) {
            JSONArray origArray = (JSONArray) jsonObj;
            JSONArray cloneArray = new JSONArray();
            for (Object itm : origArray)
                cloneArray.add(deepCloneJson(itm));
            return cloneArray;
        }

        throw new IllegalStateException("Invalid JSON object");
    }

    private static String JSON_STR;
    private static JSONObject JSON_OBJ;
    private final static JSONParser parser = new JSONParser();
    static {
        try {
            JSON_STR = "%7B%22refreshNodes%22%3A%5B%5D%2C%22full%22%3A%7B%22view%22%3A%7B%22reference%22%3A%7B%22annotation%22%3A%7B%22type%22%3A%22pagename%22%2C%22append%22%3A%22%22%7D%7D%2C%22validationMessages%22%3A%7B%22annotation%22%3A%7B%22type%22%3A%22validation-message%22%7D%7D%2C%22viewID%22%3A%22InvestmentExtraActions%22%2C%22visible%22%3Atrue%2C%22titleFormat%22%3A%7B%22annotation%22%3A%7B%22defaultValue%22%3A%22%22%2C%22action%22%3A%22get%22%2C%22replaceType%22%3A%22string%22%2C%22type%22%3A%22local-param%22%2C%22key%22%3A%22paramTitleFormat%22%7D%7D%2C%22name%22%3A%22InvestmentExtraActions%22%2C%22appliesTo%22%3A%7B%22annotation%22%3A%7B%22ref%22%3A%22.pxObjClass%22%2C%22type%22%3A%22property%22%7D%7D%2C%22containerFormat%22%3A%7B%22annotation%22%3A%7B%22defaultValue%22%3A%22%22%2C%22action%22%3A%22get%22%2C%22replaceType%22%3A%22string%22%2C%22type%22%3A%22local-param%22%2C%22key%22%3A%22paramContainerFormat%22%7D%7D%2C%22groups%22%3A%5B%7B%22layout%22%3A%7B%22visible%22%3Atrue%2C%22titleFormat%22%3A%22h2%22%2C%22groupsVisibility%22%3Atrue%2C%22containerFormat%22%3A%22NOHEADER%22%2C%22groups%22%3A%5B%7B%22layout%22%3A%7B%22visible%22%3Atrue%2C%22titleFormat%22%3A%22h2%22%2C%22groupsVisibility%22%3Atrue%2C%22containerFormat%22%3A%22NOHEADER%22%2C%22groups%22%3A%5B%7B%22field%22%3A%7B%22validationMessages%22%3A%7B%22annotation%22%3A%7B%22property%22%3A%22.pyTemplateButton%22%2C%22type%22%3A%22validation-message%22%7D%7D%2C%22visible%22%3A%7B%22annotation%22%3A%7B%22expression%22%3A%22.FlagValueGroup%28InvFilters%29%21%3Dtrue%22%2C%22defaultValue%22%3Afalse%2C%22type%22%3A%22simple-expression%22%2C%22olderValue%22%3Atrue%7D%7D%2C%22labelReserveSpace%22%3Afalse%2C%22accessCondition%22%3A%22%22%2C%22readOnly%22%3A%7B%22annotation%22%3A%7B%22type%22%3A%22readonly%22%2C%22value%22%3A%22auto%22%7D%7D%2C%22control%22%3A%7B%22modes%22%3A%5B%7B%22imageSource%22%3A%22styleclass%22%2C%22modeType%22%3A%22ignore%22%2C%22tooltip%22%3A%22%22%2C%22imageStyle%22%3A%22pi+pi-filter%22%7D%2C%7B%22modeType%22%3A%22readOnly%22%2C%22imageSource%22%3A%22styleclass%22%2C%22autoPrepend%22%3A%22%22%2C%22controlFormat%22%3A%22pzhc%22%2C%22tooltip%22%3A%22%22%2C%22showReadOnlyValidation%22%3A%22false%22%2C%22autoAppend%22%3A%22%22%2C%22formatType%22%3A%22text%22%2C%22imageStyle%22%3A%22pi+pi-filter%22%7D%5D%2C%22actionSets%22%3A%5B%7B%22actions%22%3A%5B%7B%22actionProcess%22%3A%7B%22localAction%22%3A%22InvestmentAdvanceFilters%22%2C%22localActionFormat%22%3A%22%22%2C%22customTemplate%22%3A%22pzModalTemplate%22%2C%22target%22%3A%22overlay%22%7D%2C%22action%22%3A%22localAction%22%7D%5D%2C%22events%22%3A%5B%7B%22event%22%3A%22click%22%7D%2C%7B%22event%22%3A%22enter%22%7D%5D%7D%5D%2C%22label%22%3A%7B%22annotation%22%3A%7B%22use%22%3A%22param%22%2C%22property%22%3A%22.pyButtonLabel%22%2C%22label%22%3A%22Advanced+Filters%22%2C%22type%22%3A%22localize-label%22%7D%7D%2C%22type%22%3A%22pxButton%22%7D%2C%22label%22%3A%7B%22annotation%22%3A%7B%22property%22%3A%22.pyCaption%22%2C%22label%22%3A%22%22%2C%22type%22%3A%22localize-label%22%7D%7D%2C%22type%22%3A%22Text%22%2C%22required%22%3Afalse%2C%22showLabel%22%3Afalse%2C%22validateAs%22%3A%22%22%2C%22reference%22%3A%7B%22annotation%22%3A%7B%22type%22%3A%22pagename%22%2C%22append%22%3A%22pyTemplateButton%22%7D%7D%2C%22labelFormat%22%3A%22Standard%22%2C%22disabled%22%3Afalse%2C%22testID%22%3A%7B%22annotation%22%3A%7B%22testId%22%3A%22202306071442520073292%22%2C%22type%22%3A%22test-id%22%7D%7D%2C%22valueFormatting%22%3A%22%22%2C%22value%22%3A%7B%22annotation%22%3A%7B%22ref%22%3A%22.pyTemplateButton%22%2C%22defaultValue%22%3A%22%22%2C%22type%22%3A%22property%22%7D%7D%2C%22maxLength%22%3A0%2C%22expectedLength%22%3A%22%22%2C%22fieldID%22%3A%22pyTemplateButton%22%7D%7D%2C%7B%22field%22%3A%7B%22validationMessages%22%3A%7B%22annotation%22%3A%7B%22property%22%3A%22.pyTemplateButton%22%2C%22type%22%3A%22validation-message%22%7D%7D%2C%22visible%22%3A%7B%22annotation%22%3A%7B%22expression%22%3A%22.FlagValueGroup%28InvFilters%29+%3D+true%22%2C%22defaultValue%22%3Afalse%2C%22type%22%3A%22simple-expression%22%2C%22olderValue%22%3Atrue%7D%7D%2C%22labelReserveSpace%22%3Afalse%2C%22accessCondition%22%3A%22%22%2C%22readOnly%22%3A%7B%22annotation%22%3A%7B%22type%22%3A%22readonly%22%2C%22value%22%3A%22auto%22%7D%7D%2C%22control%22%3A%7B%22modes%22%3A%5B%7B%22imageSource%22%3A%22styleclass%22%2C%22modeType%22%3A%22ignore%22%2C%22tooltip%22%3A%22%22%2C%22imageStyle%22%3A%22pi+pi-filter-on%22%7D%2C%7B%22modeType%22%3A%22readOnly%22%2C%22imageSource%22%3A%22styleclass%22%2C%22autoPrepend%22%3A%22%22%2C%22controlFormat%22%3A%22pzhc%22%2C%22tooltip%22%3A%22%22%2C%22showReadOnlyValidation%22%3A%22false%22%2C%22autoAppend%22%3A%22%22%2C%22formatType%22%3A%22text%22%2C%22imageStyle%22%3A%22pi+pi-filter-on%22%7D%5D%2C%22actionSets%22%3A%5B%7B%22actions%22%3A%5B%7B%22actionProcess%22%3A%7B%22localAction%22%3A%22InvestmentAdvanceFilters%22%2C%22localActionFormat%22%3A%22%22%2C%22customTemplate%22%3A%22pzModalTemplate%22%2C%22target%22%3A%22overlay%22%7D%2C%22action%22%3A%22localAction%22%7D%5D%2C%22events%22%3A%5B%7B%22event%22%3A%22click%22%7D%2C%7B%22event%22%3A%22enter%22%7D%5D%7D%5D%2C%22label%22%3A%7B%22annotation%22%3A%7B%22use%22%3A%22param%22%2C%22property%22%3A%22.pyButtonLabel%22%2C%22label%22%3A%22Advanced+Filters%22%2C%22type%22%3A%22localize-label%22%7D%7D%2C%22type%22%3A%22pxButton%22%7D%2C%22label%22%3A%7B%22annotation%22%3A%7B%22property%22%3A%22.pyCaption%22%2C%22label%22%3A%22%22%2C%22type%22%3A%22localize-label%22%7D%7D%2C%22type%22%3A%22Text%22%2C%22required%22%3Afalse%2C%22showLabel%22%3Afalse%2C%22validateAs%22%3A%22%22%2C%22reference%22%3A%7B%22annotation%22%3A%7B%22type%22%3A%22pagename%22%2C%22append%22%3A%22pyTemplateButton%22%7D%7D%2C%22labelFormat%22%3A%22Standard%22%2C%22disabled%22%3Afalse%2C%22testID%22%3A%7B%22annotation%22%3A%7B%22testId%22%3A%22202306071442520073292%22%2C%22type%22%3A%22test-id%22%7D%7D%2C%22valueFormatting%22%3A%22%22%2C%22value%22%3A%7B%22annotation%22%3A%7B%22ref%22%3A%22.pyTemplateButton%22%2C%22defaultValue%22%3A%22%22%2C%22type%22%3A%22property%22%7D%7D%2C%22maxLength%22%3A0%2C%22expectedLength%22%3A%22%22%2C%22fieldID%22%3A%22pyTemplateButton%22%7D%7D%2C%7B%22layout%22%3A%7B%22visible%22%3Atrue%2C%22titleFormat%22%3A%22h2%22%2C%22groupsVisibility%22%3Atrue%2C%22containerFormat%22%3A%22NOHEADER%22%2C%22groups%22%3A%5B%7B%22view%22%3A%7B%22annotation%22%3A%7B%22puts%22%3A%5B%7B%22annotation%22%3A%7B%22action%22%3A%22put%22%2C%22type%22%3A%22local-param%22%2C%22value%22%3A%22NOHEADER%22%2C%22key%22%3A%22paramContainerFormat%22%7D%7D%5D%2C%22visible%22%3Atrue%2C%22name%22%3A%22InvestmentApplyFilterWrapper%22%2C%22context%22%3A%22%22%2C%22readOnly%22%3A%7B%22annotation%22%3A%7B%22type%22%3A%22readonly%22%2C%22value%22%3A%22auto%22%7D%7D%2C%22type%22%3A%22section-include%22%2C%22replaceParent%22%3Atrue%7D%7D%7D%2C%7B%22field%22%3A%7B%22validationMessages%22%3A%7B%22annotation%22%3A%7B%22property%22%3A%22.pyTemplateButton%22%2C%22type%22%3A%22validation-message%22%7D%7D%2C%22visible%22%3Atrue%2C%22labelReserveSpace%22%3Afalse%2C%22accessCondition%22%3A%22%22%2C%22readOnly%22%3A%7B%22annotation%22%3A%7B%22type%22%3A%22readonly%22%2C%22value%22%3A%22auto%22%7D%7D%2C%22control%22%3A%7B%22modes%22%3A%5B%7B%22imageSource%22%3A%22none%22%2C%22modeType%22%3A%22ignore%22%2C%22tooltip%22%3A%22%22%7D%2C%7B%22modeType%22%3A%22readOnly%22%2C%22imageSource%22%3A%22none%22%2C%22autoPrepend%22%3A%22%22%2C%22controlFormat%22%3A%22Strong%22%2C%22tooltip%22%3A%7B%22annotation%22%3A%7B%22property%22%3A%22.pyActionPrompt%22%2C%22label%22%3A%22%5C%22Click+to+apply+filters%5C%22%22%2C%22type%22%3A%22localize-label%22%7D%7D%2C%22showReadOnlyValidation%22%3A%22false%22%2C%22autoAppend%22%3A%22%22%2C%22formatType%22%3A%22text%22%7D%5D%2C%22actionSets%22%3A%5B%7B%22actions%22%3A%5B%7B%22action%22%3A%22refresh%22%2C%22refreshFor%22%3A%7B%22annotation%22%3A%7B%22type%22%3A%22refresh-for%22%2C%22actions%22%3A%7B%22pxObjClass%22%3A%22Embed-SelectedContextAPI-Refresh%22%2C%22pyActivityClassOrig%22%3A%22SRC-EPC-Data-Intake-Requirement%22%2C%22pyActivityClass%22%3A%22%22%2C%22pyDisableSubmit%22%3A%22false%22%2C%22pyPreDataTransform%22%3A%7B%22pxObjClass%22%3A%22Embed-Invoke-DataTransform%22%2C%22pyName%22%3A%22GenerateAdvancedFilterCSV%22%2C%22pyDataTransformParams%22%3A%5B%7B%22pxObjClass%22%3A%22Embed-NameValuePair%22%2C%22pyValue%22%3A%22%5C%22Investment%5C%22%22%2C%22pyName%22%3A%22FilterContext%22%2C%22pyParameterRequired%22%3A%22-1%22%7D%2C%7B%22pxObjClass%22%3A%22Embed-NameValuePair%22%2C%22pyValue%22%3A%22%5C%22InvFilter%5C%22%22%2C%22pyName%22%3A%22AppliedFilterContext%22%2C%22pyParameterRequired%22%3A%22-1%22%7D%5D%2C%22pxWarningsToDisplay%22%3A%5B%5D%7D%2C%22pyTarget%22%3A%22otherSection%22%2C%22pyActivity%22%3A%22%22%2C%22pySection%22%3A%22InvestmentsTableDashboard%22%2C%22pyActivityParams%22%3A%5B%7B%22pxObjClass%22%3A%22Embed-NameValuePair%22%2C%22pyName%22%3A%22%22%7D%5D%2C%22pxWarningsToDisplay%22%3A%5B%5D%7D%2C%22hash%22%3A%22SW52ZXN0bWVudEV4dHJhQWN0aW9uc1NSQy1FUEMtRGF0YS1JbnRha2UtSW52ZXN0bWVudC5weVRlbXBsYXRlQnV0dG9uMjAyMzA4MzExMjE1NTcwMDk0NTMzI3B4QnV0dG9uIzg%253D%22%7D%7D%7D%5D%2C%22events%22%3A%5B%7B%22event%22%3A%22click%22%7D%2C%7B%22event%22%3A%22enter%22%7D%5D%7D%5D%2C%22label%22%3A%7B%22annotation%22%3A%7B%22use%22%3A%22param%22%2C%22property%22%3A%22.pyButtonLabel%22%2C%22label%22%3A%22Apply%22%2C%22type%22%3A%22localize-label%22%7D%7D%2C%22type%22%3A%22pxButton%22%7D%2C%22label%22%3A%7B%22annotation%22%3A%7B%22property%22%3A%22.pyCaption%22%2C%22label%22%3A%22Button%22%2C%22type%22%3A%22localize-label%22%7D%7D%2C%22type%22%3A%22Text%22%2C%22required%22%3Afalse%2C%22showLabel%22%3Afalse%2C%22validateAs%22%3A%22%22%2C%22reference%22%3A%7B%22annotation%22%3A%7B%22type%22%3A%22pagename%22%2C%22append%22%3A%22pyTemplateButton%22%7D%7D%2C%22labelFormat%22%3A%22Standard%22%2C%22disabled%22%3Afalse%2C%22testID%22%3A%7B%22annotation%22%3A%7B%22testId%22%3A%22202308311215570094533%22%2C%22type%22%3A%22test-id%22%7D%7D%2C%22valueFormatting%22%3A%22%22%2C%22value%22%3A%7B%22annotation%22%3A%7B%22ref%22%3A%22.pyTemplateButton%22%2C%22defaultValue%22%3A%22%22%2C%22type%22%3A%22property%22%7D%7D%2C%22maxLength%22%3A0%2C%22expectedLength%22%3A%22%22%2C%22fieldID%22%3A%22pyTemplateButton%22%7D%7D%5D%2C%22groupFormat%22%3A%22Inline%22%2C%22layoutFormat%22%3A%22SIMPLELAYOUT%22%2C%22title%22%3A%7B%22annotation%22%3A%7B%22property%22%3A%22.pyCaption%22%2C%22label%22%3A%22%22%2C%22type%22%3A%22localize-label%22%7D%7D%7D%7D%2C%7B%22layout%22%3A%7B%22visible%22%3Atrue%2C%22titleFormat%22%3A%22h2%22%2C%22groupsVisibility%22%3Atrue%2C%22containerFormat%22%3A%22NOHEADER%22%2C%22groups%22%3A%5B%7B%22layout%22%3A%7B%22visible%22%3Atrue%2C%22titleFormat%22%3A%22h2%22%2C%22groupsVisibility%22%3Atrue%2C%22containerFormat%22%3A%22NOHEADER%22%2C%22groups%22%3A%5B%7B%22field%22%3A%7B%22validationMessages%22%3A%7B%22annotation%22%3A%7B%22property%22%3A%22.pyTemplateButton%22%2C%22type%22%3A%22validation-message%22%7D%7D%2C%22visible%22%3A%7B%22annotation%22%3A%7B%22expression%22%3A%22.FlagValueGroup%28InvFilters%29+%3D+true%22%2C%22defaultValue%22%3Afalse%2C%22type%22%3A%22simple-expression%22%2C%22olderValue%22%3Atrue%7D%7D%2C%22labelReserveSpace%22%3Afalse%2C%22accessCondition%22%3A%22%22%2C%22readOnly%22%3A%7B%22annotation%22%3A%7B%22type%22%3A%22readonly%22%2C%22value%22%3A%22auto%22%7D%7D%2C%22control%22%3A%7B%22modes%22%3A%5B%7B%22imageSource%22%3A%22styleclass%22%2C%22modeType%22%3A%22ignore%22%2C%22tooltip%22%3A%22%22%2C%22imageStyle%22%3A%22pi+pi-close%22%7D%2C%7B%22modeType%22%3A%22readOnly%22%2C%22imageSource%22%3A%22styleclass%22%2C%22autoPrepend%22%3A%22%22%2C%22controlFormat%22%3A%22pzhc%22%2C%22tooltip%22%3A%7B%22annotation%22%3A%7B%22property%22%3A%22.pyActionPrompt%22%2C%22label%22%3A%22%5C%22Click+to+clear+filters%5C%22%22%2C%22type%22%3A%22localize-label%22%7D%7D%2C%22showReadOnlyValidation%22%3A%22false%22%2C%22autoAppend%22%3A%22%22%2C%22formatType%22%3A%22text%22%2C%22imageStyle%22%3A%22pi+pi-close%22%7D%5D%2C%22actionSets%22%3A%5B%7B%22actions%22%3A%5B%7B%22action%22%3A%22refresh%22%2C%22refreshFor%22%3A%7B%22annotation%22%3A%7B%22type%22%3A%22refresh-for%22%2C%22actions%22%3A%7B%22pxObjClass%22%3A%22Embed-SelectedContextAPI-Refresh%22%2C%22pyActivityClassOrig%22%3A%22SRC-EPC-Data-Intake-Requirement%22%2C%22pyActivityClass%22%3A%22%22%2C%22pyDisableSubmit%22%3A%22false%22%2C%22pyPreDataTransform%22%3A%7B%22pxObjClass%22%3A%22Embed-Invoke-DataTransform%22%2C%22pyName%22%3A%22ClearAdvancedFilters%22%2C%22pyDataTransformParams%22%3A%5B%7B%22pxObjClass%22%3A%22Embed-NameValuePair%22%2C%22pyName%22%3A%22%22%7D%5D%2C%22pxWarningsToDisplay%22%3A%5B%5D%7D%2C%22pyTarget%22%3A%22thisSection%22%2C%22pyActivity%22%3A%22%22%2C%22pySection%22%3A%22%22%2C%22pyActivityParams%22%3A%5B%7B%22pxObjClass%22%3A%22Embed-NameValuePair%22%2C%22pyName%22%3A%22%22%7D%5D%7D%2C%22hash%22%3A%22SW52ZXN0bWVudEV4dHJhQWN0aW9uc1NSQy1FUEMtRGF0YS1JbnRha2UtSW52ZXN0bWVudC5weVRlbXBsYXRlQnV0dG9uMjAyMzA4MzExMjA2MTEwNjQzMTA5I3B4QnV0dG9uIzEz%22%7D%7D%7D%2C%7B%22action%22%3A%22refresh%22%2C%22refreshFor%22%3A%7B%22annotation%22%3A%7B%22type%22%3A%22refresh-for%22%2C%22actions%22%3A%7B%22pxObjClass%22%3A%22Embed-SelectedContextAPI-Refresh%22%2C%22pyActivityClassOrig%22%3A%22SRC-EPC-Data-Intake-Requirement%22%2C%22pyActivityClass%22%3A%22%22%2C%22pyDisableSubmit%22%3A%22false%22%2C%22pyPreDataTransform%22%3A%7B%22pxObjClass%22%3A%22Embed-Invoke-DataTransform%22%2C%22pyName%22%3A%22%22%2C%22pyDataTransformParams%22%3A%5B%7B%22pxObjClass%22%3A%22Embed-NameValuePair%22%2C%22pyName%22%3A%22%22%7D%5D%7D%2C%22pyTarget%22%3A%22otherSection%22%2C%22pyActivity%22%3A%22%22%2C%22pySection%22%3A%22InvestmentsTableDashboard%22%2C%22pyActivityParams%22%3A%5B%7B%22pxObjClass%22%3A%22Embed-NameValuePair%22%2C%22pyName%22%3A%22%22%7D%5D%2C%22pxWarningsToDisplay%22%3A%5B%5D%7D%2C%22hash%22%3A%22SW52ZXN0bWVudEV4dHJhQWN0aW9uc1NSQy1FUEMtRGF0YS1JbnRha2UtSW52ZXN0bWVudC5weVRlbXBsYXRlQnV0dG9uMjAyMzA4MzExMjA2MTEwNjQzMTA5I3B4QnV0dG9uIzEz%22%7D%7D%7D%5D%2C%22events%22%3A%5B%7B%22event%22%3A%22click%22%7D%2C%7B%22event%22%3A%22enter%22%7D%5D%7D%5D%2C%22label%22%3A%7B%22annotation%22%3A%7B%22use%22%3A%22param%22%2C%22property%22%3A%22.pyButtonLabel%22%2C%22label%22%3A%22Clear%22%2C%22type%22%3A%22localize-label%22%7D%7D%2C%22type%22%3A%22pxButton%22%7D%2C%22label%22%3A%7B%22annotation%22%3A%7B%22property%22%3A%22.pyCaption%22%2C%22label%22%3A%22Button%22%2C%22type%22%3A%22localize-label%22%7D%7D%2C%22type%22%3A%22Text%22%2C%22required%22%3Afalse%2C%22showLabel%22%3Afalse%2C%22validateAs%22%3A%22%22%2C%22reference%22%3A%7B%22annotation%22%3A%7B%22type%22%3A%22pagename%22%2C%22append%22%3A%22pyTemplateButton%22%7D%7D%2C%22labelFormat%22%3A%22Standard%22%2C%22disabled%22%3Afalse%2C%22testID%22%3A%7B%22annotation%22%3A%7B%22testId%22%3A%22202308311206110643109%22%2C%22type%22%3A%22test-id%22%7D%7D%2C%22valueFormatting%22%3A%22%22%2C%22value%22%3A%7B%22annotation%22%3A%7B%22ref%22%3A%22.pyTemplateButton%22%2C%22defaultValue%22%3A%22%22%2C%22type%22%3A%22property%22%7D%7D%2C%22maxLength%22%3A0%2C%22expectedLength%22%3A%22%22%2C%22fieldID%22%3A%22pyTemplateButton%22%7D%7D%2C%7B%22layout%22%3A%7B%22visible%22%3Atrue%2C%22titleFormat%22%3A%22h2%22%2C%22groupsVisibility%22%3Atrue%2C%22containerFormat%22%3A%22NOHEADER%22%2C%22groups%22%3A%5B%7B%22field%22%3A%7B%22validationMessages%22%3A%7B%22annotation%22%3A%7B%22property%22%3A%22.pyTemplateButton%22%2C%22type%22%3A%22validation-message%22%7D%7D%2C%22visible%22%3Atrue%2C%22labelReserveSpace%22%3Afalse%2C%22accessCondition%22%3A%22%22%2C%22readOnly%22%3A%7B%22annotation%22%3A%7B%22type%22%3A%22readonly%22%2C%22value%22%3A%22auto%22%7D%7D%2C%22control%22%3A%7B%22modes%22%3A%5B%7B%22imageSource%22%3A%22styleclass%22%2C%22modeType%22%3A%22ignore%22%2C%22tooltip%22%3A%22%22%2C%22imageStyle%22%3A%22pi+pi-download%22%7D%2C%7B%22modeType%22%3A%22readOnly%22%2C%22imageSource%22%3A%22styleclass%22%2C%22autoPrepend%22%3A%22%22%2C%22controlFormat%22%3A%22pzhc%22%2C%22tooltip%22%3A%7B%22annotation%22%3A%7B%22property%22%3A%22.pyActionPrompt%22%2C%22label%22%3A%22Click+to+Export+to+Excel%22%2C%22type%22%3A%22localize-label%22%7D%7D%2C%22showReadOnlyValidation%22%3A%22false%22%2C%22autoAppend%22%3A%22%22%2C%22formatType%22%3A%22text%22%2C%22imageStyle%22%3A%22pi+pi-download%22%7D%5D%2C%22actionSets%22%3A%5B%7B%22actions%22%3A%5B%7B%22actionProcess%22%3A%7B%22urlBase%22%3A%22%22%2C%22queryParams%22%3A%5B%7B%22valueReference%22%3A%7B%22reference%22%3A%22ProgramID%22%2C%22lastSavedValue%22%3A%7B%22annotation%22%3A%7B%22ref%22%3A%22.ProgramID%22%2C%22defaultValue%22%3A%22%22%2C%22type%22%3A%22property%22%7D%7D%7D%2C%22name%22%3A%22ProgramID%22%7D%2C%7B%22valueReference%22%3A%7B%22reference%22%3A%22FlagValueGroup%26%2340%3BInvFilters%26%2341%3B%22%2C%22lastSavedValue%22%3A%7B%22annotation%22%3A%7B%22ref%22%3A%22.FlagValueGroup%26%2340%3BInvFilters%26%2341%3B%22%2C%22defaultValue%22%3A%22%22%2C%22type%22%3A%22property%22%7D%7D%7D%2C%22name%22%3A%22HasFilter%22%7D%2C%7B%22valueReference%22%3A%7B%22reference%22%3A%22D_FilterPage.TagCSV%22%2C%22lastSavedValue%22%3A%7B%22annotation%22%3A%7B%22ref%22%3A%22D_FilterPage.TagCSV%22%2C%22defaultValue%22%3A%22%22%2C%22type%22%3A%22property%22%7D%7D%7D%2C%22name%22%3A%22TagCSV%22%7D%2C%7B%22valueReference%22%3A%7B%22reference%22%3A%22D_FilterPage.CapabilityCSV%22%2C%22lastSavedValue%22%3A%7B%22annotation%22%3A%7B%22ref%22%3A%22D_FilterPage.CapabilityCSV%22%2C%22defaultValue%22%3A%22%22%2C%22type%22%3A%22property%22%7D%7D%7D%2C%22name%22%3A%22CapCSV%22%7D%2C%7B%22valueReference%22%3A%7B%22reference%22%3A%22D_FilterPage.OrgCSV%22%2C%22lastSavedValue%22%3A%7B%22annotation%22%3A%7B%22ref%22%3A%22D_FilterPage.OrgCSV%22%2C%22defaultValue%22%3A%22%22%2C%22type%22%3A%22property%22%7D%7D%7D%2C%22name%22%3A%22OrgCSV%22%7D%2C%7B%22valueReference%22%3A%7B%22reference%22%3A%22D_FilterPage.GovernanceBodyCSV%22%2C%22lastSavedValue%22%3A%7B%22annotation%22%3A%7B%22ref%22%3A%22D_FilterPage.GovernanceBodyCSV%22%2C%22defaultValue%22%3A%22%22%2C%22type%22%3A%22property%22%7D%7D%7D%2C%22name%22%3A%22GovernanceCSV%22%7D%5D%2C%22windowName%22%3A%22_self%22%2C%22alternateDomain%22%3A%7B%22url%22%3A%22%22%7D%2C%22windowOptions%22%3A%22location%3D0%2Cmenubar%3D0%2Ctoolbar%3D0%2Cstatus%3D0%2Cresizable%3D0%2Clocation%3D0%2Cscrollbars%3D0%22%7D%2C%22action%22%3A%22openUrlInWindow%22%7D%5D%2C%22events%22%3A%5B%7B%22event%22%3A%22click%22%7D%2C%7B%22event%22%3A%22enter%22%7D%5D%7D%5D%2C%22label%22%3A%7B%22annotation%22%3A%7B%22use%22%3A%22param%22%2C%22property%22%3A%22.pyButtonLabel%22%2C%22label%22%3A%22Export%22%2C%22type%22%3A%22localize-label%22%7D%7D%2C%22type%22%3A%22pxButton%22%7D%2C%22label%22%3A%7B%22annotation%22%3A%7B%22property%22%3A%22.pyCaption%22%2C%22label%22%3A%22Button%22%2C%22type%22%3A%22localize-label%22%7D%7D%2C%22type%22%3A%22Text%22%2C%22required%22%3Afalse%2C%22showLabel%22%3Afalse%2C%22validateAs%22%3A%22%22%2C%22reference%22%3A%7B%22annotation%22%3A%7B%22type%22%3A%22pagename%22%2C%22append%22%3A%22pyTemplateButton%22%7D%7D%2C%22labelFormat%22%3A%22Standard%22%2C%22disabled%22%3Afalse%2C%22testID%22%3A%7B%22annotation%22%3A%7B%22testId%22%3A%22202310160911300454914%22%2C%22type%22%3A%22test-id%22%7D%7D%2C%22valueFormatting%22%3A%22%22%2C%22value%22%3A%7B%22annotation%22%3A%7B%22ref%22%3A%22.pyTemplateButton%22%2C%22defaultValue%22%3A%22%22%2C%22type%22%3A%22property%22%7D%7D%2C%22maxLength%22%3A0%2C%22expectedLength%22%3A%22%22%2C%22fieldID%22%3A%22pyTemplateButton%22%7D%7D%5D%2C%22groupFormat%22%3A%22Default%22%2C%22layoutFormat%22%3A%22SIMPLELAYOUT%22%2C%22title%22%3A%7B%22annotation%22%3A%7B%22property%22%3A%22.pyCaption%22%2C%22label%22%3A%22%22%2C%22type%22%3A%22localize-label%22%7D%7D%7D%7D%5D%2C%22groupFormat%22%3A%22Inline%22%2C%22layoutFormat%22%3A%22SIMPLELAYOUT%22%2C%22title%22%3A%7B%22annotation%22%3A%7B%22property%22%3A%22.pyCaption%22%2C%22label%22%3A%22%22%2C%22type%22%3A%22localize-label%22%7D%7D%7D%7D%5D%2C%22groupFormat%22%3A%22Mimic+a+sentence%22%2C%22layoutFormat%22%3A%22SIMPLELAYOUT%22%2C%22title%22%3A%7B%22annotation%22%3A%7B%22property%22%3A%22.pyCaption%22%2C%22label%22%3A%22%22%2C%22type%22%3A%22localize-label%22%7D%7D%7D%7D%5D%2C%22groupFormat%22%3A%22Inline%22%2C%22layoutFormat%22%3A%22SIMPLELAYOUT%22%2C%22title%22%3A%7B%22annotation%22%3A%7B%22property%22%3A%22.pyCaption%22%2C%22label%22%3A%22%22%2C%22type%22%3A%22localize-label%22%7D%7D%7D%7D%5D%2C%22groupFormat%22%3A%22Simple+list%22%2C%22layoutFormat%22%3A%22SIMPLELAYOUT%22%2C%22title%22%3A%7B%22annotation%22%3A%7B%22property%22%3A%22.pyCaption%22%2C%22label%22%3A%22%22%2C%22type%22%3A%22localize-label%22%7D%7D%7D%7D%5D%2C%22title%22%3A%7B%22annotation%22%3A%7B%22defaultValue%22%3A%22%22%2C%22action%22%3A%22get%22%2C%22replaceType%22%3A%22string%22%2C%22type%22%3A%22local-param%22%2C%22key%22%3A%22paramTitle%22%7D%7D%7D%7D%7D";
            JSON_OBJ = (JSONObject) parser.parse(URLDecoder.decode(JSON_STR));
        } catch (Exception ex) {
            oLog.error("Couldn't generate DXAPI JSON.", ex);
        }
    }

    public void perform() {
        ClipboardPage myStepPage = tools.getStepPage();
    }

    public void fuaInit() {
    }

    public void fuaDestroy() {
    }

    private static final String oDependencies[] = {
            "Rule-Obj-Activity:DOFUASSEMBLY",
            "Rule-Utility-Function:DXAPIFUA!PZSECTIONDXAPIMETHODHEADER",
            "Rule-Utility-Function:DXAPIFUA!PZSECTIONDXAPIMETHODABSENT",
            "Rule-Utility-Function:DXAPIFUA!PZSECTIONDXAPIMETHODACCESS",
            "Rule-Utility-Function:DXAPIFUA!PZSECTIONDXAPIMETHODFINISH",
            "Rule-Utility-Function:DXAPIFUA!PZSECTIONDXAPIMETHODCALL",
            "Rule-Utility-Function:DXAPIFUA!PZSECTIONDXAPIMETHODBODY",
            "Rule-HTML-Property:PXBUTTON" };

    public String[] getUsedRules() {
        return oDependencies;
    }

    private static final DependentRuleInfo[] oDependentRuleInfos = {
            new DependentRuleInfo("DOFUASSEMBLY", "Rule-Obj-Activity", "",
                    true, "Rule-HTML-Section", "", "", "", "!DOFUASSEMBLY",
                    true, false, "ABSOLUTE_IS_NOT_PRIMARY", 1),
            new DependentRuleInfo(
                    "DXAPIFUA!PZSECTIONDXAPIMETHODHEADER",
                    "Rule-Utility-Function",
                    "",
                    false,
                    "",
                    "Pega-ProcessEngine",
                    "08-08-04",
                    "RULE-UTILITY-FUNCTION DXAPIFUA PZSECTIONDXAPIMETHODHEADER--(PUBLICAPI,CLIPBOARDPAGE) #20230407T142530.369 GMT",
                    "DXAPIFUA!PZSECTIONDXAPIMETHODHEADER", true, false,
                    "ABSOLUTE_CLASSLESS", 1),
            new DependentRuleInfo(
                    "DXAPIFUA!PZSECTIONDXAPIMETHODABSENT",
                    "Rule-Utility-Function",
                    "",
                    false,
                    "",
                    "Pega-ProcessEngine",
                    "08-08-01",
                    "RULE-UTILITY-FUNCTION DXAPIFUA PZSECTIONDXAPIMETHODABSENT--(PUBLICAPI,CLIPBOARDPAGE) #20220209T125423.055 GMT",
                    "DXAPIFUA!PZSECTIONDXAPIMETHODABSENT", true, false,
                    "ABSOLUTE_CLASSLESS", 1),
            new DependentRuleInfo(
                    "DXAPIFUA!PZSECTIONDXAPIMETHODACCESS",
                    "Rule-Utility-Function",
                    "",
                    false,
                    "",
                    "Pega-ProcessEngine",
                    "08-08-01",
                    "RULE-UTILITY-FUNCTION DXAPIFUA PZSECTIONDXAPIMETHODACCESS--(PUBLICAPI,CLIPBOARDPAGE) #20220209T125423.061 GMT",
                    "DXAPIFUA!PZSECTIONDXAPIMETHODACCESS", true, false,
                    "ABSOLUTE_CLASSLESS", 1),
            new DependentRuleInfo(
                    "DXAPIFUA!PZSECTIONDXAPIMETHODFINISH",
                    "Rule-Utility-Function",
                    "",
                    false,
                    "",
                    "Pega-ProcessEngine",
                    "08-08-01",
                    "RULE-UTILITY-FUNCTION DXAPIFUA PZSECTIONDXAPIMETHODFINISH--(PUBLICAPI,CLIPBOARDPAGE) #20220209T125423.078 GMT",
                    "DXAPIFUA!PZSECTIONDXAPIMETHODFINISH", true, false,
                    "ABSOLUTE_CLASSLESS", 1),
            new DependentRuleInfo(
                    "DXAPIFUA!PZSECTIONDXAPIMETHODCALL",
                    "Rule-Utility-Function",
                    "",
                    false,
                    "",
                    "Pega-ProcessEngine",
                    "08-08-01",
                    "RULE-UTILITY-FUNCTION DXAPIFUA PZSECTIONDXAPIMETHODCALL--(PUBLICAPI,CLIPBOARDPAGE) #20220209T125423.072 GMT",
                    "DXAPIFUA!PZSECTIONDXAPIMETHODCALL", true, false,
                    "ABSOLUTE_CLASSLESS", 1),
            new DependentRuleInfo(
                    "DXAPIFUA!PZSECTIONDXAPIMETHODBODY",
                    "Rule-Utility-Function",
                    "",
                    false,
                    "",
                    "Pega-ProcessEngine",
                    "08-08-04",
                    "RULE-UTILITY-FUNCTION DXAPIFUA PZSECTIONDXAPIMETHODBODY--(PUBLICAPI,CLIPBOARDPAGE) #20230407T142530.346 GMT",
                    "DXAPIFUA!PZSECTIONDXAPIMETHODBODY", true, false,
                    "ABSOLUTE_CLASSLESS", 1),
            new DependentRuleInfo("PXBUTTON", "Rule-HTML-Property", "", false,
                    "", "", "", "", "PXBUTTON", true, false,
                    "ABSOLUTE_CLASSLESS", 1) };

    /**
    * This method returns the set of dependent rules required to build
    * the generated code and (possibly) whole classes that the rules assembler declared.
    * @return array of <code>DependentRuleInfo</code> objects.
    */
    public DependentRuleInfo[] getDependentRuleInfos() {
        return oDependentRuleInfos;
    }

    //	Rules used in this assembly (order and duplicates ARE significant to hash code) :
    //	RULE-UTILITY-FUNCTION DXAPIFUA PZSECTIONDXAPIMETHODABSENT--(PUBLICAPI,CLIPBOARDPAGE) #20220209T125423.055 GMT:20220209T125423.055 GMT
    //	RULE-UTILITY-FUNCTION DXAPIFUA PZSECTIONDXAPIMETHODACCESS--(PUBLICAPI,CLIPBOARDPAGE) #20220209T125423.061 GMT:20220209T125423.061 GMT
    //	RULE-UTILITY-FUNCTION DXAPIFUA PZSECTIONDXAPIMETHODBODY--(PUBLICAPI,CLIPBOARDPAGE) #20230407T142530.346 GMT:20230407T142530.346 GMT
    //	RULE-UTILITY-FUNCTION DXAPIFUA PZSECTIONDXAPIMETHODCALL--(PUBLICAPI,CLIPBOARDPAGE) #20220209T125423.072 GMT:20220209T125423.072 GMT
    //	RULE-UTILITY-FUNCTION DXAPIFUA PZSECTIONDXAPIMETHODFINISH--(PUBLICAPI,CLIPBOARDPAGE) #20220209T125423.078 GMT:20220209T125423.078 GMT
    //	RULE-UTILITY-FUNCTION DXAPIFUA PZSECTIONDXAPIMETHODHEADER--(PUBLICAPI,CLIPBOARDPAGE) #20230407T142530.369 GMT:20230407T142530.369 GMT

    //	Functions used during this assembly :
    //	RULE-UTILITY-FUNCTION DXAPIFUA PZDXAPIAPPLYMODESFROMCONTROL--(PF7504D3A3AF2B931607B42EC908ECBE8 #20220209T125422.721 GMT:20220209T125422.721 GMT
    //	RULE-UTILITY-FUNCTION DXAPIFUA PZDXAPIDETERMINEDISABLED--(PUBLICAPI,CLIPBOARDPAGE) #20230427T190849.944 GMT:20230427T190849.944 GMT
    //	RULE-UTILITY-FUNCTION DXAPIFUA PZDXAPIDETERMINEGENERICREFERENCE--(STRING) #20220209T125422.745 GMT:20220209T125422.745 GMT
    //	RULE-UTILITY-FUNCTION DXAPIFUA PZDXAPIDETERMINEPCCLASS--(PUBLICAPI,STRING,STRING) #20220209T125422.791 GMT:20220209T125422.791 GMT
    //	RULE-UTILITY-FUNCTION DXAPIFUA PZDXAPIDETERMINEREQUIRED--(PUBLICAPI,CLIPBOARDPAGE) #20230427T190850.001 GMT:20230427T190850.001 GMT
    //	RULE-UTILITY-FUNCTION DXAPIFUA PZDXAPIDETERMINESECTIONREADONLY--(PUBLICAPI,CLIPBOARDPAGE) #20230427T190850.030 GMT:20230427T190850.030 GMT
    //	RULE-UTILITY-FUNCTION DXAPIFUA PZDXAPIDETERMINETITLE--(PUBLICAPI,CLIPBOARDPAGE) #20220209T125422.815 GMT:20220707T210854.745 GMT
    //	RULE-UTILITY-FUNCTION DXAPIFUA PZDXAPIDETERMINETOOLTIP--(PUBLICB1287696E9855E48EC08F295FDD81499 #20220209T125422.822 GMT:20220209T125422.822 GMT
    //	RULE-UTILITY-FUNCTION DXAPIFUA PZDXAPIDETERMINEVISIBLE--(PUBLICAPI,CLIPBOARDPAGE,STRING) #20230427T190850.067 GMT:20230427T190850.067 GMT
    //	RULE-UTILITY-FUNCTION DXAPIFUA PZDXAPIJSONFORACTIONS--(PUBLICAPI,CLIPBOARDPAGE,CLIPBOARDPAGE) #20230119T211558.258 GMT:20230119T211558.258 GMT
    //	RULE-UTILITY-FUNCTION DXAPIFUA PZDXAPIJSONFORFIELD--(PUBLICAPI,D45243068DA4436819B68AA6E532124F #20230407T142530.121 GMT:20230407T142530.121 GMT
    //	RULE-UTILITY-FUNCTION DXAPIFUA PZDXAPIJSONFORGROUP--(PUBLICAPI,F57865B7448A71D93E5187D831C5865C #20230105T131128.152 GMT:20230105T131128.152 GMT
    //	RULE-UTILITY-FUNCTION DXAPIFUA PZDXAPIJSONFORLAYOUT--(PUBLICAPIAFC95865A7A2527E2A197FE8A3F36484 #20221103T135243.335 GMT:20221103T135243.335 GMT
    //	RULE-UTILITY-FUNCTION DXAPIFUA PZDXAPIJSONFORMODES--(PUBLICAPI,CLIPBOARDPAGE,CLIPBOARDPAGE) #20221116T093101.286 GMT:20221121T145616.886 GMT
    //	RULE-UTILITY-FUNCTION DXAPIFUA PZDXAPIJSONFORVIEW--(CLIPBOARDPAGE) #20220209T125422.973 GMT:20220209T125422.973 GMT
    //	RULE-UTILITY-FUNCTION DXAPIFUA PZDXAPIJSONFORVIEWFROMSECTION--(6A90D62E978F905C3CF4D9FDFF17784C #20230105T131128.250 GMT:20230105T131128.250 GMT
    //	RULE-UTILITY-FUNCTION DXAPIFUA PZDXAPIJSONFORVIEWINTERNAL--(PUB0BD7188B22D1E7C45B24F2CB5D5EAFE9 #20220209T125422.985 GMT:20220216T200457.537 GMT
    //	RULE-UTILITY-FUNCTION DXAPIFUA PZSECTIONDXAPIMETHODBODY--(PUBLICAPI,CLIPBOARDPAGE) #20230407T142530.346 GMT:20230407T142530.346 GMT
    //	RULE-UTILITY-FUNCTION DXAPIFUA PZSECTIONDXAPIMETHODFINISH--(PUBLICAPI,CLIPBOARDPAGE) #20220209T125423.078 GMT:20220209T125423.078 GMT
    //	RULE-UTILITY-FUNCTION DXAPIFUA PZSECTIONDXAPIMETHODHEADER--(PUBLICAPI,CLIPBOARDPAGE) #20230407T142530.369 GMT:20230407T142530.369 GMT
    //	RULE-UTILITY-FUNCTION UTILITIES GETRULESYSTEMSETTING #20180713T131444.340 GMT:20180713T131444.340 GMT
    //	RULE-UTILITY-FUNCTION UTILITIES ISINPAGELIST #20180713T131444.398 GMT:20180713T131444.398 GMT
    //	RULE-UTILITY-FUNCTION UTILITIES LOOKUP #20180713T131444.446 GMT:20180713T131444.446 GMT
    //	RULE-UTILITY-FUNCTION UTILITIES LOOKUP--(STRING,STRING,STRING,ST2C086E23263E7513A698846B7B67A739 #20180713T131444.450 GMT:20180713T131444.450 GMT
    //	RULE-UTILITY-FUNCTION UTILITIES PXGETSTEPPAGEREFERENCE #20180713T142134.102 GMT:20180713T142134.102 GMT

    /**
     * provides a stand-in for uniqueness tests for the
     * content of this stream. Created from list of rules
     * and dates listed in the comment above this declaration.
     * @return	32 byte hash of that list using MD5
     */
    public static String getFUAContentHash() {
        return "6ed0770618df8d9e7473989d861698de";
    }

    public String getDefinitionAppliesToClass() {
        return "SRC-EPC-Data-Intake-Investment";
    }

    public String getAspect() {
        return "Action";
    }

    public static Map<String, AssemblyParameters> getAssemblyParametersMap(
            StreamBuilderToolKit tools) {
        Map<String, AssemblyParameters> clone = new HashMap<String, AssemblyParameters>();
        return clone;
    }

    private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo(
            "RULE-HTML-SECTION SRC-EPC-DATA-INTAKE-INVESTMENT INVESTMENTEXTRAACTIONS #20231215T160912.199 GMT",
            "SRC-EPC-Data-Intake-Investment InvestmentExtraActions", "EPC",
            "02-02-51", "20231215T160912.199 GMT");
}

// ********** Aspect Stream **********

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
import com.pega.ibm.icu.math.BigDecimal;
import com.pega.pegarules.jsptags.TagTools;
import com.pega.pegarules.priv.AbstractFUASupport;
import com.pega.pegarules.priv.FUAUtil;
import com.pega.pegarules.priv.LogHelper;
import com.pega.pegarules.priv.PegaAPI;
import com.pega.pegarules.priv.clipboard.PegaClipboardPage;
import com.pega.pegarules.priv.database.*;
import com.pega.pegarules.priv.generator.AssemblyParameters;
import com.pega.pegarules.priv.generator.DependentRuleInfo;
import com.pega.pegarules.priv.runtime.ComplexParameterPage;
import com.pega.pegarules.priv.runtime.IActionRequest;
import com.pega.pegarules.priv.runtime.IActionRequestRegistrar;
import com.pega.pegarules.priv.runtime.IAutoStreamRuntime;
import com.pega.pegarules.priv.runtime.PegaStreamAPI;
import com.pega.pegarules.priv.runtime.jsp.StreamBuilderBase;
import com.pega.pegarules.priv.runtime.jsp.StreamBuilderSection;
import com.pega.pegarules.pub.*;
import com.pega.pegarules.pub.clipboard.*;
import com.pega.pegarules.pub.context.*;
import com.pega.pegarules.pub.database.*;
import com.pega.pegarules.pub.dictionary.*;
import com.pega.pegarules.pub.generator.*;
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
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

/**
 * Builds JSP stream SRC-EPC-DATA-INTAKE-INVESTMENT!INVESTMENTEXTRAACTIONS.
 */
public class Rule_HTML_Section_SRC_EPC_Data_Intake_Investment_InvestmentExtraActions_Stream_20231215T160912_199_GMT
        extends StreamBuilderSection implements StreamBuilder, FUASupport,
        FUAReusable, WebAllowable {
    private static final LogHelper oLog = new LogHelper(
            "Rule_HTML_Section.InvestmentExtraActions.SRC_EPC_Data_Intake_Investment.Stream");
    private static Map<String, String[]> oCellRuntimeParamsMap = new HashMap<String, String[]>();
    private static Map<String, String> oControlPathsMap = new HashMap<String, String>();
    private static Map<String, AssemblyParameters> oAssemblyParamsMap = null;
    private static final int pzChecksum = 1778988216;
    private static boolean pz_isValidAssembly = true;
    /** The current stream builder. */
    /** Properties of the stream definition for the stream that included the current stream (or null if none). */
    private Map mParentStreamProperties = null;

    /** The handle of the current stream. */
    protected String pz_CurrentRuleKey;
    private IControlRuntimeUtilities controlRuntimeUtilities = null;

    /**
     * Creates a stream builder.
     *
     * @param aContext the current executable
     */
    public Rule_HTML_Section_SRC_EPC_Data_Intake_Investment_InvestmentExtraActions_Stream_20231215T160912_199_GMT(
            com.pega.pegarules.priv.PegaAPI aContext) {
        cleanForReuse(aContext);
        controlRuntimeUtilities = tools.getControlUtilities();
        initAssemblyParameters(tools);
    }

    public static Map<String, AssemblyParameters> getAssemblyParametersMap(
            StreamBuilderToolKit tools) {
        initAssemblyParameters(tools);
        Map<String, AssemblyParameters> clone = new HashMap<String, AssemblyParameters>();
        clone.putAll(oAssemblyParamsMap);
        return clone;
    }

    public static void initAssemblyParameters(StreamBuilderToolKit tools) {
        try {
            if (oAssemblyParamsMap == null || oAssemblyParamsMap.isEmpty()) {
                oAssemblyParamsMap = tools.getControlUtilities()
                        .getAssemblyParamsMap(oControlPathsMap, tools,
                                oCellRuntimeParamsMap, pxUniqueStreamHash);
                if (oAssemblyParamsMap != null && !oAssemblyParamsMap.isEmpty()) {
                    oControlPathsMap = null;
                    oCellRuntimeParamsMap = null;
                }
            }
        } catch (IllegalStateException e) {
            pz_isValidAssembly = false;
        }
    }

    public boolean isAllowedInWeb() {
        return true;
    }

    private static String pxUniqueStreamHash = "33371dc83bfd0bf93ebcabe8cfcc5fc8db5f170a";
    private boolean pxIsNonTemplateStream = false;
    private char previousTemplatingStatus = '\0';

    public void execute() {
        if (!pz_isValidAssembly) {
            throw new PRRuntimeException("Invalid Section Assembly ");
        }
        previousTemplatingStatus = '\0';
        pzAuto.beginStream(pega);
        initRequiredPages();
        pageContext = pega.getJSPFactory().getPageContext(mHttpServlet,
                request, mStreamResponse, null, true, 0, true);
        application = pageContext.getServletContext();
        out = pageContext.getOut();
        session = pageContext.getSession();
        mStreamResponse.setContentType("text/html;charset=UTF-8");
        try {
            pxUniqueStreamHash = "33371dc83bfd0bf93ebcabe8cfcc5fc8db5f170a";
            pzAuto.getUIComponentRuntime().getRuntimeContextTree()
                    .pushSection("InvestmentExtraActions", pxUniqueStreamHash);
            pxIsNonTemplateStream = hasNonTemplateMethod_1();
            pzAuto.getUIComponentRuntime()
                    .getRuntimeContextTree()
                    .saveValue(
                            com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_UNIQUE_STREAMHASH,
                            pxUniqueStreamHash);
            if (!pzAuto
                    .getUIComponentRuntime()
                    .getRuntimeContextTree()
                    .canProcessSection(pxIsNonTemplateStream, false,
                            pxUniqueStreamHash + "_1", false)) {
                pzAuto.getUIComponentRuntime().getRuntimeContextTree()
                        .popSection();
                return;
            }
            if (previousTemplatingStatus == '\0') {
                previousTemplatingStatus = pzAuto.getUIComponentRuntime()
                        .getTemplatingUIStatus();
            }
            pzAuto.getUIComponentRuntime()
                    .getRuntimeContextTree()
                    .saveValue(
                            com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_IS_NONTEMPLATE_STREAM,
                            String.valueOf(pxIsNonTemplateStream));
            /*
             * Begin RULE-HTML-SECTION SRC-EPC-DATA-INTAKE-INVESTMENT INVESTMENTEXTRAACTIONS #20231215T160912.199 GMT
             * Set up context.
             */
            final String prevRuleKey_1 = pz_CurrentRuleKey;
            pz_CurrentRuleKey = "RULE-HTML-SECTION SRC-EPC-DATA-INTAKE-INVESTMENT INVESTMENTEXTRAACTIONS #20231215T160912.199 GMT";
            final String prevClass_1 = mStreamResponse.getJspBaseClass();
            mStreamResponse.setJspBaseClass("Rule-HTML-Section");
            final Map prevPropDefs_1 = mStreamResponse.getPropertyDefinitions();
            mStreamResponse.setPropertyDefinitions(oPropDefinitions_1);
            if (mParentStreamProperties == null) {
                mParentStreamProperties = pega.getStreamProperties();
                if (mParentStreamProperties == null) {
                    mParentStreamProperties = Collections.EMPTY_MAP;
                }
            }
            pega.setStreamProperties(oStreamProperties_1);
            try {
                if (((com.pega.pegarules.priv.runtime.PegaStreamAPI) pega)
                        .streamProlog(oTraceInfo_0)) {
                    if (!pzDispatchToInvokedMethod()) {

                        performStream_1();

                    }
                }
            } catch (Throwable thr) {
                pzSection.abortComponent();
                oLog.error(pzAuto.getException().getSectionMsg(), thr);
                throw new PRRuntimeException(pzAuto.getException()
                        .getSectionMsg() + " : " + thr.getMessage(), thr);
            } finally {
                mStreamResponse.setPropertyDefinitions(prevPropDefs_1);
                mStreamResponse.setJspBaseClass(prevClass_1);
                pz_CurrentRuleKey = prevRuleKey_1;
                ((com.pega.pegarules.priv.runtime.PegaStreamAPI) pega)
                        .streamEpilog(oTraceInfo_0, false);
                pzAuto.getUIComponentRuntime().getRuntimeContextTree()
                        .popSection();
                pzAuto.getUIComponentRuntime().resetTemplatingUIStatus(
                        previousTemplatingStatus);
            }
            /* end RULE-HTML-SECTION SRC-EPC-DATA-INTAKE-INVESTMENT INVESTMENTEXTRAACTIONS #20231215T160912.199 GMT */
        } catch (Throwable ex) {
            handleError(ex);
        } finally {
            pzAuto.finishStream();
            if (pega.getJSPFactory() != null) {
                pega.getJSPFactory().releasePageContext(pageContext);
            }
            pega.returnHTTPServletRequest(request);
        }
    }

    public void fuaInit() {
    }

    public void fuaDestroy() {
    }

    private static final String oDependencies[] = {
            "Rule-Obj-Activity:PZASSEMBLEPREPROCESS",
            "Rule-HTML-Property:PXBUTTON" };

    public String[] getUsedRules() {
        return oDependencies;
    }

    private static final DependentRuleInfo[] oDependentRuleInfos = {
            new DependentRuleInfo(
                    "PZASSEMBLEPREPROCESS",
                    "Rule-Obj-Activity",
                    "RULE-HTML-SECTION",
                    true,
                    "Rule-HTML-Section",
                    "Pega-UIEngine",
                    "08-03-01",
                    "RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT",
                    "!PZASSEMBLEPREPROCESS", true, false,
                    "ABSOLUTE_IS_NOT_PRIMARY", 1),
            new DependentRuleInfo("PXBUTTON", "Rule-HTML-Property", "", false,
                    "", "Pega-Gadgets", "08-03-01",
                    "RULE-HTML-PROPERTY PXBUTTON #20190131T183501.513 GMT",
                    "PXBUTTON", true, false, "ABSOLUTE_CLASSLESS", 1928622883) };

    /**
    * This method returns the set of dependent rules required to build
    * the generated code and (possibly) whole classes that the rules assembler declared.
    * @return array of <code>DependentRuleInfo</code> objects.
    */
    public DependentRuleInfo[] getDependentRuleInfos() {
        return oDependentRuleInfos;
    }

    //	Rules used in this assembly (order and duplicates ARE significant to hash code) :
    //	RULE-HTML-PROPERTY PXBUTTON #20190131T183501.513 GMT:20190131T183501.513 GMT
    //	RULE-HTML-PROPERTY PXBUTTON #20190131T183501.513 GMT:20190131T183501.513 GMT
    //	RULE-HTML-PROPERTY PXBUTTON #20190131T183501.513 GMT:20190131T183501.513 GMT
    //	RULE-HTML-PROPERTY PXBUTTON #20190131T183501.513 GMT:20190131T183501.513 GMT
    //	RULE-HTML-PROPERTY PXBUTTON #20190131T183501.513 GMT:20190131T183501.513 GMT
    //	RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT:20190430T113026.575 GMT
    //	simpleLayout_6(
    //	simpleLayout_1(
    //	simpleLayout_2(
    //	simpleLayout_4(
    //	simpleLayout_5(
    //	simpleLayout_3(

    //	Functions used during this assembly :
    //	RULE-UTILITY-FUNCTION DEFAULT HASMESSAGES #20180713T131436.731 GMT:20180713T131436.731 GMT
    //	RULE-UTILITY-FUNCTION HARNESS GENERATECLIENTWHENDIV #20180713T133337.849 GMT:20180713T133337.849 GMT
    //	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONBODYHTML--(STRING8119D405D65E5FC1B82614EF9838EE7F #20230105T134205.037 GMT:20230105T134205.037 GMT
    //	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONHTML--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20190130T075719.993 GMT:20190530T084144.624 GMT
    //	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONPROPERTYPARAMS--(12B0C95B359D6764824177DF4BC335BF #20181206T131216.951 GMT:20181206T131216.951 GMT
    //	RULE-UTILITY-FUNCTION HARNESS GENERATESETDEFAULTVALUES--(CLIPBBDB0FDAA1582A08C0911BE4E853713C8 #20191129T095927.918 GMT:20191129T095927.918 GMT
    //	RULE-UTILITY-FUNCTION HARNESS GETCLIENTWHENPROPERTIES #20180713T133337.962 GMT:20180713T133337.962 GMT
    //	RULE-UTILITY-FUNCTION HARNESS ISNOTJSP #20180713T132451.140 GMT:20180713T132451.140 GMT
    //	RULE-UTILITY-FUNCTION HARNESS ISPARAM #20180713T132451.145 GMT:20180713T132451.145 GMT
    //	RULE-UTILITY-FUNCTION HARNESS PZADDDESIGNTEMPLATEDEPENDENCY--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20180713T133338.079 GMT:20180713T133338.079 GMT
    //	RULE-UTILITY-FUNCTION HARNESS PZGENERATEADVPARAM #20180713T133339.603 GMT:20180713T133339.603 GMT
    //	RULE-UTILITY-FUNCTION HARNESS PZGENERATEADVPARAM--(STRINGBUFFER,CLIPBOARDPROPERTY,STRING) #20180713T133339.606 GMT:20180713T133339.606 GMT
    //	RULE-UTILITY-FUNCTION HARNESS PZGENERATEAUTOMATIONID--(CLIPBOARDPAGE,STRING) #20180713T133339.615 GMT:20180713T133339.615 GMT
    //	RULE-UTILITY-FUNCTION HARNESS PZGENERATEDECLAREPARAMS--(STRINGFDC1A05E906C7D1540A87AB36D46644C #20180713T133339.722 GMT:20180713T133339.722 GMT
    //	RULE-UTILITY-FUNCTION HARNESS PZGENERATEELEMENTMODEL--(STRINGBAC08C2213A8175CF3DB1B7FEA4664F0D #20180713T133339.741 GMT:20180713T133339.741 GMT
    //	RULE-UTILITY-FUNCTION HARNESS PZGENERATEFIELDINCLUDE #20180713T133339.748 GMT:20180713T133339.748 GMT
    //	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONDIV #20200130T140416.280 GMT:20200130T140416.280 GMT
    //	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONHTMLHELPER--(STB164ED9B4CFDEBA54B743216A805012A #20201222T180835.792 GMT:20201222T180835.792 GMT
    //	RULE-UTILITY-FUNCTION HARNESS PZGENERATESIMPLELAYOUTHTML #20180713T133339.900 GMT:20180713T133339.900 GMT
    //	RULE-UTILITY-FUNCTION HARNESS PZGENERATETOURID #20180713T133339.904 GMT:20180713T133339.904 GMT
    //	RULE-UTILITY-FUNCTION HARNESS PZGENERATEUIINSPECTORMETADATA #20180713T133339.909 GMT:20180713T133339.909 GMT
    //	RULE-UTILITY-FUNCTION HARNESS PZGETLAYOUTTYPE #20180713T133339.966 GMT:20180713T133339.966 GMT
    //	RULE-UTILITY-FUNCTION HARNESS PZGETPROPSFORTRACKING--(BOOLEAN,STRING) #20190520T091856.371 GMT:20190520T091856.371 GMT
    //	RULE-UTILITY-FUNCTION HARNESS PZISACTIONCONFIGUREDONSECTION--(83A8B0AB7CE3605FF27EAE9292646DA3 #20180713T133341.237 GMT:20180713T133341.237 GMT
    //	RULE-UTILITY-FUNCTION HARNESS PZSECTIONINCLUDEINCELL--(CLIPBOAF2BD5B648774E376BD18CD12B064353F #20180713T133341.324 GMT:20180713T133341.324 GMT
    //	RULE-UTILITY-FUNCTION HARNESS VALIDATEFORLOCALIZATIONTOKEN #20180713T132451.245 GMT:20180713T132451.245 GMT
    //	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATECONTROL--(CLIPBOARDPAGE,CLIPBOARDPROPERTY) #20190930T091802.162 GMT:20190930T091802.162 GMT
    //	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATESECTION--(CLIPBOARDPAGE,BOOLEAN) #20180713T133341.418 GMT:20180713T133341.418 GMT
    //	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATESECTIONINCLUDES #20200409T062442.142 GMT:20200409T062442.142 GMT
    //	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATETHIRDPARTYPARAMS #20180713T133341.437 GMT:20180713T133341.437 GMT
    //	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATECELL #20190311T210918.919 GMT:20190311T210918.919 GMT
    //	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATEGRID #20180713T133341.458 GMT:20180713T133341.458 GMT
    //	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATEROW #20180713T133341.463 GMT:20180713T133341.463 GMT
    //	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATERULEEXISTENCE #20180713T133341.471 GMT:20180713T133341.471 GMT
    //	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATESTANDARDHEADERELEMENTS #20180713T133341.476 GMT:20180713T133341.476 GMT
    //	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDCONSTANT #20180713T133342.959 GMT:20180713T133342.959 GMT
    //	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDLN #20180713T133342.968 GMT:20180713T133342.968 GMT
    //	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDSTRING #20180713T133342.971 GMT:20180713T133342.971 GMT
    //	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDVALUE #20180713T133342.978 GMT:20180713T133342.978 GMT
    //	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDVALUE--(STRING,CLI5436799337856473D715B7B3B9FDA861 #20190320T065455.546 GMT:20190320T065455.546 GMT
    //	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDVALUE--(STRING,CLI805ACB584571D11D0909301738737110 #20190320T065455.669 GMT:20190329T124704.529 GMT
    //	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONLOCALACTION--(CLIPBOARDP735454E5CE9DE0AF1D25BFD33036C12C #20190423T162450.172 GMT:20190423T162450.172 GMT
    //	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONOPENURLINWINDOW #20190717T074339.248 GMT:20191031T072346.716 GMT
    //	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONREFRESH--(CLIPBOARDPAGE,8AECDFE4A5256F13DC3F6C7D56453947 #20190320T065455.847 GMT:20190424T132824.042 GMT
    //	RULE-UTILITY-FUNCTION PZCONTROL PZBEHAVIORPROPERTIESCOUNT #20180713T133344.756 GMT:20180713T133344.756 GMT
    //	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONDITION--(CLIPBOARDPEFCDC2BD7217D45AF6F510980B90D167 #20190829T145118.669 GMT:20190829T145118.669 GMT
    //	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROL--(CLIPBOARDPAG958D4B4F290980CF271DE20E4A2E7F6E #20190405T152034.266 GMT:20190426T142746.856 GMT
    //	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLACTION--(CLIPBOB48B86F24D2B45DD052F71A16FDC5D4F #20201230T105617.123 GMT:20201230T105617.123 GMT
    //	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLCLIENTEVENT--(SF4D1A128F6CD72072BF94229061A5843 #20180713T133344.895 GMT:20180713T133344.895 GMT
    //	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATELINKORBUTTON--(CLIPBOAB4DCC1531E1C4D576C7E21B7E74A2550 #20230328T132007.973 GMT:20230328T132007.973 GMT
    //	RULE-UTILITY-FUNCTION PZCONTROL PZGETPROPERTYCLASS #20180713T133346.414 GMT:20180713T133346.414 GMT
    //	RULE-UTILITY-FUNCTION PZCONTROL PZMERGECONTROLPAGES #20180713T133346.497 GMT:20180713T133346.497 GMT
    //	RULE-UTILITY-FUNCTION PZCONTROL PZPACKAGEHOSTSECTION--(CLIPBOARDPAGE,FIRSTUSEASSEMBLER) #20180713T133346.501 GMT:20180713T133346.501 GMT
    //	RULE-UTILITY-FUNCTION PZCONTROL PZVALIDATEFIELDVALUE #20180713T133346.618 GMT:20180713T133346.618 GMT
    //	RULE-UTILITY-FUNCTION PZCONTROL PZVALIDATEPROPREF #20180713T133346.623 GMT:20180713T133346.623 GMT
    //	RULE-UTILITY-FUNCTION STRING ISLITERAL #20180713T131441.656 GMT:20180713T131441.656 GMT
    //	RULE-UTILITY-FUNCTION STRING STRIPSPECIALCHARS #20180713T131442.797 GMT:20180713T131442.797 GMT
    //	RULE-UTILITY-FUNCTION UIENGINE PZGETANIMATIONSJSONSTRING--(CLIPBOARDPAGE) #20190417T070159.744 GMT:20190430T131934.330 GMT
    //	RULE-UTILITY-FUNCTION UTILITIES PZVALIDATEFIELDVALUEREFERENCE #20190509T091013.548 GMT:20190509T091013.548 GMT
    //	RULE-UTILITY-FUNCTION UTILITIES VALIDATERULEEXISTENCE2 #20180713T131446.070 GMT:20180713T131446.070 GMT

    /**
     * provides a stand-in for uniqueness tests for the
     * content of this stream. Created from list of rules
     * and dates listed in the comment above this declaration.
     * @return	32 byte hash of that list using MD5
     */
    public static String getFUAContentHash() {
        return "a5246f1cb44c9ac69ae959871ed71c09";
    }

    public String getDefinitionAppliesToClass() {
        return "SRC-EPC-Data-Intake-Investment";
    }

    public String getAspect() {
        return "Stream";
    }

    public void pzSectionBody_1() {
        pzSection.includeExpressions();
        if ("true".equals(tools.getParamValue("partialRefresh"))) {
        } else {
            tools.putSaveValue(
                    "sectionUniqueID",
                    ((new StringBuilder("SID"))
                            .append((((com.pega.pegarules.priv.context.PegaRequestor) tools
                                    .getRequestor()).currentTimeUnique())))
                            .toString());
            if (pzAuto.isForOfflineTemplate()) {
                try {
                    tools.putSaveValue("offlineSectionClassKey", tools
                            .getStepPage().getClassName());
                } catch (Exception e) {
                }
            }
            pzSection
                    .beginSection(
                            "InvestmentExtraActions",
                            1,
                            "Rule-HTML-Section",
                            "{'type':'Section','ruleName':'InvestmentExtraActions','insKey':'RULE-HTML-SECTION SRC-EPC-DATA-INTAKE-INVESTMENT INVESTMENTEXTRAACTIONS #20231215T160912.199 GMT','sectionType':'standard'}");
            pzLayout_7();
            tools.putSaveValue("ContainerID", "");
            pzSection.endSection();
            tools.putSaveValue("sectionUniqueID", "");
            if (pzAuto.isForOfflineTemplate()) {
                tools.putSaveValue("offlineSectionClassKey", "");
            }
        }
    }

    public void buildWhiteList_1() {
        Map<String, String> config;
        pega.getUIEngine().getUIAction("refresh", null).register();
        pega.getUIEngine().getUIAction("refresh", null).register();
        config = new HashMap<String, String>();
        config.put("ActionSection", "pyOverlayTemplate");
        config.put("NewTaskStatus", "InvestmentAdvanceFilters");
        pega.getUIEngine().getUIAction("localAction", config).register();
        config = new HashMap<String, String>();
        config.put("ActionSection", "pyOverlayTemplate");
        config.put("NewTaskStatus", "InvestmentAdvanceFilters");
        pega.getUIEngine().getUIAction("localAction", config).register();
        config = new HashMap<String, String>();
        config.put("ActionSection", "pyOverlayTemplate");
        config.put("NewTaskStatus", "InvestmentAdvanceFilters");
        pega.getUIEngine().getUIAction("localAction", config).register();
        config = new HashMap<String, String>();
        config.put("ActionSection", "pyOverlayTemplate");
        config.put("NewTaskStatus", "InvestmentAdvanceFilters");
        pega.getUIEngine().getUIAction("localAction", config).register();
        pega.getUIEngine().getUIAction("refresh", null).register();
        pega.getUIEngine().getUIAction("refresh", null).register();
        pega.getUIEngine().getUIAction("refresh", null).register();
        config = new HashMap<String, String>();
        config.put("pyTarget", "thisSection");
        config.put("pyPreDataTransform.pyName", "GenerateAdvancedFilterCSV");
        config.put("StaticDataTransformParams",
                "FilterContext=Investment&AppliedFilterContext=InvFilter");
        pega.getUIEngine().getUIAction("refresh", config).register();
        config = new HashMap<String, String>();
        config.put("pyTarget", "thisSection");
        config.put("pyPreDataTransform.pyName", "GenerateAdvancedFilterCSV");
        config.put("StaticDataTransformParams",
                "FilterContext=Investment&AppliedFilterContext=InvFilter");
        pega.getUIEngine().getUIAction("refresh", config).register();
        pega.getUIEngine().getUIAction("refresh", null).register();
        pega.getUIEngine().getUIAction("refresh", null).register();
        config = new HashMap<String, String>();
        config.put("pyTarget", "thisSection");
        config.put("pyPreDataTransform.pyName", "ClearAdvancedFilters");
        pega.getUIEngine().getUIAction("refresh", config).register();
        config = new HashMap<String, String>();
        config.put("pyTarget", "thisSection");
        pega.getUIEngine().getUIAction("refresh", config).register();
        config = new HashMap<String, String>();
        config.put("pyTarget", "thisSection");
        config.put("pyPreDataTransform.pyName", "ClearAdvancedFilters");
        pega.getUIEngine().getUIAction("refresh", config).register();
        config = new HashMap<String, String>();
        config.put("pyTarget", "thisSection");
        pega.getUIEngine().getUIAction("refresh", config).register();
        pega.getUIEngine().getUIAction("refresh", null).register();
        config = new HashMap<String, String>();
        config.put("pyPreActivity", "ExportInvestmentsToExcel");
        pega.getUIEngine().getUIAction("openUrlInWindow", config).register();
        config = new HashMap<String, String>();
        config.put("pyPreActivity", "ExportInvestmentsToExcel");
        pega.getUIEngine().getUIAction("openUrlInWindow", config).register();
    }

    public void pzLayoutBody_6() {
        tools.putParamValue("LAYOUT_METHOD_NAME", "simpleLayout_6");
        simpleLayout_6();
    }

    public void pzLayoutBodyWrapper_7() {
        tools.appendString("<div class='layout layout-none'>");
        String clsScroll = "";
        tools.appendString("<div section_index='1' class='" + clsScroll
                + " layout-body clearfix'>");
        tools.putParamValue("LAYOUT_METHOD_NAME", "simpleLayout_6");
        simpleLayout_6();
        tools.appendString("</div></div>");
        tools.putSaveValue("rowClass", "");
    }

    public void pzLayoutBody_5() {
        tools.putParamValue("LAYOUT_METHOD_NAME", "simpleLayout_5");
        simpleLayout_5();
    }

    public void pzLayoutBodyWrapper_6() {
        tools.appendString("<div class='layout layout-none'>");
        String clsScroll = "";
        tools.appendString("<div section_index='1' class='" + clsScroll
                + " layout-body'>");
        tools.putParamValue("LAYOUT_METHOD_NAME", "simpleLayout_5");
        simpleLayout_5();
        tools.appendString("</div></div>");
        tools.putSaveValue("rowClass", "");
    }

    public void pzLayoutBody_4() {
        tools.putParamValue("LAYOUT_METHOD_NAME", "simpleLayout_4");
        simpleLayout_4();
    }

    public void pzLayoutBodyWrapper_5() {
        tools.appendString("<div class='layout layout-none'>");
        String clsScroll = "";
        tools.appendString("<div section_index='1' class='" + clsScroll
                + " layout-body'>");
        tools.putParamValue("LAYOUT_METHOD_NAME", "simpleLayout_4");
        simpleLayout_4();
        tools.appendString("</div></div>");
        tools.putSaveValue("rowClass", "");
    }

    public void pzLayoutBody_3() {
        tools.putParamValue("LAYOUT_METHOD_NAME", "simpleLayout_3");
        simpleLayout_3();
    }

    public void pzLayoutBodyWrapper_4() {
        tools.appendString("<div class='layout layout-none'>");
        String clsScroll = "";
        tools.appendString("<div section_index='1' class='" + clsScroll
                + " layout-body'>");
        tools.putParamValue("LAYOUT_METHOD_NAME", "simpleLayout_3");
        simpleLayout_3();
        tools.appendString("</div></div>");
        tools.putSaveValue("rowClass", "");
    }

    public void pzLayoutBody_2() {
        tools.putParamValue("LAYOUT_METHOD_NAME", "simpleLayout_2");
        simpleLayout_2();
    }

    public void pzLayoutBodyWrapper_3() {
        tools.appendString("<div class='layout layout-none'>");
        String clsScroll = "";
        tools.appendString("<div section_index='1' class='" + clsScroll
                + " layout-body'>");
        tools.putParamValue("LAYOUT_METHOD_NAME", "simpleLayout_2");
        simpleLayout_2();
        tools.appendString("</div></div>");
        tools.putSaveValue("rowClass", "");
    }

    public String getUIActionsMetaData_5() {
        StringBuilder actionsStringBuilder = tools.pushStreamBody();
        ((PegaStreamAPI) tools).disableDirectStreaming();

        {
            boolean isBehaviorAdded = false;
            isBehaviorAdded = false;
            tools.appendString(" data-click='[");
            if (isBehaviorAdded && true) {
                tools.appendString(",");
            }
            tools.appendString("[\"openUrlInWindow\", [\""
                    + tools.findPage("pxThread", false).getString("pxReqURI")
                    + "?pyActivity=@baseclass.pzProcessURLInWindow");
            if (pzAuto.isURLEncryptionEnabled()) {
                tools.appendString("&pyPreActivity=ExportInvestmentsToExcel");
            } else {
                tools.appendString("&amp;pyPreActivity=ExportInvestmentsToExcel");
            }
            if (pzAuto.isURLEncryptionEnabled()) {
                tools.appendString("&ProgramID=");
            } else {
                tools.appendString("&amp;ProgramID=");
            }

            tools.appendString("#~"
                    + pzAuto.getUIComponentRuntime().generateActionToken(
                            ".ProgramID") + "~#");
            if (pzAuto.isURLEncryptionEnabled()) {
                tools.appendString("&HasFilter=");
            } else {
                tools.appendString("&amp;HasFilter=");
            }

            tools.appendString("#~"
                    + pzAuto.getUIComponentRuntime().generateActionToken(
                            ".FlagValueGroup(InvFilters)") + "~#");
            if (pzAuto.isURLEncryptionEnabled()) {
                tools.appendString("&TagCSV=");
            } else {
                tools.appendString("&amp;TagCSV=");
            }

            tools.appendString("#~"
                    + pzAuto.getUIComponentRuntime().generateActionToken(
                            "D_FilterPage.TagCSV") + "~#");
            if (pzAuto.isURLEncryptionEnabled()) {
                tools.appendString("&CapCSV=");
            } else {
                tools.appendString("&amp;CapCSV=");
            }

            tools.appendString("#~"
                    + pzAuto.getUIComponentRuntime().generateActionToken(
                            "D_FilterPage.CapabilityCSV") + "~#");
            if (pzAuto.isURLEncryptionEnabled()) {
                tools.appendString("&OrgCSV=");
            } else {
                tools.appendString("&amp;OrgCSV=");
            }

            tools.appendString("#~"
                    + pzAuto.getUIComponentRuntime().generateActionToken(
                            "D_FilterPage.OrgCSV") + "~#");
            if (pzAuto.isURLEncryptionEnabled()) {
                tools.appendString("&GovernanceCSV=");
            } else {
                tools.appendString("&amp;GovernanceCSV=");
            }

            tools.appendString("#~"
                    + pzAuto.getUIComponentRuntime().generateActionToken(
                            "D_FilterPage.GovernanceBodyCSV") + "~#");
            tools.appendString("\", \"_self\", \"location=0,menubar=0,toolbar=0,status=0,resizable=0,location=0,scrollbars=0\", \"false\",\":event\",\"false\", \"false\"]");

            tools.appendString("]");
            isBehaviorAdded = true;
            tools.appendString("]' ");
            isBehaviorAdded = false;
            tools.appendString(" data-keydown='[");
            if (isBehaviorAdded && true) {
                tools.appendString(",");
            }
            tools.appendString("[\"openUrlInWindow\", [\""
                    + tools.findPage("pxThread", false).getString("pxReqURI")
                    + "?pyActivity=@baseclass.pzProcessURLInWindow");
            if (pzAuto.isURLEncryptionEnabled()) {
                tools.appendString("&pyPreActivity=ExportInvestmentsToExcel");
            } else {
                tools.appendString("&amp;pyPreActivity=ExportInvestmentsToExcel");
            }
            if (pzAuto.isURLEncryptionEnabled()) {
                tools.appendString("&ProgramID=");
            } else {
                tools.appendString("&amp;ProgramID=");
            }

            tools.appendString("#~"
                    + pzAuto.getUIComponentRuntime().generateActionToken(
                            ".ProgramID") + "~#");
            if (pzAuto.isURLEncryptionEnabled()) {
                tools.appendString("&HasFilter=");
            } else {
                tools.appendString("&amp;HasFilter=");
            }

            tools.appendString("#~"
                    + pzAuto.getUIComponentRuntime().generateActionToken(
                            ".FlagValueGroup(InvFilters)") + "~#");
            if (pzAuto.isURLEncryptionEnabled()) {
                tools.appendString("&TagCSV=");
            } else {
                tools.appendString("&amp;TagCSV=");
            }

            tools.appendString("#~"
                    + pzAuto.getUIComponentRuntime().generateActionToken(
                            "D_FilterPage.TagCSV") + "~#");
            if (pzAuto.isURLEncryptionEnabled()) {
                tools.appendString("&CapCSV=");
            } else {
                tools.appendString("&amp;CapCSV=");
            }

            tools.appendString("#~"
                    + pzAuto.getUIComponentRuntime().generateActionToken(
                            "D_FilterPage.CapabilityCSV") + "~#");
            if (pzAuto.isURLEncryptionEnabled()) {
                tools.appendString("&OrgCSV=");
            } else {
                tools.appendString("&amp;OrgCSV=");
            }

            tools.appendString("#~"
                    + pzAuto.getUIComponentRuntime().generateActionToken(
                            "D_FilterPage.OrgCSV") + "~#");
            if (pzAuto.isURLEncryptionEnabled()) {
                tools.appendString("&GovernanceCSV=");
            } else {
                tools.appendString("&amp;GovernanceCSV=");
            }

            tools.appendString("#~"
                    + pzAuto.getUIComponentRuntime().generateActionToken(
                            "D_FilterPage.GovernanceBodyCSV") + "~#");
            tools.appendString("\", \"_self\", \"location=0,menubar=0,toolbar=0,status=0,resizable=0,location=0,scrollbars=0\", \"false\",\":event\",\"false\", \"false\"]");

            tools.appendString(",");
            tools.appendString(",\"enter\"");
            tools.appendString("]");
            isBehaviorAdded = true;
            tools.appendString("]' ");
        }
        try {
            if (tools.getParamValue("AJAXTrackID") != null
                    && !tools.getParamValue("AJAXTrackID").equals("")) {
                com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_controlAction = pzAuto
                        .getChangeTracker(tools.getParamValue("AJAXTrackID"));
                ct_controlAction.trackValueChanges(
                        tools.getProperty(".ProgramID"), -1);
                ct_controlAction.trackValueChanges(
                        tools.getProperty(".FlagValueGroup(InvFilters)"), -1);
                ct_controlAction.trackValueChanges(
                        tools.getProperty("D_FilterPage.TagCSV"), -1);
                ct_controlAction.trackValueChanges(
                        tools.getProperty("D_FilterPage.CapabilityCSV"), -1);
                ct_controlAction.trackValueChanges(
                        tools.getProperty("D_FilterPage.OrgCSV"), -1);
                ct_controlAction
                        .trackValueChanges(tools
                                .getProperty("D_FilterPage.GovernanceBodyCSV"),
                                -1);
            }
        } catch (Exception e) {
        }
        String returnString = actionsStringBuilder.toString();
        tools.popStreamBody();
        return returnString;
    }

    public void pxButton_5() {
        boolean isDisplayTextWithParam = false;
        String displayTextParamName = "";
        String displayTextParamValue = "";

        StringBuffer pegaValidation = null;
        boolean addedValidation = false;
        try {

            if (pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') {
                tools.appendString("<span ");
                tools.appendString(">");
            }
            if (pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y') {
                IUIComponentMetadata metadataPage = pzAuto
                        .getUIComponentRuntime().createMetadata();
                IUIComponentMetadata cellPage = pzAuto.getUIComponentRuntime()
                        .createMetadata();
                IUIComponentMetadata modePage1 = pzAuto.getUIComponentRuntime()
                        .createMetadata();
                IUIComponentMetadata modePage2 = pzAuto.getUIComponentRuntime()
                        .createMetadata();
                java.util.List<String> ctPropRefs = new ArrayList<String>();
                IUIComponent ctrlComponent = pzAuto.getUIComponent();
                String expressionId = null;
                com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
                tools.putParamValue("skipHTMLEncoding", "true");
                IUIComponentMetadata pxPrivilegeIdentifiers = pzAuto
                        .getUIComponentRuntime().createMetadata();
                if (expressionId != null && expressionId.length() > 0) {
                    modePage2.put("pyExpressionId", expressionId);
                }
                String uid = String
                        .valueOf(((com.pega.pegarules.priv.context.PegaRequestor) tools
                                .getRequestor()).currentTimeUnique());
                String navPage = "pyNavigation" + uid;
                cellPage.put(
                        "automationId",
                        " "
                                + pzCell.getTestIdIfEnabled("202310160911300454914")
                                + " ");
                if (false || (pzAuto.isOffline() && false)) {
                    modePage2.put("nav", navPage);
                }
                modePage2.put("pyName", "InvestmentExtraActions_$CTX$_16");
                String repeatIndx = "";
                String pyTooltip = "";
                if (pega.getPackageRuntime().canPackage()) {
                    tools.getLocalizedTextForString(".pyActionPrompt",
                            "Click to Export to Excel\t" + repeatIndx,
                            StreamBuilder.FMT_LITERAL);
                } else {
                    pzAuto.getUIComponentRuntime()
                            .getRuntimeContextTree()
                            .addLocalizedValue("Click to Export to Excel",
                                    ".pyActionPrompt");
                }
                pyTooltip = "Click to Export to Excel";
                modePage2.put("tooltip", pyTooltip);
                modePage2.put("helpertype", "tooltip");
                modePage2.put("styles", "");
                modePage2.put("imgSrc", "styleclass");
                String pyIconStyle = "";
                pyIconStyle = "pi pi-download";
                modePage2.put("image", pyIconStyle);
                modePage2.put("pyActionImagePosition", "right");
                String customStyles = null;
                String pyLabel = "";
                if (pega.getPackageRuntime().canPackage()) {
                    tools.getLocalizedTextForString(".pyButtonLabel",
                            "Export\t" + repeatIndx, StreamBuilder.FMT_LITERAL);
                } else {
                    pzAuto.getUIComponentRuntime().getRuntimeContextTree()
                            .addLocalizedValue("Export", ".pyButtonLabel");
                }
                pyLabel = "Export";
                modePage2.put("label", pyLabel);
                String spxUniqueStreamHash37 = getUIActionsMetaData_5();
                if (spxUniqueStreamHash37 != null
                        && !"".equals(spxUniqueStreamHash37)) {
                    pzAuto.getUIComponentRuntime()
                            .getRuntimeContextTree()
                            .addActionString(spxUniqueStreamHash37,
                                    pxUniqueStreamHash + "_37");
                    modePage2.put("pyActionStringID", pxUniqueStreamHash
                            + "_37");
                }
                modePage2
                        .put("actionPath", " data-keyboard='.' data-click='.'");
                tools.putParamValue("skipHTMLEncoding", "false");
                cellPage.addMetadataInArray("pyModes", modePage1);
                cellPage.addMetadataInArray("pyModes", modePage2);
                metadataPage.putMetadata("pyCell", cellPage);
                ctrlComponent
                        .addDependentScripts("pzpega_ui_template_button.js");
                ctrlComponent.beginComponent("pxButton", metadataPage);
                ctrlComponent.setTrackedProperties(ctPropRefs
                        .toArray(new String[] {}));
                tools.putParamValue("isControlEditableOriginal", true);
                ctrlComponent.endComponent();
            } else {
                boolean bDisabled = false;
                boolean bOptimizedMarkup = pzAuto.getUIComponentRuntime()
                        .isHarnessTemplatized() && pzAuto.isOffline();
                String pyFormatValue = "";
                String toolTipVal = "";
                String hrefValue = "#";
                String referenceString = tools.getStepPage().getReference();
                boolean isParameterizedDeclarePage = pega
                        .getDeclarativePageUtils().isParameterizedDPName(
                                referenceString);
                if (isParameterizedDeclarePage) {
                    referenceString = tools.getStepPage().getString(
                            "pzPageNameBase");
                }
                String buttonUID = "name='InvestmentExtraActions_"
                        + referenceString + "_16'";
                String securedPropValue = null;
                tools.appendString("<button "
                        + pzCell.getTestIdIfEnabled("202310160911300454914")
                        + "  data-ctl='Button'  type='button' ");
                if (!"true".equals(tools
                        .getParamValue("pxAvoidUniqueAttribute")))
                    tools.appendString(buttonUID);
                pega_uiengine_pzcontrol.pzAddClientValidation(tools, "", "",
                        "", "");
                {
                    boolean isBehaviorAdded = false;
                    isBehaviorAdded = false;
                    tools.appendString(" data-click='[");
                    if (isBehaviorAdded && true) {
                        tools.appendString(",");
                    }
                    tools.appendString("[\"openUrlInWindow\", [\""
                            + tools.findPage("pxThread", false).getString(
                                    "pxReqURI")
                            + "?pyActivity=@baseclass.pzProcessURLInWindow");
                    if (pzAuto.isURLEncryptionEnabled()) {
                        tools.appendString("&pyPreActivity=ExportInvestmentsToExcel");
                    } else {
                        tools.appendString("&amp;pyPreActivity=ExportInvestmentsToExcel");
                    }
                    if (pzAuto.isURLEncryptionEnabled()) {
                        tools.appendString("&ProgramID=");
                    } else {
                        tools.appendString("&amp;ProgramID=");
                    }

                    tools.appendString("#~"
                            + pzAuto.getUIComponentRuntime()
                                    .generateActionToken(".ProgramID") + "~#");
                    if (pzAuto.isURLEncryptionEnabled()) {
                        tools.appendString("&HasFilter=");
                    } else {
                        tools.appendString("&amp;HasFilter=");
                    }

                    tools.appendString("#~"
                            + pzAuto.getUIComponentRuntime()
                                    .generateActionToken(
                                            ".FlagValueGroup(InvFilters)")
                            + "~#");
                    if (pzAuto.isURLEncryptionEnabled()) {
                        tools.appendString("&TagCSV=");
                    } else {
                        tools.appendString("&amp;TagCSV=");
                    }

                    tools.appendString("#~"
                            + pzAuto.getUIComponentRuntime()
                                    .generateActionToken("D_FilterPage.TagCSV")
                            + "~#");
                    if (pzAuto.isURLEncryptionEnabled()) {
                        tools.appendString("&CapCSV=");
                    } else {
                        tools.appendString("&amp;CapCSV=");
                    }

                    tools.appendString("#~"
                            + pzAuto.getUIComponentRuntime()
                                    .generateActionToken(
                                            "D_FilterPage.CapabilityCSV")
                            + "~#");
                    if (pzAuto.isURLEncryptionEnabled()) {
                        tools.appendString("&OrgCSV=");
                    } else {
                        tools.appendString("&amp;OrgCSV=");
                    }

                    tools.appendString("#~"
                            + pzAuto.getUIComponentRuntime()
                                    .generateActionToken("D_FilterPage.OrgCSV")
                            + "~#");
                    if (pzAuto.isURLEncryptionEnabled()) {
                        tools.appendString("&GovernanceCSV=");
                    } else {
                        tools.appendString("&amp;GovernanceCSV=");
                    }

                    tools.appendString("#~"
                            + pzAuto.getUIComponentRuntime()
                                    .generateActionToken(
                                            "D_FilterPage.GovernanceBodyCSV")
                            + "~#");
                    tools.appendString("\", \"_self\", \"location=0,menubar=0,toolbar=0,status=0,resizable=0,location=0,scrollbars=0\", \"false\",\":event\",\"false\", \"false\"]");

                    tools.appendString("]");
                    isBehaviorAdded = true;
                    tools.appendString("]' ");
                    isBehaviorAdded = false;
                    tools.appendString(" data-keydown='[");
                    if (isBehaviorAdded && true) {
                        tools.appendString(",");
                    }
                    tools.appendString("[\"openUrlInWindow\", [\""
                            + tools.findPage("pxThread", false).getString(
                                    "pxReqURI")
                            + "?pyActivity=@baseclass.pzProcessURLInWindow");
                    if (pzAuto.isURLEncryptionEnabled()) {
                        tools.appendString("&pyPreActivity=ExportInvestmentsToExcel");
                    } else {
                        tools.appendString("&amp;pyPreActivity=ExportInvestmentsToExcel");
                    }
                    if (pzAuto.isURLEncryptionEnabled()) {
                        tools.appendString("&ProgramID=");
                    } else {
                        tools.appendString("&amp;ProgramID=");
                    }

                    tools.appendString("#~"
                            + pzAuto.getUIComponentRuntime()
                                    .generateActionToken(".ProgramID") + "~#");
                    if (pzAuto.isURLEncryptionEnabled()) {
                        tools.appendString("&HasFilter=");
                    } else {
                        tools.appendString("&amp;HasFilter=");
                    }

                    tools.appendString("#~"
                            + pzAuto.getUIComponentRuntime()
                                    .generateActionToken(
                                            ".FlagValueGroup(InvFilters)")
                            + "~#");
                    if (pzAuto.isURLEncryptionEnabled()) {
                        tools.appendString("&TagCSV=");
                    } else {
                        tools.appendString("&amp;TagCSV=");
                    }

                    tools.appendString("#~"
                            + pzAuto.getUIComponentRuntime()
                                    .generateActionToken("D_FilterPage.TagCSV")
                            + "~#");
                    if (pzAuto.isURLEncryptionEnabled()) {
                        tools.appendString("&CapCSV=");
                    } else {
                        tools.appendString("&amp;CapCSV=");
                    }

                    tools.appendString("#~"
                            + pzAuto.getUIComponentRuntime()
                                    .generateActionToken(
                                            "D_FilterPage.CapabilityCSV")
                            + "~#");
                    if (pzAuto.isURLEncryptionEnabled()) {
                        tools.appendString("&OrgCSV=");
                    } else {
                        tools.appendString("&amp;OrgCSV=");
                    }

                    tools.appendString("#~"
                            + pzAuto.getUIComponentRuntime()
                                    .generateActionToken("D_FilterPage.OrgCSV")
                            + "~#");
                    if (pzAuto.isURLEncryptionEnabled()) {
                        tools.appendString("&GovernanceCSV=");
                    } else {
                        tools.appendString("&amp;GovernanceCSV=");
                    }

                    tools.appendString("#~"
                            + pzAuto.getUIComponentRuntime()
                                    .generateActionToken(
                                            "D_FilterPage.GovernanceBodyCSV")
                            + "~#");
                    tools.appendString("\", \"_self\", \"location=0,menubar=0,toolbar=0,status=0,resizable=0,location=0,scrollbars=0\", \"false\",\":event\",\"false\", \"false\"]");

                    tools.appendString(",");
                    tools.appendString(",\"enter\"");
                    tools.appendString("]");
                    isBehaviorAdded = true;
                    tools.appendString("]' ");
                }
                try {
                    if (tools.getParamValue("AJAXTrackID") != null
                            && !tools.getParamValue("AJAXTrackID").equals("")) {
                        com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_controlAction = pzAuto
                                .getChangeTracker(tools
                                        .getParamValue("AJAXTrackID"));
                        ct_controlAction.trackValueChanges(
                                tools.getProperty(".ProgramID"), -1);
                        ct_controlAction
                                .trackValueChanges(
                                        tools.getProperty(".FlagValueGroup(InvFilters)"),
                                        -1);
                        ct_controlAction.trackValueChanges(
                                tools.getProperty("D_FilterPage.TagCSV"), -1);
                        ct_controlAction
                                .trackValueChanges(
                                        tools.getProperty("D_FilterPage.CapabilityCSV"),
                                        -1);
                        ct_controlAction.trackValueChanges(
                                tools.getProperty("D_FilterPage.OrgCSV"), -1);
                        ct_controlAction.trackValueChanges(tools
                                .getProperty("D_FilterPage.GovernanceBodyCSV"),
                                -1);
                    }
                } catch (Exception e) {
                }
                String repeatIndx = "";
                if (bOptimizedMarkup) {
                    tools.appendString("  data-bindprops='title,innerHTML' ");
                }
                tools.appendString("  title= '");
                toolTipVal = tools.getLocalizedTextForString(".pyActionPrompt",
                        "Click to Export to Excel\t" + repeatIndx,
                        StreamBuilder.FMT_LITERAL)
                        + "' ";
                tools.appendString(toolTipVal);
                tools.appendString("class='pzhc pzbutton");
                tools.appendString("'");
                if (bOptimizedMarkup) {
                    tools.appendString(" data-bindprops='innerHTML,title' ");
                }
                tools.appendString(" >");
                String classProp = "";
                classProp = "pi pi-download";
                boolean hasLineBreaks = false;
                hasLineBreaks = "Export"
                        .matches("(.*)<([Bb][Rr])\\s*\\/*\\s*>(.*)");
                if (hasLineBreaks) {
                    tools.appendString("<span class='pzbtn-label'  data-keyboard='.' data-click='.' ");
                }
                if (bOptimizedMarkup && hasLineBreaks) {
                    tools.appendString("  data-bindprops='title,innerHTML' ");
                }
                if (hasLineBreaks) {
                    tools.appendString("  > ");
                }
                tools.appendString("");
                pega_uiengine_harness.pzGenAKey(tools
                        .getLocalizedTextForString(".pyButtonLabel", "Export",
                                StreamBuilder.FMT_LITERAL));
                checkForScriptTags_1(tools.getParamValue("pzULabel"));
                if (hasLineBreaks) {
                    tools.appendString("</span>");
                }
                tools.appendString(" <i aria-hidden='true'  data-keyboard='.' data-click='.' class='"
                        + classProp + "'></i>");
                tools.appendString("</button>");
            }

            tools.putParamValue("pega_attributes", "");
            if (pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') {
                tools.appendString("</span>");
            }
            tools.putParamValue("doAutoFormatting", "false");
            tools.putParamValue("isControlEditableOriginal", true);
            if (pegaValidation != null) {
                com.pega.pegarules.priv.factory.StringBufferFactory
                        .release(pegaValidation);
            }
        } catch (Exception e) {

            oLog.error(e.getMessage());

            if (pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'
                    && pzAuto.getUIComponentRuntime().getRuntimeContextTree()
                            .isLiveDesignViewMode()) {

                IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime()
                        .createMetadata();
                IUIComponent ctrlComponent = pzAuto.getUIComponent();
                metadata.put("cellInfo", "Button");
                metadata.put("msgText", "config issue");
                ctrlComponent
                        .addDependentScripts("pzpega_ui_template_designview.js");
                ctrlComponent.beginComponent("pxDesignViewError", metadata);
                tools.putParamValue("isControlEditableOriginal", true);
                ctrlComponent.endComponent();
            }
        }

    }

    public int simpleLayoutCell_7(int index) {
        IUIComponent uiComp = null;
        String labelName = "";
        String ariahiddenString = "";
        String baseRef = "";
        generateClientWhenDiv_1();
        tools.appendString("' "
                + pega.getUIEngine().getFVInspectorUtils()
                        .startCollectingFieldValueData()
                + pzCell.getInspectorDataDynamic(
                        "pxButton",
                        ".pyTemplateInputBox",
                        "RH_2.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(4).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)")
                + " class='content-item content-field item-"
                + Integer.toString(index)
                + " remove-top-spacing remove-bottom-spacing remove-left-spacing remove-right-spacing   "
                + pzSection.getCustomStyle(false, "", "dataValueRead",
                        "dataValueWrite")
                + " flex flex-row '  STRING_TYPE='field' RESERVE_SPACE='false'>");
        pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
        tools.putSaveValue("parentLayouttype", "SIMPLELAYOUT");
        pxButton_5();
        tools.appendString(pega.getUIEngine().getFVInspectorUtils()
                .stopCollectingFieldValueData()
                + "</div>");
        index++;
        return index;
    }

    public int simpleLayoutTemplateCell_7(int index) {
        IUIComponent uiComp = null;
        String labelName = "";
        String expressionId = null;
        boolean isLabelJSP = false;
        String reqExpressionId = null;
        String disExpressionId = null;
        com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
        if (expression != null) {
            expressionId = expression.getId();
        }
        String pyCustomRequireFormat = "";
        pyCustomRequireFormat = tools.getLocalizedTextForString("pyCaption",
                "pyRequired");
        String dataFieldValueMeta = pega.getUIEngine().getFVInspectorUtils()
                .startCollectingFieldValueData();
        String baseRef = "";
        boolean pyDLCellVisibility = false;
        IUIComponent cc_dlCell = pzAuto.getUIComponent();
        IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime()
                .createMetadata();
        IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime()
                .createMetadata();
        pgCells.put(
                "partialClass",
                "remove-top-spacing remove-bottom-spacing remove-left-spacing remove-right-spacing flex flex-row");
        pgCells.put(
                "automationId",
                new StringBuilder(" ")
                        .append(pzCell
                                .getTestIdIfEnabled("202310160911300454914-Label"))
                        .append(" ").toString().replace("data-test-id=", "")
                        .trim());
        pgCells.put("format", "pxButton");
        pgCells.put("forLabel", ".pyTemplateInputBox");
        pgCells.put("pyAutoHTML", "true");
        pgCells.put("spanClass", "iconRequired standard_iconRequired");
        pgCells.put("cstmreqfor", pyCustomRequireFormat);
        if (!StringUtils.isBlank(expressionId))
            pgCells.put("pyExpressionId", expressionId);
        if (!"".equals(baseRef))
            pgCells.put("pyBaseRef", String.valueOf(baseRef));
        if (!"".equals(dataFieldValueMeta))
            pgCells.put("startFV", dataFieldValueMeta);
        pgCells.put("labelJSP", String.valueOf(isLabelJSP));
        pgCells.put("pyPreventXSSInLabel", false);
        pg_dlCellMeta.putMetadata("pyCell", pgCells);
        boolean isExpression = false;
        boolean isOffline = false;
        cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
        String inspectorData = pzCell
                .getInspectorDataDynamic(
                        "pxButton",
                        ".pyTemplateInputBox",
                        "RH_2.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(4).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
        if (!inspectorData.isEmpty()) {
            pgCells.put("liveUI", inspectorData);
        }
        pxButton_5();
        labelName = "Button";
        if (!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
            pzAuto.getUIComponentRuntime().getRuntimeContextTree()
                    .addLocalizedValue(labelName, "pyCaption");
        } else {
            StringUtils.crossScriptingFilter(tools.getLocalizedTextForString(
                    "pyCaption", labelName));
        }
        pgCells.put("pyLabelValue", labelName);
        String uiFieldValueMeta = pega.getUIEngine().getFVInspectorUtils()
                .stopCollectingFieldValueData();
        if (!"".equals(uiFieldValueMeta)) {
            pgCells.put("stopFV", uiFieldValueMeta);
        }
        cc_dlCell.endComponent();
        index++;
        return index;
    }

    public void pzSetExpandParam_7() {
        pzSection.getLayout().setExpandParam(
                "SubSectionInvestmentExtraActionsBBBBBB", "", false);
    }

    public void simpleLayout_2() {
        char parentTemplatingStatus = pzAuto.getUIComponentRuntime()
                .getTemplatingUIStatus();
        char currentTemplatingStatus = 'Y';
        if (!tools.getParamValue("UITemplatingStatus").equals("N")) {
            currentTemplatingStatus = pzAuto.getUIComponentRuntime()
                    .setTemplatingUIStatus('Y');
        } else {
            currentTemplatingStatus = pzAuto.getUIComponentRuntime()
                    .setTemplatingUIStatus('N');
        }
        String spxUniqueStreamHash35 = "";
        if (currentTemplatingStatus != 'N') {
            spxUniqueStreamHash35 = getUIActionsMetaData_1();
            if (spxUniqueStreamHash35 != null
                    && !"".equals(spxUniqueStreamHash35)) {
                pzAuto.getUIComponentRuntime()
                        .getRuntimeContextTree()
                        .addActionString(spxUniqueStreamHash35,
                                pxUniqueStreamHash + "_35");
            }
        }
        String refreshAttributes = "";
        String strMethodName = "";
        IUIComponent cc_dl = null;
        boolean bIsIe = (pzAuto.getBrowserUtils().isIE());
        String bIsWrapperAdded = tools.getParamValue("bIsWrapperAdded");
        String bIsGridLayout = tools.getParamValue("bIsGridLayout");
        cc_dl = pzAuto.getUIComponent();
        IUIComponentMetadata pg_dlmeta = pzAuto.getUIComponentRuntime()
                .createMetadata();
        pg_dlmeta.put("automationId",
                " " + pzCell.getTestIdIfEnabled("202310160911300449355") + " ");
        String subscriptionID = null;
        if (currentTemplatingStatus != 'Y') {
            if (bIsIe && "true".equals(bIsGridLayout)
                    && !"true".equals(bIsWrapperAdded)) {
                tools.appendString("<div class='flex-grid-table-wrapper'><div class='flex-grid-tablecell-wrapper'>");
                tools.putParamValue("bIsWrapperAdded", "true");
            }
            tools.appendString("<div bSimpleLayout='true' ");
            if (((PegaAPI) tools).getUIEngine().getPushServiceUtils()
                    .isPushEnabled()
                    && subscriptionID != null) {
                tools.appendString(" data-subscription-id='" + subscriptionID
                        + "' ");
            }
            tools.appendString(""
                    + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'RH_2.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(4).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}")
                    + " class='"
                    + "flex  content  layout-content-default content-default padding-b-0_5x"
                    + "'  ");
            if (!tools.getParamValue("pyPegaDesignMode").equals("true")) {
                tools.appendString(" ");
            }
            tools.appendString(" " + refreshAttributes + ">");
        } else {
            String expressionId = null;
            com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
            if (!tools.getParamValue("pyPegaDesignMode").equals("true")
                    && spxUniqueStreamHash35 != null
                    && !"".equals(spxUniqueStreamHash35)) {
                pg_dlmeta.put("pyActionStringID", pxUniqueStreamHash + "_35");
            }
            if (!StringUtils.isBlank(expressionId)) {
                pg_dlmeta.put("pyExpressionId", expressionId);
            }
            if (!"".equals(strMethodName))
                pg_dlmeta.put("methodnm", strMethodName);
            pg_dlmeta.put("customClassName", "padding-b-0_5x");
            pg_dlmeta.put("format", "default");
            String inspectorData = new StringBuilder("\"")
                    .append(""
                            + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'RH_2.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(4).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}")
                            + "").append("\"").toString();
            if (!inspectorData.equals("\"\"")) {
                pg_dlmeta.put("liveUI", inspectorData);
            }
            pg_dlmeta.put("isDLChild", "true");
            pg_dlmeta.put("clear", "false");
            pg_dlmeta.put("lMode", "SimpleDiv");
            pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
            cc_dl.beginComponent("DynamicLayout", pg_dlmeta);
        }
        int index = 1;
        if (currentTemplatingStatus != 'Y') {
            index = simpleLayoutCell_7(index);
        } else {
            index = simpleLayoutTemplateCell_7(index);
        }
        if (currentTemplatingStatus != 'Y') {
            tools.appendString("</div>");
            if (bIsIe && "true".equals(bIsGridLayout)
                    && !"true".equals(bIsWrapperAdded)) {
                tools.appendString("</div></div>");
                tools.putParamValue("bIsWrapperAdded", "false");
            }
        } else {
            cc_dl.endComponent();
        }
        pzAuto.getUIComponentRuntime().resetTemplatingUIStatus(
                parentTemplatingStatus);
    }

    public void pzLayoutContainer_2() {
        IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime()
                .createMetadata();
        String expressionId = null;
        com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
        String expressionId_BV = null;
        com.pega.pegarules.priv.runtime.ui.IExpression expression_BV = null;
        if (!StringUtils.isBlank(expressionId_BV)) {
            metadataPage.put("expressionId_BV", expressionId_BV);
        }
        String paramName = "EXPANDEDSubSectionInvestmentExtraActionsBBBBBB";
        String inspectorLayoutData = pzAuto
                .getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'RH_2.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(4).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}");
        if (!inspectorLayoutData.isEmpty()) {
            metadataPage.put("liveUI", inspectorLayoutData);
        }
        String pyPrefix = null;
        IUIComponent containerComponent = pzAuto.getUIComponent();
        metadataPage.put("dlChild", "true");
        metadataPage.put("lMode", "SimpleDiv");
        containerComponent.beginComponent("pxLayoutContainer", metadataPage);
        pzLayoutBody_2();
        containerComponent.endComponent();
    }

    public void pzLayout_3() {
        char currentTemplatingStatus = pzAuto.getUIComponentRuntime()
                .setTemplatingUIStatus('Y');
        if (currentTemplatingStatus == 'Y') {
            pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
        }
        pzSetExpandParam_7();
        tools.putParamValue("RWClasses", "");
        if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
            pzLayoutBodyWrapper_3();
        }
        if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
            tools.putParamValue("pyInlineStyleSec", "");
            pzLayoutContainer_2();
            tools.putParamValue("pyInlineStyleSec", "");
        }
    }

    public String getUIActionsMetaData_4() {
        StringBuilder actionsStringBuilder = tools.pushStreamBody();
        ((PegaStreamAPI) tools).disableDirectStreaming();

        {
            boolean isBehaviorAdded = false;
            isBehaviorAdded = false;
            tools.appendString(" data-click='[");
            if (isBehaviorAdded && true) {
                tools.appendString(",");
            }
            {
                com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto
                        .getActionRequest();
                com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
                StringBuffer staticURLStr = new StringBuffer();
                StringBuffer preActParamStr = new StringBuffer();
                StringBuffer preDTParamStr = new StringBuffer();
                String runTimeSecStreamName = tools
                        .getParamValue("runTimeSecStreamName");
                tools.putParamValue("runTimeSecStreamName", "");
                if (pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
                    try {
                        pzPackageRuntime.packageSection(
                                "InvestmentExtraActions", tools.getStepPage()
                                        .getReference(), tools.getStepPage()
                                        .getString("pxObjClass"));
                    } catch (Exception e) {
                        oLog.error("Error generating section package - "
                                + e.getMessage());
                    }
                }
                refreshActionRequest.registerFixedParameter("pyActivity",
                        "ReloadSection");
                refreshActionRequest.registerFixedParameter("SectionName", "");
                staticURLStr
                        .append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
                staticURLStr
                        .append("&StreamName="
                                + ((!StringUtils.isBlank(runTimeSecStreamName)) ? runTimeSecStreamName
                                        : "InvestmentExtraActions"));
                staticURLStr.append("&PreDataTransform=ClearAdvancedFilters");
                tools.appendString("[\"refresh\", [\"thisSection\",\"\", \"\", \"");
                refreshActionRequestD = refreshActionRequest
                        .createDispatchedActionRequest();
                tools.appendString("=\", \"\", \"ClearAdvancedFilters,");
                refreshActionRequestD = refreshActionRequest
                        .createDispatchedActionRequest();
                tools.appendString("\",\":event\",\"\",[\"");
                if (!"".equals(preActParamStr.toString())) {
                    staticURLStr.append("&pzActivityParamsEncrypted="
                            + pega_uiengine_pzcontrol.pzURLEncodeString("{"
                                    + preActParamStr.toString() + "}"));
                }
                if (!"".equals(preDTParamStr.toString())) {
                    staticURLStr.append("&pzDTParamsEncrypted="
                            + pega_uiengine_pzcontrol.pzURLEncodeString("{"
                                    + preDTParamStr.toString() + "}"));
                }
                tools.appendString(StringUtils
                        .escapeIntoJSONString(pega_rules_utilities
                                .pzEncryptURLActionString(tools, "Thread",
                                        staticURLStr.toString()))
                        + "\",{"
                        + preActParamStr.toString()
                        + "},{"
                        + preDTParamStr.toString()
                        + "}],\""
                        + pzAuto.getUIComponentRuntime()
                                .generateActionTokenForPage() + "\"]");
                if (pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
                    pzPackageRuntime.packageDataTransform(tools.getStepPage()
                            .getString("pxObjClass"), "ClearAdvancedFilters");
                }
                pzAuto.registerActionRequest(refreshActionRequest);
            }

            tools.appendString("]");
            isBehaviorAdded = true;
            if (isBehaviorAdded && true) {
                tools.appendString(",");
            }
            {
                com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto
                        .getActionRequest();
                com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
                StringBuffer staticURLStr = new StringBuffer();
                StringBuffer preActParamStr = new StringBuffer();
                StringBuffer preDTParamStr = new StringBuffer();
                refreshActionRequest.registerFixedParameter("pyActivity",
                        "ReloadSection");
                refreshActionRequest.registerFixedParameter("StreamList",
                        "InvestmentsTableDashboard|Rule-HTML-Section|:");
                staticURLStr
                        .append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
                tools.appendString("[\"refresh\", [\"otherSection\",\"InvestmentsTableDashboard\", \"\", \"");
                refreshActionRequestD = refreshActionRequest
                        .createDispatchedActionRequest();
                tools.appendString("=\", \"\", \",");
                refreshActionRequestD = refreshActionRequest
                        .createDispatchedActionRequest();
                tools.appendString("\",\":event\",\"\",[\"");
                if (!"".equals(preActParamStr.toString())) {
                    staticURLStr.append("&pzActivityParamsEncrypted="
                            + pega_uiengine_pzcontrol.pzURLEncodeString("{"
                                    + preActParamStr.toString() + "}"));
                }
                if (!"".equals(preDTParamStr.toString())) {
                    staticURLStr.append("&pzDTParamsEncrypted="
                            + pega_uiengine_pzcontrol.pzURLEncodeString("{"
                                    + preDTParamStr.toString() + "}"));
                }
                tools.appendString(StringUtils
                        .escapeIntoJSONString(pega_rules_utilities
                                .pzEncryptURLActionString(tools, "Thread",
                                        staticURLStr.toString()))
                        + "\",{"
                        + preActParamStr.toString()
                        + "},{"
                        + preDTParamStr.toString()
                        + "}],\""
                        + pzAuto.getUIComponentRuntime()
                                .generateActionTokenForPage() + "\"]");
                pzAuto.registerActionRequest(refreshActionRequest);
            }

            tools.appendString("]");
            isBehaviorAdded = true;
            tools.appendString("]' ");
            isBehaviorAdded = false;
            tools.appendString(" data-keydown='[");
            if (isBehaviorAdded && true) {
                tools.appendString(",");
            }
            {
                com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto
                        .getActionRequest();
                com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
                StringBuffer staticURLStr = new StringBuffer();
                StringBuffer preActParamStr = new StringBuffer();
                StringBuffer preDTParamStr = new StringBuffer();
                String runTimeSecStreamName = tools
                        .getParamValue("runTimeSecStreamName");
                tools.putParamValue("runTimeSecStreamName", "");
                if (pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
                    try {
                        pzPackageRuntime.packageSection(
                                "InvestmentExtraActions", tools.getStepPage()
                                        .getReference(), tools.getStepPage()
                                        .getString("pxObjClass"));
                    } catch (Exception e) {
                        oLog.error("Error generating section package - "
                                + e.getMessage());
                    }
                }
                refreshActionRequest.registerFixedParameter("pyActivity",
                        "ReloadSection");
                refreshActionRequest.registerFixedParameter("SectionName", "");
                staticURLStr
                        .append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
                staticURLStr
                        .append("&StreamName="
                                + ((!StringUtils.isBlank(runTimeSecStreamName)) ? runTimeSecStreamName
                                        : "InvestmentExtraActions"));
                staticURLStr.append("&PreDataTransform=ClearAdvancedFilters");
                tools.appendString("[\"refresh\", [\"thisSection\",\"\", \"\", \"");
                refreshActionRequestD = refreshActionRequest
                        .createDispatchedActionRequest();
                tools.appendString("=\", \"\", \"ClearAdvancedFilters,");
                refreshActionRequestD = refreshActionRequest
                        .createDispatchedActionRequest();
                tools.appendString("\",\":event\",\"\",[\"");
                if (!"".equals(preActParamStr.toString())) {
                    staticURLStr.append("&pzActivityParamsEncrypted="
                            + pega_uiengine_pzcontrol.pzURLEncodeString("{"
                                    + preActParamStr.toString() + "}"));
                }
                if (!"".equals(preDTParamStr.toString())) {
                    staticURLStr.append("&pzDTParamsEncrypted="
                            + pega_uiengine_pzcontrol.pzURLEncodeString("{"
                                    + preDTParamStr.toString() + "}"));
                }
                tools.appendString(StringUtils
                        .escapeIntoJSONString(pega_rules_utilities
                                .pzEncryptURLActionString(tools, "Thread",
                                        staticURLStr.toString()))
                        + "\",{"
                        + preActParamStr.toString()
                        + "},{"
                        + preDTParamStr.toString()
                        + "}],\""
                        + pzAuto.getUIComponentRuntime()
                                .generateActionTokenForPage() + "\"]");
                if (pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
                    pzPackageRuntime.packageDataTransform(tools.getStepPage()
                            .getString("pxObjClass"), "ClearAdvancedFilters");
                }
                pzAuto.registerActionRequest(refreshActionRequest);
            }

            tools.appendString(",");
            tools.appendString(",\"enter\"");
            tools.appendString("]");
            isBehaviorAdded = true;
            if (isBehaviorAdded && true) {
                tools.appendString(",");
            }
            {
                com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto
                        .getActionRequest();
                com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
                StringBuffer staticURLStr = new StringBuffer();
                StringBuffer preActParamStr = new StringBuffer();
                StringBuffer preDTParamStr = new StringBuffer();
                refreshActionRequest.registerFixedParameter("pyActivity",
                        "ReloadSection");
                refreshActionRequest.registerFixedParameter("StreamList",
                        "InvestmentsTableDashboard|Rule-HTML-Section|:");
                staticURLStr
                        .append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
                tools.appendString("[\"refresh\", [\"otherSection\",\"InvestmentsTableDashboard\", \"\", \"");
                refreshActionRequestD = refreshActionRequest
                        .createDispatchedActionRequest();
                tools.appendString("=\", \"\", \",");
                refreshActionRequestD = refreshActionRequest
                        .createDispatchedActionRequest();
                tools.appendString("\",\":event\",\"\",[\"");
                if (!"".equals(preActParamStr.toString())) {
                    staticURLStr.append("&pzActivityParamsEncrypted="
                            + pega_uiengine_pzcontrol.pzURLEncodeString("{"
                                    + preActParamStr.toString() + "}"));
                }
                if (!"".equals(preDTParamStr.toString())) {
                    staticURLStr.append("&pzDTParamsEncrypted="
                            + pega_uiengine_pzcontrol.pzURLEncodeString("{"
                                    + preDTParamStr.toString() + "}"));
                }
                tools.appendString(StringUtils
                        .escapeIntoJSONString(pega_rules_utilities
                                .pzEncryptURLActionString(tools, "Thread",
                                        staticURLStr.toString()))
                        + "\",{"
                        + preActParamStr.toString()
                        + "},{"
                        + preDTParamStr.toString()
                        + "}],\""
                        + pzAuto.getUIComponentRuntime()
                                .generateActionTokenForPage() + "\"]");
                pzAuto.registerActionRequest(refreshActionRequest);
            }

            tools.appendString(",");
            tools.appendString(",\"enter\"");
            tools.appendString("]");
            isBehaviorAdded = true;
            tools.appendString("]' ");
        }
        String returnString = actionsStringBuilder.toString();
        tools.popStreamBody();
        return returnString;
    }

    public void pxButton_4() {
        boolean isDisplayTextWithParam = false;
        String displayTextParamName = "";
        String displayTextParamValue = "";

        StringBuffer pegaValidation = null;
        boolean addedValidation = false;
        try {

            if (pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') {
                tools.appendString("<span ");
                tools.appendString(">");
            }
            if (pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y') {
                IUIComponentMetadata metadataPage = pzAuto
                        .getUIComponentRuntime().createMetadata();
                IUIComponentMetadata cellPage = pzAuto.getUIComponentRuntime()
                        .createMetadata();
                IUIComponentMetadata modePage1 = pzAuto.getUIComponentRuntime()
                        .createMetadata();
                IUIComponentMetadata modePage2 = pzAuto.getUIComponentRuntime()
                        .createMetadata();
                java.util.List<String> ctPropRefs = new ArrayList<String>();
                IUIComponent ctrlComponent = pzAuto.getUIComponent();
                String expressionId = null;
                com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
                tools.putParamValue("skipHTMLEncoding", "true");
                IUIComponentMetadata pxPrivilegeIdentifiers = pzAuto
                        .getUIComponentRuntime().createMetadata();
                if (expressionId != null && expressionId.length() > 0) {
                    modePage2.put("pyExpressionId", expressionId);
                }
                String uid = String
                        .valueOf(((com.pega.pegarules.priv.context.PegaRequestor) tools
                                .getRequestor()).currentTimeUnique());
                String navPage = "pyNavigation" + uid;
                cellPage.put(
                        "automationId",
                        " "
                                + pzCell.getTestIdIfEnabled("202308311206110643109")
                                + " ");
                if (false || (pzAuto.isOffline() && false)) {
                    modePage2.put("nav", navPage);
                }
                modePage2.put("pyName", "InvestmentExtraActions_$CTX$_13");
                String repeatIndx = "";
                String pyTooltip = "";
                if (pega.getPackageRuntime().canPackage()) {
                    tools.getLocalizedTextForString(".pyActionPrompt",
                            "Click to clear filters\t" + repeatIndx,
                            StreamBuilder.FMT_LITERAL);
                } else {
                    pzAuto.getUIComponentRuntime()
                            .getRuntimeContextTree()
                            .addLocalizedValue("Click to clear filters",
                                    ".pyActionPrompt");
                }
                pyTooltip = "Click to clear filters";
                modePage2.put("tooltip", pyTooltip);
                modePage2.put("helpertype", "tooltip");
                modePage2.put("styles", "");
                modePage2.put("imgSrc", "styleclass");
                String pyIconStyle = "";
                pyIconStyle = "pi pi-close";
                modePage2.put("image", pyIconStyle);
                modePage2.put("pyActionImagePosition", "right");
                String customStyles = null;
                String pyLabel = "";
                if (pega.getPackageRuntime().canPackage()) {
                    tools.getLocalizedTextForString(".pyButtonLabel", "Clear\t"
                            + repeatIndx, StreamBuilder.FMT_LITERAL);
                } else {
                    pzAuto.getUIComponentRuntime().getRuntimeContextTree()
                            .addLocalizedValue("Clear", ".pyButtonLabel");
                }
                pyLabel = "Clear";
                modePage2.put("label", pyLabel);
                String spxUniqueStreamHash31 = getUIActionsMetaData_4();
                if (spxUniqueStreamHash31 != null
                        && !"".equals(spxUniqueStreamHash31)) {
                    pzAuto.getUIComponentRuntime()
                            .getRuntimeContextTree()
                            .addActionString(spxUniqueStreamHash31,
                                    pxUniqueStreamHash + "_31");
                    modePage2.put("pyActionStringID", pxUniqueStreamHash
                            + "_31");
                }
                modePage2
                        .put("actionPath", " data-keyboard='.' data-click='.'");
                tools.putParamValue("skipHTMLEncoding", "false");
                cellPage.addMetadataInArray("pyModes", modePage1);
                cellPage.addMetadataInArray("pyModes", modePage2);
                metadataPage.putMetadata("pyCell", cellPage);
                ctrlComponent
                        .addDependentScripts("pzpega_ui_template_button.js");
                ctrlComponent.beginComponent("pxButton", metadataPage);
                ctrlComponent.setTrackedProperties(ctPropRefs
                        .toArray(new String[] {}));
                tools.putParamValue("isControlEditableOriginal", true);
                ctrlComponent.endComponent();
            } else {
                boolean bDisabled = false;
                boolean bOptimizedMarkup = pzAuto.getUIComponentRuntime()
                        .isHarnessTemplatized() && pzAuto.isOffline();
                String pyFormatValue = "";
                String toolTipVal = "";
                String hrefValue = "#";
                String referenceString = tools.getStepPage().getReference();
                boolean isParameterizedDeclarePage = pega
                        .getDeclarativePageUtils().isParameterizedDPName(
                                referenceString);
                if (isParameterizedDeclarePage) {
                    referenceString = tools.getStepPage().getString(
                            "pzPageNameBase");
                }
                String buttonUID = "name='InvestmentExtraActions_"
                        + referenceString + "_13'";
                String securedPropValue = null;
                tools.appendString("<button "
                        + pzCell.getTestIdIfEnabled("202308311206110643109")
                        + "  data-ctl='Button'  type='button' ");
                if (!"true".equals(tools
                        .getParamValue("pxAvoidUniqueAttribute")))
                    tools.appendString(buttonUID);
                pega_uiengine_pzcontrol.pzAddClientValidation(tools, "", "",
                        "", "");
                {
                    boolean isBehaviorAdded = false;
                    isBehaviorAdded = false;
                    tools.appendString(" data-click='[");
                    if (isBehaviorAdded && true) {
                        tools.appendString(",");
                    }
                    {
                        com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto
                                .getActionRequest();
                        com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
                        StringBuffer staticURLStr = new StringBuffer();
                        StringBuffer preActParamStr = new StringBuffer();
                        StringBuffer preDTParamStr = new StringBuffer();
                        String runTimeSecStreamName = tools
                                .getParamValue("runTimeSecStreamName");
                        tools.putParamValue("runTimeSecStreamName", "");
                        if (pega_uiengine_offlinesupport
                                .pzIsForOfflineTemplate()) {
                            try {
                                pzPackageRuntime.packageSection(
                                        "InvestmentExtraActions",
                                        tools.getStepPage().getReference(),
                                        tools.getStepPage().getString(
                                                "pxObjClass"));
                            } catch (Exception e) {
                                oLog.error("Error generating section package - "
                                        + e.getMessage());
                            }
                        }
                        refreshActionRequest.registerFixedParameter(
                                "pyActivity", "ReloadSection");
                        refreshActionRequest.registerFixedParameter(
                                "SectionName", "");
                        staticURLStr
                                .append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
                        staticURLStr
                                .append("&StreamName="
                                        + ((!StringUtils
                                                .isBlank(runTimeSecStreamName)) ? runTimeSecStreamName
                                                : "InvestmentExtraActions"));
                        staticURLStr
                                .append("&PreDataTransform=ClearAdvancedFilters");
                        tools.appendString("[\"refresh\", [\"thisSection\",\"\", \"\", \"");
                        refreshActionRequestD = refreshActionRequest
                                .createDispatchedActionRequest();
                        tools.appendString("=\", \"\", \"ClearAdvancedFilters,");
                        refreshActionRequestD = refreshActionRequest
                                .createDispatchedActionRequest();
                        tools.appendString("\",\":event\",\"\",[\"");
                        if (!"".equals(preActParamStr.toString())) {
                            staticURLStr.append("&pzActivityParamsEncrypted="
                                    + pega_uiengine_pzcontrol
                                            .pzURLEncodeString("{"
                                                    + preActParamStr.toString()
                                                    + "}"));
                        }
                        if (!"".equals(preDTParamStr.toString())) {
                            staticURLStr.append("&pzDTParamsEncrypted="
                                    + pega_uiengine_pzcontrol
                                            .pzURLEncodeString("{"
                                                    + preDTParamStr.toString()
                                                    + "}"));
                        }
                        tools.appendString(StringUtils
                                .escapeIntoJSONString(pega_rules_utilities
                                        .pzEncryptURLActionString(tools,
                                                "Thread",
                                                staticURLStr.toString()))
                                + "\",{"
                                + preActParamStr.toString()
                                + "},{"
                                + preDTParamStr.toString()
                                + "}],\""
                                + pzAuto.getUIComponentRuntime()
                                        .generateActionTokenForPage() + "\"]");
                        if (pega_uiengine_offlinesupport
                                .pzIsForOfflineTemplate()) {
                            pzPackageRuntime.packageDataTransform(tools
                                    .getStepPage().getString("pxObjClass"),
                                    "ClearAdvancedFilters");
                        }
                        pzAuto.registerActionRequest(refreshActionRequest);
                    }

                    tools.appendString("]");
                    isBehaviorAdded = true;
                    if (isBehaviorAdded && true) {
                        tools.appendString(",");
                    }
                    {
                        com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto
                                .getActionRequest();
                        com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
                        StringBuffer staticURLStr = new StringBuffer();
                        StringBuffer preActParamStr = new StringBuffer();
                        StringBuffer preDTParamStr = new StringBuffer();
                        refreshActionRequest.registerFixedParameter(
                                "pyActivity", "ReloadSection");
                        refreshActionRequest
                                .registerFixedParameter("StreamList",
                                        "InvestmentsTableDashboard|Rule-HTML-Section|:");
                        staticURLStr
                                .append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
                        tools.appendString("[\"refresh\", [\"otherSection\",\"InvestmentsTableDashboard\", \"\", \"");
                        refreshActionRequestD = refreshActionRequest
                                .createDispatchedActionRequest();
                        tools.appendString("=\", \"\", \",");
                        refreshActionRequestD = refreshActionRequest
                                .createDispatchedActionRequest();
                        tools.appendString("\",\":event\",\"\",[\"");
                        if (!"".equals(preActParamStr.toString())) {
                            staticURLStr.append("&pzActivityParamsEncrypted="
                                    + pega_uiengine_pzcontrol
                                            .pzURLEncodeString("{"
                                                    + preActParamStr.toString()
                                                    + "}"));
                        }
                        if (!"".equals(preDTParamStr.toString())) {
                            staticURLStr.append("&pzDTParamsEncrypted="
                                    + pega_uiengine_pzcontrol
                                            .pzURLEncodeString("{"
                                                    + preDTParamStr.toString()
                                                    + "}"));
                        }
                        tools.appendString(StringUtils
                                .escapeIntoJSONString(pega_rules_utilities
                                        .pzEncryptURLActionString(tools,
                                                "Thread",
                                                staticURLStr.toString()))
                                + "\",{"
                                + preActParamStr.toString()
                                + "},{"
                                + preDTParamStr.toString()
                                + "}],\""
                                + pzAuto.getUIComponentRuntime()
                                        .generateActionTokenForPage() + "\"]");
                        pzAuto.registerActionRequest(refreshActionRequest);
                    }

                    tools.appendString("]");
                    isBehaviorAdded = true;
                    tools.appendString("]' ");
                    isBehaviorAdded = false;
                    tools.appendString(" data-keydown='[");
                    if (isBehaviorAdded && true) {
                        tools.appendString(",");
                    }
                    {
                        com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto
                                .getActionRequest();
                        com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
                        StringBuffer staticURLStr = new StringBuffer();
                        StringBuffer preActParamStr = new StringBuffer();
                        StringBuffer preDTParamStr = new StringBuffer();
                        String runTimeSecStreamName = tools
                                .getParamValue("runTimeSecStreamName");
                        tools.putParamValue("runTimeSecStreamName", "");
                        if (pega_uiengine_offlinesupport
                                .pzIsForOfflineTemplate()) {
                            try {
                                pzPackageRuntime.packageSection(
                                        "InvestmentExtraActions",
                                        tools.getStepPage().getReference(),
                                        tools.getStepPage().getString(
                                                "pxObjClass"));
                            } catch (Exception e) {
                                oLog.error("Error generating section package - "
                                        + e.getMessage());
                            }
                        }
                        refreshActionRequest.registerFixedParameter(
                                "pyActivity", "ReloadSection");
                        refreshActionRequest.registerFixedParameter(
                                "SectionName", "");
                        staticURLStr
                                .append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
                        staticURLStr
                                .append("&StreamName="
                                        + ((!StringUtils
                                                .isBlank(runTimeSecStreamName)) ? runTimeSecStreamName
                                                : "InvestmentExtraActions"));
                        staticURLStr
                                .append("&PreDataTransform=ClearAdvancedFilters");
                        tools.appendString("[\"refresh\", [\"thisSection\",\"\", \"\", \"");
                        refreshActionRequestD = refreshActionRequest
                                .createDispatchedActionRequest();
                        tools.appendString("=\", \"\", \"ClearAdvancedFilters,");
                        refreshActionRequestD = refreshActionRequest
                                .createDispatchedActionRequest();
                        tools.appendString("\",\":event\",\"\",[\"");
                        if (!"".equals(preActParamStr.toString())) {
                            staticURLStr.append("&pzActivityParamsEncrypted="
                                    + pega_uiengine_pzcontrol
                                            .pzURLEncodeString("{"
                                                    + preActParamStr.toString()
                                                    + "}"));
                        }
                        if (!"".equals(preDTParamStr.toString())) {
                            staticURLStr.append("&pzDTParamsEncrypted="
                                    + pega_uiengine_pzcontrol
                                            .pzURLEncodeString("{"
                                                    + preDTParamStr.toString()
                                                    + "}"));
                        }
                        tools.appendString(StringUtils
                                .escapeIntoJSONString(pega_rules_utilities
                                        .pzEncryptURLActionString(tools,
                                                "Thread",
                                                staticURLStr.toString()))
                                + "\",{"
                                + preActParamStr.toString()
                                + "},{"
                                + preDTParamStr.toString()
                                + "}],\""
                                + pzAuto.getUIComponentRuntime()
                                        .generateActionTokenForPage() + "\"]");
                        if (pega_uiengine_offlinesupport
                                .pzIsForOfflineTemplate()) {
                            pzPackageRuntime.packageDataTransform(tools
                                    .getStepPage().getString("pxObjClass"),
                                    "ClearAdvancedFilters");
                        }
                        pzAuto.registerActionRequest(refreshActionRequest);
                    }

                    tools.appendString(",");
                    tools.appendString(",\"enter\"");
                    tools.appendString("]");
                    isBehaviorAdded = true;
                    if (isBehaviorAdded && true) {
                        tools.appendString(",");
                    }
                    {
                        com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto
                                .getActionRequest();
                        com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
                        StringBuffer staticURLStr = new StringBuffer();
                        StringBuffer preActParamStr = new StringBuffer();
                        StringBuffer preDTParamStr = new StringBuffer();
                        refreshActionRequest.registerFixedParameter(
                                "pyActivity", "ReloadSection");
                        refreshActionRequest
                                .registerFixedParameter("StreamList",
                                        "InvestmentsTableDashboard|Rule-HTML-Section|:");
                        staticURLStr
                                .append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
                        tools.appendString("[\"refresh\", [\"otherSection\",\"InvestmentsTableDashboard\", \"\", \"");
                        refreshActionRequestD = refreshActionRequest
                                .createDispatchedActionRequest();
                        tools.appendString("=\", \"\", \",");
                        refreshActionRequestD = refreshActionRequest
                                .createDispatchedActionRequest();
                        tools.appendString("\",\":event\",\"\",[\"");
                        if (!"".equals(preActParamStr.toString())) {
                            staticURLStr.append("&pzActivityParamsEncrypted="
                                    + pega_uiengine_pzcontrol
                                            .pzURLEncodeString("{"
                                                    + preActParamStr.toString()
                                                    + "}"));
                        }
                        if (!"".equals(preDTParamStr.toString())) {
                            staticURLStr.append("&pzDTParamsEncrypted="
                                    + pega_uiengine_pzcontrol
                                            .pzURLEncodeString("{"
                                                    + preDTParamStr.toString()
                                                    + "}"));
                        }
                        tools.appendString(StringUtils
                                .escapeIntoJSONString(pega_rules_utilities
                                        .pzEncryptURLActionString(tools,
                                                "Thread",
                                                staticURLStr.toString()))
                                + "\",{"
                                + preActParamStr.toString()
                                + "},{"
                                + preDTParamStr.toString()
                                + "}],\""
                                + pzAuto.getUIComponentRuntime()
                                        .generateActionTokenForPage() + "\"]");
                        pzAuto.registerActionRequest(refreshActionRequest);
                    }

                    tools.appendString(",");
                    tools.appendString(",\"enter\"");
                    tools.appendString("]");
                    isBehaviorAdded = true;
                    tools.appendString("]' ");
                }
                String repeatIndx = "";
                if (bOptimizedMarkup) {
                    tools.appendString("  data-bindprops='title,innerHTML' ");
                }
                tools.appendString("  title= '");
                toolTipVal = tools.getLocalizedTextForString(".pyActionPrompt",
                        "Click to clear filters\t" + repeatIndx,
                        StreamBuilder.FMT_LITERAL)
                        + "' ";
                tools.appendString(toolTipVal);
                tools.appendString("class='pzhc pzbutton");
                tools.appendString("'");
                if (bOptimizedMarkup) {
                    tools.appendString(" data-bindprops='innerHTML,title' ");
                }
                tools.appendString(" >");
                String classProp = "";
                classProp = "pi pi-close";
                boolean hasLineBreaks = false;
                hasLineBreaks = "Clear"
                        .matches("(.*)<([Bb][Rr])\\s*\\/*\\s*>(.*)");
                if (hasLineBreaks) {
                    tools.appendString("<span class='pzbtn-label'  data-keyboard='.' data-click='.' ");
                }
                if (bOptimizedMarkup && hasLineBreaks) {
                    tools.appendString("  data-bindprops='title,innerHTML' ");
                }
                if (hasLineBreaks) {
                    tools.appendString("  > ");
                }
                tools.appendString("");
                pega_uiengine_harness.pzGenAKey(tools
                        .getLocalizedTextForString(".pyButtonLabel", "Clear",
                                StreamBuilder.FMT_LITERAL));
                checkForScriptTags_1(tools.getParamValue("pzULabel"));
                if (hasLineBreaks) {
                    tools.appendString("</span>");
                }
                tools.appendString(" <i aria-hidden='true'  data-keyboard='.' data-click='.' class='"
                        + classProp + "'></i>");
                tools.appendString("</button>");
            }

            tools.putParamValue("pega_attributes", "");
            if (pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') {
                tools.appendString("</span>");
            }
            tools.putParamValue("doAutoFormatting", "false");
            tools.putParamValue("isControlEditableOriginal", true);
            if (pegaValidation != null) {
                com.pega.pegarules.priv.factory.StringBufferFactory
                        .release(pegaValidation);
            }
        } catch (Exception e) {

            oLog.error(e.getMessage());

            if (pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'
                    && pzAuto.getUIComponentRuntime().getRuntimeContextTree()
                            .isLiveDesignViewMode()) {

                IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime()
                        .createMetadata();
                IUIComponent ctrlComponent = pzAuto.getUIComponent();
                metadata.put("cellInfo", "Button");
                metadata.put("msgText", "config issue");
                ctrlComponent
                        .addDependentScripts("pzpega_ui_template_designview.js");
                ctrlComponent.beginComponent("pxDesignViewError", metadata);
                tools.putParamValue("isControlEditableOriginal", true);
                ctrlComponent.endComponent();
            }
        }

    }

    public int simpleLayoutCell_6(int index) {
        IUIComponent uiComp = null;
        String labelName = "";
        String ariahiddenString = "";
        String baseRef = "";
        generateClientWhenDiv_3();
        tools.appendString("' "
                + pega.getUIEngine().getFVInspectorUtils()
                        .startCollectingFieldValueData()
                + pzCell.getInspectorDataDynamic(
                        "pxButton",
                        ".pyTemplateInputBox",
                        "RH_2.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(4).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)")
                + " class='content-item content-field item-"
                + Integer.toString(index)
                + " remove-top-spacing remove-bottom-spacing remove-left-spacing    "
                + pzSection.getCustomStyle(false, "", "padding-b-0_5x",
                        "padding-b-0_5x")
                + " "
                + pzSection.getCustomStyle(false, "", "dataValueRead",
                        "dataValueWrite")
                + " flex flex-row '  STRING_TYPE='field' RESERVE_SPACE='false'>");
        pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
        tools.putSaveValue("parentLayouttype", "SIMPLELAYOUT");
        pxButton_4();
        tools.appendString(pega.getUIEngine().getFVInspectorUtils()
                .stopCollectingFieldValueData()
                + "</div>");
        index++;
        return index;
    }

    public int simpleLayoutTemplateCell_6(int index) {
        IUIComponent uiComp = null;
        String labelName = "";
        String expressionId = null;
        boolean isLabelJSP = false;
        String reqExpressionId = null;
        String disExpressionId = null;
        com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
        expressionId = pxUniqueStreamHash + "_34";
        expression = pzAuto
                .getUIComponentRuntime()
                .getExpressionEvaluator()
                .addExpression("showWhen",
                        ".FlagValueGroup(InvFilters) = true", expressionId);
        if (expression != null) {
            expressionId = expression.getId();
        }
        String pyCustomRequireFormat = "";
        pyCustomRequireFormat = tools.getLocalizedTextForString("pyCaption",
                "pyRequired");
        String dataFieldValueMeta = pega.getUIEngine().getFVInspectorUtils()
                .startCollectingFieldValueData();
        String baseRef = "";
        boolean pyDLCellVisibility = false;
        IUIComponent cc_dlCell = pzAuto.getUIComponent();
        IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime()
                .createMetadata();
        IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime()
                .createMetadata();
        pgCells.put("partialClass",
                "remove-top-spacing remove-bottom-spacing remove-left-spacing flex flex-row");
        pgCells.put(
                "automationId",
                new StringBuilder(" ")
                        .append(pzCell
                                .getTestIdIfEnabled("202308311206110643109-Label"))
                        .append(" ").toString().replace("data-test-id=", "")
                        .trim());
        pgCells.put("format", "pxButton");
        pgCells.put("forLabel", ".pyTemplateInputBox");
        pgCells.put("pyAutoHTML", "true");
        pgCells.put("spanClass", "iconRequired standard_iconRequired");
        pgCells.put("customROStyles", "padding-b-0_5x");
        pgCells.put("customRWStyles", "padding-b-0_5x");
        pgCells.put("cstmreqfor", pyCustomRequireFormat);
        if (!StringUtils.isBlank(expressionId))
            pgCells.put("pyExpressionId", expressionId);
        if (!"".equals(baseRef))
            pgCells.put("pyBaseRef", String.valueOf(baseRef));
        if (!"".equals(dataFieldValueMeta))
            pgCells.put("startFV", dataFieldValueMeta);
        pgCells.put("labelJSP", String.valueOf(isLabelJSP));
        pgCells.put("pyPreventXSSInLabel", false);
        pg_dlCellMeta.putMetadata("pyCell", pgCells);
        boolean isExpression = false;
        boolean isOffline = false;
        cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
        String inspectorData = pzCell
                .getInspectorDataDynamic(
                        "pxButton",
                        ".pyTemplateInputBox",
                        "RH_2.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(4).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
        if (!inspectorData.isEmpty()) {
            pgCells.put("liveUI", inspectorData);
        }
        pxButton_4();
        labelName = "Button";
        if (!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
            pzAuto.getUIComponentRuntime().getRuntimeContextTree()
                    .addLocalizedValue(labelName, "pyCaption");
        } else {
            StringUtils.crossScriptingFilter(tools.getLocalizedTextForString(
                    "pyCaption", labelName));
        }
        pgCells.put("pyLabelValue", labelName);
        String uiFieldValueMeta = pega.getUIEngine().getFVInspectorUtils()
                .stopCollectingFieldValueData();
        if (!"".equals(uiFieldValueMeta)) {
            pgCells.put("stopFV", uiFieldValueMeta);
        }
        cc_dlCell.endComponent();
        index++;
        return index;
    }

    public int simpleLayoutCell_8(int index) {
        IUIComponent uiComp = null;
        String labelName = "";
        String ariahiddenString = "";
        String baseRef = "";
        generateClientWhenDiv_1();
        tools.appendString("'  class='content-item content-layout item-"
                + Integer.toString(index)
                + " remove-top-spacing remove-bottom-spacing remove-right-spacing   flex flex-row  align-end'  STRING_TYPE='layout' RESERVE_SPACE='false'>");
        pzLayout_3();
        tools.putSaveValue("ContainerID", "");
        tools.appendString("</div>");
        index++;
        return index;
    }

    public int simpleLayoutTemplateCell_8(int index) {
        IUIComponent uiComp = null;
        String labelName = "";
        String expressionId = null;
        boolean isLabelJSP = false;
        String reqExpressionId = null;
        String disExpressionId = null;
        com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
        if (expression != null) {
            expressionId = expression.getId();
        }
        String pyCustomRequireFormat = "";
        pyCustomRequireFormat = tools.getLocalizedTextForString("pyCaption",
                "pyRequired");
        String baseRef = "";
        boolean pyDLCellVisibility = false;
        IUIComponent cc_dlCell = pzAuto.getUIComponent();
        IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime()
                .createMetadata();
        IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime()
                .createMetadata();
        pgCells.put("pyType", "layout");
        pgCells.put("RWActive", "false");
        pgCells.put(
                "partialClass",
                "remove-top-spacing remove-bottom-spacing remove-right-spacing align-end flex flex-row");
        pgCells.put("spanClass", "iconRequired standard_iconRequired");
        pgCells.put("cstmreqfor", pyCustomRequireFormat);
        if (!StringUtils.isBlank(expressionId))
            pgCells.put("pyExpressionId", expressionId);
        if (!"".equals(baseRef))
            pgCells.put("pyBaseRef", String.valueOf(baseRef));
        pgCells.put("labelJSP", String.valueOf(isLabelJSP));
        pgCells.put("pyPreventXSSInLabel", false);
        pg_dlCellMeta.putMetadata("pyCell", pgCells);
        boolean isExpression = false;
        boolean isOffline = false;
        cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
        pzLayout_3();
        tools.putSaveValue("ContainerID", "");
        labelName = "";
        if (!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
            pzAuto.getUIComponentRuntime().getRuntimeContextTree()
                    .addLocalizedValue(labelName, "pyCaption");
        } else {
            StringUtils.crossScriptingFilter(tools.getLocalizedTextForString(
                    "pyCaption", labelName));
        }
        pgCells.put("pyLabelValue", labelName);
        cc_dlCell.endComponent();
        index++;
        return index;
    }

    public void pzSetExpandParam_6() {
        pzSection.getLayout().setExpandParam(
                "SubSectionInvestmentExtraActionsBBBBB", "", false);
    }

    public void simpleLayout_3() {
        char parentTemplatingStatus = pzAuto.getUIComponentRuntime()
                .getTemplatingUIStatus();
        char currentTemplatingStatus = 'Y';
        if (!tools.getParamValue("UITemplatingStatus").equals("N")) {
            currentTemplatingStatus = pzAuto.getUIComponentRuntime()
                    .setTemplatingUIStatus('Y');
        } else {
            currentTemplatingStatus = pzAuto.getUIComponentRuntime()
                    .setTemplatingUIStatus('N');
        }
        String spxUniqueStreamHash29 = "";
        if (currentTemplatingStatus != 'N') {
            spxUniqueStreamHash29 = getUIActionsMetaData_1();
            if (spxUniqueStreamHash29 != null
                    && !"".equals(spxUniqueStreamHash29)) {
                pzAuto.getUIComponentRuntime()
                        .getRuntimeContextTree()
                        .addActionString(spxUniqueStreamHash29,
                                pxUniqueStreamHash + "_29");
            }
        }
        String refreshAttributes = "";
        String strMethodName = "";
        IUIComponent cc_dl = null;
        boolean bIsIe = (pzAuto.getBrowserUtils().isIE());
        String bIsWrapperAdded = tools.getParamValue("bIsWrapperAdded");
        String bIsGridLayout = tools.getParamValue("bIsGridLayout");
        cc_dl = pzAuto.getUIComponent();
        IUIComponentMetadata pg_dlmeta = pzAuto.getUIComponentRuntime()
                .createMetadata();
        pg_dlmeta.put("automationId",
                " " + pzCell.getTestIdIfEnabled("202308311215570093885") + " ");
        String subscriptionID = null;
        if (currentTemplatingStatus != 'Y') {
            if (bIsIe && "true".equals(bIsGridLayout)
                    && !"true".equals(bIsWrapperAdded)) {
                tools.appendString("<div class='flex-grid-table-wrapper'><div class='flex-grid-tablecell-wrapper'>");
                tools.putParamValue("bIsWrapperAdded", "true");
            }
            tools.appendString("<div bSimpleLayout='true' ");
            if (((PegaAPI) tools).getUIEngine().getPushServiceUtils()
                    .isPushEnabled()
                    && subscriptionID != null) {
                tools.appendString(" data-subscription-id='" + subscriptionID
                        + "' ");
            }
            tools.appendString(""
                    + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'RH_2.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(4).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)'}")
                    + " class='"
                    + "flex  content  layout-content-inline content-inline "
                    + "'  ");
            if (!tools.getParamValue("pyPegaDesignMode").equals("true")) {
                tools.appendString(" ");
            }
            tools.appendString(" " + refreshAttributes + ">");
        } else {
            String expressionId = null;
            com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
            if (!tools.getParamValue("pyPegaDesignMode").equals("true")
                    && spxUniqueStreamHash29 != null
                    && !"".equals(spxUniqueStreamHash29)) {
                pg_dlmeta.put("pyActionStringID", pxUniqueStreamHash + "_29");
            }
            if (!StringUtils.isBlank(expressionId)) {
                pg_dlmeta.put("pyExpressionId", expressionId);
            }
            if (!"".equals(strMethodName))
                pg_dlmeta.put("methodnm", strMethodName);
            pg_dlmeta.put("format", "inline");
            String inspectorData = new StringBuilder("\"")
                    .append(""
                            + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'RH_2.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(4).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)'}")
                            + "").append("\"").toString();
            if (!inspectorData.equals("\"\"")) {
                pg_dlmeta.put("liveUI", inspectorData);
            }
            pg_dlmeta.put("isDLChild", "true");
            pg_dlmeta.put("clear", "false");
            pg_dlmeta.put("lMode", "SimpleDiv");
            pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
            cc_dl.beginComponent("DynamicLayout", pg_dlmeta);
        }
        int index = 1;
        if (currentTemplatingStatus != 'Y') {
            index = simpleLayoutCell_6(index);
        } else {
            index = simpleLayoutTemplateCell_6(index);
        }
        if (currentTemplatingStatus != 'Y') {
            index = simpleLayoutCell_8(index);
        } else {
            index = simpleLayoutTemplateCell_8(index);
        }
        if (currentTemplatingStatus != 'Y') {
            tools.appendString("</div>");
            if (bIsIe && "true".equals(bIsGridLayout)
                    && !"true".equals(bIsWrapperAdded)) {
                tools.appendString("</div></div>");
                tools.putParamValue("bIsWrapperAdded", "false");
            }
        } else {
            cc_dl.endComponent();
        }
        pzAuto.getUIComponentRuntime().resetTemplatingUIStatus(
                parentTemplatingStatus);
    }

    public void pzLayoutContainer_3() {
        IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime()
                .createMetadata();
        String expressionId = null;
        com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
        String expressionId_BV = null;
        com.pega.pegarules.priv.runtime.ui.IExpression expression_BV = null;
        if (!StringUtils.isBlank(expressionId_BV)) {
            metadataPage.put("expressionId_BV", expressionId_BV);
        }
        String paramName = "EXPANDEDSubSectionInvestmentExtraActionsBBBBB";
        String inspectorLayoutData = pzAuto
                .getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'RH_2.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(4).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)'}");
        if (!inspectorLayoutData.isEmpty()) {
            metadataPage.put("liveUI", inspectorLayoutData);
        }
        String pyPrefix = null;
        IUIComponent containerComponent = pzAuto.getUIComponent();
        metadataPage.put("dlChild", "true");
        metadataPage.put("lMode", "SimpleDiv");
        containerComponent.beginComponent("pxLayoutContainer", metadataPage);
        pzLayoutBody_3();
        containerComponent.endComponent();
    }

    public void pzLayout_4() {
        char currentTemplatingStatus = pzAuto.getUIComponentRuntime()
                .setTemplatingUIStatus('Y');
        if (currentTemplatingStatus == 'Y') {
            pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
        }
        pzSetExpandParam_6();
        tools.putParamValue("RWClasses", "");
        if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
            pzLayoutBodyWrapper_4();
        }
        if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
            tools.putParamValue("pyInlineStyleSec", "");
            pzLayoutContainer_3();
            tools.putParamValue("pyInlineStyleSec", "");
        }
    }

    public int simpleLayoutCell_9(int index) {
        IUIComponent uiComp = null;
        String labelName = "";
        String ariahiddenString = "";
        String baseRef = "";
        generateClientWhenDiv_1();
        tools.appendString("'  class='content-item content-layout item-"
                + Integer.toString(index)
                + " remove-top-spacing remove-bottom-spacing remove-left-spacing remove-right-spacing   flex flex-row '  STRING_TYPE='layout' RESERVE_SPACE='false'>");
        pzLayout_4();
        tools.putSaveValue("ContainerID", "");
        tools.appendString("</div>");
        index++;
        return index;
    }

    public int simpleLayoutTemplateCell_9(int index) {
        IUIComponent uiComp = null;
        String labelName = "";
        String expressionId = null;
        boolean isLabelJSP = false;
        String reqExpressionId = null;
        String disExpressionId = null;
        com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
        if (expression != null) {
            expressionId = expression.getId();
        }
        String pyCustomRequireFormat = "";
        pyCustomRequireFormat = tools.getLocalizedTextForString("pyCaption",
                "pyRequired");
        String baseRef = "";
        boolean pyDLCellVisibility = false;
        IUIComponent cc_dlCell = pzAuto.getUIComponent();
        IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime()
                .createMetadata();
        IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime()
                .createMetadata();
        pgCells.put("pyType", "layout");
        pgCells.put("RWActive", "false");
        pgCells.put(
                "partialClass",
                "remove-top-spacing remove-bottom-spacing remove-left-spacing remove-right-spacing flex flex-row");
        pgCells.put("spanClass", "iconRequired standard_iconRequired");
        pgCells.put("cstmreqfor", pyCustomRequireFormat);
        if (!StringUtils.isBlank(expressionId))
            pgCells.put("pyExpressionId", expressionId);
        if (!"".equals(baseRef))
            pgCells.put("pyBaseRef", String.valueOf(baseRef));
        pgCells.put("labelJSP", String.valueOf(isLabelJSP));
        pgCells.put("pyPreventXSSInLabel", false);
        pg_dlCellMeta.putMetadata("pyCell", pgCells);
        boolean isExpression = false;
        boolean isOffline = false;
        cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
        pzLayout_4();
        tools.putSaveValue("ContainerID", "");
        labelName = "";
        if (!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
            pzAuto.getUIComponentRuntime().getRuntimeContextTree()
                    .addLocalizedValue(labelName, "pyCaption");
        } else {
            StringUtils.crossScriptingFilter(tools.getLocalizedTextForString(
                    "pyCaption", labelName));
        }
        pgCells.put("pyLabelValue", labelName);
        cc_dlCell.endComponent();
        index++;
        return index;
    }

    public void pzSetExpandParam_5() {
        pzSection.getLayout().setExpandParam(
                "SubSectionInvestmentExtraActionsBBBB", "", false);
    }

    public void simpleLayout_4() {
        char parentTemplatingStatus = pzAuto.getUIComponentRuntime()
                .getTemplatingUIStatus();
        char currentTemplatingStatus = 'Y';
        if (!tools.getParamValue("UITemplatingStatus").equals("N")) {
            currentTemplatingStatus = pzAuto.getUIComponentRuntime()
                    .setTemplatingUIStatus('Y');
        } else {
            currentTemplatingStatus = pzAuto.getUIComponentRuntime()
                    .setTemplatingUIStatus('N');
        }
        String spxUniqueStreamHash28 = "";
        if (currentTemplatingStatus != 'N') {
            spxUniqueStreamHash28 = getUIActionsMetaData_1();
            if (spxUniqueStreamHash28 != null
                    && !"".equals(spxUniqueStreamHash28)) {
                pzAuto.getUIComponentRuntime()
                        .getRuntimeContextTree()
                        .addActionString(spxUniqueStreamHash28,
                                pxUniqueStreamHash + "_28");
            }
        }
        String refreshAttributes = "";
        String strMethodName = "";
        IUIComponent cc_dl = null;
        boolean bIsIe = (pzAuto.getBrowserUtils().isIE());
        String bIsWrapperAdded = tools.getParamValue("bIsWrapperAdded");
        String bIsGridLayout = tools.getParamValue("bIsGridLayout");
        cc_dl = pzAuto.getUIComponent();
        IUIComponentMetadata pg_dlmeta = pzAuto.getUIComponentRuntime()
                .createMetadata();
        pg_dlmeta.put("automationId",
                " " + pzCell.getTestIdIfEnabled("202310131445280510181") + " ");
        String subscriptionID = null;
        if (currentTemplatingStatus != 'Y') {
            if (bIsIe && "true".equals(bIsGridLayout)
                    && !"true".equals(bIsWrapperAdded)) {
                tools.appendString("<div class='flex-grid-table-wrapper'><div class='flex-grid-tablecell-wrapper'>");
                tools.putParamValue("bIsWrapperAdded", "true");
            }
            tools.appendString("<div bSimpleLayout='true' ");
            if (((PegaAPI) tools).getUIEngine().getPushServiceUtils()
                    .isPushEnabled()
                    && subscriptionID != null) {
                tools.appendString(" data-subscription-id='" + subscriptionID
                        + "' ");
            }
            tools.appendString(""
                    + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'RH_2.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(4).pySections(1)'}")
                    + " class='"
                    + "flex  content  layout-content-mimic_a_sentence content-mimic_a_sentence "
                    + "'  ");
            if (!tools.getParamValue("pyPegaDesignMode").equals("true")) {
                tools.appendString(" ");
            }
            tools.appendString(" " + refreshAttributes + ">");
        } else {
            String expressionId = null;
            com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
            if (!tools.getParamValue("pyPegaDesignMode").equals("true")
                    && spxUniqueStreamHash28 != null
                    && !"".equals(spxUniqueStreamHash28)) {
                pg_dlmeta.put("pyActionStringID", pxUniqueStreamHash + "_28");
            }
            if (!StringUtils.isBlank(expressionId)) {
                pg_dlmeta.put("pyExpressionId", expressionId);
            }
            if (!"".equals(strMethodName))
                pg_dlmeta.put("methodnm", strMethodName);
            pg_dlmeta.put("format", "mimic_a_sentence");
            String inspectorData = new StringBuilder("\"")
                    .append(""
                            + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'RH_2.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(4).pySections(1)'}")
                            + "").append("\"").toString();
            if (!inspectorData.equals("\"\"")) {
                pg_dlmeta.put("liveUI", inspectorData);
            }
            pg_dlmeta.put("isDLChild", "true");
            pg_dlmeta.put("clear", "false");
            pg_dlmeta.put("lMode", "SimpleDiv");
            pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
            cc_dl.beginComponent("DynamicLayout", pg_dlmeta);
        }
        int index = 1;
        if (currentTemplatingStatus != 'Y') {
            index = simpleLayoutCell_9(index);
        } else {
            index = simpleLayoutTemplateCell_9(index);
        }
        if (currentTemplatingStatus != 'Y') {
            tools.appendString("</div>");
            if (bIsIe && "true".equals(bIsGridLayout)
                    && !"true".equals(bIsWrapperAdded)) {
                tools.appendString("</div></div>");
                tools.putParamValue("bIsWrapperAdded", "false");
            }
        } else {
            cc_dl.endComponent();
        }
        pzAuto.getUIComponentRuntime().resetTemplatingUIStatus(
                parentTemplatingStatus);
    }

    public void pzLayoutContainer_4() {
        IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime()
                .createMetadata();
        String expressionId = null;
        com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
        String expressionId_BV = null;
        com.pega.pegarules.priv.runtime.ui.IExpression expression_BV = null;
        if (!StringUtils.isBlank(expressionId_BV)) {
            metadataPage.put("expressionId_BV", expressionId_BV);
        }
        String paramName = "EXPANDEDSubSectionInvestmentExtraActionsBBBB";
        String inspectorLayoutData = pzAuto
                .getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'RH_2.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(4).pySections(1)'}");
        if (!inspectorLayoutData.isEmpty()) {
            metadataPage.put("liveUI", inspectorLayoutData);
        }
        String pyPrefix = null;
        IUIComponent containerComponent = pzAuto.getUIComponent();
        metadataPage.put("dlChild", "true");
        metadataPage.put("lMode", "SimpleDiv");
        containerComponent.beginComponent("pxLayoutContainer", metadataPage);
        pzLayoutBody_4();
        containerComponent.endComponent();
    }

    public void pzLayout_5() {
        char currentTemplatingStatus = pzAuto.getUIComponentRuntime()
                .setTemplatingUIStatus('Y');
        if (currentTemplatingStatus == 'Y') {
            pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
        }
        pzSetExpandParam_5();
        tools.putParamValue("RWClasses", "");
        if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
            pzLayoutBodyWrapper_5();
        }
        if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
            tools.putParamValue("pyInlineStyleSec", "");
            pzLayoutContainer_4();
            tools.putParamValue("pyInlineStyleSec", "");
        }
    }

    public void pzLayoutBody_1() {
        tools.putParamValue("LAYOUT_METHOD_NAME", "simpleLayout_1");
        simpleLayout_1();
    }

    public void pzLayoutBodyWrapper_2() {
        tools.appendString("<div class='layout layout-none'>");
        String clsScroll = "";
        tools.appendString("<div section_index='1' class='" + clsScroll
                + " layout-body'>");
        tools.putParamValue("LAYOUT_METHOD_NAME", "simpleLayout_1");
        simpleLayout_1();
        tools.appendString("</div></div>");
        tools.putSaveValue("rowClass", "");
    }

    public String getUIActionsMetaData_3() {
        StringBuilder actionsStringBuilder = tools.pushStreamBody();
        ((PegaStreamAPI) tools).disableDirectStreaming();

        {
            boolean isBehaviorAdded = false;
            isBehaviorAdded = false;
            tools.appendString(" data-click='[");
            if (isBehaviorAdded && true) {
                tools.appendString(",");
            }
            {
                com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto
                        .getActionRequest();
                com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
                StringBuffer staticURLStr = new StringBuffer();
                StringBuffer preActParamStr = new StringBuffer();
                StringBuffer preDTParamStr = new StringBuffer();
                refreshActionRequest.registerFixedParameter("pyActivity",
                        "ReloadSection");
                refreshActionRequest.registerFixedParameter("StreamList",
                        "InvestmentsTableDashboard|Rule-HTML-Section|:");
                staticURLStr
                        .append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
                staticURLStr
                        .append("&PreDataTransform=GenerateAdvancedFilterCSV");
                tools.appendString("[\"refresh\", [\"otherSection\",\"InvestmentsTableDashboard\", \"\", \"");
                refreshActionRequestD = refreshActionRequest
                        .createDispatchedActionRequest();
                tools.appendString("=\", \"\", \"GenerateAdvancedFilterCSV,");
                refreshActionRequestD = refreshActionRequest
                        .createDispatchedActionRequest();
                preDTParamStr
                        .append((!"".equals(preDTParamStr.toString()) ? ","
                                : "") + "\"FilterContext\":\"Investment\"");
                refreshActionRequestD.registerFixedParameter("FilterContext",
                        "Investment");
                preDTParamStr
                        .append((!"".equals(preDTParamStr.toString()) ? ","
                                : "")
                                + "\"AppliedFilterContext\":\"InvFilter\"");
                refreshActionRequestD.registerFixedParameter(
                        "AppliedFilterContext", "InvFilter");
                tools.appendString("\",\":event\",\"\",[\"");
                if (!"".equals(preActParamStr.toString())) {
                    staticURLStr.append("&pzActivityParamsEncrypted="
                            + pega_uiengine_pzcontrol.pzURLEncodeString("{"
                                    + preActParamStr.toString() + "}"));
                }
                if (!"".equals(preDTParamStr.toString())) {
                    staticURLStr.append("&pzDTParamsEncrypted="
                            + pega_uiengine_pzcontrol.pzURLEncodeString("{"
                                    + preDTParamStr.toString() + "}"));
                }
                tools.appendString(StringUtils
                        .escapeIntoJSONString(pega_rules_utilities
                                .pzEncryptURLActionString(tools, "Thread",
                                        staticURLStr.toString()))
                        + "\",{"
                        + preActParamStr.toString()
                        + "},{"
                        + preDTParamStr.toString()
                        + "}],\""
                        + pzAuto.getUIComponentRuntime()
                                .generateActionTokenForPage() + "\"]");
                pzAuto.registerActionRequest(refreshActionRequest);
            }

            tools.appendString("]");
            isBehaviorAdded = true;
            tools.appendString("]' ");
            isBehaviorAdded = false;
            tools.appendString(" data-keydown='[");
            if (isBehaviorAdded && true) {
                tools.appendString(",");
            }
            {
                com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto
                        .getActionRequest();
                com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
                StringBuffer staticURLStr = new StringBuffer();
                StringBuffer preActParamStr = new StringBuffer();
                StringBuffer preDTParamStr = new StringBuffer();
                refreshActionRequest.registerFixedParameter("pyActivity",
                        "ReloadSection");
                refreshActionRequest.registerFixedParameter("StreamList",
                        "InvestmentsTableDashboard|Rule-HTML-Section|:");
                staticURLStr
                        .append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
                staticURLStr
                        .append("&PreDataTransform=GenerateAdvancedFilterCSV");
                tools.appendString("[\"refresh\", [\"otherSection\",\"InvestmentsTableDashboard\", \"\", \"");
                refreshActionRequestD = refreshActionRequest
                        .createDispatchedActionRequest();
                tools.appendString("=\", \"\", \"GenerateAdvancedFilterCSV,");
                refreshActionRequestD = refreshActionRequest
                        .createDispatchedActionRequest();
                preDTParamStr
                        .append((!"".equals(preDTParamStr.toString()) ? ","
                                : "") + "\"FilterContext\":\"Investment\"");
                refreshActionRequestD.registerFixedParameter("FilterContext",
                        "Investment");
                preDTParamStr
                        .append((!"".equals(preDTParamStr.toString()) ? ","
                                : "")
                                + "\"AppliedFilterContext\":\"InvFilter\"");
                refreshActionRequestD.registerFixedParameter(
                        "AppliedFilterContext", "InvFilter");
                tools.appendString("\",\":event\",\"\",[\"");
                if (!"".equals(preActParamStr.toString())) {
                    staticURLStr.append("&pzActivityParamsEncrypted="
                            + pega_uiengine_pzcontrol.pzURLEncodeString("{"
                                    + preActParamStr.toString() + "}"));
                }
                if (!"".equals(preDTParamStr.toString())) {
                    staticURLStr.append("&pzDTParamsEncrypted="
                            + pega_uiengine_pzcontrol.pzURLEncodeString("{"
                                    + preDTParamStr.toString() + "}"));
                }
                tools.appendString(StringUtils
                        .escapeIntoJSONString(pega_rules_utilities
                                .pzEncryptURLActionString(tools, "Thread",
                                        staticURLStr.toString()))
                        + "\",{"
                        + preActParamStr.toString()
                        + "},{"
                        + preDTParamStr.toString()
                        + "}],\""
                        + pzAuto.getUIComponentRuntime()
                                .generateActionTokenForPage() + "\"]");
                pzAuto.registerActionRequest(refreshActionRequest);
            }

            tools.appendString(",");
            tools.appendString(",\"enter\"");
            tools.appendString("]");
            isBehaviorAdded = true;
            tools.appendString("]' ");
        }
        String returnString = actionsStringBuilder.toString();
        tools.popStreamBody();
        return returnString;
    }

    public void pxButton_3() {
        boolean isDisplayTextWithParam = false;
        String displayTextParamName = "";
        String displayTextParamValue = "";

        StringBuffer pegaValidation = null;
        boolean addedValidation = false;
        try {

            if (pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') {
                tools.appendString("<span ");
                tools.appendString(">");
            }
            if (pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y') {
                IUIComponentMetadata metadataPage = pzAuto
                        .getUIComponentRuntime().createMetadata();
                IUIComponentMetadata cellPage = pzAuto.getUIComponentRuntime()
                        .createMetadata();
                IUIComponentMetadata modePage1 = pzAuto.getUIComponentRuntime()
                        .createMetadata();
                IUIComponentMetadata modePage2 = pzAuto.getUIComponentRuntime()
                        .createMetadata();
                java.util.List<String> ctPropRefs = new ArrayList<String>();
                IUIComponent ctrlComponent = pzAuto.getUIComponent();
                String expressionId = null;
                com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
                tools.putParamValue("skipHTMLEncoding", "true");
                IUIComponentMetadata pxPrivilegeIdentifiers = pzAuto
                        .getUIComponentRuntime().createMetadata();
                if (expressionId != null && expressionId.length() > 0) {
                    modePage2.put("pyExpressionId", expressionId);
                }
                String uid = String
                        .valueOf(((com.pega.pegarules.priv.context.PegaRequestor) tools
                                .getRequestor()).currentTimeUnique());
                String navPage = "pyNavigation" + uid;
                cellPage.put(
                        "automationId",
                        " "
                                + pzCell.getTestIdIfEnabled("202308311215570094533")
                                + " ");
                if (false || (pzAuto.isOffline() && false)) {
                    modePage2.put("nav", navPage);
                }
                modePage2.put("pyName", "InvestmentExtraActions_$CTX$_8");
                String repeatIndx = "";
                String pyTooltip = "";
                if (pega.getPackageRuntime().canPackage()) {
                    tools.getLocalizedTextForString(".pyActionPrompt",
                            "Click to apply filters\t" + repeatIndx,
                            StreamBuilder.FMT_LITERAL);
                } else {
                    pzAuto.getUIComponentRuntime()
                            .getRuntimeContextTree()
                            .addLocalizedValue("Click to apply filters",
                                    ".pyActionPrompt");
                }
                pyTooltip = "Click to apply filters";
                modePage2.put("tooltip", pyTooltip);
                modePage2.put("helpertype", "tooltip");
                modePage2.put("styles", "Strong");
                modePage2.put("imgSrc", "none");
                modePage2.put("pyActionImagePosition", "left");
                String customStyles = null;
                String pyLabel = "";
                if (pega.getPackageRuntime().canPackage()) {
                    tools.getLocalizedTextForString(".pyButtonLabel", "Apply\t"
                            + repeatIndx, StreamBuilder.FMT_LITERAL);
                } else {
                    pzAuto.getUIComponentRuntime().getRuntimeContextTree()
                            .addLocalizedValue("Apply", ".pyButtonLabel");
                }
                pyLabel = "Apply";
                modePage2.put("label", pyLabel);
                String spxUniqueStreamHash21 = getUIActionsMetaData_3();
                if (spxUniqueStreamHash21 != null
                        && !"".equals(spxUniqueStreamHash21)) {
                    pzAuto.getUIComponentRuntime()
                            .getRuntimeContextTree()
                            .addActionString(spxUniqueStreamHash21,
                                    pxUniqueStreamHash + "_21");
                    modePage2.put("pyActionStringID", pxUniqueStreamHash
                            + "_21");
                }
                modePage2
                        .put("actionPath", " data-keyboard='.' data-click='.'");
                tools.putParamValue("skipHTMLEncoding", "false");
                cellPage.addMetadataInArray("pyModes", modePage1);
                cellPage.addMetadataInArray("pyModes", modePage2);
                metadataPage.putMetadata("pyCell", cellPage);
                ctrlComponent
                        .addDependentScripts("pzpega_ui_template_button.js");
                ctrlComponent.beginComponent("pxButton", metadataPage);
                ctrlComponent.setTrackedProperties(ctPropRefs
                        .toArray(new String[] {}));
                tools.putParamValue("isControlEditableOriginal", true);
                ctrlComponent.endComponent();
            } else {
                boolean bDisabled = false;
                boolean bOptimizedMarkup = pzAuto.getUIComponentRuntime()
                        .isHarnessTemplatized() && pzAuto.isOffline();
                String pyFormatValue = "";
                String toolTipVal = "";
                String hrefValue = "#";
                String referenceString = tools.getStepPage().getReference();
                boolean isParameterizedDeclarePage = pega
                        .getDeclarativePageUtils().isParameterizedDPName(
                                referenceString);
                if (isParameterizedDeclarePage) {
                    referenceString = tools.getStepPage().getString(
                            "pzPageNameBase");
                }
                String buttonUID = "name='InvestmentExtraActions_"
                        + referenceString + "_8'";
                String securedPropValue = null;
                tools.appendString("<button "
                        + pzCell.getTestIdIfEnabled("202308311215570094533")
                        + "  data-ctl='Button'  type='button' ");
                if (!"true".equals(tools
                        .getParamValue("pxAvoidUniqueAttribute")))
                    tools.appendString(buttonUID);
                pega_uiengine_pzcontrol.pzAddClientValidation(tools, "", "",
                        "", "");
                {
                    boolean isBehaviorAdded = false;
                    isBehaviorAdded = false;
                    tools.appendString(" data-click='[");
                    if (isBehaviorAdded && true) {
                        tools.appendString(",");
                    }
                    {
                        com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto
                                .getActionRequest();
                        com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
                        StringBuffer staticURLStr = new StringBuffer();
                        StringBuffer preActParamStr = new StringBuffer();
                        StringBuffer preDTParamStr = new StringBuffer();
                        refreshActionRequest.registerFixedParameter(
                                "pyActivity", "ReloadSection");
                        refreshActionRequest
                                .registerFixedParameter("StreamList",
                                        "InvestmentsTableDashboard|Rule-HTML-Section|:");
                        staticURLStr
                                .append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
                        staticURLStr
                                .append("&PreDataTransform=GenerateAdvancedFilterCSV");
                        tools.appendString("[\"refresh\", [\"otherSection\",\"InvestmentsTableDashboard\", \"\", \"");
                        refreshActionRequestD = refreshActionRequest
                                .createDispatchedActionRequest();
                        tools.appendString("=\", \"\", \"GenerateAdvancedFilterCSV,");
                        refreshActionRequestD = refreshActionRequest
                                .createDispatchedActionRequest();
                        preDTParamStr.append((!"".equals(preDTParamStr
                                .toString()) ? "," : "")
                                + "\"FilterContext\":\"Investment\"");
                        refreshActionRequestD.registerFixedParameter(
                                "FilterContext", "Investment");
                        preDTParamStr.append((!"".equals(preDTParamStr
                                .toString()) ? "," : "")
                                + "\"AppliedFilterContext\":\"InvFilter\"");
                        refreshActionRequestD.registerFixedParameter(
                                "AppliedFilterContext", "InvFilter");
                        tools.appendString("\",\":event\",\"\",[\"");
                        if (!"".equals(preActParamStr.toString())) {
                            staticURLStr.append("&pzActivityParamsEncrypted="
                                    + pega_uiengine_pzcontrol
                                            .pzURLEncodeString("{"
                                                    + preActParamStr.toString()
                                                    + "}"));
                        }
                        if (!"".equals(preDTParamStr.toString())) {
                            staticURLStr.append("&pzDTParamsEncrypted="
                                    + pega_uiengine_pzcontrol
                                            .pzURLEncodeString("{"
                                                    + preDTParamStr.toString()
                                                    + "}"));
                        }
                        tools.appendString(StringUtils
                                .escapeIntoJSONString(pega_rules_utilities
                                        .pzEncryptURLActionString(tools,
                                                "Thread",
                                                staticURLStr.toString()))
                                + "\",{"
                                + preActParamStr.toString()
                                + "},{"
                                + preDTParamStr.toString()
                                + "}],\""
                                + pzAuto.getUIComponentRuntime()
                                        .generateActionTokenForPage() + "\"]");
                        pzAuto.registerActionRequest(refreshActionRequest);
                    }

                    tools.appendString("]");
                    isBehaviorAdded = true;
                    tools.appendString("]' ");
                    isBehaviorAdded = false;
                    tools.appendString(" data-keydown='[");
                    if (isBehaviorAdded && true) {
                        tools.appendString(",");
                    }
                    {
                        com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto
                                .getActionRequest();
                        com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
                        StringBuffer staticURLStr = new StringBuffer();
                        StringBuffer preActParamStr = new StringBuffer();
                        StringBuffer preDTParamStr = new StringBuffer();
                        refreshActionRequest.registerFixedParameter(
                                "pyActivity", "ReloadSection");
                        refreshActionRequest
                                .registerFixedParameter("StreamList",
                                        "InvestmentsTableDashboard|Rule-HTML-Section|:");
                        staticURLStr
                                .append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
                        staticURLStr
                                .append("&PreDataTransform=GenerateAdvancedFilterCSV");
                        tools.appendString("[\"refresh\", [\"otherSection\",\"InvestmentsTableDashboard\", \"\", \"");
                        refreshActionRequestD = refreshActionRequest
                                .createDispatchedActionRequest();
                        tools.appendString("=\", \"\", \"GenerateAdvancedFilterCSV,");
                        refreshActionRequestD = refreshActionRequest
                                .createDispatchedActionRequest();
                        preDTParamStr.append((!"".equals(preDTParamStr
                                .toString()) ? "," : "")
                                + "\"FilterContext\":\"Investment\"");
                        refreshActionRequestD.registerFixedParameter(
                                "FilterContext", "Investment");
                        preDTParamStr.append((!"".equals(preDTParamStr
                                .toString()) ? "," : "")
                                + "\"AppliedFilterContext\":\"InvFilter\"");
                        refreshActionRequestD.registerFixedParameter(
                                "AppliedFilterContext", "InvFilter");
                        tools.appendString("\",\":event\",\"\",[\"");
                        if (!"".equals(preActParamStr.toString())) {
                            staticURLStr.append("&pzActivityParamsEncrypted="
                                    + pega_uiengine_pzcontrol
                                            .pzURLEncodeString("{"
                                                    + preActParamStr.toString()
                                                    + "}"));
                        }
                        if (!"".equals(preDTParamStr.toString())) {
                            staticURLStr.append("&pzDTParamsEncrypted="
                                    + pega_uiengine_pzcontrol
                                            .pzURLEncodeString("{"
                                                    + preDTParamStr.toString()
                                                    + "}"));
                        }
                        tools.appendString(StringUtils
                                .escapeIntoJSONString(pega_rules_utilities
                                        .pzEncryptURLActionString(tools,
                                                "Thread",
                                                staticURLStr.toString()))
                                + "\",{"
                                + preActParamStr.toString()
                                + "},{"
                                + preDTParamStr.toString()
                                + "}],\""
                                + pzAuto.getUIComponentRuntime()
                                        .generateActionTokenForPage() + "\"]");
                        pzAuto.registerActionRequest(refreshActionRequest);
                    }

                    tools.appendString(",");
                    tools.appendString(",\"enter\"");
                    tools.appendString("]");
                    isBehaviorAdded = true;
                    tools.appendString("]' ");
                }
                String repeatIndx = "";
                if (bOptimizedMarkup) {
                    tools.appendString("  data-bindprops='title,innerHTML' ");
                }
                tools.appendString("  title= '");
                toolTipVal = tools.getLocalizedTextForString(".pyActionPrompt",
                        "Click to apply filters\t" + repeatIndx,
                        StreamBuilder.FMT_LITERAL)
                        + "' ";
                tools.appendString(toolTipVal);
                tools.appendString("class='Strong pzhc pzbutton");
                tools.appendString("'");
                if (bOptimizedMarkup) {
                    tools.appendString(" data-bindprops='innerHTML,title' ");
                }
                tools.appendString(" >");
                boolean hasLineBreaks = false;
                hasLineBreaks = "Apply"
                        .matches("(.*)<([Bb][Rr])\\s*\\/*\\s*>(.*)");
                if (hasLineBreaks) {
                    tools.appendString("<span class='pzbtn-label'  data-keyboard='.' data-click='.' ");
                }
                if (bOptimizedMarkup && hasLineBreaks) {
                    tools.appendString("  data-bindprops='title,innerHTML' ");
                }
                if (hasLineBreaks) {
                    tools.appendString("  > ");
                }
                tools.appendString("");
                pega_uiengine_harness.pzGenAKey(tools
                        .getLocalizedTextForString(".pyButtonLabel", "Apply",
                                StreamBuilder.FMT_LITERAL));
                checkForScriptTags_1(tools.getParamValue("pzULabel"));
                tools.appendString("</button>");
            }

            tools.putParamValue("pega_attributes", "");
            if (pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') {
                tools.appendString("</span>");
            }
            tools.putParamValue("doAutoFormatting", "false");
            tools.putParamValue("isControlEditableOriginal", true);
            if (pegaValidation != null) {
                com.pega.pegarules.priv.factory.StringBufferFactory
                        .release(pegaValidation);
            }
        } catch (Exception e) {

            oLog.error(e.getMessage());

            if (pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'
                    && pzAuto.getUIComponentRuntime().getRuntimeContextTree()
                            .isLiveDesignViewMode()) {

                IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime()
                        .createMetadata();
                IUIComponent ctrlComponent = pzAuto.getUIComponent();
                metadata.put("cellInfo", "Button");
                metadata.put("msgText", "config issue");
                ctrlComponent
                        .addDependentScripts("pzpega_ui_template_designview.js");
                ctrlComponent.beginComponent("pxDesignViewError", metadata);
                tools.putParamValue("isControlEditableOriginal", true);
                ctrlComponent.endComponent();
            }
        }

    }

    public void pzLayoutBodyWrapper_1() {
        if (pzSection.getLayout().loadLayoutBody()) {
            sectionBodyIncludeInCell_2();
        }
        tools.putSaveValue("rowClass", "");
    }

    public void buildSection_2() {
        Map<String, Object> secInfo = new HashMap<String, Object>();
        secInfo.put("usingPage", "");
        secInfo.put("isUsingPagePropertyRef", false);
        secInfo.put("doNotConsiderDecParams", false);
        secInfo.put("keepStreamProperties", true);
        secInfo.put("preserveParamState", false);
        Map<String, String> secParams = new HashMap<String, String>();
        secInfo.put(
                com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PARAMETERS,
                secParams);
        pzAuto.getUIComponentRuntime()
                .getRuntimeContextTree()
                .loadSection(pxUniqueStreamHash + "_19",
                        "InvestmentApplyFilterWrapper", secInfo);
    }

    public void sectionBodyIncludeInCell_2() {
        if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
            buildSection_2();
            return;
        }
        String strSectionPageProp = "";
        tools.putParamValue("section_params", "");

        String inputType = "Input";
        boolean popReadOnly = false;
        String readOnlyParam = tools.getParamValue("ReadOnly");
        if (readOnlyParam.equalsIgnoreCase("-1")
                || readOnlyParam.equalsIgnoreCase("true")
                || !tools.hasInputEnabled()) {
            if (!(readOnlyParam.equalsIgnoreCase("-1") || readOnlyParam
                    .equalsIgnoreCase("true")) && !tools.hasInputEnabled()) {
                popReadOnly = true;
            }
            inputType = "NoInput";
        }
        if ("NoInput".equals(inputType)) {
            tools.putParamValue("SectionReadOnly", "-1");
        }
        String sectionName = "InvestmentApplyFilterWrapper";
        String usingPage = null;
        ClipboardPage pg_usingPage = null;
        if (usingPage != null && !"".equals(usingPage)) {
            pg_usingPage = tools.findPage(usingPage);
        }
        PRStackFrame pz_StackFrame1 = null;
        String lazyInfoBefore = null;
        if (pg_usingPage != null) {
            lazyInfoBefore = tools.getParamValue("lazyLoadInfo");
            pz_StackFrame1 = pega.pushStackFrame(null, pg_usingPage, false,
                    false, PRStackFrame.Type.APPEND_STREAM,
                    "Rule-HTML-Section", sectionName);
            tools.putParamValue("lazyLoadInfo", "");
        }
        if (usingPage == null
                || "".equals(usingPage)
                || (pg_usingPage != null && !pg_usingPage
                        .getString("pxObjClass").trim().equals(""))) {
            String tempRenderSingle = tools.getParamValue("RenderSingle");
            tools.putParamValue("RenderSingle", "");
            if (!tools.getParamValue("SecBaseRefParam").equals("false")) {
                tools.putParamValue(
                        "section_base_ref",
                        " NAME='BASE_REF' BASE_REF='"
                                + pega_uiengine_harness.pzGetUsingPageName(
                                        usingPage, pg_usingPage) + "'");
            }
            pzAuto.emitIncludeStreamReference(sectionName, null, inputType,
                    "Rule-HTML-Section", null);
            tools.putParamValue("section_base_ref", "");
            tools.putParamValue("RenderSingle", tempRenderSingle);
        }
        if (pg_usingPage != null) {
            String lazyInfoAfter = tools.getParamValue("lazyLoadInfo");
            pega.popStackFrame(pz_StackFrame1, false);
            tools.putParamValue("lazyLoadInfo", lazyInfoBefore + lazyInfoAfter);
        }
        if (popReadOnly) {
            tools.getParameterPage().remove("SectionReadOnly");
        }
    }

    public void pzSetExpandParam_4() {
        pzSection.getLayout().setExpandParam(
                "SubSectionCellInvestmentExtraActions551", "", false);
    }

    public void pzLayout_1() {
        pzSetExpandParam_4();
        pzLayoutBodyWrapper_1();
    }

    public void buildSection_1() {
        Map<String, Object> secInfo = new HashMap<String, Object>();
        secInfo.put("usingPage", "");
        secInfo.put("isUsingPagePropertyRef", false);
        secInfo.put("doNotConsiderDecParams", false);
        secInfo.put("keepStreamProperties", true);
        secInfo.put("preserveParamState", false);
        Map<String, String> secParams = new HashMap<String, String>();
        secInfo.put(
                com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PARAMETERS,
                secParams);
        pzAuto.getUIComponentRuntime()
                .getRuntimeContextTree()
                .loadSection(pxUniqueStreamHash + "_16",
                        "InvestmentApplyFilterWrapper", secInfo);
    }

    public void sectionBodyIncludeInCell_1() {
        if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
            buildSection_1();
            return;
        }
        String strSectionPageProp = "";
        tools.putParamValue("section_params", "");

        String inputType = "Input";
        boolean popReadOnly = false;
        String readOnlyParam = tools.getParamValue("ReadOnly");
        if (readOnlyParam.equalsIgnoreCase("-1")
                || readOnlyParam.equalsIgnoreCase("true")
                || !tools.hasInputEnabled()) {
            if (!(readOnlyParam.equalsIgnoreCase("-1") || readOnlyParam
                    .equalsIgnoreCase("true")) && !tools.hasInputEnabled()) {
                popReadOnly = true;
            }
            inputType = "NoInput";
        }
        if ("NoInput".equals(inputType)) {
            tools.putParamValue("SectionReadOnly", "-1");
        }
        String sectionName = "InvestmentApplyFilterWrapper";
        String usingPage = null;
        ClipboardPage pg_usingPage = null;
        if (usingPage != null && !"".equals(usingPage)) {
            pg_usingPage = tools.findPage(usingPage);
        }
        PRStackFrame pz_StackFrame1 = null;
        String lazyInfoBefore = null;
        if (pg_usingPage != null) {
            lazyInfoBefore = tools.getParamValue("lazyLoadInfo");
            pz_StackFrame1 = pega.pushStackFrame(null, pg_usingPage, false,
                    false, PRStackFrame.Type.APPEND_STREAM,
                    "Rule-HTML-Section", sectionName);
            tools.putParamValue("lazyLoadInfo", "");
        }
        if (usingPage == null
                || "".equals(usingPage)
                || (pg_usingPage != null && !pg_usingPage
                        .getString("pxObjClass").trim().equals(""))) {
            String tempRenderSingle = tools.getParamValue("RenderSingle");
            tools.putParamValue("RenderSingle", "");
            if (!tools.getParamValue("SecBaseRefParam").equals("false")) {
                tools.putParamValue(
                        "section_base_ref",
                        " NAME='BASE_REF' BASE_REF='"
                                + pega_uiengine_harness.pzGetUsingPageName(
                                        usingPage, pg_usingPage) + "'");
            }
            pzAuto.emitIncludeStreamReference(sectionName, null, inputType,
                    "Rule-HTML-Section", null);
            tools.putParamValue("section_base_ref", "");
            tools.putParamValue("RenderSingle", tempRenderSingle);
        }
        if (pg_usingPage != null) {
            String lazyInfoAfter = tools.getParamValue("lazyLoadInfo");
            pega.popStackFrame(pz_StackFrame1, false);
            tools.putParamValue("lazyLoadInfo", lazyInfoBefore + lazyInfoAfter);
        }
        if (popReadOnly) {
            tools.getParameterPage().remove("SectionReadOnly");
        }
    }

    public int simpleLayoutCell_3(int index) {
        IUIComponent uiComp = null;
        String labelName = "";
        String ariahiddenString = "";
        String baseRef = "";
        generateClientWhenDiv_1();
        tools.appendString("' "
                + pzCell.getInspectorDataDynamic(
                        "SUB_SECTION",
                        "InvestmentApplyFilterWrapper",
                        "RH_2.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)")
                + " class='content-item content-sub_section item-"
                + Integer.toString(index)
                + " remove-top-spacing remove-bottom-spacing remove-left-spacing   flex flex-row '  STRING_TYPE='sub_section' RESERVE_SPACE='false'>");
        String tempRenderSingle = "";

        tempRenderSingle = tools.getParamValue("RenderSingle");
        tools.putParamValue("RenderSingle", "");
        sectionBodyIncludeInCell_1();
        tools.putParamValue("RenderSingle", tempRenderSingle);
        tools.appendString("</div>");
        index++;
        return index;
    }

    public int simpleLayoutTemplateCell_3(int index) {
        IUIComponent uiComp = null;
        String labelName = "";
        String expressionId = null;
        boolean isLabelJSP = false;
        String reqExpressionId = null;
        String disExpressionId = null;
        com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
        if (expression != null) {
            expressionId = expression.getId();
        }
        String pyCustomRequireFormat = "";
        pyCustomRequireFormat = tools.getLocalizedTextForString("pyCaption",
                "pyRequired");
        String baseRef = "";
        boolean pyDLCellVisibility = false;
        IUIComponent cc_dlCell = pzAuto.getUIComponent();
        IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime()
                .createMetadata();
        IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime()
                .createMetadata();
        pgCells.put("pyType", "sub_section");
        pgCells.put("partialClass",
                "remove-top-spacing remove-bottom-spacing remove-left-spacing flex flex-row");
        pgCells.put("spanClass", "iconRequired standard_iconRequired");
        pgCells.put("cstmreqfor", pyCustomRequireFormat);
        if (!StringUtils.isBlank(expressionId))
            pgCells.put("pyExpressionId", expressionId);
        if (!"".equals(baseRef))
            pgCells.put("pyBaseRef", String.valueOf(baseRef));
        pgCells.put("labelJSP", String.valueOf(isLabelJSP));
        pgCells.put("pyPreventXSSInLabel", false);
        pg_dlCellMeta.putMetadata("pyCell", pgCells);
        boolean isExpression = false;
        boolean isOffline = false;
        cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
        String inspectorData = pzCell
                .getInspectorDataDynamic(
                        "SUB_SECTION",
                        "InvestmentApplyFilterWrapper",
                        "RH_2.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
        if (!inspectorData.isEmpty()) {
            pgCells.put("liveUI", inspectorData);
        }
        String tempRenderSingle = "";
        tempRenderSingle = tools.getParamValue("RenderSingle");
        tools.putParamValue("RenderSingle", "");
        pzLayout_1();
        tools.putSaveValue("ContainerID", "");
        tools.putParamValue("RenderSingle", tempRenderSingle);
        labelName = "";
        if (!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
            pzAuto.getUIComponentRuntime().getRuntimeContextTree()
                    .addLocalizedValue(labelName, "pyCaption");
        } else {
            StringUtils.crossScriptingFilter(tools.getLocalizedTextForString(
                    "pyCaption", labelName));
        }
        pgCells.put("pyLabelValue", labelName);
        cc_dlCell.endComponent();
        index++;
        return index;
    }

    public int simpleLayoutCell_4(int index) {
        IUIComponent uiComp = null;
        String labelName = "";
        String ariahiddenString = "";
        String baseRef = "";
        generateClientWhenDiv_1();
        tools.appendString("' "
                + pega.getUIEngine().getFVInspectorUtils()
                        .startCollectingFieldValueData()
                + pzCell.getInspectorDataDynamic(
                        "pxButton",
                        ".pyTemplateInputBox",
                        "RH_2.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2)")
                + " class='content-item content-field item-"
                + Integer.toString(index)
                + " remove-top-spacing remove-bottom-spacing remove-right-spacing    "
                + pzSection.getCustomStyle(false, "", "padding-t-2x",
                        "padding-t-2x")
                + " "
                + pzSection.getCustomStyle(false, "", "dataValueRead",
                        "dataValueWrite")
                + " flex flex-row '  STRING_TYPE='field' RESERVE_SPACE='false'>");
        pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
        tools.putSaveValue("parentLayouttype", "SIMPLELAYOUT");
        pxButton_3();
        tools.appendString(pega.getUIEngine().getFVInspectorUtils()
                .stopCollectingFieldValueData()
                + "</div>");
        index++;
        return index;
    }

    public int simpleLayoutTemplateCell_4(int index) {
        IUIComponent uiComp = null;
        String labelName = "";
        String expressionId = null;
        boolean isLabelJSP = false;
        String reqExpressionId = null;
        String disExpressionId = null;
        com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
        if (expression != null) {
            expressionId = expression.getId();
        }
        String pyCustomRequireFormat = "";
        pyCustomRequireFormat = tools.getLocalizedTextForString("pyCaption",
                "pyRequired");
        String dataFieldValueMeta = pega.getUIEngine().getFVInspectorUtils()
                .startCollectingFieldValueData();
        String baseRef = "";
        boolean pyDLCellVisibility = false;
        IUIComponent cc_dlCell = pzAuto.getUIComponent();
        IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime()
                .createMetadata();
        IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime()
                .createMetadata();
        pgCells.put("partialClass",
                "remove-top-spacing remove-bottom-spacing remove-right-spacing flex flex-row");
        pgCells.put(
                "automationId",
                new StringBuilder(" ")
                        .append(pzCell
                                .getTestIdIfEnabled("202308311215570094533-Label"))
                        .append(" ").toString().replace("data-test-id=", "")
                        .trim());
        pgCells.put("format", "pxButton");
        pgCells.put("forLabel", ".pyTemplateInputBox");
        pgCells.put("pyAutoHTML", "true");
        pgCells.put("spanClass", "iconRequired standard_iconRequired");
        pgCells.put("customROStyles", "padding-t-2x");
        pgCells.put("customRWStyles", "padding-t-2x");
        pgCells.put("cstmreqfor", pyCustomRequireFormat);
        if (!StringUtils.isBlank(expressionId))
            pgCells.put("pyExpressionId", expressionId);
        if (!"".equals(baseRef))
            pgCells.put("pyBaseRef", String.valueOf(baseRef));
        if (!"".equals(dataFieldValueMeta))
            pgCells.put("startFV", dataFieldValueMeta);
        pgCells.put("labelJSP", String.valueOf(isLabelJSP));
        pgCells.put("pyPreventXSSInLabel", false);
        pg_dlCellMeta.putMetadata("pyCell", pgCells);
        boolean isExpression = false;
        boolean isOffline = false;
        cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
        String inspectorData = pzCell
                .getInspectorDataDynamic(
                        "pxButton",
                        ".pyTemplateInputBox",
                        "RH_2.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2)");
        if (!inspectorData.isEmpty()) {
            pgCells.put("liveUI", inspectorData);
        }
        pxButton_3();
        labelName = "Button";
        if (!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
            pzAuto.getUIComponentRuntime().getRuntimeContextTree()
                    .addLocalizedValue(labelName, "pyCaption");
        } else {
            StringUtils.crossScriptingFilter(tools.getLocalizedTextForString(
                    "pyCaption", labelName));
        }
        pgCells.put("pyLabelValue", labelName);
        String uiFieldValueMeta = pega.getUIEngine().getFVInspectorUtils()
                .stopCollectingFieldValueData();
        if (!"".equals(uiFieldValueMeta)) {
            pgCells.put("stopFV", uiFieldValueMeta);
        }
        cc_dlCell.endComponent();
        index++;
        return index;
    }

    public void pzSetExpandParam_3() {
        pzSection.getLayout().setExpandParam(
                "SubSectionInvestmentExtraActionsBBB", "", false);
    }

    public void simpleLayout_1() {
        char parentTemplatingStatus = pzAuto.getUIComponentRuntime()
                .getTemplatingUIStatus();
        char currentTemplatingStatus = 'Y';
        if (!tools.getParamValue("UITemplatingStatus").equals("N")) {
            currentTemplatingStatus = pzAuto.getUIComponentRuntime()
                    .setTemplatingUIStatus('Y');
        } else {
            currentTemplatingStatus = pzAuto.getUIComponentRuntime()
                    .setTemplatingUIStatus('N');
        }
        String spxUniqueStreamHash14 = "";
        if (currentTemplatingStatus != 'N') {
            spxUniqueStreamHash14 = getUIActionsMetaData_1();
            if (spxUniqueStreamHash14 != null
                    && !"".equals(spxUniqueStreamHash14)) {
                pzAuto.getUIComponentRuntime()
                        .getRuntimeContextTree()
                        .addActionString(spxUniqueStreamHash14,
                                pxUniqueStreamHash + "_14");
            }
        }
        String refreshAttributes = "";
        String strMethodName = "";
        IUIComponent cc_dl = null;
        boolean bIsIe = (pzAuto.getBrowserUtils().isIE());
        String bIsWrapperAdded = tools.getParamValue("bIsWrapperAdded");
        String bIsGridLayout = tools.getParamValue("bIsGridLayout");
        cc_dl = pzAuto.getUIComponent();
        IUIComponentMetadata pg_dlmeta = pzAuto.getUIComponentRuntime()
                .createMetadata();
        pg_dlmeta.put("automationId",
                " " + pzCell.getTestIdIfEnabled("202308311224040159940") + " ");
        String subscriptionID = null;
        if (currentTemplatingStatus != 'Y') {
            if (bIsIe && "true".equals(bIsGridLayout)
                    && !"true".equals(bIsWrapperAdded)) {
                tools.appendString("<div class='flex-grid-table-wrapper'><div class='flex-grid-tablecell-wrapper'>");
                tools.putParamValue("bIsWrapperAdded", "true");
            }
            tools.appendString("<div bSimpleLayout='true' ");
            if (((PegaAPI) tools).getUIEngine().getPushServiceUtils()
                    .isPushEnabled()
                    && subscriptionID != null) {
                tools.appendString(" data-subscription-id='" + subscriptionID
                        + "' ");
            }
            tools.appendString(""
                    + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'RH_2.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1)'}")
                    + " class='"
                    + "flex  content  layout-content-inline content-inline "
                    + "'  ");
            if (!tools.getParamValue("pyPegaDesignMode").equals("true")) {
                tools.appendString(" ");
            }
            tools.appendString(" " + refreshAttributes + ">");
        } else {
            String expressionId = null;
            com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
            if (StringUtils.isBlank(expressionId)) {
                expressionId = pxUniqueStreamHash + "_15";
            }
            expression = pzAuto
                    .getUIComponentRuntime()
                    .getExpressionEvaluator()
                    .addExpression("showWhen",
                            ".FlagValueGroup(InvFilters) = true", expressionId);
            if (!tools.getParamValue("pyPegaDesignMode").equals("true")
                    && spxUniqueStreamHash14 != null
                    && !"".equals(spxUniqueStreamHash14)) {
                pg_dlmeta.put("pyActionStringID", pxUniqueStreamHash + "_14");
            }
            if (!StringUtils.isBlank(expressionId)) {
                pg_dlmeta.put("pyExpressionId", expressionId);
            }
            if (!"".equals(strMethodName))
                pg_dlmeta.put("methodnm", strMethodName);
            pg_dlmeta.put("format", "inline");
            String inspectorData = new StringBuilder("\"")
                    .append(""
                            + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'RH_2.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1)'}")
                            + "").append("\"").toString();
            if (!inspectorData.equals("\"\"")) {
                pg_dlmeta.put("liveUI", inspectorData);
            }
            pg_dlmeta.put("isDLChild", "true");
            pg_dlmeta.put("clear", "false");
            pg_dlmeta.put("lMode", "SimpleDiv");
            pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
            cc_dl.beginComponent("DynamicLayout", pg_dlmeta);
        }
        int index = 1;
        if (currentTemplatingStatus != 'Y') {
            index = simpleLayoutCell_3(index);
        } else {
            index = simpleLayoutTemplateCell_3(index);
        }
        if (currentTemplatingStatus != 'Y') {
            index = simpleLayoutCell_4(index);
        } else {
            index = simpleLayoutTemplateCell_4(index);
        }
        if (currentTemplatingStatus != 'Y') {
            tools.appendString("</div>");
            if (bIsIe && "true".equals(bIsGridLayout)
                    && !"true".equals(bIsWrapperAdded)) {
                tools.appendString("</div></div>");
                tools.putParamValue("bIsWrapperAdded", "false");
            }
        } else {
            cc_dl.endComponent();
        }
        pzAuto.getUIComponentRuntime().resetTemplatingUIStatus(
                parentTemplatingStatus);
    }

    public void pzLayoutContainer_1() {
        IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime()
                .createMetadata();
        String expressionId = null;
        com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
        expressionId = pxUniqueStreamHash + "_24";
        expression = pzAuto
                .getUIComponentRuntime()
                .getExpressionEvaluator()
                .addExpression("showWhen",
                        ".FlagValueGroup(InvFilters) = true", expressionId);
        expressionId = expression.getId();
        String expressionId_BV = null;
        com.pega.pegarules.priv.runtime.ui.IExpression expression_BV = null;
        if (!StringUtils.isBlank(expressionId_BV)) {
            metadataPage.put("expressionId_BV", expressionId_BV);
        }
        String paramName = "EXPANDEDSubSectionInvestmentExtraActionsBBB";
        String inspectorLayoutData = pzAuto
                .getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'RH_2.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1)'}");
        if (!inspectorLayoutData.isEmpty()) {
            metadataPage.put("liveUI", inspectorLayoutData);
        }
        String pyPrefix = null;
        IUIComponent containerComponent = pzAuto.getUIComponent();
        metadataPage.put("dlChild", "true");
        metadataPage.put("lMode", "SimpleDiv");
        containerComponent.beginComponent("pxLayoutContainer", metadataPage);
        pzLayoutBody_1();
        containerComponent.endComponent();
    }

    public void pzLayout_2() {
        char currentTemplatingStatus = pzAuto.getUIComponentRuntime()
                .setTemplatingUIStatus('Y');
        if (currentTemplatingStatus == 'Y') {
            pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
        }
        pzSetExpandParam_3();
        tools.putParamValue("RWClasses", "");
        if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
            pzLayoutBodyWrapper_2();
        }
        if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
            tools.putParamValue("pyInlineStyleSec", "");
            pzLayoutContainer_1();
            tools.putParamValue("pyInlineStyleSec", "");
        }
    }

    public void generateClientWhenDiv_3() {
        String clientWhenAttr = "";
        char currentTemplatingStatus = 'Y';
        currentTemplatingStatus = pzAuto.getUIComponentRuntime()
                .getTemplatingUIStatus();
        if (currentTemplatingStatus == 'N')
            tools.appendString("<div ");
        if (currentTemplatingStatus == 'N')
            tools.appendString("id=\"CT\"");
        if (tools.getThread().getName().indexOf("/$WorkProcessing") != -1
                || tools.getThread().getName().indexOf("/$FlowModalProcess") != -1) {
            if (currentTemplatingStatus == 'N') {
                tools.appendString(" thread_name = \""
                        + tools.getThread().getName() + "\"");
            } else {
                String threadName = tools.getThread().getName();
                clientWhenAttr += "thread_name= \"" + threadName + "\" ";
            }
        }
        if (currentTemplatingStatus == 'N')
            tools.appendString(" SWP=\".FlagValueGroup(InvFilters)\"  SHOW_WHEN=\".FlagValueGroup(InvFilters) = true\"");
        if (pzAuto.evaluateWhen(".FlagValueGroup(InvFilters) = true", null,
                true)) {
            if (currentTemplatingStatus == 'N')
                tools.appendString(" style=' ");
            else
                clientWhenAttr += "style= '";
        } else {
            if (currentTemplatingStatus == 'N')
                tools.appendString(" style='display:none; ");
            else
                clientWhenAttr += "style='display:none;  ";
        }
        if (currentTemplatingStatus == 'Y')
            clientWhenAttr += "'";
        if (currentTemplatingStatus == 'Y')
            tools.putParamValue("clientWhenAttr", clientWhenAttr);
        try {
            if (tools.getParamValue("AJAXTrackID") != null
                    && !tools.getParamValue("AJAXTrackID").equals("")) {
                com.pega.pegarules.priv.runtime.IStreamChangeTracker changeTracker = pzAuto
                        .getChangeTracker(tools.getParamValue("AJAXTrackID"));
                changeTracker.trackValueChanges(tools.getStepPage()
                        .getReference() + ".FlagValueGroup(InvFilters)", -1);
            }
        } catch (Exception e) {
        }
    }

    public void pxButton_2() {
        boolean isDisplayTextWithParam = false;
        String displayTextParamName = "";
        String displayTextParamValue = "";

        StringBuffer pegaValidation = null;
        boolean addedValidation = false;
        try {

            if (pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') {
                tools.appendString("<span ");
                tools.appendString(">");
            }
            if (pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y') {
                IUIComponentMetadata metadataPage = pzAuto
                        .getUIComponentRuntime().createMetadata();
                IUIComponentMetadata cellPage = pzAuto.getUIComponentRuntime()
                        .createMetadata();
                IUIComponentMetadata modePage1 = pzAuto.getUIComponentRuntime()
                        .createMetadata();
                IUIComponentMetadata modePage2 = pzAuto.getUIComponentRuntime()
                        .createMetadata();
                java.util.List<String> ctPropRefs = new ArrayList<String>();
                IUIComponent ctrlComponent = pzAuto.getUIComponent();
                String expressionId = null;
                com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
                tools.putParamValue("skipHTMLEncoding", "true");
                IUIComponentMetadata pxPrivilegeIdentifiers = pzAuto
                        .getUIComponentRuntime().createMetadata();
                if (expressionId != null && expressionId.length() > 0) {
                    modePage2.put("pyExpressionId", expressionId);
                }
                String uid = String
                        .valueOf(((com.pega.pegarules.priv.context.PegaRequestor) tools
                                .getRequestor()).currentTimeUnique());
                String navPage = "pyNavigation" + uid;
                cellPage.put(
                        "automationId",
                        " "
                                + pzCell.getTestIdIfEnabled("202306071442520073292")
                                + " ");
                if (false || (pzAuto.isOffline() && false)) {
                    modePage2.put("nav", navPage);
                }
                modePage2.put("pyName", "InvestmentExtraActions_$CTX$_4");
                String repeatIndx = "";
                String pyTooltip = "";
                modePage2.put("tooltip", pyTooltip);
                modePage2.put("helpertype", "none");
                modePage2.put("styles", "");
                modePage2.put("imgSrc", "styleclass");
                String pyIconStyle = "";
                pyIconStyle = "pi pi-filter-on";
                modePage2.put("image", pyIconStyle);
                modePage2.put("pyActionImagePosition", "right");
                String customStyles = null;
                String pyLabel = "";
                if (pega.getPackageRuntime().canPackage()) {
                    tools.getLocalizedTextForString(".pyButtonLabel",
                            "Advanced Filters\t" + repeatIndx,
                            StreamBuilder.FMT_LITERAL);
                } else {
                    pzAuto.getUIComponentRuntime()
                            .getRuntimeContextTree()
                            .addLocalizedValue("Advanced Filters",
                                    ".pyButtonLabel");
                }
                pyLabel = "Advanced Filters";
                modePage2.put("label", pyLabel);
                String spxUniqueStreamHash10 = getUIActionsMetaData_2();
                if (spxUniqueStreamHash10 != null
                        && !"".equals(spxUniqueStreamHash10)) {
                    pzAuto.getUIComponentRuntime()
                            .getRuntimeContextTree()
                            .addActionString(spxUniqueStreamHash10,
                                    pxUniqueStreamHash + "_10");
                    modePage2.put("pyActionStringID", pxUniqueStreamHash
                            + "_10");
                }
                modePage2
                        .put("actionPath", " data-keyboard='.' data-click='.'");
                tools.putParamValue("skipHTMLEncoding", "false");
                cellPage.addMetadataInArray("pyModes", modePage1);
                cellPage.addMetadataInArray("pyModes", modePage2);
                metadataPage.putMetadata("pyCell", cellPage);
                ctrlComponent
                        .addDependentScripts("pzpega_ui_template_button.js");
                ctrlComponent.beginComponent("pxButton", metadataPage);
                ctrlComponent.setTrackedProperties(ctPropRefs
                        .toArray(new String[] {}));
                tools.putParamValue("isControlEditableOriginal", true);
                ctrlComponent.endComponent();
            } else {
                boolean bDisabled = false;
                boolean bOptimizedMarkup = pzAuto.getUIComponentRuntime()
                        .isHarnessTemplatized() && pzAuto.isOffline();
                String pyFormatValue = "";
                String toolTipVal = "";
                String hrefValue = "#";
                String referenceString = tools.getStepPage().getReference();
                boolean isParameterizedDeclarePage = pega
                        .getDeclarativePageUtils().isParameterizedDPName(
                                referenceString);
                if (isParameterizedDeclarePage) {
                    referenceString = tools.getStepPage().getString(
                            "pzPageNameBase");
                }
                String buttonUID = "name='InvestmentExtraActions_"
                        + referenceString + "_4'";
                String securedPropValue = null;
                tools.appendString("<button "
                        + pzCell.getTestIdIfEnabled("202306071442520073292")
                        + "  data-ctl='Button'  type='button' ");
                if (!"true".equals(tools
                        .getParamValue("pxAvoidUniqueAttribute")))
                    tools.appendString(buttonUID);
                pega_uiengine_pzcontrol.pzAddClientValidation(tools, "", "",
                        "", "");
                {
                    boolean isBehaviorAdded = false;
                    isBehaviorAdded = false;
                    tools.appendString(" data-click='[");
                    if (isBehaviorAdded && true) {
                        tools.appendString(",");
                    }
                    {
                        StringMap keyMap = new HashStringMap();
                        keyMap.putString("pxObjClass", "Rule-Obj-FlowAction");
                        keyMap.putString("pyActionName",
                                "InvestmentAdvanceFilters");
                        String strLAClassName = "";
                        String offlineUsingPage = "";
                        strLAClassName = tools.getStepPage().getString(
                                "pxObjClass");
                        offlineUsingPage = tools.getStepPage().getReference();
                        keyMap.putString("pyClassName", strLAClassName);
                        ParameterPage newParamsPage = new ParameterPage();
                        newParamsPage.putString("pyFlowActionPurpose",
                                "GETSTREAMTYPE");
                        try {
                            tools.doAction(keyMap, tools.getStepPage(),
                                    newParamsPage);
                        } catch (Exception e) {
                            oLog.error(e.getMessage());
                        }
                        String streamType = newParamsPage
                                .getString("StreamType");
                        newParamsPage.putString("pyFlowActionPurpose",
                                "CHECKSECURITY");
                        try {
                            tools.doAction(keyMap, tools.getPrimaryPage(),
                                    newParamsPage);
                        } catch (Exception e) {
                            oLog.error(e.getMessage());
                        }
                        String bHasPrivilege = newParamsPage
                                .getString("CheckSecurityRetVal");
                        if (pega_uiengine_offlinesupport
                                .pzIsForOfflineTemplate()) {
                            try {
                                pzPackageRuntime.packageLocalAction(
                                        "InvestmentAdvanceFilters",
                                        offlineUsingPage, strLAClassName);
                                pzPackageRuntime.packageSection(
                                        "pyOverlayTemplate", offlineUsingPage,
                                        strLAClassName, true);
                            } catch (Exception e1) {
                                oLog.error("Error generating local action package - "
                                        + e1.getMessage());
                            }
                            if (pega_uiengine_offlinesupport
                                    .pzIsForOfflineTemplate()) {
                                try {
                                    pzPackageRuntime.packageSection(
                                            "InvestmentExtraActions",
                                            tools.getStepPage().getReference(),
                                            tools.getStepPage().getString(
                                                    "pxObjClass"));
                                } catch (Exception e) {
                                    oLog.error("Error generating section package - "
                                            + e.getMessage());
                                }
                            }
                        }
                        if (streamType.equals("")) {
                            streamType = "Rule-Obj-FlowAction";
                        }
                        String usingPage = "";
                        if (("").equals(usingPage)) {
                            usingPage = tools.getStepPage().getReference();
                        }
                        if ("true".equals(bHasPrivilege)) {
                            tools.appendString("[\"processAction\", [\"InvestmentAdvanceFilters\",\"overlay\",\":event\",\"\",\""
                                    + streamType
                                    + "\",\"\",\"pzModalTemplate\",\"%7B%22isCustomMobileAnim%22%3A%22false%22%2C%22desktop%22%3A%7B%22reveal%22%3A%7B%22ease%22%3A%22standard%22%2C%22effect%22%3A%22anim-fade-open%22%2C%22speed%22%3A%22default%22%7D%2C%22isCustomDismiss%22%3A%22false%22%7D%7D\",\"true\",\""
                                    + strLAClassName
                                    + "\",\""
                                    + strLAClassName
                                    + "\",\"true\",\"false\",\"\",\"\"]");
                        } else {
                            tools.appendString("[\"processAction\", [\"You are not authorized to perform this Flow or Local action\"]");
                        }
                    }

                    tools.appendString("]");
                    isBehaviorAdded = true;
                    tools.appendString("]' ");
                    isBehaviorAdded = false;
                    tools.appendString(" data-keydown='[");
                    if (isBehaviorAdded && true) {
                        tools.appendString(",");
                    }
                    {
                        StringMap keyMap = new HashStringMap();
                        keyMap.putString("pxObjClass", "Rule-Obj-FlowAction");
                        keyMap.putString("pyActionName",
                                "InvestmentAdvanceFilters");
                        String strLAClassName = "";
                        String offlineUsingPage = "";
                        strLAClassName = tools.getStepPage().getString(
                                "pxObjClass");
                        offlineUsingPage = tools.getStepPage().getReference();
                        keyMap.putString("pyClassName", strLAClassName);
                        ParameterPage newParamsPage = new ParameterPage();
                        newParamsPage.putString("pyFlowActionPurpose",
                                "GETSTREAMTYPE");
                        try {
                            tools.doAction(keyMap, tools.getStepPage(),
                                    newParamsPage);
                        } catch (Exception e) {
                            oLog.error(e.getMessage());
                        }
                        String streamType = newParamsPage
                                .getString("StreamType");
                        newParamsPage.putString("pyFlowActionPurpose",
                                "CHECKSECURITY");
                        try {
                            tools.doAction(keyMap, tools.getPrimaryPage(),
                                    newParamsPage);
                        } catch (Exception e) {
                            oLog.error(e.getMessage());
                        }
                        String bHasPrivilege = newParamsPage
                                .getString("CheckSecurityRetVal");
                        if (pega_uiengine_offlinesupport
                                .pzIsForOfflineTemplate()) {
                            try {
                                pzPackageRuntime.packageLocalAction(
                                        "InvestmentAdvanceFilters",
                                        offlineUsingPage, strLAClassName);
                                pzPackageRuntime.packageSection(
                                        "pyOverlayTemplate", offlineUsingPage,
                                        strLAClassName, true);
                            } catch (Exception e1) {
                                oLog.error("Error generating local action package - "
                                        + e1.getMessage());
                            }
                            if (pega_uiengine_offlinesupport
                                    .pzIsForOfflineTemplate()) {
                                try {
                                    pzPackageRuntime.packageSection(
                                            "InvestmentExtraActions",
                                            tools.getStepPage().getReference(),
                                            tools.getStepPage().getString(
                                                    "pxObjClass"));
                                } catch (Exception e) {
                                    oLog.error("Error generating section package - "
                                            + e.getMessage());
                                }
                            }
                        }
                        if (streamType.equals("")) {
                            streamType = "Rule-Obj-FlowAction";
                        }
                        String usingPage = "";
                        if (("").equals(usingPage)) {
                            usingPage = tools.getStepPage().getReference();
                        }
                        if ("true".equals(bHasPrivilege)) {
                            tools.appendString("[\"processAction\", [\"InvestmentAdvanceFilters\",\"overlay\",\":event\",\"\",\""
                                    + streamType
                                    + "\",\"\",\"pzModalTemplate\",\"%7B%22isCustomMobileAnim%22%3A%22false%22%2C%22desktop%22%3A%7B%22reveal%22%3A%7B%22ease%22%3A%22standard%22%2C%22effect%22%3A%22anim-fade-open%22%2C%22speed%22%3A%22default%22%7D%2C%22isCustomDismiss%22%3A%22false%22%7D%7D\",\"true\",\""
                                    + strLAClassName
                                    + "\",\""
                                    + strLAClassName
                                    + "\",\"true\",\"false\",\"\",\"\"]");
                        } else {
                            tools.appendString("[\"processAction\", [\"You are not authorized to perform this Flow or Local action\"]");
                        }
                    }

                    tools.appendString(",");
                    tools.appendString(",\"enter\"");
                    tools.appendString("]");
                    isBehaviorAdded = true;
                    tools.appendString("]' ");
                }
                String repeatIndx = "";
                tools.appendString("class='pzhc pzbutton");
                tools.appendString("'");
                if (bOptimizedMarkup) {
                    tools.appendString(" data-bindprops='innerHTML,title' ");
                }
                tools.appendString(" >");
                String classProp = "";
                classProp = "pi pi-filter-on";
                boolean hasLineBreaks = false;
                hasLineBreaks = "Advanced Filters"
                        .matches("(.*)<([Bb][Rr])\\s*\\/*\\s*>(.*)");
                if (hasLineBreaks) {
                    tools.appendString("<span class='pzbtn-label'  data-keyboard='.' data-click='.' ");
                }
                if (bOptimizedMarkup && hasLineBreaks) {
                    tools.appendString("  data-bindprops='title,innerHTML' ");
                }
                if (hasLineBreaks) {
                    tools.appendString("  > ");
                }
                tools.appendString("");
                pega_uiengine_harness.pzGenAKey(tools
                        .getLocalizedTextForString(".pyButtonLabel",
                                "Advanced Filters", StreamBuilder.FMT_LITERAL));
                checkForScriptTags_1(tools.getParamValue("pzULabel"));
                if (hasLineBreaks) {
                    tools.appendString("</span>");
                }
                tools.appendString(" <i aria-hidden='true'  data-keyboard='.' data-click='.' class='"
                        + classProp + "'></i>");
                tools.appendString("</button>");
            }

            tools.putParamValue("pega_attributes", "");
            if (pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') {
                tools.appendString("</span>");
            }
            tools.putParamValue("doAutoFormatting", "false");
            tools.putParamValue("isControlEditableOriginal", true);
            if (pegaValidation != null) {
                com.pega.pegarules.priv.factory.StringBufferFactory
                        .release(pegaValidation);
            }
        } catch (Exception e) {

            oLog.error(e.getMessage());

            if (pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'
                    && pzAuto.getUIComponentRuntime().getRuntimeContextTree()
                            .isLiveDesignViewMode()) {

                IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime()
                        .createMetadata();
                IUIComponent ctrlComponent = pzAuto.getUIComponent();
                metadata.put("cellInfo", "");
                metadata.put("msgText", "config issue");
                ctrlComponent
                        .addDependentScripts("pzpega_ui_template_designview.js");
                ctrlComponent.beginComponent("pxDesignViewError", metadata);
                tools.putParamValue("isControlEditableOriginal", true);
                ctrlComponent.endComponent();
            }
        }

    }

    public void checkForScriptTags_1(String ScriptTags) {
        String isEncodingAllowed = tools.getSystemSettings().getDynamic(
                "Pega-UIEngine", "isLinkLabelEncodingAllowed");
        if ("false".equals(isEncodingAllowed)) {
            tools.appendString(StringUtils.crossScriptingFilter(ScriptTags));
        } else {
            if (ScriptTags.toLowerCase().contains("<script>")
                    || ScriptTags.toLowerCase().contains("<<include")
                    || ScriptTags.toLowerCase().contains("<%")) {
                tools.appendString(StringUtils.crossScriptingFilter(ScriptTags));
            } else {
                tools.appendString(StringUtils.filterRichText(ScriptTags));
            }
        }
    }

    public String getUIActionsMetaData_2() {
        StringBuilder actionsStringBuilder = tools.pushStreamBody();
        ((PegaStreamAPI) tools).disableDirectStreaming();

        {
            boolean isBehaviorAdded = false;
            isBehaviorAdded = false;
            tools.appendString(" data-click='[");
            if (isBehaviorAdded && true) {
                tools.appendString(",");
            }
            {
                StringMap keyMap = new HashStringMap();
                keyMap.putString("pxObjClass", "Rule-Obj-FlowAction");
                keyMap.putString("pyActionName", "InvestmentAdvanceFilters");
                String strLAClassName = "";
                String offlineUsingPage = "";
                strLAClassName = tools.getStepPage().getString("pxObjClass");
                offlineUsingPage = tools.getStepPage().getReference();
                keyMap.putString("pyClassName", strLAClassName);
                ParameterPage newParamsPage = new ParameterPage();
                newParamsPage.putString("pyFlowActionPurpose", "GETSTREAMTYPE");
                try {
                    tools.doAction(keyMap, tools.getStepPage(), newParamsPage);
                } catch (Exception e) {
                    oLog.error(e.getMessage());
                }
                String streamType = newParamsPage.getString("StreamType");
                newParamsPage.putString("pyFlowActionPurpose", "CHECKSECURITY");
                try {
                    tools.doAction(keyMap, tools.getPrimaryPage(),
                            newParamsPage);
                } catch (Exception e) {
                    oLog.error(e.getMessage());
                }
                String bHasPrivilege = newParamsPage
                        .getString("CheckSecurityRetVal");
                if (pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
                    try {
                        pzPackageRuntime.packageLocalAction(
                                "InvestmentAdvanceFilters", offlineUsingPage,
                                strLAClassName);
                        pzPackageRuntime.packageSection("pyOverlayTemplate",
                                offlineUsingPage, strLAClassName, true);
                    } catch (Exception e1) {
                        oLog.error("Error generating local action package - "
                                + e1.getMessage());
                    }
                    if (pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
                        try {
                            pzPackageRuntime
                                    .packageSection(
                                            "InvestmentExtraActions",
                                            tools.getStepPage().getReference(),
                                            tools.getStepPage().getString(
                                                    "pxObjClass"));
                        } catch (Exception e) {
                            oLog.error("Error generating section package - "
                                    + e.getMessage());
                        }
                    }
                }
                if (streamType.equals("")) {
                    streamType = "Rule-Obj-FlowAction";
                }
                String usingPage = "";
                if (("").equals(usingPage)) {
                    usingPage = tools.getStepPage().getReference();
                }
                if ("true".equals(bHasPrivilege)) {
                    tools.appendString("[\"processAction\", [\"InvestmentAdvanceFilters\",\"overlay\",\":event\",\"\",\""
                            + streamType
                            + "\",\"\",\"pzModalTemplate\",\"%7B%22isCustomMobileAnim%22%3A%22false%22%2C%22desktop%22%3A%7B%22reveal%22%3A%7B%22ease%22%3A%22standard%22%2C%22effect%22%3A%22anim-fade-open%22%2C%22speed%22%3A%22default%22%7D%2C%22isCustomDismiss%22%3A%22false%22%7D%7D\",\"true\",\""
                            + strLAClassName
                            + "\",\""
                            + strLAClassName
                            + "\",\"true\",\"false\",\"\",\"\"]");
                } else {
                    tools.appendString("[\"processAction\", [\"You are not authorized to perform this Flow or Local action\"]");
                }
            }

            tools.appendString("]");
            isBehaviorAdded = true;
            tools.appendString("]' ");
            isBehaviorAdded = false;
            tools.appendString(" data-keydown='[");
            if (isBehaviorAdded && true) {
                tools.appendString(",");
            }
            {
                StringMap keyMap = new HashStringMap();
                keyMap.putString("pxObjClass", "Rule-Obj-FlowAction");
                keyMap.putString("pyActionName", "InvestmentAdvanceFilters");
                String strLAClassName = "";
                String offlineUsingPage = "";
                strLAClassName = tools.getStepPage().getString("pxObjClass");
                offlineUsingPage = tools.getStepPage().getReference();
                keyMap.putString("pyClassName", strLAClassName);
                ParameterPage newParamsPage = new ParameterPage();
                newParamsPage.putString("pyFlowActionPurpose", "GETSTREAMTYPE");
                try {
                    tools.doAction(keyMap, tools.getStepPage(), newParamsPage);
                } catch (Exception e) {
                    oLog.error(e.getMessage());
                }
                String streamType = newParamsPage.getString("StreamType");
                newParamsPage.putString("pyFlowActionPurpose", "CHECKSECURITY");
                try {
                    tools.doAction(keyMap, tools.getPrimaryPage(),
                            newParamsPage);
                } catch (Exception e) {
                    oLog.error(e.getMessage());
                }
                String bHasPrivilege = newParamsPage
                        .getString("CheckSecurityRetVal");
                if (pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
                    try {
                        pzPackageRuntime.packageLocalAction(
                                "InvestmentAdvanceFilters", offlineUsingPage,
                                strLAClassName);
                        pzPackageRuntime.packageSection("pyOverlayTemplate",
                                offlineUsingPage, strLAClassName, true);
                    } catch (Exception e1) {
                        oLog.error("Error generating local action package - "
                                + e1.getMessage());
                    }
                    if (pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
                        try {
                            pzPackageRuntime
                                    .packageSection(
                                            "InvestmentExtraActions",
                                            tools.getStepPage().getReference(),
                                            tools.getStepPage().getString(
                                                    "pxObjClass"));
                        } catch (Exception e) {
                            oLog.error("Error generating section package - "
                                    + e.getMessage());
                        }
                    }
                }
                if (streamType.equals("")) {
                    streamType = "Rule-Obj-FlowAction";
                }
                String usingPage = "";
                if (("").equals(usingPage)) {
                    usingPage = tools.getStepPage().getReference();
                }
                if ("true".equals(bHasPrivilege)) {
                    tools.appendString("[\"processAction\", [\"InvestmentAdvanceFilters\",\"overlay\",\":event\",\"\",\""
                            + streamType
                            + "\",\"\",\"pzModalTemplate\",\"%7B%22isCustomMobileAnim%22%3A%22false%22%2C%22desktop%22%3A%7B%22reveal%22%3A%7B%22ease%22%3A%22standard%22%2C%22effect%22%3A%22anim-fade-open%22%2C%22speed%22%3A%22default%22%7D%2C%22isCustomDismiss%22%3A%22false%22%7D%7D\",\"true\",\""
                            + strLAClassName
                            + "\",\""
                            + strLAClassName
                            + "\",\"true\",\"false\",\"\",\"\"]");
                } else {
                    tools.appendString("[\"processAction\", [\"You are not authorized to perform this Flow or Local action\"]");
                }
            }

            tools.appendString(",");
            tools.appendString(",\"enter\"");
            tools.appendString("]");
            isBehaviorAdded = true;
            tools.appendString("]' ");
        }
        String returnString = actionsStringBuilder.toString();
        tools.popStreamBody();
        return returnString;
    }

    public void generateClientWhenDiv_2() {
        String clientWhenAttr = "";
        char currentTemplatingStatus = 'Y';
        currentTemplatingStatus = pzAuto.getUIComponentRuntime()
                .getTemplatingUIStatus();
        if (currentTemplatingStatus == 'N')
            tools.appendString("<div ");
        if (currentTemplatingStatus == 'N')
            tools.appendString("id=\"CT\"");
        if (tools.getThread().getName().indexOf("/$WorkProcessing") != -1
                || tools.getThread().getName().indexOf("/$FlowModalProcess") != -1) {
            if (currentTemplatingStatus == 'N') {
                tools.appendString(" thread_name = \""
                        + tools.getThread().getName() + "\"");
            } else {
                String threadName = tools.getThread().getName();
                clientWhenAttr += "thread_name= \"" + threadName + "\" ";
            }
        }
        if (currentTemplatingStatus == 'N')
            tools.appendString(" SWP=\".FlagValueGroup(InvFilters)\"  SHOW_WHEN=\".FlagValueGroup(InvFilters)!=true\"");
        if (pzAuto
                .evaluateWhen(".FlagValueGroup(InvFilters)!=true", null, true)) {
            if (currentTemplatingStatus == 'N')
                tools.appendString(" style=' ");
            else
                clientWhenAttr += "style= '";
        } else {
            if (currentTemplatingStatus == 'N')
                tools.appendString(" style='display:none; ");
            else
                clientWhenAttr += "style='display:none;  ";
        }
        if (currentTemplatingStatus == 'Y')
            clientWhenAttr += "'";
        if (currentTemplatingStatus == 'Y')
            tools.putParamValue("clientWhenAttr", clientWhenAttr);
        try {
            if (tools.getParamValue("AJAXTrackID") != null
                    && !tools.getParamValue("AJAXTrackID").equals("")) {
                com.pega.pegarules.priv.runtime.IStreamChangeTracker changeTracker = pzAuto
                        .getChangeTracker(tools.getParamValue("AJAXTrackID"));
                changeTracker.trackValueChanges(tools.getStepPage()
                        .getReference() + ".FlagValueGroup(InvFilters)", -1);
            }
        } catch (Exception e) {
        }
    }

    public void pxButton_1() {
        boolean isDisplayTextWithParam = false;
        String displayTextParamName = "";
        String displayTextParamValue = "";

        StringBuffer pegaValidation = null;
        boolean addedValidation = false;
        try {

            if (pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') {
                tools.appendString("<span ");
                tools.appendString(">");
            }
            if (pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y') {
                IUIComponentMetadata metadataPage = pzAuto
                        .getUIComponentRuntime().createMetadata();
                IUIComponentMetadata cellPage = pzAuto.getUIComponentRuntime()
                        .createMetadata();
                IUIComponentMetadata modePage1 = pzAuto.getUIComponentRuntime()
                        .createMetadata();
                IUIComponentMetadata modePage2 = pzAuto.getUIComponentRuntime()
                        .createMetadata();
                java.util.List<String> ctPropRefs = new ArrayList<String>();
                IUIComponent ctrlComponent = pzAuto.getUIComponent();
                String expressionId = null;
                com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
                tools.putParamValue("skipHTMLEncoding", "true");
                IUIComponentMetadata pxPrivilegeIdentifiers = pzAuto
                        .getUIComponentRuntime().createMetadata();
                if (expressionId != null && expressionId.length() > 0) {
                    modePage2.put("pyExpressionId", expressionId);
                }
                String uid = String
                        .valueOf(((com.pega.pegarules.priv.context.PegaRequestor) tools
                                .getRequestor()).currentTimeUnique());
                String navPage = "pyNavigation" + uid;
                cellPage.put(
                        "automationId",
                        " "
                                + pzCell.getTestIdIfEnabled("202306071442520073292")
                                + " ");
                if (false || (pzAuto.isOffline() && false)) {
                    modePage2.put("nav", navPage);
                }
                modePage2.put("pyName", "InvestmentExtraActions_$CTX$_3");
                String repeatIndx = "";
                String pyTooltip = "";
                modePage2.put("tooltip", pyTooltip);
                modePage2.put("helpertype", "none");
                modePage2.put("styles", "");
                modePage2.put("imgSrc", "styleclass");
                String pyIconStyle = "";
                pyIconStyle = "pi pi-filter";
                modePage2.put("image", pyIconStyle);
                modePage2.put("pyActionImagePosition", "right");
                String customStyles = null;
                String pyLabel = "";
                if (pega.getPackageRuntime().canPackage()) {
                    tools.getLocalizedTextForString(".pyButtonLabel",
                            "Advanced Filters\t" + repeatIndx,
                            StreamBuilder.FMT_LITERAL);
                } else {
                    pzAuto.getUIComponentRuntime()
                            .getRuntimeContextTree()
                            .addLocalizedValue("Advanced Filters",
                                    ".pyButtonLabel");
                }
                pyLabel = "Advanced Filters";
                modePage2.put("label", pyLabel);
                String spxUniqueStreamHash5 = getUIActionsMetaData_2();
                if (spxUniqueStreamHash5 != null
                        && !"".equals(spxUniqueStreamHash5)) {
                    pzAuto.getUIComponentRuntime()
                            .getRuntimeContextTree()
                            .addActionString(spxUniqueStreamHash5,
                                    pxUniqueStreamHash + "_5");
                    modePage2
                            .put("pyActionStringID", pxUniqueStreamHash + "_5");
                }
                modePage2
                        .put("actionPath", " data-keyboard='.' data-click='.'");
                tools.putParamValue("skipHTMLEncoding", "false");
                cellPage.addMetadataInArray("pyModes", modePage1);
                cellPage.addMetadataInArray("pyModes", modePage2);
                metadataPage.putMetadata("pyCell", cellPage);
                ctrlComponent
                        .addDependentScripts("pzpega_ui_template_button.js");
                ctrlComponent.beginComponent("pxButton", metadataPage);
                ctrlComponent.setTrackedProperties(ctPropRefs
                        .toArray(new String[] {}));
                tools.putParamValue("isControlEditableOriginal", true);
                ctrlComponent.endComponent();
            } else {
                boolean bDisabled = false;
                boolean bOptimizedMarkup = pzAuto.getUIComponentRuntime()
                        .isHarnessTemplatized() && pzAuto.isOffline();
                String pyFormatValue = "";
                String toolTipVal = "";
                String hrefValue = "#";
                String referenceString = tools.getStepPage().getReference();
                boolean isParameterizedDeclarePage = pega
                        .getDeclarativePageUtils().isParameterizedDPName(
                                referenceString);
                if (isParameterizedDeclarePage) {
                    referenceString = tools.getStepPage().getString(
                            "pzPageNameBase");
                }
                String buttonUID = "name='InvestmentExtraActions_"
                        + referenceString + "_3'";
                String securedPropValue = null;
                tools.appendString("<button "
                        + pzCell.getTestIdIfEnabled("202306071442520073292")
                        + "  data-ctl='Button'  type='button' ");
                if (!"true".equals(tools
                        .getParamValue("pxAvoidUniqueAttribute")))
                    tools.appendString(buttonUID);
                pega_uiengine_pzcontrol.pzAddClientValidation(tools, "", "",
                        "", "");
                {
                    boolean isBehaviorAdded = false;
                    isBehaviorAdded = false;
                    tools.appendString(" data-click='[");
                    if (isBehaviorAdded && true) {
                        tools.appendString(",");
                    }
                    {
                        StringMap keyMap = new HashStringMap();
                        keyMap.putString("pxObjClass", "Rule-Obj-FlowAction");
                        keyMap.putString("pyActionName",
                                "InvestmentAdvanceFilters");
                        String strLAClassName = "";
                        String offlineUsingPage = "";
                        strLAClassName = tools.getStepPage().getString(
                                "pxObjClass");
                        offlineUsingPage = tools.getStepPage().getReference();
                        keyMap.putString("pyClassName", strLAClassName);
                        ParameterPage newParamsPage = new ParameterPage();
                        newParamsPage.putString("pyFlowActionPurpose",
                                "GETSTREAMTYPE");
                        try {
                            tools.doAction(keyMap, tools.getStepPage(),
                                    newParamsPage);
                        } catch (Exception e) {
                            oLog.error(e.getMessage());
                        }
                        String streamType = newParamsPage
                                .getString("StreamType");
                        newParamsPage.putString("pyFlowActionPurpose",
                                "CHECKSECURITY");
                        try {
                            tools.doAction(keyMap, tools.getPrimaryPage(),
                                    newParamsPage);
                        } catch (Exception e) {
                            oLog.error(e.getMessage());
                        }
                        String bHasPrivilege = newParamsPage
                                .getString("CheckSecurityRetVal");
                        if (pega_uiengine_offlinesupport
                                .pzIsForOfflineTemplate()) {
                            try {
                                pzPackageRuntime.packageLocalAction(
                                        "InvestmentAdvanceFilters",
                                        offlineUsingPage, strLAClassName);
                                pzPackageRuntime.packageSection(
                                        "pyOverlayTemplate", offlineUsingPage,
                                        strLAClassName, true);
                            } catch (Exception e1) {
                                oLog.error("Error generating local action package - "
                                        + e1.getMessage());
                            }
                            if (pega_uiengine_offlinesupport
                                    .pzIsForOfflineTemplate()) {
                                try {
                                    pzPackageRuntime.packageSection(
                                            "InvestmentExtraActions",
                                            tools.getStepPage().getReference(),
                                            tools.getStepPage().getString(
                                                    "pxObjClass"));
                                } catch (Exception e) {
                                    oLog.error("Error generating section package - "
                                            + e.getMessage());
                                }
                            }
                        }
                        if (streamType.equals("")) {
                            streamType = "Rule-Obj-FlowAction";
                        }
                        String usingPage = "";
                        if (("").equals(usingPage)) {
                            usingPage = tools.getStepPage().getReference();
                        }
                        if ("true".equals(bHasPrivilege)) {
                            tools.appendString("[\"processAction\", [\"InvestmentAdvanceFilters\",\"overlay\",\":event\",\"\",\""
                                    + streamType
                                    + "\",\"\",\"pzModalTemplate\",\"%7B%22isCustomMobileAnim%22%3A%22false%22%2C%22desktop%22%3A%7B%22reveal%22%3A%7B%22ease%22%3A%22standard%22%2C%22effect%22%3A%22anim-fade-open%22%2C%22speed%22%3A%22default%22%7D%2C%22isCustomDismiss%22%3A%22false%22%7D%7D\",\"true\",\""
                                    + strLAClassName
                                    + "\",\""
                                    + strLAClassName
                                    + "\",\"true\",\"false\",\"\",\"\"]");
                        } else {
                            tools.appendString("[\"processAction\", [\"You are not authorized to perform this Flow or Local action\"]");
                        }
                    }

                    tools.appendString("]");
                    isBehaviorAdded = true;
                    tools.appendString("]' ");
                    isBehaviorAdded = false;
                    tools.appendString(" data-keydown='[");
                    if (isBehaviorAdded && true) {
                        tools.appendString(",");
                    }
                    {
                        StringMap keyMap = new HashStringMap();
                        keyMap.putString("pxObjClass", "Rule-Obj-FlowAction");
                        keyMap.putString("pyActionName",
                                "InvestmentAdvanceFilters");
                        String strLAClassName = "";
                        String offlineUsingPage = "";
                        strLAClassName = tools.getStepPage().getString(
                                "pxObjClass");
                        offlineUsingPage = tools.getStepPage().getReference();
                        keyMap.putString("pyClassName", strLAClassName);
                        ParameterPage newParamsPage = new ParameterPage();
                        newParamsPage.putString("pyFlowActionPurpose",
                                "GETSTREAMTYPE");
                        try {
                            tools.doAction(keyMap, tools.getStepPage(),
                                    newParamsPage);
                        } catch (Exception e) {
                            oLog.error(e.getMessage());
                        }
                        String streamType = newParamsPage
                                .getString("StreamType");
                        newParamsPage.putString("pyFlowActionPurpose",
                                "CHECKSECURITY");
                        try {
                            tools.doAction(keyMap, tools.getPrimaryPage(),
                                    newParamsPage);
                        } catch (Exception e) {
                            oLog.error(e.getMessage());
                        }
                        String bHasPrivilege = newParamsPage
                                .getString("CheckSecurityRetVal");
                        if (pega_uiengine_offlinesupport
                                .pzIsForOfflineTemplate()) {
                            try {
                                pzPackageRuntime.packageLocalAction(
                                        "InvestmentAdvanceFilters",
                                        offlineUsingPage, strLAClassName);
                                pzPackageRuntime.packageSection(
                                        "pyOverlayTemplate", offlineUsingPage,
                                        strLAClassName, true);
                            } catch (Exception e1) {
                                oLog.error("Error generating local action package - "
                                        + e1.getMessage());
                            }
                            if (pega_uiengine_offlinesupport
                                    .pzIsForOfflineTemplate()) {
                                try {
                                    pzPackageRuntime.packageSection(
                                            "InvestmentExtraActions",
                                            tools.getStepPage().getReference(),
                                            tools.getStepPage().getString(
                                                    "pxObjClass"));
                                } catch (Exception e) {
                                    oLog.error("Error generating section package - "
                                            + e.getMessage());
                                }
                            }
                        }
                        if (streamType.equals("")) {
                            streamType = "Rule-Obj-FlowAction";
                        }
                        String usingPage = "";
                        if (("").equals(usingPage)) {
                            usingPage = tools.getStepPage().getReference();
                        }
                        if ("true".equals(bHasPrivilege)) {
                            tools.appendString("[\"processAction\", [\"InvestmentAdvanceFilters\",\"overlay\",\":event\",\"\",\""
                                    + streamType
                                    + "\",\"\",\"pzModalTemplate\",\"%7B%22isCustomMobileAnim%22%3A%22false%22%2C%22desktop%22%3A%7B%22reveal%22%3A%7B%22ease%22%3A%22standard%22%2C%22effect%22%3A%22anim-fade-open%22%2C%22speed%22%3A%22default%22%7D%2C%22isCustomDismiss%22%3A%22false%22%7D%7D\",\"true\",\""
                                    + strLAClassName
                                    + "\",\""
                                    + strLAClassName
                                    + "\",\"true\",\"false\",\"\",\"\"]");
                        } else {
                            tools.appendString("[\"processAction\", [\"You are not authorized to perform this Flow or Local action\"]");
                        }
                    }

                    tools.appendString(",");
                    tools.appendString(",\"enter\"");
                    tools.appendString("]");
                    isBehaviorAdded = true;
                    tools.appendString("]' ");
                }
                String repeatIndx = "";
                tools.appendString("class='pzhc pzbutton");
                tools.appendString("'");
                if (bOptimizedMarkup) {
                    tools.appendString(" data-bindprops='innerHTML,title' ");
                }
                tools.appendString(" >");
                String classProp = "";
                classProp = "pi pi-filter";
                boolean hasLineBreaks = false;
                hasLineBreaks = "Advanced Filters"
                        .matches("(.*)<([Bb][Rr])\\s*\\/*\\s*>(.*)");
                if (hasLineBreaks) {
                    tools.appendString("<span class='pzbtn-label'  data-keyboard='.' data-click='.' ");
                }
                if (bOptimizedMarkup && hasLineBreaks) {
                    tools.appendString("  data-bindprops='title,innerHTML' ");
                }
                if (hasLineBreaks) {
                    tools.appendString("  > ");
                }
                tools.appendString("");
                pega_uiengine_harness.pzGenAKey(tools
                        .getLocalizedTextForString(".pyButtonLabel",
                                "Advanced Filters", StreamBuilder.FMT_LITERAL));
                checkForScriptTags_1(tools.getParamValue("pzULabel"));
                if (hasLineBreaks) {
                    tools.appendString("</span>");
                }
                tools.appendString(" <i aria-hidden='true'  data-keyboard='.' data-click='.' class='"
                        + classProp + "'></i>");
                tools.appendString("</button>");
            }

            tools.putParamValue("pega_attributes", "");
            if (pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') {
                tools.appendString("</span>");
            }
            tools.putParamValue("doAutoFormatting", "false");
            tools.putParamValue("isControlEditableOriginal", true);
            if (pegaValidation != null) {
                com.pega.pegarules.priv.factory.StringBufferFactory
                        .release(pegaValidation);
            }
        } catch (Exception e) {

            oLog.error(e.getMessage());

            if (pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'
                    && pzAuto.getUIComponentRuntime().getRuntimeContextTree()
                            .isLiveDesignViewMode()) {

                IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime()
                        .createMetadata();
                IUIComponent ctrlComponent = pzAuto.getUIComponent();
                metadata.put("cellInfo", "");
                metadata.put("msgText", "config issue");
                ctrlComponent
                        .addDependentScripts("pzpega_ui_template_designview.js");
                ctrlComponent.beginComponent("pxDesignViewError", metadata);
                tools.putParamValue("isControlEditableOriginal", true);
                ctrlComponent.endComponent();
            }
        }

    }

    public int simpleLayoutCell_1(int index) {
        IUIComponent uiComp = null;
        String labelName = "";
        String ariahiddenString = "";
        String baseRef = "";
        generateClientWhenDiv_2();
        tools.appendString("' "
                + pega.getUIEngine().getFVInspectorUtils()
                        .startCollectingFieldValueData()
                + pzCell.getInspectorDataDynamic(
                        "pxButton",
                        ".pyTemplateInputBox",
                        "RH_2.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)")
                + " class='content-item content-field item-"
                + Integer.toString(index)
                + " remove-top-spacing remove-left-spacing   "
                + pzSection.getCustomStyle(false, "", "dataValueRead",
                        "dataValueWrite")
                + " flex flex-row '  STRING_TYPE='field' RESERVE_SPACE='false'>");
        pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
        tools.putSaveValue("parentLayouttype", "SIMPLELAYOUT");
        pxButton_1();
        tools.appendString(pega.getUIEngine().getFVInspectorUtils()
                .stopCollectingFieldValueData()
                + "</div>");
        index++;
        return index;
    }

    public int simpleLayoutTemplateCell_1(int index) {
        IUIComponent uiComp = null;
        String labelName = "";
        String expressionId = null;
        boolean isLabelJSP = false;
        String reqExpressionId = null;
        String disExpressionId = null;
        com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
        expressionId = pxUniqueStreamHash + "_8";
        expression = pzAuto
                .getUIComponentRuntime()
                .getExpressionEvaluator()
                .addExpression("showWhen", ".FlagValueGroup(InvFilters)!=true",
                        expressionId);
        if (expression != null) {
            expressionId = expression.getId();
        }
        String pyCustomRequireFormat = "";
        pyCustomRequireFormat = tools.getLocalizedTextForString("pyCaption",
                "pyRequired");
        String dataFieldValueMeta = pega.getUIEngine().getFVInspectorUtils()
                .startCollectingFieldValueData();
        String baseRef = "";
        boolean pyDLCellVisibility = false;
        IUIComponent cc_dlCell = pzAuto.getUIComponent();
        IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime()
                .createMetadata();
        IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime()
                .createMetadata();
        pgCells.put("partialClass",
                "remove-top-spacing remove-left-spacing flex flex-row");
        pgCells.put(
                "automationId",
                new StringBuilder(" ")
                        .append(pzCell
                                .getTestIdIfEnabled("202306071442520073292-Label"))
                        .append(" ").toString().replace("data-test-id=", "")
                        .trim());
        pgCells.put("format", "pxButton");
        pgCells.put("forLabel", ".pyTemplateInputBox");
        pgCells.put("pyAutoHTML", "true");
        pgCells.put("spanClass", "iconRequired standard_iconRequired");
        pgCells.put("cstmreqfor", pyCustomRequireFormat);
        if (!StringUtils.isBlank(expressionId))
            pgCells.put("pyExpressionId", expressionId);
        if (!"".equals(baseRef))
            pgCells.put("pyBaseRef", String.valueOf(baseRef));
        if (!"".equals(dataFieldValueMeta))
            pgCells.put("startFV", dataFieldValueMeta);
        pgCells.put("labelJSP", String.valueOf(isLabelJSP));
        pgCells.put("pyPreventXSSInLabel", false);
        pg_dlCellMeta.putMetadata("pyCell", pgCells);
        boolean isExpression = false;
        boolean isOffline = false;
        cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
        String inspectorData = pzCell
                .getInspectorDataDynamic(
                        "pxButton",
                        ".pyTemplateInputBox",
                        "RH_2.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
        if (!inspectorData.isEmpty()) {
            pgCells.put("liveUI", inspectorData);
        }
        pxButton_1();
        labelName = "";
        if (!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
            pzAuto.getUIComponentRuntime().getRuntimeContextTree()
                    .addLocalizedValue(labelName, "pyCaption");
        } else {
            StringUtils.crossScriptingFilter(tools.getLocalizedTextForString(
                    "pyCaption", labelName));
        }
        pgCells.put("pyLabelValue", labelName);
        String uiFieldValueMeta = pega.getUIEngine().getFVInspectorUtils()
                .stopCollectingFieldValueData();
        if (!"".equals(uiFieldValueMeta)) {
            pgCells.put("stopFV", uiFieldValueMeta);
        }
        cc_dlCell.endComponent();
        index++;
        return index;
    }

    public int simpleLayoutCell_2(int index) {
        IUIComponent uiComp = null;
        String labelName = "";
        String ariahiddenString = "";
        String baseRef = "";
        generateClientWhenDiv_3();
        tools.appendString("' "
                + pega.getUIEngine().getFVInspectorUtils()
                        .startCollectingFieldValueData()
                + pzCell.getInspectorDataDynamic(
                        "pxButton",
                        ".pyTemplateInputBox",
                        "RH_2.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2)")
                + " class='content-item content-field item-"
                + Integer.toString(index)
                + "    "
                + pzSection.getCustomStyle(false, "", "padding-t-2x",
                        "padding-t-2x")
                + " "
                + pzSection.getCustomStyle(false, "", "dataValueRead",
                        "dataValueWrite")
                + " flex flex-row '  STRING_TYPE='field' RESERVE_SPACE='false'>");
        pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
        tools.putSaveValue("parentLayouttype", "SIMPLELAYOUT");
        pxButton_2();
        tools.appendString(pega.getUIEngine().getFVInspectorUtils()
                .stopCollectingFieldValueData()
                + "</div>");
        index++;
        return index;
    }

    public int simpleLayoutTemplateCell_2(int index) {
        IUIComponent uiComp = null;
        String labelName = "";
        String expressionId = null;
        boolean isLabelJSP = false;
        String reqExpressionId = null;
        String disExpressionId = null;
        com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
        expressionId = pxUniqueStreamHash + "_13";
        expression = pzAuto
                .getUIComponentRuntime()
                .getExpressionEvaluator()
                .addExpression("showWhen",
                        ".FlagValueGroup(InvFilters) = true", expressionId);
        if (expression != null) {
            expressionId = expression.getId();
        }
        String pyCustomRequireFormat = "";
        pyCustomRequireFormat = tools.getLocalizedTextForString("pyCaption",
                "pyRequired");
        String dataFieldValueMeta = pega.getUIEngine().getFVInspectorUtils()
                .startCollectingFieldValueData();
        String baseRef = "";
        boolean pyDLCellVisibility = false;
        IUIComponent cc_dlCell = pzAuto.getUIComponent();
        IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime()
                .createMetadata();
        IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime()
                .createMetadata();
        pgCells.put("partialClass", "flex flex-row");
        pgCells.put(
                "automationId",
                new StringBuilder(" ")
                        .append(pzCell
                                .getTestIdIfEnabled("202306071442520073292-Label"))
                        .append(" ").toString().replace("data-test-id=", "")
                        .trim());
        pgCells.put("format", "pxButton");
        pgCells.put("forLabel", ".pyTemplateInputBox");
        pgCells.put("pyAutoHTML", "true");
        pgCells.put("spanClass", "iconRequired standard_iconRequired");
        pgCells.put("customROStyles", "padding-t-2x");
        pgCells.put("customRWStyles", "padding-t-2x");
        pgCells.put("cstmreqfor", pyCustomRequireFormat);
        if (!StringUtils.isBlank(expressionId))
            pgCells.put("pyExpressionId", expressionId);
        if (!"".equals(baseRef))
            pgCells.put("pyBaseRef", String.valueOf(baseRef));
        if (!"".equals(dataFieldValueMeta))
            pgCells.put("startFV", dataFieldValueMeta);
        pgCells.put("labelJSP", String.valueOf(isLabelJSP));
        pgCells.put("pyPreventXSSInLabel", false);
        pg_dlCellMeta.putMetadata("pyCell", pgCells);
        boolean isExpression = false;
        boolean isOffline = false;
        cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
        String inspectorData = pzCell
                .getInspectorDataDynamic(
                        "pxButton",
                        ".pyTemplateInputBox",
                        "RH_2.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2)");
        if (!inspectorData.isEmpty()) {
            pgCells.put("liveUI", inspectorData);
        }
        pxButton_2();
        labelName = "";
        if (!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
            pzAuto.getUIComponentRuntime().getRuntimeContextTree()
                    .addLocalizedValue(labelName, "pyCaption");
        } else {
            StringUtils.crossScriptingFilter(tools.getLocalizedTextForString(
                    "pyCaption", labelName));
        }
        pgCells.put("pyLabelValue", labelName);
        String uiFieldValueMeta = pega.getUIEngine().getFVInspectorUtils()
                .stopCollectingFieldValueData();
        if (!"".equals(uiFieldValueMeta)) {
            pgCells.put("stopFV", uiFieldValueMeta);
        }
        cc_dlCell.endComponent();
        index++;
        return index;
    }

    public int simpleLayoutCell_5(int index) {
        IUIComponent uiComp = null;
        String labelName = "";
        String ariahiddenString = "";
        String baseRef = "";
        generateClientWhenDiv_3();
        tools.appendString("'  class='content-item content-layout item-"
                + Integer.toString(index)
                + "   flex flex-row '  STRING_TYPE='layout' RESERVE_SPACE='false'>");
        pzLayout_2();
        tools.putSaveValue("ContainerID", "");
        tools.appendString("</div>");
        index++;
        return index;
    }

    public int simpleLayoutTemplateCell_5(int index) {
        IUIComponent uiComp = null;
        String labelName = "";
        String expressionId = null;
        boolean isLabelJSP = false;
        String reqExpressionId = null;
        String disExpressionId = null;
        com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
        expressionId = pxUniqueStreamHash + "_27";
        expression = pzAuto
                .getUIComponentRuntime()
                .getExpressionEvaluator()
                .addExpression("showWhen",
                        ".FlagValueGroup(InvFilters) = true", expressionId);
        if (expression != null) {
            expressionId = expression.getId();
        }
        String pyCustomRequireFormat = "";
        pyCustomRequireFormat = tools.getLocalizedTextForString("pyCaption",
                "pyRequired");
        String baseRef = "";
        boolean pyDLCellVisibility = false;
        IUIComponent cc_dlCell = pzAuto.getUIComponent();
        IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime()
                .createMetadata();
        IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime()
                .createMetadata();
        pgCells.put("pyType", "layout");
        pgCells.put("RWActive", "false");
        pgCells.put("partialClass", "flex flex-row");
        pgCells.put("spanClass", "iconRequired standard_iconRequired");
        pgCells.put("cstmreqfor", pyCustomRequireFormat);
        if (!StringUtils.isBlank(expressionId))
            pgCells.put("pyExpressionId", expressionId);
        if (!"".equals(baseRef))
            pgCells.put("pyBaseRef", String.valueOf(baseRef));
        pgCells.put("labelJSP", String.valueOf(isLabelJSP));
        pgCells.put("pyPreventXSSInLabel", false);
        pg_dlCellMeta.putMetadata("pyCell", pgCells);
        boolean isExpression = false;
        boolean isOffline = false;
        cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
        pzLayout_2();
        tools.putSaveValue("ContainerID", "");
        labelName = "";
        if (!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
            pzAuto.getUIComponentRuntime().getRuntimeContextTree()
                    .addLocalizedValue(labelName, "pyCaption");
        } else {
            StringUtils.crossScriptingFilter(tools.getLocalizedTextForString(
                    "pyCaption", labelName));
        }
        pgCells.put("pyLabelValue", labelName);
        cc_dlCell.endComponent();
        index++;
        return index;
    }

    public int simpleLayoutCell_10(int index) {
        IUIComponent uiComp = null;
        String labelName = "";
        String ariahiddenString = "";
        String baseRef = "";
        generateClientWhenDiv_1();
        tools.appendString("'  class='content-item content-layout item-"
                + Integer.toString(index)
                + " remove-bottom-spacing remove-right-spacing   flex flex-row  align-end'  STRING_TYPE='layout' RESERVE_SPACE='false'>");
        pzLayout_5();
        tools.putSaveValue("ContainerID", "");
        tools.appendString("</div>");
        index++;
        return index;
    }

    public int simpleLayoutTemplateCell_10(int index) {
        IUIComponent uiComp = null;
        String labelName = "";
        String expressionId = null;
        boolean isLabelJSP = false;
        String reqExpressionId = null;
        String disExpressionId = null;
        com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
        if (expression != null) {
            expressionId = expression.getId();
        }
        String pyCustomRequireFormat = "";
        pyCustomRequireFormat = tools.getLocalizedTextForString("pyCaption",
                "pyRequired");
        String baseRef = "";
        boolean pyDLCellVisibility = false;
        IUIComponent cc_dlCell = pzAuto.getUIComponent();
        IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime()
                .createMetadata();
        IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime()
                .createMetadata();
        pgCells.put("pyType", "layout");
        pgCells.put("RWActive", "false");
        pgCells.put("partialClass",
                "remove-bottom-spacing remove-right-spacing align-end flex flex-row");
        pgCells.put("spanClass", "iconRequired standard_iconRequired");
        pgCells.put("cstmreqfor", pyCustomRequireFormat);
        if (!StringUtils.isBlank(expressionId))
            pgCells.put("pyExpressionId", expressionId);
        if (!"".equals(baseRef))
            pgCells.put("pyBaseRef", String.valueOf(baseRef));
        pgCells.put("labelJSP", String.valueOf(isLabelJSP));
        pgCells.put("pyPreventXSSInLabel", false);
        pg_dlCellMeta.putMetadata("pyCell", pgCells);
        boolean isExpression = false;
        boolean isOffline = false;
        cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
        pzLayout_5();
        tools.putSaveValue("ContainerID", "");
        labelName = "";
        if (!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
            pzAuto.getUIComponentRuntime().getRuntimeContextTree()
                    .addLocalizedValue(labelName, "pyCaption");
        } else {
            StringUtils.crossScriptingFilter(tools.getLocalizedTextForString(
                    "pyCaption", labelName));
        }
        pgCells.put("pyLabelValue", labelName);
        cc_dlCell.endComponent();
        index++;
        return index;
    }

    public void pzSetExpandParam_2() {
        pzSection.getLayout().setExpandParam(
                "SubSectionInvestmentExtraActionsBB", "", false);
    }

    public void simpleLayout_5() {
        char parentTemplatingStatus = pzAuto.getUIComponentRuntime()
                .getTemplatingUIStatus();
        char currentTemplatingStatus = 'Y';
        if (!tools.getParamValue("UITemplatingStatus").equals("N")) {
            currentTemplatingStatus = pzAuto.getUIComponentRuntime()
                    .setTemplatingUIStatus('Y');
        } else {
            currentTemplatingStatus = pzAuto.getUIComponentRuntime()
                    .setTemplatingUIStatus('N');
        }
        String spxUniqueStreamHash3 = "";
        if (currentTemplatingStatus != 'N') {
            spxUniqueStreamHash3 = getUIActionsMetaData_1();
            if (spxUniqueStreamHash3 != null
                    && !"".equals(spxUniqueStreamHash3)) {
                pzAuto.getUIComponentRuntime()
                        .getRuntimeContextTree()
                        .addActionString(spxUniqueStreamHash3,
                                pxUniqueStreamHash + "_3");
            }
        }
        String refreshAttributes = "";
        String strMethodName = "";
        IUIComponent cc_dl = null;
        boolean bIsIe = (pzAuto.getBrowserUtils().isIE());
        String bIsWrapperAdded = tools.getParamValue("bIsWrapperAdded");
        String bIsGridLayout = tools.getParamValue("bIsGridLayout");
        cc_dl = pzAuto.getUIComponent();
        IUIComponentMetadata pg_dlmeta = pzAuto.getUIComponentRuntime()
                .createMetadata();
        pg_dlmeta.put("automationId",
                " " + pzCell.getTestIdIfEnabled("202310250839170492391") + " ");
        String subscriptionID = null;
        if (currentTemplatingStatus != 'Y') {
            if (bIsIe && "true".equals(bIsGridLayout)
                    && !"true".equals(bIsWrapperAdded)) {
                tools.appendString("<div class='flex-grid-table-wrapper'><div class='flex-grid-tablecell-wrapper'>");
                tools.putParamValue("bIsWrapperAdded", "true");
            }
            tools.appendString("<div bSimpleLayout='true' ");
            if (((PegaAPI) tools).getUIEngine().getPushServiceUtils()
                    .isPushEnabled()
                    && subscriptionID != null) {
                tools.appendString(" data-subscription-id='" + subscriptionID
                        + "' ");
            }
            tools.appendString(""
                    + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'RH_2.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)'}")
                    + " class='"
                    + "flex  content  layout-content-inline content-inline "
                    + "'  ");
            if (!tools.getParamValue("pyPegaDesignMode").equals("true")) {
                tools.appendString(" ");
            }
            tools.appendString(" " + refreshAttributes + ">");
        } else {
            String expressionId = null;
            com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
            if (!tools.getParamValue("pyPegaDesignMode").equals("true")
                    && spxUniqueStreamHash3 != null
                    && !"".equals(spxUniqueStreamHash3)) {
                pg_dlmeta.put("pyActionStringID", pxUniqueStreamHash + "_3");
            }
            if (!StringUtils.isBlank(expressionId)) {
                pg_dlmeta.put("pyExpressionId", expressionId);
            }
            if (!"".equals(strMethodName))
                pg_dlmeta.put("methodnm", strMethodName);
            pg_dlmeta.put("format", "inline");
            String inspectorData = new StringBuilder("\"")
                    .append(""
                            + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'RH_2.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)'}")
                            + "").append("\"").toString();
            if (!inspectorData.equals("\"\"")) {
                pg_dlmeta.put("liveUI", inspectorData);
            }
            pg_dlmeta.put("isDLChild", "true");
            pg_dlmeta.put("clear", "false");
            pg_dlmeta.put("lMode", "SimpleDiv");
            pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
            cc_dl.beginComponent("DynamicLayout", pg_dlmeta);
        }
        int index = 1;
        if (currentTemplatingStatus != 'Y') {
            index = simpleLayoutCell_1(index);
        } else {
            index = simpleLayoutTemplateCell_1(index);
        }
        if (currentTemplatingStatus != 'Y') {
            index = simpleLayoutCell_2(index);
        } else {
            index = simpleLayoutTemplateCell_2(index);
        }
        if (currentTemplatingStatus != 'Y') {
            index = simpleLayoutCell_5(index);
        } else {
            index = simpleLayoutTemplateCell_5(index);
        }
        if (currentTemplatingStatus != 'Y') {
            index = simpleLayoutCell_10(index);
        } else {
            index = simpleLayoutTemplateCell_10(index);
        }
        if (currentTemplatingStatus != 'Y') {
            tools.appendString("</div>");
            if (bIsIe && "true".equals(bIsGridLayout)
                    && !"true".equals(bIsWrapperAdded)) {
                tools.appendString("</div></div>");
                tools.putParamValue("bIsWrapperAdded", "false");
            }
        } else {
            cc_dl.endComponent();
        }
        pzAuto.getUIComponentRuntime().resetTemplatingUIStatus(
                parentTemplatingStatus);
    }

    public void pzLayoutContainer_5() {
        IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime()
                .createMetadata();
        String expressionId = null;
        com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
        String expressionId_BV = null;
        com.pega.pegarules.priv.runtime.ui.IExpression expression_BV = null;
        if (!StringUtils.isBlank(expressionId_BV)) {
            metadataPage.put("expressionId_BV", expressionId_BV);
        }
        String paramName = "EXPANDEDSubSectionInvestmentExtraActionsBB";
        String inspectorLayoutData = pzAuto
                .getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'RH_2.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)'}");
        if (!inspectorLayoutData.isEmpty()) {
            metadataPage.put("liveUI", inspectorLayoutData);
        }
        String pyPrefix = null;
        IUIComponent containerComponent = pzAuto.getUIComponent();
        metadataPage.put("dlChild", "true");
        metadataPage.put("lMode", "SimpleDiv");
        containerComponent.beginComponent("pxLayoutContainer", metadataPage);
        pzLayoutBody_5();
        containerComponent.endComponent();
    }

    public void pzLayout_6() {
        char currentTemplatingStatus = pzAuto.getUIComponentRuntime()
                .setTemplatingUIStatus('Y');
        if (currentTemplatingStatus == 'Y') {
            pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
        }
        pzSetExpandParam_2();
        tools.putParamValue("RWClasses", "");
        if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
            pzLayoutBodyWrapper_6();
        }
        if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
            tools.putParamValue("pyInlineStyleSec", "");
            pzLayoutContainer_5();
            tools.putParamValue("pyInlineStyleSec", "");
        }
    }

    public void generateClientWhenDiv_1() {
        String clientWhenAttr = "";
        char currentTemplatingStatus = 'Y';
        currentTemplatingStatus = pzAuto.getUIComponentRuntime()
                .getTemplatingUIStatus();
        if (currentTemplatingStatus == 'N')
            tools.appendString("<div ");
        if (tools.getThread().getName().indexOf("/$WorkProcessing") != -1
                || tools.getThread().getName().indexOf("/$FlowModalProcess") != -1) {
            if (currentTemplatingStatus == 'N') {
                tools.appendString(" thread_name = \""
                        + tools.getThread().getName() + "\"");
            } else {
                String threadName = tools.getThread().getName();
                clientWhenAttr += "thread_name= \"" + threadName + "\" ";
            }
        }
        if (currentTemplatingStatus == 'N')
            tools.appendString(" style='");
        else
            clientWhenAttr += "style='";
        if (currentTemplatingStatus == 'Y')
            clientWhenAttr += "'";
        if (currentTemplatingStatus == 'Y')
            tools.putParamValue("clientWhenAttr", clientWhenAttr);
    }

    public String getUIActionsMetaData_1() {
        StringBuilder actionsStringBuilder = tools.pushStreamBody();
        ((PegaStreamAPI) tools).disableDirectStreaming();
        String returnString = actionsStringBuilder.toString();
        tools.popStreamBody();
        return returnString;
    }

    public int simpleLayoutCell_11(int index) {
        IUIComponent uiComp = null;
        String labelName = "";
        String ariahiddenString = "";
        String baseRef = "";
        generateClientWhenDiv_1();
        tools.appendString("'  class='content-item content-layout item-"
                + Integer.toString(index)
                + "   flex flex-row '  STRING_TYPE='layout' RESERVE_SPACE='false'>");
        pzLayout_6();
        tools.putSaveValue("ContainerID", "");
        tools.appendString("</div>");
        index++;
        return index;
    }

    public int simpleLayoutTemplateCell_11(int index) {
        IUIComponent uiComp = null;
        String labelName = "";
        String expressionId = null;
        boolean isLabelJSP = false;
        String reqExpressionId = null;
        String disExpressionId = null;
        com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
        if (expression != null) {
            expressionId = expression.getId();
        }
        String pyCustomRequireFormat = "";
        pyCustomRequireFormat = tools.getLocalizedTextForString("pyCaption",
                "pyRequired");
        String baseRef = "";
        boolean pyDLCellVisibility = false;
        IUIComponent cc_dlCell = pzAuto.getUIComponent();
        IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime()
                .createMetadata();
        IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime()
                .createMetadata();
        pgCells.put("pyType", "layout");
        pgCells.put("RWActive", "false");
        pgCells.put("partialClass", "flex flex-row");
        pgCells.put("spanClass", "iconRequired standard_iconRequired");
        pgCells.put("cstmreqfor", pyCustomRequireFormat);
        if (!StringUtils.isBlank(expressionId))
            pgCells.put("pyExpressionId", expressionId);
        if (!"".equals(baseRef))
            pgCells.put("pyBaseRef", String.valueOf(baseRef));
        pgCells.put("labelJSP", String.valueOf(isLabelJSP));
        pgCells.put("pyPreventXSSInLabel", false);
        pg_dlCellMeta.putMetadata("pyCell", pgCells);
        boolean isExpression = false;
        boolean isOffline = false;
        cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
        pzLayout_6();
        tools.putSaveValue("ContainerID", "");
        labelName = "";
        if (!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
            pzAuto.getUIComponentRuntime().getRuntimeContextTree()
                    .addLocalizedValue(labelName, "pyCaption");
        } else {
            StringUtils.crossScriptingFilter(tools.getLocalizedTextForString(
                    "pyCaption", labelName));
        }
        pgCells.put("pyLabelValue", labelName);
        cc_dlCell.endComponent();
        index++;
        return index;
    }

    public void pzSetExpandParam_1() {
        pzSection.getLayout().setExpandParam(
                "SubSectionInvestmentExtraActionsB", "", false);
    }

    public void simpleLayout_6() {
        char parentTemplatingStatus = pzAuto.getUIComponentRuntime()
                .getTemplatingUIStatus();
        char currentTemplatingStatus = 'Y';
        if (!tools.getParamValue("UITemplatingStatus").equals("N")) {
            currentTemplatingStatus = pzAuto.getUIComponentRuntime()
                    .setTemplatingUIStatus('Y');
        } else {
            currentTemplatingStatus = pzAuto.getUIComponentRuntime()
                    .setTemplatingUIStatus('N');
        }
        String spxUniqueStreamHash2 = "";
        if (currentTemplatingStatus != 'N') {
            spxUniqueStreamHash2 = getUIActionsMetaData_1();
            if (spxUniqueStreamHash2 != null
                    && !"".equals(spxUniqueStreamHash2)) {
                pzAuto.getUIComponentRuntime()
                        .getRuntimeContextTree()
                        .addActionString(spxUniqueStreamHash2,
                                pxUniqueStreamHash + "_2");
            }
        }
        String refreshAttributes = "";
        String strMethodName = "";
        IUIComponent cc_dl = null;
        boolean bIsIe = (pzAuto.getBrowserUtils().isIE());
        String bIsWrapperAdded = tools.getParamValue("bIsWrapperAdded");
        String bIsGridLayout = tools.getParamValue("bIsGridLayout");
        cc_dl = pzAuto.getUIComponent();
        IUIComponentMetadata pg_dlmeta = pzAuto.getUIComponentRuntime()
                .createMetadata();
        pg_dlmeta.put("automationId",
                " " + pzCell.getTestIdIfEnabled("201808120943310957798") + " ");
        String subscriptionID = null;
        if (currentTemplatingStatus != 'Y') {
            if (bIsIe && "true".equals(bIsGridLayout)
                    && !"true".equals(bIsWrapperAdded)) {
                tools.appendString("<div class='flex-grid-table-wrapper'><div class='flex-grid-tablecell-wrapper'>");
                tools.putParamValue("bIsWrapperAdded", "true");
            }
            tools.appendString("<div bSimpleLayout='true' ");
            if (((PegaAPI) tools).getUIEngine().getPushServiceUtils()
                    .isPushEnabled()
                    && subscriptionID != null) {
                tools.appendString(" data-subscription-id='" + subscriptionID
                        + "' ");
            }
            tools.appendString(""
                    + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'RH_2.pySections(1)'}")
                    + " class='"
                    + "flex  content  layout-content-simple_list content-simple_list "
                    + "'  ");
            if (!tools.getParamValue("pyPegaDesignMode").equals("true")) {
                tools.appendString(" ");
            }
            tools.appendString(" " + refreshAttributes + ">");
        } else {
            String expressionId = null;
            com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
            if (!tools.getParamValue("pyPegaDesignMode").equals("true")
                    && spxUniqueStreamHash2 != null
                    && !"".equals(spxUniqueStreamHash2)) {
                pg_dlmeta.put("pyActionStringID", pxUniqueStreamHash + "_2");
            }
            if (!StringUtils.isBlank(expressionId)) {
                pg_dlmeta.put("pyExpressionId", expressionId);
            }
            if (!"".equals(strMethodName))
                pg_dlmeta.put("methodnm", strMethodName);
            pg_dlmeta.put("format", "simple_list");
            String inspectorData = new StringBuilder("\"")
                    .append(""
                            + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'RH_2.pySections(1)'}")
                            + "").append("\"").toString();
            if (!inspectorData.equals("\"\"")) {
                pg_dlmeta.put("liveUI", inspectorData);
            }
            pg_dlmeta.put("lMode", "SimpleDiv");
            pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
            cc_dl.beginComponent("DynamicLayout", pg_dlmeta);
        }
        int index = 1;
        if (currentTemplatingStatus != 'Y') {
            index = simpleLayoutCell_11(index);
        } else {
            index = simpleLayoutTemplateCell_11(index);
        }
        if (currentTemplatingStatus != 'Y') {
            tools.appendString("</div>");
            if (bIsIe && "true".equals(bIsGridLayout)
                    && !"true".equals(bIsWrapperAdded)) {
                tools.appendString("</div></div>");
                tools.putParamValue("bIsWrapperAdded", "false");
            }
        } else {
            cc_dl.endComponent();
        }
        pzAuto.getUIComponentRuntime().resetTemplatingUIStatus(
                parentTemplatingStatus);
    }

    public void pzLayoutContainer_6() {
        IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime()
                .createMetadata();
        String expressionId = null;
        com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
        String expressionId_BV = null;
        com.pega.pegarules.priv.runtime.ui.IExpression expression_BV = null;
        if (!StringUtils.isBlank(expressionId_BV)) {
            metadataPage.put("expressionId_BV", expressionId_BV);
        }
        String paramName = "EXPANDEDSubSectionInvestmentExtraActionsB";
        String inspectorLayoutData = pzAuto
                .getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'RH_2.pySections(1)'}");
        if (!inspectorLayoutData.isEmpty()) {
            metadataPage.put("liveUI", inspectorLayoutData);
        }
        String pyPrefix = null;
        IUIComponent containerComponent = pzAuto.getUIComponent();
        metadataPage.put("lMode", "SimpleDiv");
        metadataPage.put("contCustom", "margin-b-1x");
        containerComponent.beginComponent("pxLayoutContainer", metadataPage);
        pzLayoutBody_6();
        containerComponent.endComponent();
    }

    public void pzLayout_7() {
        char currentTemplatingStatus = pzAuto.getUIComponentRuntime()
                .setTemplatingUIStatus('Y');
        if (currentTemplatingStatus == 'Y') {
            pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
        }
        pzSetExpandParam_1();
        tools.putParamValue("RWClasses", "");
        if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
            pzLayoutBodyWrapper_7();
        }
        if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
            tools.putParamValue("pyInlineStyleSec", "");
            pzLayoutContainer_6();
            tools.putParamValue("pyInlineStyleSec", "");
        }
    }

    private void performStream_1() throws Throwable {
        buildWhiteList_1();
        pzSectionBody_1();
    }

    private static final Map oPropDefinitions_1 = null;
    private static final Map oStreamProperties_1 = new HashMap();
    static {
        oStreamProperties_1.put("pyRuleAvailable", "Yes");
        oStreamProperties_1.put("pyCircumstanceDateProp", "");
        oStreamProperties_1.put("pyCircumstanceVal", "");
        oStreamProperties_1.put("pyMethodStatus", "");
        oStreamProperties_1
                .put("pyClassName", "SRC-EPC-Data-Intake-Investment");
        oStreamProperties_1.put("pyCircumstanceProp", "");
        oStreamProperties_1
                .put("pzInsKey",
                        "RULE-HTML-SECTION SRC-EPC-DATA-INTAKE-INVESTMENT INVESTMENTEXTRAACTIONS #20231215T160912.199 GMT");
        oStreamProperties_1.put("pxObjClass", "Rule-HTML-Section");
        oStreamProperties_1.put("pyCircumstanceDate", "");
        oStreamProperties_1.put("pyRuleEnds", "");
        oStreamProperties_1.put("pyRuleStarts", "");
        oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
        oStreamProperties_1.put("pyXMLType", "");
        oStreamProperties_1.put("pyRuleSet", "EPC");
        oStreamProperties_1.put("pyCorrType", "");
        oStreamProperties_1.put("pyStreamName", "InvestmentExtraActions");
        oStreamProperties_1.put("pyRuleSetVersion", "02-02-51");
    }

    private boolean hasNonTemplateMethod_1() {
        return false;
    }

    private boolean hasNonTemplateComponent() {
        return false;
    }

    protected static final Map pzExternalMethodMapping = new HashMap();
    protected static final Map pzExternalMethodCache = new Hashtable();
    static {
        pzExternalMethodMapping.put("simpleLayout_6", new String[][] {});
        pzExternalMethodMapping.put("simpleLayout_1", new String[][] {});
        pzExternalMethodMapping.put("simpleLayout_2", new String[][] {});
        pzExternalMethodMapping.put("simpleLayout_4", new String[][] {});
        pzExternalMethodMapping.put("simpleLayout_5", new String[][] {});
        pzExternalMethodMapping.put("simpleLayout_3", new String[][] {});
    }

    protected boolean pzDispatchToInvokedMethod() {
        return pega.dispatchToGeneratedMethodInRule(this,
                pzExternalMethodMapping, pzExternalMethodCache);
    }

    private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo(
            "RULE-HTML-SECTION SRC-EPC-DATA-INTAKE-INVESTMENT INVESTMENTEXTRAACTIONS #20231215T160912.199 GMT",
            "SRC-EPC-Data-Intake-Investment InvestmentExtraActions", "EPC",
            "02-02-51", "20231215T160912.199 GMT");
}
