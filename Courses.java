/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courses;

import java.util.Scanner;

/**
 *
 * @author cc2_1d-6
 */
public class Courses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner sc = new Scanner (System.in);
        
        System.out.println("What is Your College Department: (COA, CEA, CITCS, CTE, CAS CBA)");
           String dept= sc.nextLine ();
        System.out.println("What is Your Course: ");
            String course= sc.nextLine ();
        
            if (course.equals("CITCS")){
                System.out.println("DESCRIPTION: In 1986, the University of the Cordilleras, then known as the Baguio Colleges Foundation, became the first institution in Baguio City to offer a four-year course in Computer Science. Under the umbrella of the Arts and Sciences, this new division started with barely 100 students, 4 faculty members, and one course offering: Bachelor of Science in Information and Computer Science.");
            }
            else if (course.equals("BSCS")){
                System.out.println("The Bachelor of Science in Computer Science program provides the students with an in-depth understanding on the theoretical and applied aspects of computing. Students gain knowledge of the theories along with the methodologies and techniques in the research and development of multifaceted software systems as well as new knowledge in the field of computing.");
            
           }
            else if (course.equals("ACT")){
                System.out.println("The Associate in Computer Technology program provides the students with the skills and understanding to manage, improve and take care of computer systems and computer applications. Students will be prepared to work with advanced computer and communications equipments, computer applications and as support for offices and IT organizations.");
            }
            else
            {
                  System.out.println("What is your course: ");
                if (dept.equals("COA")){                   
                    System.out.println("The College of Accountancy provides an educational program through which students can prepare themselves for accounting, accounting related endeavors, and increasing levels of responsibility in business and society. Graduates should acquire a broad liberal education, effective personal skills, a life-long quest for knowledge, and a global perspective that will enable them to contribute to their profession and to the world");
                  
                }
                else if (dept.equals("BSA")){
                    System.out.println("The Bachelor of Science in Accountancy (BSA) curriculum adopts CHED MEMORANDUM ORDER NO. 3 Series of 2007, which is based on International Education Standards aimed to equip students to meet the competencies required in the workplace whether in the country or abroad. It is an 11 trimester course (3 years plus 2 semesters) which is equivalent to a 5-year course in a semestral setting. The program prepares students to be liberally educated accountants who can think and write clearly, effectively, and critically. It also prepares them to become total business advisors, who are knowledgeable with business structures and economic concepts; and trains them to be ethically and technically competent in the field of accounting and auditing.");
                }
                else if (dept.equals("BSAT")){
                    System.out.println("The BSAcT is a program that prepares students for a career in the accounting and finance divisions of organizations in the private and public sectors. The accounting courses in the BSAcT program, combined with business management courses, equip students with the needed skills, proficiency, and intellectual abilities to lead successful careers. All four major sectors of accountancy, namely public practice, commerce and industry, government, and education, need support staff who will work as bookkeepers, financial analysts, audit staff, inventory control accountants, general ledger accountants, receivables accountants, payables accountants, and other functions where the CPA credential is not required. The BSAcT graduate could adequately respond to this need.");
                }
                else if (dept.equals("BSMA")){
                    System.out.println("The BSMA curriculum is a 9 trimester course (3 years), equivalent to a 4-year course in a semestral setting. The course prepares students for a career within the accounting and finance division of both private enterprises and public sectors. The courses offered are a combination of accounting and related business subjects to equip them with the needed skills, proficiency and intellectual abilities. All the four (4) major fields of Accountancy, namely, public practice, commerce and industry, government, and education, need support staff to work as bookkeepers, financial analysts, audit staff, inventory control personnel, accounts payable administration personnel and other accounting works where a CPA title is not required. The BSMA graduate could adequately respond to this need.");
                }
                else if (dept.equals("BSFA")){
                    System.out.println("BS in Forensic Accounting is a degree program that prepares a person to become a professional forensic accountant or fraud examiner. The program has a total of 201 units and can be finished within nine terms or three years. Forensic Accounting or financial forensics is the specialty practice area of accountancy that encompasses engagements that deters and/or detects fraud and may result from actual or anticipated disputes or litigation. The integration of accounting, auditing and investigative skills yields the specialization known as Forensic Accounting. It provides an accounting analysis that is suitable to the court which will form the basis for discussion, debate and ultimately dispute resolution.");
                }
    }
    
}
}
