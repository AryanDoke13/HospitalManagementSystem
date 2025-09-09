package java1;

import java.util.*;  // only need util, no need for io.*
import java.util.Calendar;

class worker {
    String sid, sname, desg, sex;
    int salary;

    void new_staff() {
        Scanner input = new Scanner(System.in);
        System.out.print("id:- ");
        sid = input.nextLine();
        System.out.print("name:- ");
        sname = input.nextLine();
        System.out.print("designation:- ");
        desg = input.nextLine();
        System.out.print("sex:- ");
        sex = input.nextLine();
        System.out.print("salary:- ");
        salary = input.nextInt();
    }

    void worker_info() {
        System.out.println(sid + "\t" + sname + "\t" + desg + "\t" + sex + "\t" + salary);
    }
}

class doctor {
    String did, dname, specilist, appoint, doc_qual;
    int droom;

    void new_doctor() {
        Scanner input = new Scanner(System.in);
        System.out.print("id:- ");
        did = input.nextLine();
        System.out.print("name:- ");
        dname = input.nextLine();
        System.out.print("specialization:- ");
        specilist = input.nextLine();
        System.out.print("work time:- ");
        appoint = input.nextLine();
        System.out.print("qualification:- ");
        doc_qual = input.nextLine();
        System.out.print("room no.:- ");
        droom = input.nextInt();
    }

    void doctor_info() {
        System.out.println(did + "\t" + dname + " \t" + specilist + " \t" + appoint + " \t" + doc_qual + " \t" + droom);
    }
}

class patient {
    String pid, pname, disease, sex, admit_status;
    int age;

    void new_patient() {
        Scanner input = new Scanner(System.in);
        System.out.print("id:- ");
        pid = input.nextLine();
        System.out.print("name:- ");
        pname = input.nextLine();
        System.out.print("disease:- ");
        disease = input.nextLine();
        System.out.print("sex:- ");
        sex = input.nextLine();
        System.out.print("admit_status:- ");
        admit_status = input.nextLine();
        System.out.print("age:- ");
        age = input.nextInt();
    }

    void patient_info() {
        System.out.println(pid + "\t" + pname + " \t" + disease + " \t" + sex + " \t" + admit_status + "\t" + age);
    }
}

class medical {
    String med_name, med_comp, exp_date;
    int med_cost, count;

    void new_medi() {
        Scanner input = new Scanner(System.in);
        System.out.print("name:- ");
        med_name = input.nextLine();
        System.out.print("company:- ");
        med_comp = input.nextLine();
        System.out.print("exp_date:- ");
        exp_date = input.nextLine();
        System.out.print("cost:- ");
        med_cost = input.nextInt();
        System.out.print("no of unit:- ");
        count = input.nextInt();
    }

    void find_medi() {
        System.out.println(med_name + " \t" + med_comp + " \t" + exp_date + " \t" + med_cost);
    }
}

class lab {
    String fecility;
    int lab_cost;

    void new_feci() {
        Scanner input = new Scanner(System.in);
        System.out.print("facility:- ");
        fecility = input.nextLine();
        System.out.print("cost:- ");
        lab_cost = input.nextInt();
    }

    void feci_list() {
        System.out.println(fecility + "\t\t" + lab_cost);
    }
}

class fecility {   // intentionally kept name as per your note
    String fec_name;

    void add_feci() {
        Scanner input = new Scanner(System.in);
        System.out.print("facility:- ");
        fec_name = input.nextLine();
    }

    void show_feci() {
        System.out.println(fec_name);
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
        String months[] = {
                "Jan", "Feb", "Mar", "Apr", "May", "Jun",
                "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
        };

        Calendar calendar = Calendar.getInstance();

        int count1 = 4, count2 = 4, count3 = 4, count4 = 4, count5 = 4, count6 = 4;

        System.out.println("\n--------------------------------------------------------------------------------");
        System.out.println(" * Welcome to Hospital Management System Project in Java *");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.print("Date: " + months[calendar.get(Calendar.MONTH)] + " " +
                calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.YEAR));
        System.out.println("\t\tTime: " + calendar.get(Calendar.HOUR) + ":" +
                calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));

        doctor[] d = new doctor[25];
        patient[] p = new patient[100];
        lab[] l = new lab[20];
        fecility[] f = new fecility[20];
        medical[] m = new medical[100];
        worker[] w = new worker[100];

        for (int i = 0; i < 25; i++) d[i] = new doctor();
        for (int i = 0; i < 100; i++) p[i] = new patient();
        for (int i = 0; i < 20; i++) l[i] = new lab();
        for (int i = 0; i < 20; i++) f[i] = new fecility();
        for (int i = 0; i < 100; i++) m[i] = new medical();
        for (int i = 0; i < 100; i++) w[i] = new worker();

        // --- pre-filled data kept same as your version ---

        Scanner input = new Scanner(System.in);
        int choice, j, c1, status = 1, s1, s2, s3, s4, s5, s6;

        while (status == 1) {
            System.out.println("\n                                    MAIN MENU");
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("1.Doctor  2. Patients  3.Medicines  4.Laboratories  5. Facilities  6. Worker ");
            System.out.println("-----------------------------------------------------------------------------------");
            choice = input.nextInt();

            switch (choice) {
                case 1: // Doctor
                    s1 = 1;
                    while (s1 == 1) {
                        System.out.println("1.Add New Entry\n2.Existing Doctors List");
                        c1 = input.nextInt();
                        if (c1 == 1) {
                            d[count1].new_doctor();
                            count1++;
                        } else if (c1 == 2) {
                            System.out.println("id \t Name\t Specilist \t Timing \t Qualification \t Room No.");
                            for (j = 0; j < count1; j++) d[j].doctor_info();
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s1 = input.nextInt();
                    }
                    break;

                case 2: // Patient
                    s2 = 1;
                    while (s2 == 1) {
                        System.out.println("1.Add New Entry\n2.Existing Patients List");
                        c1 = input.nextInt();
                        if (c1 == 1) {
                            p[count2].new_patient();
                            count2++;
                        } else if (c1 == 2) {
                            System.out.println("id \t Name \t Disease \t Gender \t Admit Status \t Age");
                            for (j = 0; j < count2; j++) p[j].patient_info();
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s2 = input.nextInt();
                    }
                    break;

                case 3: // Medicine
                    s3 = 1;
                    while (s3 == 1) {
                        System.out.println("1.Add New Entry\n2.Existing Medicines List");
                        c1 = input.nextInt();
                        if (c1 == 1) {
                            m[count3].new_medi();
                            count3++;
                        } else if (c1 == 2) {
                            System.out.println("Name \t Company \t Expiry Date \t Cost");
                            for (j = 0; j < count3; j++) m[j].find_medi();
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s3 = input.nextInt();
                    }
                    break;

                case 4: // Lab
                    s4 = 1;
                    while (s4 == 1) {
                        System.out.println("1.Add New Entry\n2.Existing Laboratories List");
                        c1 = input.nextInt();
                        if (c1 == 1) {
                            l[count4].new_feci();
                            count4++;
                        } else if (c1 == 2) {
                            System.out.println("Facilities\t\t Cost");
                            for (j = 0; j < count4; j++) l[j].feci_list();
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s4 = input.nextInt();
                    }
                    break;

                case 5: // Facility
                    s5 = 1;
                    while (s5 == 1) {
                        System.out.println("1.Add New Facility\n2.Existing Facilities List");
                        c1 = input.nextInt();
                        if (c1 == 1) {
                            f[count5].add_feci();
                            count5++;
                        } else if (c1 == 2) {
                            System.out.println("Hospital Facilities are:");
                            for (j = 0; j < count5; j++) f[j].show_feci();
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s5 = input.nextInt();
                    }
                    break;

                case 6: // Worker
                    s6 = 1;
                    while (s6 == 1) {
                        System.out.println("1.Add New Worker\n2.Existing Worker List");
                        c1 = input.nextInt();
                        if (c1 == 1) {
                            w[count6].new_staff();
                            count6++;
                        } else if (c1 == 2) {
                            System.out.println("id \t Name \t Designation \t Sex \t Salary");
                            for (j = 0; j < count6; j++) w[j].worker_info();
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s6 = input.nextInt();
                    }
                    break;

                default:
                    System.out.println(" You Have Entered Wrong Choice!!!");
            }
            System.out.println("\nReturn to MAIN MENU Press 1, Exit Press 0");
            status = input.nextInt();
        }
    }
}
