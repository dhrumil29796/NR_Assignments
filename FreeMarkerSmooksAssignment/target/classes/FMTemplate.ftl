<BookOrderInformation>
<ContextInformation>
<#list contextInformation as details>
		<SessionId>${details.sessionId}</SessionId>
		<BookingMode>${details.bookingMode}</BookingMode>
		<Country>${details.country}</Country>
		<State>${details.state}</State>
		<City>${details.city}</City>
</#list>
</ContextInformation>
<BookOrderList>
<#list bookOrderItems as book>
		<Book>
			<Name>${book.bookName}</Name>
			<Price>${book.bookPrice}</Price>
			<Author>${book.authorName}</Author>
			<Publisher>${book.publisherName}</Publisher>
			<OrderBookingDate>${book.orderBookingDate}</OrderBookingDate>
		</Book>
</#list>
</BookOrderList>
</BookOrderInformation>