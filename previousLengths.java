function previousLengths(arr)
{
	for (var i = arr.length-1; i > 0; i--)
	{
		var letter = 0;
		letter = arr[i-1].replace( /\s/g, '').length;
		arr[i]=letter;
	}
	return arr;
}
