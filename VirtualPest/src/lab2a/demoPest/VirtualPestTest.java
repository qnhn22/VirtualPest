package lab2a.demoPest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VirtualPestTest {
	VirtualPest virtualP1;
	VirtualPest virtualP2;
	VirtualPest virtualP3;
	VirtualPest virtualP4;
	VirtualPest virtualP5;

	@Before
	public void setUp() throws Exception {
		virtualP1 = new VirtualPest("Fred", 1);
		virtualP2 = new VirtualPest("Fred", 2);
		virtualP3 = new VirtualPest("Fred", 3);
		virtualP4 = new VirtualPest("Fred", 4);
		virtualP5 = new VirtualPest("Fred", 5);
		
	}

	@Test
	public void testConstructor()
	{
		assertEquals("Fred", virtualP1.getName());
		assertEquals(1, virtualP1.getIntState());
	}
	
	@Test
	public void testGetFile()
	{
		assertEquals("src/lab2a/demoPest/fish.jpg", virtualP1.getFile());
    }

	@Test
	public void testGetNumActions()
	{
		assertEquals(3, virtualP1.getNumActions());
	}
    
	@Test
    public void testGetState()
	{
		assertEquals("hungry", virtualP1.getState());
		assertEquals("sleepy", virtualP2.getState());
		assertEquals("full", virtualP3.getState());    
		assertEquals("grouchy", virtualP4.getState());    
		assertEquals("error", virtualP5.getState());
    }
     
	@Test
    public void testGetAction()
	{
		assertEquals("feed", virtualP1.getAction(1));
		assertEquals("pet", virtualP1.getAction(2));
		assertEquals("put to bed", virtualP1.getAction(3));
		assertEquals("", virtualP1.getAction(4));
    }
	
	@Test
	public void testGetPestSound()
	{
		assertEquals("blurp!", virtualP1.getPestSound());
		assertEquals("zzZZzzzZz", virtualP2.getPestSound());
		assertEquals("BLURP!", virtualP3.getPestSound());
		assertEquals("blurp! bubble bubble ...", virtualP4.getPestSound());
		assertEquals("", virtualP5.getPestSound());
	}
	
	@Test
	public void testGetPestAction()
	{
		assertEquals("swim to top", virtualP1.getPestAction());
		assertEquals("lay on bottom", virtualP2.getPestAction());
		assertEquals("sulk on bottom", virtualP3.getPestAction());
		assertEquals("swim to bottom", virtualP4.getPestAction());
		assertEquals("", virtualP5.getPestAction());
	}
	
	@Test
	public void testDoAction()
	{
		virtualP1.doAction(0);
		assertEquals(2, virtualP1.getIntState());
		virtualP1 = new VirtualPest("Fred", 1);
		virtualP1.doAction(1);
		assertEquals(3, virtualP1.getIntState());
		virtualP2.doAction(3);
		assertEquals(4, virtualP2.getIntState());
		virtualP2 = new VirtualPest("Fred", 2);
		virtualP2.doAction(0);
		assertEquals(1, virtualP2.getIntState());
		virtualP3.doAction(2);
		assertEquals(2, virtualP3.getIntState());
		virtualP3 = new VirtualPest("Fred", 3);
		virtualP3.doAction(0);
		assertEquals(4, virtualP3.getIntState());
		virtualP4.doAction(2);
		assertEquals(1, virtualP4.getIntState());
		
	}
	
	


}
