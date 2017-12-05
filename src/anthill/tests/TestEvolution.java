package anthill.tests;

import anthill.model.Ant;
import anthill.model.Anthill;
import anthill.model.roles.Queen;
import anthill.model.states.Adult;
import anthill.observer.Observer;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class TestEvolution {

  @Test
  void test() {
    Ant queen = new Ant();
    
    queen.state = new Adult(new Queen());
    Anthill ah = queen.getState().getRole().ifQueen(queen).createAnthill(queen);
    for (int i = 0 ; i < 100 ; i++) {
      Ant a = queen.getState().getRole().ifQueen(queen).createEgg();
      ah.listAnt.add(a);
      ah.setEgg();
    }
    System.out.println(ah.listAnt.size());
    Observer o = new Observer();
    for (Ant a : ah.listAnt) {
      o.updateEggToMaggot(a);
      ah.setMaggot();
      o.updateMaggotToChrysalis(a);
      ah.setChrysalis();
      o.updateChrysalisToAdult(a,ah);
      System.out.println(a.getAntId() + " " + a.getState().getRole().toString(a));
    }
    assertTrue(ah.getNbWorker() == 70);
    assertTrue(ah.getNbPrince() == 5);
    assertTrue(ah.getNbSoldier() == 20);
    assertTrue(ah.getNbPrincess() == 5);
    assertTrue((ah.getNbPrince() + ah.getNbPrincess() + ah.getNbSoldier() + ah.getNbWorker() + 1) == 101);
  }

}