package com.codewithGAS.livre.entity;

import java.util.Date;

public class EmprunteStudentDTO {

    private String bookName;
    private Date dateEmprunte;
    private Date datePrevue;
    private Date dateRetour;


    public EmprunteStudentDTO(String bookName, Date dateEmprunte, Date datePrevue, Date dateRetour) {
        this.bookName = bookName;
        this.dateEmprunte = dateEmprunte;
        this.datePrevue = datePrevue;
        this.dateRetour = dateRetour;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Date getDateEmprunte() {
        return dateEmprunte;
    }

    public void setDateEmprunte(Date dateEmprunte) {
        this.dateEmprunte = dateEmprunte;
    }

    public Date getDatePrevue() {
        return datePrevue;
    }

    public void setDatePrevue(Date datePrevue) {
        this.datePrevue = datePrevue;
    }

    public Date getDateRetour() {
        return dateRetour;
    }

    public void setDateRetour(Date dateRetour) {
        this.dateRetour = dateRetour;
    }
}
