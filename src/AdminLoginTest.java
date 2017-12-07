
import java.awt.event.KeyEvent;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JTextField;

import junit.extensions.jfcunit.JFCTestCase;
import junit.extensions.jfcunit.JFCTestHelper;
import junit.extensions.jfcunit.TestHelper;
import junit.extensions.jfcunit.eventdata.KeyEventData;
import junit.extensions.jfcunit.eventdata.MouseEventData;
import junit.extensions.jfcunit.eventdata.StringEventData;
import junit.extensions.jfcunit.finder.DialogFinder;
import junit.extensions.jfcunit.finder.NamedComponentFinder;


public class AdminLoginTest extends JFCTestCase{
	private TestHelper helper = null;
	private AdminLogin adminLogin = null;
	
//	protected void setUp() throws Exception {
//		super.setUp();
//		helper = new JFCTestHelper();
//		adminLogin = new AdminLogin("LoginScreenTest: " + getName());
//		adminLogin.setVisible(true);
//	}

	protected void tearDown() throws Exception {
		adminLogin = null;
		JFCTestHelper.cleanUp(this);
		super.tearDown();
	}
	
	@SuppressWarnings({ "unchecked", "unchecked" })
	public void testUserAndPasswordEmpty() {
	    NamedComponentFinder finder = new NamedComponentFinder(JComponent.class, "LoginButton" );
	    JButton loginButton = ( JButton ) finder.find( adminLogin, 0);
	    assertNotNull( "Could not find the Exit button", loginButton );

//	    finder.setName( "EnterButton" );
//	    JButton enterButton = ( JButton ) finder.find( adminLogin, 0 );
//	    assertNotNull( "Could not find the Enter button", enterButton );

	    finder.setName( "LoginNameTextField" );
	    JTextField userNameField = ( JTextField ) finder.find( adminLogin, 0 );
	    assertNotNull( "Could not find the userNameField", userNameField );
	    assertEquals( "Username field is empty", "", userNameField.getText( ) );

	    finder.setName( "PasswordTextField" );
	    JTextField passwordField = ( JTextField ) finder.find( adminLogin, 0 );
	    assertNotNull( "Could not find the passwordField", passwordField );
	    assertEquals( "Password field is empty", "", passwordField.getText( ) );

		try {
			helper.enterClickAndLeave(new MouseEventData(this, loginButton));
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}

	    DialogFinder dFinder = new DialogFinder(adminLogin.FailedLogin);
	    List showingDialogs = dFinder.findAll(adminLogin);
	    assertEquals( "Number of dialogs showing is wrong", 1, showingDialogs.size( ) );
	    JDialog dialog = ( JDialog )showingDialogs.get( 0 );
	    assertEquals( "Wrong dialog showing up", adminLogin.FailedLogin, dialog.getTitle( ) );
	    TestHelper.disposeWindow( dialog, this );
	}

}
