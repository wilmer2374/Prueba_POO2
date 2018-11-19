/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wbelenzaca_vista;

/**
 *
 * @author WIN8
 */
public class detalleOperacion {
    private boolean Assembly;
    private boolean Inspection;
    private boolean CNCevent;
    
    public void SelectOpConfig(){
        
    }

    public boolean isAssembly() {
        return Assembly;
    }

    public void setAssembly(boolean Assembly) {
        this.Assembly = Assembly;
    }

    public boolean isInspection() {
        return Inspection;
    }

    public void setInspection(boolean Inspection) {
        this.Inspection = Inspection;
    }

    public boolean isCNCevent() {
        return CNCevent;
    }

    public void setCNCevent(boolean CNCevent) {
        this.CNCevent = CNCevent;
    }
}
