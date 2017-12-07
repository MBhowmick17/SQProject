import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TslTestCaseGenerator {
	public static void main(String[] args) {
		try {
			StringBuffer testingFile = new StringBuffer();
			
			File file = new File(System.getProperty("user.dir") + "/bookdao.tsl.tsl");
			
			FileReader fileReader = new FileReader(file);
			
			BufferedReader bufferedReader = new BufferedReader(fileReader);
						
			String stringLine;
			boolean isStart = false;
			int index = 0;
			String argsLine = "";
			testingFile.append("\n" + "			import static org.junit.Assert.*;\n" + "\n" + "			import org.junit.Test;\n" + "\n" + "			public class TSLTest {\n" + "\n");
			StringBuffer testCase = null;
			int i = 1;
			while ((stringLine = bufferedReader.readLine()) != null) {
				if(stringLine.startsWith("Test Case")) {
					isStart = true;
					testCase = new StringBuffer();
					continue;
				}
				if(stringLine.trim().equals("")) {
					if(isStart) {
						isStart = false;
						String testCaseStr = testCase.toString();
						testCaseStr = testCaseStr.trim();
						String[] tokens = testCaseStr.split("\\s+");
						String callNo = tokens[0].equals("null")?"":tokens[0]  ;
						callNo+=i++;
						String name = tokens[1].equals("null")?"":tokens[1] ;
						String author = tokens[2].equals("null")?"":tokens[2];
						String publisher = tokens[3].equals("null")?"":tokens[3] ;
						String quantity = tokens[4].equals("null")?"":tokens[4] ;
						testingFile.append(
								"				@Test\n" + 
								"				public void test"+ index++ +"() {\n" + 
								"					try{            \n" + 
								" BookDao.save(\"" + callNo +"\",\""+ name +"\",\""+ author +"\",\"" + publisher + "\", " + quantity + " );" +
								
								"			        }catch(Exception ex){\n" + 
								"			            System.out.println(ex.getMessage());\n" + 
								"			        }\n" + 
								"				}\n" + 
								"\n"); 
					}
					continue;
				}
				if(isStart) {
					if(stringLine.indexOf("<n/a>")==-1 ) {
						String[] tokens = stringLine.split(":");
						testCase.append(tokens[1]+" ");
					} else {
						continue;
						
					}
				}
			}
			testingFile.append("\n}");
            
			fileReader.close();
			  BufferedWriter bwr = new BufferedWriter(new FileWriter(new File("src/TSLTest.java")));
              bwr.write(testingFile.toString());
              bwr.flush();
              bwr.close();
              System.out.println("Test File Generated from TSL");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
