/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package govtschemeportal;

/**
 *
 * @author Atul
 */
public class Schememodalclass 
{
    int scheme_no;
    String scheme_name;
    String sector;
    String male;
    String female;
    int income;
    String education;
    String caste;
    String description;
    
    
    
    
   public Schememodalclass()
   {
       
   }

    public Schememodalclass(int scheme_no, String scheme_name, String sector, String male, String female,int income, String education, String caste, String description) {
        this.scheme_no = scheme_no;
        this.scheme_name = scheme_name;
        this.sector = sector;
        this.male = male;
        this.female=female;
        this.income = income;
        this.education = education;
        this.caste = caste;
        this.description = description;
    }

    public int getScheme_no() {
        return scheme_no;
    }

    public String getScheme_name() {
        return scheme_name;
    }

    public String getSector() {
        return sector;
    }

    public String getMale() {
        return male;
    }

    public String getFemale() {
        return female;
    }

    public int getIncome() {
        return income;
    }

    public String getEducation() {
        return education;
    }

    public String getCaste() {
        return caste;
    }

    public String getDescription() {
        return description;
    }
    
    
    
}
