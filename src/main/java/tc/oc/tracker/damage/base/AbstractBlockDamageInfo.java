package tc.oc.tracker.damage.base;

import com.google.common.base.Preconditions;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.bukkit.block.BlockState;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import tc.oc.tracker.base.AbstractDamageInfo;
import tc.oc.tracker.damage.BlockDamageInfo;

public class AbstractBlockDamageInfo extends AbstractDamageInfo implements BlockDamageInfo {

  private final
  @Nonnull
  BlockState blockDamager;

  public AbstractBlockDamageInfo(@Nullable LivingEntity resolvedDamager,
      @Nonnull BlockState blockDamager) {
    super(resolvedDamager);

    Preconditions.checkNotNull(blockDamager, "block damager");

    this.blockDamager = blockDamager;
  }

  public
  @Nonnull
  BlockState getBlockDamager() {
    return this.blockDamager;
  }

  @Override
  public
  @Nonnull
  DamageCause getDamageCause() {
    return DamageCause.CONTACT;
  }
}
