package com.example.yumarketforowners.presentation.screen.reviewmanage.innerfragment.review

import android.widget.Toast
import com.example.yumarketforowners.domain.model.review.Review
import com.example.yumarketforowners.presentation.adapter.ModelRecyclerAdapter
import com.example.yumarketforowners.presentation.recyclerview.listener.reviewmanage.ReviewViewHolderListener
import com.example.yumarketforowners.presentation.screen.reviewmanage.innerfragment.BaseReviewInnerFragment
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class ReviewInnerFragment : BaseReviewInnerFragment<ReviewUiState>() {
    @Inject
    lateinit var presenter: ReviewManagePresenter

    override val adapter: ModelRecyclerAdapter<ReviewUiState> by lazy {
        ModelRecyclerAdapter(
            object : ReviewViewHolderListener {
                override fun onReplyClicked(review: ReviewUiState) {
                    Toast.makeText(context, "$review reply clicked", Toast.LENGTH_SHORT).show()
                }
            }
        )
    }

    override fun requestData() {
        // TODO: 2022.07.10 request by market id
        presenter.requestData(0)
    }
}
