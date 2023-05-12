package tr.org.tarimkredi.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import tr.org.tarimkredi.dto.PersonelDTO;

@FeignClient(name = "PersonelFeignImpl", url = "http://localhost:8090")
public interface PersonelFeign {
	@GetMapping("/personel/yasaGore")
	public List<PersonelDTO> getPersonellerByYas(@RequestParam("yas") int yas);
}
