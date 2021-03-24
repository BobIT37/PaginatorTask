package com.ilhanturkmen.paginationhelper.paginationhelper;

import java.util.List;

public class PaginationHelper {
	
	 public List<Character > collection;  
	    public int itemsPerPage;   
        /**
         * 
         * @param collection
         * @param itemsPerPage
         */
	    public PaginationHelper(List<Character> collection, int itemsPerPage) {
	        this.collection=collection;
	        this.itemsPerPage=itemsPerPage;
	    }
        /**
         * 
         * @return
         */
	    public int itemCount() {
	        return collection.size();
	    }
        /**
         * 
         * @return
         */
	    public int pageCount() {
	        int len = collection.size();
	        int page = len%itemsPerPage;
	        int pages = 0;
	        if(page != 0){
	            pages = len/itemsPerPage +1;
	        }else{
	            pages = len/itemsPerPage;
	        }
	        return pages;
	    }
        /**
         * 
         * @param pageIndex
         * @return
         */
	    public int pageItemCount(int pageIndex) {
	        int pages = this.pageCount();
	        int len = collection.size();
	        int page = len%itemsPerPage;
	        if(pageIndex<0 || pageIndex>=pages){
	            return -1;
	        }
	        else{
	            if(page !=0 && pageIndex==pages-1){
	                return page;
	            }else{
	                return itemsPerPage;
	            }
	        }
	    }
        /**
         * 
         * @param itemIndex
         * @return
         */
	    public int pageIndex(int itemIndex) {
	        int len = collection.size();
	        if(itemIndex<=len && itemIndex >0){
	            return itemIndex / itemsPerPage;
	        }else{
	            return -1;
	        }
	    }

}
