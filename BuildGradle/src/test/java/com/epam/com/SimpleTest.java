package com.epam.com;

import com.epam.mp.client.IphoneVideoClient;
import com.epam.mp.client.VideoClient;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class SimpleTest {

    private VideoClient videoClient;

    @Test
    public void testConcatenate() {

        videoClient = new IphoneVideoClient();

        assertNotNull(videoClient.createFactory());

    }
}
