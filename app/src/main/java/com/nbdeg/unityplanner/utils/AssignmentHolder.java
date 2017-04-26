package com.nbdeg.unityplanner.utils;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.nbdeg.unityplanner.R;
import com.nbdeg.unityplanner.data.Assignments;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AssignmentHolder extends RecyclerView.ViewHolder {
    private final TextView mNameField;
    private final TextView mDueField;
    private final TextView mClassField;
    public final View mView;

    public AssignmentHolder(View itemView) {
        super(itemView);
        mNameField = (TextView) itemView.findViewById(R.id.view_assignment_name);
        mDueField = (TextView) itemView.findViewById(R.id.view_assignment_due);
        mClassField = (TextView) itemView.findViewById(R.id.view_assignment_class);
        mView = itemView;
    }

    public void setEverything(Assignments assignment) {
        mNameField.setText(assignment.getAssignmentName());
        if (assignment.getDueDate() != null) {
            Date dueDate = new Date(assignment.getDueDate());
            SimpleDateFormat formatter = new SimpleDateFormat("MMMM d, yyyy");
            mDueField.setText(formatter.format(dueDate));
        } if (assignment.getDueClass() != null) {
            mClassField.setText(assignment.getDueClass());
        }
    }
}