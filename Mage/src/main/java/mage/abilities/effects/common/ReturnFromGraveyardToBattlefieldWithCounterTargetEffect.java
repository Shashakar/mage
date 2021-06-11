package mage.abilities.effects.common;

import mage.abilities.Ability;
import mage.abilities.Mode;
import mage.abilities.effects.ReplacementEffectImpl;
import mage.constants.Duration;
import mage.constants.Outcome;
import mage.counters.Counter;
import mage.game.Game;
import mage.game.events.EntersTheBattlefieldEvent;
import mage.game.events.GameEvent;
import mage.game.permanent.Permanent;

public class ReturnFromGraveyardToBattlefieldWithCounterTargetEffect extends ReturnFromGraveyardToBattlefieldTargetEffect {

    private final Counter counter;
    private final boolean additional;

    public ReturnFromGraveyardToBattlefieldWithCounterTargetEffect(Counter counter) {
        this(counter, false);
    }

    public ReturnFromGraveyardToBattlefieldWithCounterTargetEffect(Counter counter, boolean additional) {
        super();
        this.counter = counter;
        this.additional = additional;
    }

    private ReturnFromGraveyardToBattlefieldWithCounterTargetEffect(final ReturnFromGraveyardToBattlefieldWithCounterTargetEffect effect) {
        super(effect);
        this.counter = effect.counter;
        this.additional = effect.additional;
    }

    @Override
    public ReturnFromGraveyardToBattlefieldWithCounterTargetEffect copy() {
        return new ReturnFromGraveyardToBattlefieldWithCounterTargetEffect(this);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        AddCounterReplacementEffect counterEffect = new AddCounterReplacementEffect(counter);
        game.addEffect(counterEffect, source);
        return super.apply(game, source);
    }

    @Override
    public String getText(Mode mode) {
        StringBuilder sb = new StringBuilder(super.getText(mode));
        sb.append(" with ");
        if (additional) {
            if (counter.getCount() == 1) {
                sb.append("an");
            } else {
                sb.append(counter.getCount());
            }
            sb.append(" additional");
        } else if (counter.getCount() == 1) {
            sb.append("a");
        } else {
            sb.append(counter.getCount());
        }
        sb.append(' ');
        sb.append(counter.getName());
        sb.append(" counter");
        if (counter.getCount() != 1) {
            sb.append('s');
        }
        sb.append(" on it");
        return sb.toString();
    }
}

class AddCounterReplacementEffect extends ReplacementEffectImpl {

    private final Counter counter;

    public AddCounterReplacementEffect(Counter counter) {
        super(Duration.EndOfStep, Outcome.BoostCreature);
        this.counter = counter;
    }

    private AddCounterReplacementEffect(final AddCounterReplacementEffect effect) {
        super(effect);
        this.counter = effect.counter;
    }

    @Override
    public AddCounterReplacementEffect copy() {
        return new AddCounterReplacementEffect(this);
    }

    @Override
    public boolean checksEventType(GameEvent event, Game game) {
        return event.getType() == GameEvent.EventType.ENTERS_THE_BATTLEFIELD;
    }

    @Override
    public boolean applies(GameEvent event, Ability source, Game game) {
        return event.getTargetId().equals(getTargetPointer().getFirst(game, source));
    }

    @Override
    public boolean replaceEvent(GameEvent event, Ability source, Game game) {
        Permanent creature = ((EntersTheBattlefieldEvent) event).getTarget();
        if (creature == null) {
            return false;
        }
        creature.addCounters(counter.copy(), source.getControllerId(), source, game, event.getAppliedEffects());
        discard();
        return false;
    }
}
