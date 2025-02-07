package com.firpy.model;

import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;

public record MinorVisitor(long id, String name, LocalDate dateOfBirth, AdultVisitor guardian) implements IVisitor
{
	@Override
	public @NotNull Long getId()
	{
		return id;
	}

	@Override
	public @NotNull String getName()
	{
		return name;
	}
}
