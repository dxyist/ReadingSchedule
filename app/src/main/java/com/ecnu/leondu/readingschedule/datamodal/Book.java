package com.ecnu.leondu.readingschedule.datamodal;

/**
 * Created by LeonDu on 3/20/16.
 */
public class Book extends BookBaseClass{


    private static final long serialVersionUID = -1620818460713276672L;

    // 补充书签部分
    private String bookNameString;
    private int totalPageNumber;

    // add something

    private int currentPageNumber;

    public Book(long taskID, String bookNameString, int totalPageNumber) {
        super(taskID);
        this.bookNameString = bookNameString;
        this.totalPageNumber = totalPageNumber;
    }

    public String getBookNameString() {
        return bookNameString;
    }

    public void setBookNameString(String bookNameString) {
        this.bookNameString = bookNameString;
    }

    public int getTotalPageNumber() {
        return totalPageNumber;
    }

    public void setTotalPageNumber(int totalPageNumber) {
        this.totalPageNumber = totalPageNumber;
    }

    public int getCurrentPageNumber() {
        return currentPageNumber;
    }

    public void setCurrentPageNumber(int currentPageNumber) {
        this.currentPageNumber = currentPageNumber;
    }
}
