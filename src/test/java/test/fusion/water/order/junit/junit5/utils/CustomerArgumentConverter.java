/**
 * (C) Copyright 2021 Araf Karsh Hamid 
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package test.fusion.water.order.junit.junit5.utils;

import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.SimpleArgumentConverter;

/**
 * 
 * @author arafkarsh
 *
 */
public class CustomerArgumentConverter extends SimpleArgumentConverter {

	@Override
	protected Object convert(Object source, Class<?> targetType) 
			throws ArgumentConversionException {
		return String.valueOf(source);
	}

}
