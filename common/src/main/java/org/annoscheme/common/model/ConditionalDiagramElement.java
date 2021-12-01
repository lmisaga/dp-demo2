package org.annoscheme.common.model;

import org.annoscheme.common.annotation.BranchingType;

public class ConditionalDiagramElement extends DiagramElement {

	private String condition;

	private BranchingType branchingType;

	private DiagramElement parent;

	private DiagramElement mainFlowDirectChild;

	private DiagramElement alternateFlowDirectChild;

	public DiagramElement getParent() {
		return parent;
	}

	public void setParent(DiagramElement parent) {
		this.parent = parent;
	}

	public DiagramElement getMainFlowDirectChild() {
		return mainFlowDirectChild;
	}

	public void setMainFlowDirectChild(DiagramElement mainFlowDirectChild) {
		this.mainFlowDirectChild = mainFlowDirectChild;
	}

	public DiagramElement getAlternateFlowDirectChild() {
		return alternateFlowDirectChild;
	}

	public void setAlternateFlowDirectChild(DiagramElement alternateFlowDirectChild) {
		this.alternateFlowDirectChild = alternateFlowDirectChild;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public BranchingType getBranchingType() {
		return branchingType;
	}

	public void setBranchingType(BranchingType branchingType) {
		this.branchingType = branchingType;
	}
}
