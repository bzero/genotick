package com.alphatica.genotick.instructions;

import com.alphatica.genotick.processor.Processor;

import java.io.Serializable;

public class JumpIfVariableNotEqualZero extends VarJumpInstruction implements Serializable{
    public static final long serialVersionUID = 5411560101077877447L;

    public JumpIfVariableNotEqualZero(JumpIfVariableNotEqualZero i) {
        this.setVariableArgument(i.getVariableArgument());
        this.setAddress(i.getAddress());
    }

    @SuppressWarnings("unused")
    public JumpIfVariableNotEqualZero() {
    }

    @Override
    public void executeOn(Processor processor)  {
        processor.execute(this);
    }

    @Override
    public JumpIfVariableNotEqualZero copy() {
        return new JumpIfVariableNotEqualZero(this);
    }
}