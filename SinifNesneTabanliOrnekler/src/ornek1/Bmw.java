package ornek1;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Bmw extends Araba {
	private boolean otomatikPilot = false;
}
