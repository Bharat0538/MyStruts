package com.cluster;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */

public class MyListener implements PhaseListener {

	@Override
	public void afterPhase(PhaseEvent phaseEvent) {
		System.out.println("AFTER PHASE ID:- "	+ phaseEvent.getPhaseId().toString());
	}

	@Override
	public void beforePhase(PhaseEvent phaseEvent) {
		System.out.println("BEFORE PHASE ID:- "	+ phaseEvent.getPhaseId().toString());
	}

	@Override
	public PhaseId getPhaseId() {
		return PhaseId.ANY_PHASE;
	}

}
