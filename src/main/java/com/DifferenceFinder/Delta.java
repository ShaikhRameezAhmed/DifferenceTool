package com.DifferenceFinder;

import java.util.List;

import com.github.difflib.patch.AbstractDelta;
import com.github.difflib.patch.Chunk;
import com.github.difflib.patch.DeltaType;
import com.github.difflib.patch.PatchFailedException;

public class Delta<String> extends AbstractDelta<String>{

	public Delta(DeltaType type, Chunk<String> source, Chunk<String> target) {
		super(type, source, target);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void applyTo(List<String> target) throws PatchFailedException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void restore(List<String> target) {
		// TODO Auto-generated method stub
		
	}

}
