package com.brandon.songr;

import com.brandon.songr.models.Album;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

//@SpringBootTest
class SongrApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testAlbum() {
		Album sut = new Album("Title", "Artist", 1, 1, "test");

		assertEquals("Title", sut.getTitle());
		assertEquals(1, sut.getLength());
	}

}
