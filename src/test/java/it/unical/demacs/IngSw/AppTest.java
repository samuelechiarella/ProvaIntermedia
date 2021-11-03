package it.unical.demacs.IngSw;

import static org.junit.Assert.assertTrue;

import java.util.Collections;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void sort(List<Integer> list, int order){
    	if (order == 0)
    	{
    		for (int i = 0;i <list.size();i++)
    		{
    			if (list.get(i)>list.get(i+1))
    				System.out.println("fail");
    		}
    	}
        assertTrue( true );
    }
}
