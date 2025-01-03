
package mage.cards.s;

import java.util.UUID;
import mage.MageInt;
import mage.abilities.triggers.BeginningOfEndStepTriggeredAbility;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.costs.common.RemoveCountersSourceCost;
import mage.abilities.dynamicvalue.common.CreaturesDiedThisTurnCount;
import mage.abilities.effects.common.RegenerateSourceEffect;
import mage.abilities.effects.common.counter.AddCountersSourceEffect;
import mage.abilities.hint.common.CreaturesDiedThisTurnHint;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.constants.TargetController;
import mage.constants.Zone;
import mage.counters.CounterType;

/**
 *
 * @author LoneFox
 */
public final class ScavengingGhoul extends CardImpl {

    public ScavengingGhoul(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.CREATURE},"{3}{B}");
        this.subtype.add(SubType.ZOMBIE);
        this.power = new MageInt(2);
        this.toughness = new MageInt(2);

        // At the beginning of each end step, put a corpse counter on Scavenging Ghoul for each creature that died this turn.
        this.addAbility(new BeginningOfEndStepTriggeredAbility(TargetController.ANY, new AddCountersSourceEffect(CounterType.CORPSE.createInstance(),
            CreaturesDiedThisTurnCount.instance, true), false).addHint(CreaturesDiedThisTurnHint.instance));
        // Remove a corpse counter from Scavenging Ghoul: Regenerate Scavenging Ghoul.
        this.addAbility(new SimpleActivatedAbility(new RegenerateSourceEffect(),
            new RemoveCountersSourceCost(CounterType.CORPSE.createInstance())));
    }

    private ScavengingGhoul(final ScavengingGhoul card) {
        super(card);
    }

    @Override
    public ScavengingGhoul copy() {
        return new ScavengingGhoul(this);
    }
}
