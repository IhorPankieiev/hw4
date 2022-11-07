package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter type of file (xml, doc or txt):");
        Scanner entType = new Scanner(System.in);
        String type = entType.next();

        switch (type) {
            case "doc":
                AbstractHandler fileDOC = new DOCHandler();
                fileDOC.open();
                fileDOC.create();
                fileDOC.change();
                fileDOC.save();
                break;
            case "xml":
                AbstractHandler fileXML = new XMLHandler();
                fileXML.open();
                fileXML.create();
                fileXML.change();
                fileXML.save();
                break;
            case "txt":
                AbstractHandler fileTXT = new TXTHandler();
                fileTXT.open();
                fileTXT.create();
                fileTXT.change();
                fileTXT.save();
                break;
            default:
                System.out.println("Sorry. This type of file is not supported");
        }
    }
}
