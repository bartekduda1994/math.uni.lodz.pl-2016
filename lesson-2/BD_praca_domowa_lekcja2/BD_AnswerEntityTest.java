package com.gft.structuraltest.testconference.registrationdata;

import static org.junit.Assert.*;
import org.junit.*;

public class AnswerEntityTest
{

    @Test
    public void shouldReturnFalseWhenObjectIsNull()
	{
        AnswerEntity an1 = new AnswerEntity();
        AnswerEntity an2 = null;
        assertFalse(an1.equals(an2));
    } 
	
	
	//Praca domowa 
	//Bartłomiej Duda
	//13.11.2016
	
	@Test
	public void czy_this_rownasie_object()
	{
        AnswerEntity an1 = new AnswerEntity();
        AnswerEntity an2 = new AnswerEntity();
        assertTrue(an1.equals(an2));
    } 
	
	
	@Test
 	public void czy_this_jest_obiektem()
	{
		 Object TEN_OBIEKT = new AnswerEntity();
		 assertTrue(TEN_OBIEKT.equals(TEN_OBIEKT));
	}
	
	
	@Test
 	public void czy_answer_text_rownasie_inny_answer_text()
	{
		AnswerEntity an1 = new AnswerEntity();
        AnswerEntity an2 = new AnswerEntity();
		an1.setAnswerText("dfdsgsdg34543tegergfdgbdf");
		an2.setAnswerText("dfdsgsdg34543tegergfdgbdf");
		
		assertTrue(an1.equals(an2));
	}
	
	@Test
 	public void czy_drugi_answer_text_rozny_od_null()
	{
		AnswerEntity an1 = new AnswerEntity();
        AnswerEntity an2 = new AnswerEntity();
		an1.setAnswerText(null);
		an2.setAnswerText("hhhhhhhhhhhhhu6675757");
		
		assertFalse(an1.equals(an2));
	}
	
	
	@Test
	public void czy_id_sa_rowne()
	{
		AnswerEntity an1 = new AnswerEntity();
        AnswerEntity an2 = new AnswerEntity();
		an1.setId(new Long(777));
		an2.setId(new Long(777));
        assertTrue(an1.equals(an2));
	}
	
	@Test
	public void czy_pierwsze_id_null_drugie_nie_null()
	{
		AnswerEntity an1 = new AnswerEntity();
        AnswerEntity an2 = new AnswerEntity();
		an2.setId(new Long(777));
        assertFalse(an1.equals(an2));
	}
	
	@Test
	public void czy_pytanie1_null_pytanie2_nie_null()
	{
		AnswerEntity an1 = new AnswerEntity();
        AnswerEntity an2 = new AnswerEntity();
		QuestionEntity pytanie2 = new QuestionEntity();
		an2.setQuestion(pytanie2);
        assertFalse(an1.equals(an2));
	}
	
	@Test
	public void test2()
	{
		AnswerEntity an1 = new AnswerEntity();
        AnswerEntity an2 = new AnswerEntity();
		QuestionEntity pytanie1 = new QuestionEntity();
		QuestionEntity pytanie2 = new QuestionEntity();
		an1.setQuestion(pytanie1);
		an2.setQuestion(pytanie2);
        assertFalse(an1.equals(an2));
	}
	
	
	
	@Test
	public void czy_pytania_sa_rowne()
	{
		AnswerEntity an1 = new AnswerEntity();
        AnswerEntity an2 = new AnswerEntity();
		QuestionEntity pytanie1 = new QuestionEntity();
		QuestionEntity pytanie2 = new QuestionEntity();
		an1.setQuestion(pytanie1);
		an2.setQuestion(pytanie1);
        assertTrue(an1.equals(an2));
	}
	
	
	public class Wakacje 
	{
		String plaza;
		int dlugosc;
		String morze;
		String piasek;
	}
	
	@Test
	public void czy_klasy_sa_rowne()
	{
         AnswerEntity an1 = new AnswerEntity();
         Wakacje an2 = new Wakacje();
         assertFalse(an1.equals(an2));
	}
	
	
    
}