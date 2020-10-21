package com.example.semana5_1;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContactoAdaptador extends RecyclerView.Adapter<ContactoAdaptador.ContactosViewHolder>{
	
	ArrayList<Contactos> contactosx; // trae la lista de una base de datos o de cualquier lugar
	Activity activity;
	private int like;
	
	public ContactoAdaptador ( ArrayList< Contactos > contactosx, Activity activity ) {
		this.contactosx = contactosx;
		this.activity = activity;
	}
	
	@NonNull
	@Override
	public ContactosViewHolder onCreateViewHolder ( @NonNull ViewGroup parent, int viewType ) {
		View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_contactos, parent,false );
		return new ContactosViewHolder(v);
	}
	
	@Override
	public void onBindViewHolder ( @NonNull ContactosViewHolder contactosViewHolder, int position ) {
	 final Contactos contactosy = contactosx.get (position);
	 contactosViewHolder.imgFoto.setImageResource (contactosy.getFoto ());
	 contactosViewHolder.tvNombre.setText (contactosy.getNombre ());
	 contactosViewHolder.tvTelefono.setText (contactosy.getTelefono ());
	 contactosViewHolder.tvLikes.setText (String.valueOf (contactosy.getLikes ()));
	 
	 contactosViewHolder.btnLike.setOnClickListener (new View.OnClickListener () {
		 @Override
		 public void onClick ( View v ) {
			like = contactosy.getLikes ();
			like += 1;
			contactosy.setLikes (like);
			
			 Toast.makeText (activity, "Diste like a :" + contactosy.getNombre (),
					 Toast.LENGTH_SHORT).show ();
		 }
	 });
	}
	
	@Override
	public int getItemCount () {
		return contactosx.size ();
	}
	
	public static class ContactosViewHolder extends RecyclerView.ViewHolder{
		private ImageView imgFoto;
		private TextView tvNombre;
		private TextView tvTelefono;
		private ImageButton btnLike;
		private TextView tvLikes;
		
		public ContactosViewHolder ( @NonNull View itemView ) {
			super (itemView);
			imgFoto = (ImageView) itemView.findViewById(R.id.imgFoto);
			tvNombre = (TextView) itemView.findViewById(R.id.tvNombre);
			tvTelefono = (TextView) itemView.findViewById(R.id.tvTelefono);
			tvLikes = (TextView) itemView.findViewById (R.id.tvLikes);
			btnLike = (ImageButton) itemView.findViewById (R.id.btnLike);
			
		}
	}
}
