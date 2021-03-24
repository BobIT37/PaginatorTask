package com.ilhanturkmen.paginationhelper.test;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ilhanturkmen.paginationhelper.paginationhelper.PaginationHelper;

public class PaginationHelperTest {
	
	private PaginationHelper helper;

    @BeforeMethod
    public void setup() {
        helper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
    }

    @Test(priority = 1, description = "item count should match 6", enabled = true)
    public void getItemCount() {
    	Assert.assertNotNull(helper.itemCount());
        Assert.assertEquals(6, helper.itemCount());
        Assert.assertNotEquals('w', helper.itemCount());   
    }

    @Test(priority = 2, description = "page count should match 2", enabled = true)
    public void getPageCount() {
    	Assert.assertNotNull(helper.pageCount());
        Assert.assertEquals(2, helper.pageCount());
        Assert.assertNotEquals('w', helper.pageCount());
    }

    @Test(priority = 3, description = "page item count should match required values", enabled = true)
    public void getPageItemCount() {
        Assert.assertEquals(4, helper.pageItemCount(0));
        Assert.assertEquals(2, helper.pageItemCount(1));
        Assert.assertEquals(-1, helper.pageItemCount(2));
        Assert.assertNotEquals(-1, helper.pageItemCount(1));
        Assert.assertNotEquals('w', helper.pageItemCount(1));
        Assert.assertNotEquals(77, helper.pageItemCount(1));
    }

    @Test(priority = 1, description = "page index should match required values", enabled = true)
    public void getPageIndex() {
        /**
         * helper.pageIndex(5); //should == 1 (zero based index)
         * helper.pageIndex(2); //should == 0
         * helper.pageIndex(20); //should == -1
         * helper.pageIndex(-10); //should == -1
         */
       Assert.assertEquals(1, helper.pageIndex(5));
       Assert.assertEquals(0, helper.pageIndex(2));
       Assert.assertEquals(-1, helper.pageIndex(20));
       Assert.assertEquals(-1, helper.pageIndex(-10));
       Assert.assertNotEquals(-2,helper.pageIndex(5));
       Assert.assertNotEquals(1, helper.pageIndex(2));
       Assert.assertNotEquals(-2,helper.pageIndex(20));
       Assert.assertNotEquals('t',helper.pageIndex(-10));
    }


}
