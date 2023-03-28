package com.bike.mainbike;

import com.bike.bikebrand_bikemodel.BrandAndModelWrapper;
import com.bike.bikebrand_bikemodel.BrandAndModelWrapper.Brand;
import com.bike.bikebrand_bikemodel.BrandAndModelWrapper.Model;
import com.bike.bikebrand_bikemodel.bikebrand.Avon;
import com.bike.bikebrand_bikemodel.bikebrand.BMW;
import com.bike.bikebrand_bikemodel.bikemodel.MountainBike;
import com.bike.bikebrand_bikemodel.bikemodel.RoadBike;
import com.bike.bikecomponent.Parts;
import com.bike.bikecomponent.bikechain.Chain;
import com.bike.bikecomponent.bikechain.DoubleStrandChain;
import com.bike.bikecomponent.bikechain.TripleStrandChain;
import com.bike.bikecomponent.bikechair.Chair;
import com.bike.bikecomponent.bikechair.ComfortChair;
import com.bike.bikecomponent.bikechair.CruiserChair;
import com.bike.bikecomponent.bikeframe.CarbonFiberFrame;
import com.bike.bikecomponent.bikeframe.Frame;
import com.bike.bikecomponent.bikeframe.SteelFrame;
import com.bike.bikecomponent.bikegear.Gear;
import com.bike.bikecomponent.bikegear.HubGear;
import com.bike.bikecomponent.bikegear.SingleSpeedGear;
import com.bike.bikecomponent.bikehandlebar.CruiserHandleBar;
import com.bike.bikecomponent.bikehandlebar.FlatHandleBar;
import com.bike.bikecomponent.bikehandlebar.HandleBar;
import com.bike.bikecomponent.bikepedal.ClipPedal;
import com.bike.bikecomponent.bikepedal.Pedal;
import com.bike.bikecomponent.bikepedal.PlatformPedal;
import com.bike.bikecomponent.biketire.MountainTire;
import com.bike.bikecomponent.biketire.RoadTire;
import com.bike.bikecomponent.biketire.Tire;
import com.bike.buildprocess.*;
import org.jetbrains.annotations.NotNull;

public final class BikeBuilder {
    static {
        System.out.println("- - - - - Build your bike - - - - -");
    }
    private final BrandAndModelWrapper brandAndModel;
    private final Parts parts;

    public BikeBuilder(BrandAndModelWrapper brandAndModel, Parts parts) {
        this.brandAndModel = brandAndModel;
        this.parts = parts;
        brandAndModel.setBrand(brand());
        brandAndModel.setModel(model());
        parts.setChain(chain());
        parts.setChair(chair());
        parts.setFrame(frame());
        parts.setGear(gear());
        parts.setHandle(handleBar());
        parts.setPedal(pedal());
        parts.setTire(tire());
    }

    public void defaultBuild1() {
        {
            System.out.println("-----Mountain Bike Build-----");
        }
        brandAndModel.setBrand(new BMW());
        brandAndModel.setModel(new MountainBike());
        parts.setChain(new TripleStrandChain());
        parts.setChair(new CruiserChair());
        parts.setFrame(new SteelFrame());
        parts.setGear(new HubGear());
        parts.setHandle(new CruiserHandleBar());
        parts.setPedal(new ClipPedal());
        parts.setTire(new MountainTire());
    }

    public void defaultBuild2() {
        {
            System.out.println("-----Road Bike Build-----");
        }
        brandAndModel.setBrand(new Avon());
        brandAndModel.setModel(new RoadBike());
        parts.setChain(new DoubleStrandChain());
        parts.setChair(new ComfortChair());
        parts.setFrame(new CarbonFiberFrame());
        parts.setGear(new SingleSpeedGear());
        parts.setHandle(new FlatHandleBar());
        parts.setPedal(new PlatformPedal());
        parts.setTire(new RoadTire());
    }


    @NotNull private Brand brand() {
        final BrandProcess brandProcess = new BrandProcess();
        brandProcess.process();
        return brandProcess.getType();
    }

    @NotNull private Model model() {
        final ModelProcess modelProcess = new ModelProcess();
        modelProcess.process();
        return modelProcess.getType();
    }

    @NotNull private Chain chain() {
        final ChainProcess chainProcess = new ChainProcess();
        chainProcess.process();
        return chainProcess.getType();
    }

    @NotNull private Chair chair() {
        final ChairProcess chairProcess = new ChairProcess();
        chairProcess.process();
        return chairProcess.getType();
    }

    @NotNull private Frame frame() {
        final FrameProcess frameProcess = new FrameProcess();
        frameProcess.process();
        return frameProcess.getType();
    }

    @NotNull private Gear gear() {
        final GearProcess gearProcess = new GearProcess();
        gearProcess.process();
        return gearProcess.getType();
    }

    @NotNull private HandleBar handleBar() {
        final HandleBarProcess handleBarProcess = new HandleBarProcess();
        handleBarProcess.process();
        return handleBarProcess.getType();
    }

    @NotNull private Pedal pedal() {
        final PedalProcess pedalProcess = new PedalProcess();
        pedalProcess.process();
        return pedalProcess.getType();
    }

    @NotNull private Tire tire() {
        final TireProcess tireProcess = new TireProcess();
        tireProcess.process();
        return tireProcess.getType();
    }
}
