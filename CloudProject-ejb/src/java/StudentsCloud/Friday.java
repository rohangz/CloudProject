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
@Table(name = "friday")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Friday.findAll", query = "SELECT f FROM Friday f")
    , @NamedQuery(name = "Friday.findByFid", query = "SELECT f FROM Friday f WHERE f.fid = :fid")
    , @NamedQuery(name = "Friday.findByA", query = "SELECT f FROM Friday f WHERE f.a = :a")
    , @NamedQuery(name = "Friday.findByA1", query = "SELECT f FROM Friday f WHERE f.a1 = :a1")
    , @NamedQuery(name = "Friday.findByA2", query = "SELECT f FROM Friday f WHERE f.a2 = :a2")})
public class Friday implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "F_id")
    private String fid;
    @Size(max = 10)
    @Column(name = "9_10")
    private String a;
    @Size(max = 10)
    @Column(name = "10_11")
    private String a1;
    @Size(max = 10)
    @Column(name = "11_12")
    private String a2;

    public Friday() {
    }

    public Friday(String fid) {
        this.fid = fid;
    }

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getA1() {
        return a1;
    }

    public void setA1(String a1) {
        this.a1 = a1;
    }

    public String getA2() {
        return a2;
    }

    public void setA2(String a2) {
        this.a2 = a2;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fid != null ? fid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Friday)) {
            return false;
        }
        Friday other = (Friday) object;
        if ((this.fid == null && other.fid != null) || (this.fid != null && !this.fid.equals(other.fid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "StudentsCloud.Friday[ fid=" + fid + " ]";
    }
    
}
