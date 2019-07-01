package com.synchrony.album.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.synchrony.album.vo.AlbumResponse;

@RestController("/image")
public class ImageController {

	
	@PostMapping("/upload")
	public ResponseEntity<AlbumResponse> uploadImage(@RequestParam("file") MultipartFile file) {

		// TODO Call ImageService and make connection to external Url upload the file.
		// Construct the response message and send as the response

		return ResponseEntity.status(HttpStatus.CREATED).body(new AlbumResponse("MSG001","Successfully uploaded the file"));

	}
}