/*
 * Copyright 2013  Séven Le Mesle
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
package fr.xebia.extras.selma.it.mappers;

import fr.xebia.extras.selma.EnumMapper;
import fr.xebia.extras.selma.Mapper;
import fr.xebia.extras.selma.Maps;
import fr.xebia.extras.selma.beans.*;

/**
 * Created by slemesle on 12/03/2014.
 */
@Mapper(withEnums = @EnumMapper(from= EnumA.class, to=EnumB.class, defaultValue = "A"))
public interface CustomMethodEnumMapsMapper {

    @Maps(withEnums = @EnumMapper(from = EnumA.class, to = EnumB.class, defaultValue = "C"))
    EnumBeanB asEnumBeanB(EnumBeanA source);


    @Maps(withEnums = @EnumMapper(from = EnumA.class, to = EnumB.class))
    EnumBeanB asEnumBeanBNoDefault(EnumBeanA source);

    @Maps(withEnums = @EnumMapper(from = EnumA.class, to = EnumB.class, defaultValue = "C"))
    EnumBeanB asEnumB(EnumBeanA source, EnumBeanB dest);

    @Maps(withEnums = @EnumMapper(from = EnumA.class, to = EnumB.class))
    EnumBeanB asEnumBeanBNoDefault(EnumBeanA source, EnumBeanB dest);

    @Maps(withEnums = @EnumMapper(from = EnumIn.class, to = EnumOut.class))
    CityOut asCityOut(CityIn in, CityOut out);

}
