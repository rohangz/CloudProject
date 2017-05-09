/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentsCloud;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author hp
 */
@Entity
@Table(name = "students")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Students.findAll", query = "SELECT s FROM Students s")
    , @NamedQuery(name = "Students.findByUsername", query = "SELECT s FROM Students s WHERE s.username = :username")
    , @NamedQuery(name = "Students.findByEnrolment", query = "SELECT s FROM Students s WHERE s.enrolment = :enrolment")
    , @NamedQuery(name = "Students.findByFullName", query = "SELECT s FROM Students s WHERE s.fullName = :fullName")
    , @NamedQuery(name = "Students.findByPassword", query = "SELECT s FROM Students s WHERE s.password = :password")})
public class Students implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 20)
    @Column(name = "username")
    private String username;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "Enrolment")
    private String enrolment;
    @Size(max = 30)
    @Column(name = "Full_Name")
    private String fullName;
    @Size(max = 30)
    @Column(name = "password")
    private String password;

    public Students() {
    }

    public Students(String enrolment) {
        this.enrolment = enrolment;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEnrolment() {
        return enrolment;
    }

    public void setEnrolment(String enrolment) {
        this.enrolment = enrolment;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (enrolment != null ? enrolment.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Students)) {
            return false;
        }
        Students other = (Students) object;
        if ((this.enrolment == null && other.enrolment != null) || (this.enrolment != null && !this.enrolment.equals(other.enrolment))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "StudentsCloud.Students[ enrolment=" + enrolment + " ]";
    }
    
}
