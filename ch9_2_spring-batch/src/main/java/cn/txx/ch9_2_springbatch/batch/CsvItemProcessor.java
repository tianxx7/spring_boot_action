package cn.txx.ch9_2_springbatch.batch;

import cn.txx.ch9_2_springbatch.domain.Person;
import org.springframework.batch.item.validator.ValidatingItemProcessor;
import org.springframework.batch.item.validator.ValidationException;

/**
 * 处理
 */
public class CsvItemProcessor  extends ValidatingItemProcessor<Person>{

	@Override
	public Person process(Person item) throws ValidationException {
		super.process(item); //1  需执行super.process()才会调用自定义的校验器
		
		if(item.getNation().equals("汉族")){ //2
			item.setNation("01");
		}else{
			item.setNation("02");
		}
		return item;
	}


}
