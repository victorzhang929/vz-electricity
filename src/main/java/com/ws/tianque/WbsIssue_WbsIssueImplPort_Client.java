
package com.ws.tianque;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import javax.xml.namespace.QName;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2016-12-13T09:36:26.846+08:00
 * Generated source version: 3.1.5
 * 
 */
public final class WbsIssue_WbsIssueImplPort_Client {

    private static final QName SERVICE_NAME = new QName("http://impl.service.webService.issue.plugin.tianque.com/", "WbsIssueImplService");

    private WbsIssue_WbsIssueImplPort_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = WbsIssueImplService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        WbsIssueImplService ss = new WbsIssueImplService(wsdlURL, SERVICE_NAME);
        WbsIssue port = ss.getWbsIssueImplPort();  
        
        {
        System.out.println("Invoking searchClearIssuesCount...");
        javax.xml.datatype.XMLGregorianCalendar _searchClearIssuesCount_arg0 = null;
        IssueCount _searchClearIssuesCount__return = port.searchClearIssuesCount(_searchClearIssuesCount_arg0);
        System.out.println("searchClearIssuesCount.result=" + _searchClearIssuesCount__return);


        }
        {
        System.out.println("Invoking addIssueNew...");
        String _addIssueNew_arg0 = "";
        String _addIssueNew__return = port.addIssueNew(_addIssueNew_arg0);
        System.out.println("addIssueNew.result=" + _addIssueNew__return);


        }
        {
        System.out.println("Invoking updateWbsIssue...");
        boolean _updateWbsIssue_arg0 = false;
        java.util.List<String> _updateWbsIssue_arg1 = null;
        port.updateWbsIssue(_updateWbsIssue_arg0, _updateWbsIssue_arg1);


        }
        {
        System.out.println("Invoking getGridMenberStat...");
        String _getGridMenberStat_arg0 = "";
        Integer _getGridMenberStat_arg1 = null;
        Integer _getGridMenberStat_arg2 = null;
        String _getGridMenberStat__return = port.getGridMenberStat(_getGridMenberStat_arg0, _getGridMenberStat_arg1, _getGridMenberStat_arg2);
        System.out.println("getGridMenberStat.result=" + _getGridMenberStat__return);


        }
        {
        System.out.println("Invoking viewIssueInformation...");
        String _viewIssueInformation_arg0 = "";
        String _viewIssueInformation__return = port.viewIssueInformation(_viewIssueInformation_arg0);
        System.out.println("viewIssueInformation.result=" + _viewIssueInformation__return);


        }
        {
        System.out.println("Invoking viewIssueDetail...");
        String _viewIssueDetail_arg0 = "";
        IssueDetailVo _viewIssueDetail__return = port.viewIssueDetail(_viewIssueDetail_arg0);
        System.out.println("viewIssueDetail.result=" + _viewIssueDetail__return);


        }
        {
        System.out.println("Invoking addIssueEvaluateVo...");
        IssueEvaluateVo _addIssueEvaluateVo_arg0 = null;
        String _addIssueEvaluateVo__return = port.addIssueEvaluateVo(_addIssueEvaluateVo_arg0);
        System.out.println("addIssueEvaluateVo.result=" + _addIssueEvaluateVo__return);


        }
        {
        System.out.println("Invoking getWbsIssues...");
        String _getWbsIssues_arg0 = "";
        String _getWbsIssues_arg1 = "";
        java.util.List<com.ws.tianque.WbsIssueTemp> _getWbsIssues__return = port.getWbsIssues(_getWbsIssues_arg0, _getWbsIssues_arg1);
        System.out.println("getWbsIssues.result=" + _getWbsIssues__return);


        }
        {
        System.out.println("Invoking addPetitionIssue...");
        PetitionIssueVo _addPetitionIssue_arg0 = null;
        IssueViewObject _addPetitionIssue__return = port.addPetitionIssue(_addPetitionIssue_arg0);
        System.out.println("addPetitionIssue.result=" + _addPetitionIssue__return);


        }

        System.exit(0);
    }

}
