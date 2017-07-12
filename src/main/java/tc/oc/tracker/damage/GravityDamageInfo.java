package tc.oc.tracker.damage;

import com.google.common.base.Preconditions;
import org.bukkit.Location;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import tc.oc.tracker.base.AbstractDamageInfo;
import tc.oc.tracker.trackers.base.gravity.Fall;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class GravityDamageInfo extends AbstractDamageInfo {
    public GravityDamageInfo(@Nullable LivingEntity resolvedDamager, @Nonnull Fall.Cause cause, @Nonnull Fall.From from, @Nonnull Location fallLocation) {
        super(resolvedDamager);

        Preconditions.checkNotNull(resolvedDamager, "damager");
        Preconditions.checkNotNull(cause, "cause");
        Preconditions.checkNotNull(from, "from");

        this.cause = cause;
        this.from = from;
        this.fallLocation = fallLocation;
    }

    public @Nonnull Fall.Cause getCause() {
        return this.cause;
    }

    public @Nonnull Fall.From getFrom() {
        return this.from;
    }

    public @Nonnull Location getFallLocation() {
        return this.fallLocation;
    }

    private final @Nonnull Fall.Cause cause;
    private final @Nonnull Fall.From from;
    private final @Nonnull Location fallLocation;

    @Override
    public @Nonnull String toString() {
        return "GravityDamageInfo{damager=" + this.resolvedDamager + ",cause=" + this.cause + ",from=" + this.from + "}";
    }

    @Override
    public @Nonnull DamageCause getDamageCause() {
        return DamageCause.FALL;
    }
}
