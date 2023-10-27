package dis.eLPG.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dis.eLPG.entity.IndentDetails;

import dis.eLPG.repository.IndentRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Service
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
public class IndentService 
{
	@Autowired
	IndentRepository indrepo;
	
	public IndentDetails save(IndentDetails ind)
	{
		return indrepo.save(ind);
		
	}
	


}
