CREATE TABLE band (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name VARCHAR(255) NOT NULL UNIQUE
);

CREATE TABLE setlist (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    band_id UUID NOT NULL,
    date DATE NOT NULL,
    FOREIGN KEY (band_id) REFERENCES band(id) ON DELETE CASCADE
);

CREATE TABLE setlist_song (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    setlist_id UUID NOT NULL,
    title VARCHAR(255) NOT NULL,
    url VARCHAR(512) NOT NULL,
    platform VARCHAR(50) NOT NULL CHECK (platform IN ('SPOTIFY', 'YOUTUBE')),
    FOREIGN KEY (setlist_id) REFERENCES setlist(id) ON DELETE CASCADE
);
