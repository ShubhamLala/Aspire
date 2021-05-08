package com.example.aspire;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StudyMaterialRecyclerAdapter extends RecyclerView.Adapter<StudyMaterialRecyclerAdapter.StudyMaterialViewHolder> {
    private String grade;
    private String subject;
    private Context context;
    private ArrayList<String> phy11 = new ArrayList<>(Arrays.asList("1. Physical World","2. Units and Measurement","3. Motion in a Straight Line","4. Motion in a Plane","5. Laws of Motion","6. Work,Energy and Power","7. Systems of Particles and Rotational Motion","8. Gravitation","9. Mechanical Properties of Solids","10. Mechanical Properties of Fluids","11. Thermal Properties of Matter","12. Thermodynamics","13. Kinetic Theory","14. Oscillations","15. Waves"));
    private ArrayList<String> phy12 = new ArrayList<>(Arrays.asList("1. Electric Charges and Fields","2. Electrostatic Potential and Capacitance","3. Current Electricity","4. Moving Charges and Magnetism","5. Magnetism and Matter","6. Electromagnetic Induction","7. Alternating Current","8. Electromagnetic Waves","9. Ray Optics and Optical Instruments","10. Wave Optics","11. Dual Nature of Radiation and Matter","12. Atoms","13. Nuclei","14. Semiconductors Electronics","15. Communication Systems"));
   private ArrayList<String> maths11 = new ArrayList<>(Arrays.asList("1.Sets","2.Relations and Functions","3.Trigonometric Functions","4.Principle of Mathematical Induction","5.Complex Numbers and Quadratic Equations","6.Linear Inequalities","7.Permutations and Combinations","8.Binomial Theorem","9.Sequences and Series","10.Straight Lines","11.Conic Sections","12.Introduction to Three Dimensional Geometry","13.Limits and Derivatives","14.Mathematical Reasoning","15.Statistics","16.Probability"));
   private ArrayList<String> maths12 = new ArrayList<>(Arrays.asList("1.Relations and Functions","2.Inverse Trigonometric Functions","3.Matrices","4.Determinants","5.Continuity and Differentiability","6.Application of Derivatives","7.Integrals","8.Application of Integrals","9.Differential Equations","10.Vector Algebra","11.Three Dimensional Geometry","12.Linear Programming","13.Probability"));
   private ArrayList<String> chem11 = new ArrayList<>(Arrays.asList("1.Some Basic Concepts of Chemistry","2.Structure of Atom","3.Classification of Elements and Periodicity in Properties","4.Chemical Bonding and Molecular Structure","5.States of Matter","6.Thermodynamics","7.Equilibrium","8.Redox Reactions","9.Hydrogen","10.The s-Block Elements","11.The p-Block Elements","12.Organic Chemistry-Some Basic Principles and Techniques","13.Hydrocarbons","14.Environmental Chemistry"));
   private ArrayList<String> chem12 = new ArrayList<>(Arrays.asList("1.The Solid State","2.Solutions","3.Electrochemistry","4.Chemical Kinetics","5.Surface Chemistry","6.General Principles and Processes of Isolation of Elements","7.The p-Block Elements","8.The d and f Block Elements","9.Coordination Compounds","10.Haloalkanes and Haloarenes","11.Alcohols, Phenols and Ethers","12.Aldehydes, Ketones and Carboxylic Acids","13.Amines","14.Biomolecules","15.Polymers","16.Chemistry in Everyday life"));

   public StudyMaterialRecyclerAdapter(String grade, String subject, Context context) {
        this.grade = grade;
        this.subject = subject;
        this.context = context;
    }

    @NonNull
    @Override
    public StudyMaterialViewHolder onCreateViewHolder(@NonNull final ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.study_recycler_layout,parent,false);
        return new StudyMaterialViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudyMaterialViewHolder holder, final int position) {
        switch (subject){
            case "phy":
                if(grade.equals("0")) {
                    holder.textView.setText(phy11.get(position));
                }
                else {
                    holder.textView.setText(phy12.get(position));
                }
                break;
            case "chem":
                if(grade.equals("0")) {
                    holder.textView.setText(chem11.get(position));
                }
                else holder.textView.setText(chem12.get(position));
                break;
            case "math":
                if(grade.equals("0")) holder.textView.setText(maths11.get(position));
                else holder.textView.setText(maths12.get(position));
                break;
        }
        holder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,PdfViewer.class);
                ArrayList<String> send = new ArrayList<>(Arrays.asList(grade,subject,Integer.toString(position+1)));
                intent.putStringArrayListExtra("position",send);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        switch (subject){
            case "phy":
                if(grade.equals("0")) return phy11.size();
                else return phy12.size();
            case "chem":
                if(grade.equals("0")) return chem11.size();
                else return chem12.size();
            case "math":
                if(grade.equals("0")) return maths11.size();
                else return maths12.size();
            default:
                return 30;
        }
    }

    public class StudyMaterialViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        public StudyMaterialViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.studyRecyclerTextView);
        }
    }
}
