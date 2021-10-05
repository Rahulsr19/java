Class Entertain{
	public static.void setAndDisplayActors(String movieName,String ticketPrice,String movieLength,String rating,String[] actors){
		System.out.println("invoked setAndDisplayActors");
		System.out.println("movieName:" +movieName);
		System.out.println("ticketPrice:" +ticketPrice);
		System.out.println("movieLength:" +movieLength);
		System.out.println("rating:" +rating);
		
		for(int actorIndex=0;actorIndex<actors.length;){
			String actor=actors[actorIndex];
			System.out.println(actor);
			//break;
			actorIndex++;
		}
	}
}