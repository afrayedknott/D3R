package afrayedknot.com.d3r;

import android.util.Log;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by redna on 5/3/2017.
 */

public class DiceRollSimulation{

    private int dieSides, dieCount, dieTotalModifier, dieAdvantageState;

    DiceRollSimulation(int sides, int count, int modifier, int advantageState){

        DiceRollSimulation diceRollSimulation =
                new DiceRollSimulation(dieSides, dieCount, dieTotalModifier, dieAdvantageState);

    }

    private int roll(int sides){

        Random dieRollGenerator = new Random();
        return dieRollGenerator.nextInt(sides) + 1;

    }

    private int rollTotalCalculate(int modifier){

        return roll(dieSides) + modifier;

    }

    public ArrayList<Integer> rollAll(){

        ArrayList<Integer> recordOfRolls = new ArrayList<>(dieCount);

        for(int dieRollIter = 0; dieRollIter < dieCount; dieRollIter++){

            int result = rollTotalCalculate(dieTotalModifier);
            recordOfRolls.add(result);
            Log.i("hng",Integer.toString(result));

        }

        return recordOfRolls;

    }

}
