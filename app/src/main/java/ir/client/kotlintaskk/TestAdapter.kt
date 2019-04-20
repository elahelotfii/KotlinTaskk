package ir.client.kotlintaskk

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class TestAdapter : RecyclerView.Adapter<TestAdapter.TestViewHoloder.TestAdapter.TestViewHolder> {

    class TestViewHoloder : RecyclerView.ViewHolder {


        public class TestAdapter : RecyclerView.Adapter<TestAdapter.TestViewHolder> {


            fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TestViewHolder {

                val v = LayoutInflater.from(parent.context).inflate(R.layout.test_recycler_item, parent, false)
                val holder = TestViewHolder(v)
                return holder
            }

            fun onBindViewHolder(holder: TestViewHolder, position: Int) {

            }

            fun getItemCount(): Int? {
                return myList.size();
            }

            inner class TestViewHolder(itemView: View) : RecyclerView.ViewHolder {

                var txt: TextView


                init {

                    txt = itemView.findViewById(R.id.txtrecycle)
                }
            }
        }
    }
}

class RecyclerView {
    interface Adapter<T> {

    }

    interface ViewHolder {

    }

}

