package com.example.ecommerce
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ecommerce.ProductsAdapter.ViewHolder
import com.example.ecommerce.model.Product
import com.squareup.picasso.Picasso

class ProductsAdapter(private val products: List<Product>):RecyclerView.Adapter<ProductsAdapter.ViewHolder>()
{


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =LayoutInflater.from(parent.context).inflate(R.layout.products_row,parent,false)
        val holder=ViewHolder(view)
        // making your api clickable and being able to proceed to the next intent
        view.setOnClickListener {
            val intent=Intent(parent.context, ProdutDetails::class.java)
            parent.context.startActivity(intent)
            intent.putExtra("name",products[holder.adapterPosition].tittle)
            intent.putExtra("Photo_url",products[holder.adapterPosition].photoUrl)
        }
        return holder
    }

    override fun getItemCount() =products.size

    override fun onBindViewHolder(holder: ProductsAdapter.ViewHolder, position: Int) {
        val product=products[position]
        Picasso.get().load(product.photoUrl).into(holder.image)
        holder.tittle.text=product.tittle
        holder.price.text=product.price.toString()

    }

    class ViewHolder (itemView: View): RecyclerView.ViewHolder(itemView) {
        val image: ImageView =itemView.findViewById(R.id.photo)
        val tittle: TextView =itemView.findViewById(R.id.title)
        val price: TextView=itemView.findViewById(R.id.price)
    }

}
