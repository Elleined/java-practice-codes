package com.bike.bikecomponent;
import com.bike.bikecomponent.bikechain.Chain;
import com.bike.bikecomponent.bikechair.Chair;
import com.bike.bikecomponent.bikeframe.Frame;
import com.bike.bikecomponent.bikegear.Gear;
import com.bike.bikecomponent.bikehandlebar.HandleBar;
import com.bike.bikecomponent.bikepedal.Pedal;
import com.bike.bikecomponent.biketire.Tire;

public class Parts implements PartsDecision {

    private Pedal pedal;
    private Tire tire;
    private Chain chain;
    private Chair chair;
    private Frame frame;
    private Gear gear;
    private HandleBar handleBar;

    public Parts(){
    }
    
    // Tire
    public void rollTire(){
        PartsDecision.tireLogic(tire);
    }
    // Chain
    public void holdGear(){
        PartsDecision.chainLogic(chain);
    }
    // Gear
    public void holdChain(){
        PartsDecision.gearLogic(gear);
    }
    // Pedal
    public void rollGear(){
        PartsDecision.pedalLogic(pedal);
    }

    public Pedal getPedal() {
        return pedal;
    }
    public void setPedal(Pedal pedal) {
        this.pedal = pedal;
    }
    public Tire getTire() {
        return tire;
    }
    public void setTire(Tire tire) {
        this.tire = tire;
    }
    public Chain getChain() {
        return chain;
    }
    public void setChain(Chain chain) {
        this.chain = chain;
    }
    public Chair getChair() {
        return chair;
    }
    public void setChair(Chair chair) {
        this.chair = chair;
    }
    public Frame getFrame() {
        return frame;
    }
    public void setFrame(Frame frame) {
        this.frame = frame;
    }
    public Gear getGear() {
        return gear;
    }
    public void setGear(Gear gear) {
        this.gear = gear;
    }
    public HandleBar getHandle() {
        return handleBar;
    }
    public void setHandle(HandleBar handleBar) {
        this.handleBar = handleBar;
    }
}
