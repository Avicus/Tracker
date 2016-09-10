package tc.oc.tracker.damage;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.bukkit.OfflinePlayer;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Projectile;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;

public class DispensedProjectileDamageInfo extends ProjectileDamageInfo {

    public DispensedProjectileDamageInfo(@Nonnull Projectile projectile, @Nullable LivingEntity resolvedDamager, @Nullable Double projectileDistance, @Nullable OfflinePlayer dispenserOwner) {
        super(projectile, resolvedDamager, projectileDistance);
        
        this.dispenserOwner = dispenserOwner;
    }

    public @Nullable OfflinePlayer getdispenserOwner() {
        return this.dispenserOwner;
    }

    protected final @Nonnull OfflinePlayer dispenserOwner;
    
    @Override
    public @Nonnull String toString() {
        return "DispensedProjectileDamageInfo{shooter=" + this.resolvedDamager + ",projectile=" + this.projectile + ",distance=" + this.projectileDistance + ",dispenserOwner=" + this.dispenserOwner + "}";
    }

    @Override
    public @Nonnull DamageCause getDamageCause() {
        return DamageCause.PROJECTILE;
    }
}
