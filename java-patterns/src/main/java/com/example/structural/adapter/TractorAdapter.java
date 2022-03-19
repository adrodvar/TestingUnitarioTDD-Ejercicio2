package com.example.structural.adapter;

public class TractorAdapter implements Movable{

	private Tractor tractor = new Tractor();
	
	@Override
	public void speedUp(double quantity) {
		if (this.tractor.getSpeed() + quantity < 15) {
			this.tractor.changeMode(1); // TORTUGA
		} else {
			this.tractor.changeMode(2); // LIEBRE
		}
		
	}

}
