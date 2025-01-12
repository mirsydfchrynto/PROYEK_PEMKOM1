//import java.io.File;
//import java.io.IOException;
//
//public class file {
//    public static void main(String[] args) {
//        try {
//            // Membuat folder Root
//            File root = new File("Root");
//            root.mkdir();
//
//            // Membuat file di dalam Root
//            File projectConf = new File(root, "project.conf");
//            File manifestMf = new File(root, "manifest.mf");
//            projectConf.createNewFile();
//            manifestMf.createNewFile();
//
//            // Membuat folder classes
//            File classes = new File(root, "classes");
//            classes.mkdir();
//
//            // Membuat file di dalam folder classes
//            File testJava = new File(classes, "Test.java");
//            File testImplJava = new File(classes, "TestImpl.java");
//            testJava.createNewFile();
//            testImplJava.createNewFile();
//
//            // Membuat folder template
//            File template = new File(root, "template");
//            template.mkdir();
//
//            // Membuat file di dalam folder template
//            File enterTxt = new File(template, "enter.txt");
//            File exitTxt = new File(template, "exit.txt");
//            enterTxt.createNewFile();
//            exitTxt.createNewFile();
//
//            System.out.println("Struktur file dan folder berhasil dibuat.");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}









import java.io.File;

public class file {
    public static void main(String[] args) {

        File pc = new File("Root/project.conf");
        File tp = new File("Root/template");
        File tj = new File("Root/classes/Test.java");

    
        if (pc.renameTo(new File(tp, pc.getName()))) {
            System.out.println("File project.conf berhasil dipindahkan.");
        } else {
            System.out.println("Gagal memindahkan file project.conf.");
        }


        if (tj.delete()) {
            System.out.println("File Test.java berhasil dihapus.");
        } else {
            System.out.println("Gagal menghapus file Test.java.");
        }
    }
}