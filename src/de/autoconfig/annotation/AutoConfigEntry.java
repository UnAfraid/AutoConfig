/*
 * This file is part of AutoConfig: https://github.com/HorridoJoho/AutoConfig
 * Copyright (C) 2015  Christian Buck
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package de.autoconfig.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import de.autoconfig.parser.IAutoConfigParser;
import de.autoconfig.parser.NullParser;
import de.autoconfig.validator.IAutoConfigValidator;
import de.autoconfig.validator.NullValidator;

/**
 * @author HorridoJoho
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface AutoConfigEntry
{
	String id() default "";
	boolean hasDef() default false;
	String def() default "";
	Class<? extends IAutoConfigParser<?>> parser() default NullParser.class;
	Class<? extends IAutoConfigValidator<?>> validator() default NullValidator.class;
}
