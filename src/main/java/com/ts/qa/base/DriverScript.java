package com.ts.qa.base;

import java.io.FileInputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;


public class DriverScript {

	public static final String JENKINS_BUILD_PATH = "/var/lib/jenkins/workspace/build-automation/";
//	public ActionKeywords actionKeywords;
//	private String actionKeyword;
//	private String pageObject;
//	protected Method[] method;
// 
//	private String testStepID;
//	private String testData;
//	private String testStepDescription;
//	
//	public static Properties objectRepository;
//	
//	public static final String TSDUGOUT_IP = "35.154.83.188";
//	public static final String LOCALHOST_IP = "127.0.0.1";
//	public static final String HOST_NAME = "127.0.0.1";
//
//	public DriverScript() {
//		actionKeywords = new ActionKeywords();
//		method = actionKeywords.getClass().getMethods();
//	}
//
//	public static void main(String[] args) {
//		String sheetsPath = PropertyFileReader.getInstance().getSheetsPath() + args[0];
//		String objectRepositoryPath = null;
//		try {
//			switch (HOST_NAME) {
//				case TSDUGOUT_IP:
//					objectRepositoryPath = JENKINS_BUILD_PATH + PropertyFileReader.getInstance().getObjectRepositoryPath() + "ObjectRepository.properties";
//					ExcelFileReader.validateExcelFile(JENKINS_BUILD_PATH + sheetsPath);
//					break;
//				case LOCALHOST_IP:
//					objectRepositoryPath = PropertyFileReader.getInstance().getObjectRepositoryPath() + "ObjectRepository.properties";
//					ExcelFileReader.validateExcelFile(sheetsPath);
//					break;
//				default:
//					System.out.println("PLEASE ADD IP OF THIS MACHINE!");
//			}
//		} catch(InvalidExcelFormatException e) {
//			e.printStackTrace();
//		}
//		try (
//			FileInputStream objectRepositoryFile = new FileInputStream(objectRepositoryPath);
//			){
//			objectRepository = new Properties(System.getProperties());
//			objectRepository.load(objectRepositoryFile);
//			DriverScript startEngine = new DriverScript();
//			startEngine.executeTestCase(args[1]);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	private void executeTestCase(String testSuiteFileName) {
//		int testStep;
//		int testLastStep;
//		String testCaseID;
//		String executeTest;
//		String testScenarioName;
//		
//		int totalTestCases = ExcelFileReader.getRowCount(testSuiteFileName);
////		System.out.println("Total test Cases: " + totalTestCases);
//		
//		actionKeywords.startTestReport();
//		
//		for(int testCase=1; testCase<=totalTestCases; testCase++) {
//			testCaseID = ExcelFileReader.getCellData(testCase, PropertyFileReader.getInstance().getTestCaseID(), testSuiteFileName);
//			testScenarioName = ExcelFileReader.getCellData(testCase, PropertyFileReader.getInstance().getTestScenarioDescription(), testSuiteFileName);
//			executeTest = ExcelFileReader.getCellData(testCase, PropertyFileReader.getInstance().getExecute(), testSuiteFileName);
//			System.out.println("Test Case ID: " + testCaseID + "\tExecute: " + executeTest);
//			if(executeTest.equalsIgnoreCase("Yes")) {
//				actionKeywords.test = actionKeywords.report.createTest(testScenarioName);
//				testStep = ExcelFileReader.getRowContains(testCaseID, PropertyFileReader.getInstance().getTestCaseID(), testScenarioName);
//				testLastStep = ExcelFileReader.getTestStepsCount(testScenarioName, testCaseID, testStep);
////				System.out.println("Test Step: " + testStep + "\ttestLastStep: " + testLastStep);
//				for (;testStep<testLastStep;testStep++) {
//					testStepID = ExcelFileReader.getCellData(testStep, PropertyFileReader.getInstance().getTestStepsID(), testScenarioName);
//					testStepDescription = ExcelFileReader.getCellData(testStep, PropertyFileReader.getInstance().getTestStepDescription(), testScenarioName);
//					actionKeyword = ExcelFileReader.getCellData(testStep, PropertyFileReader.getInstance().getKeyword(), testScenarioName);
//					pageObject = ExcelFileReader.getCellData(testStep, PropertyFileReader.getInstance().getPageObject(), testScenarioName);
//					testData = ExcelFileReader.getCellData(testStep, PropertyFileReader.getInstance().getTestData(), testScenarioName);
//					executeActions();
//					System.out.println("Keyword:" + actionKeyword + "\tPageObject: " + pageObject + "\tTest Data: " + testData);
//				}
//			}
//		}	
//		actionKeywords.report.flush();
//	}
//
//	private void executeActions() { 
//		if(method.length > 0) {
//			for(int i=0;i<method.length;i++) { 
//				try {
//					if(method[i].getName().equals(actionKeyword)) {
//						method[i].invoke(actionKeywords, pageObject, testStepID, testStepDescription, testData);
//						break;
//					}
//				} catch(IllegalAccessException | InvocationTargetException e) {
//					e.printStackTrace();
//				}
//			}
//		}
//	}
//		
}
