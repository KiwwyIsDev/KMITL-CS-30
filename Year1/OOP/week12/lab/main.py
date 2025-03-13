import csv

def get_movie_with_largest_gross():
    # Open with UTF-8 encoding and error handling
    with open('movies.csv', 'r', encoding='utf-8', errors='replace') as file:
        reader = csv.DictReader(file)
        # Find the movie with the largest gross
        movie_with_largest_gross = max(reader, key=lambda x: float(x['gross']) if x['gross'] else 0)
        
    return movie_with_largest_gross.get('title', 'Unknown Title')

if __name__ == "__main__":
    movie_title = get_movie_with_largest_gross()
    print(f"The movie with the largest gross is: {movie_title}")
