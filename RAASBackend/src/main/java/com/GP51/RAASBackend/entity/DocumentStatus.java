package com.GP51.RAASBackend.entity;

public enum DocumentStatus {
    PENDING,     // Just uploaded, waiting for the queue
    PROCESSING,  // Virtual thread is currently chunking/embedding
    COMPLETED,   // Embedded and ready to be queried
    FAILED       // Something went wrong (e.g., corrupt PDF)
}