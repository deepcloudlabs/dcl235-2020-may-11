package com.example;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Main {

    public static void main(String[] args) {

        Path path = Paths.get("c:/Windows");
        if (!Files.isDirectory(path)) {
            System.err.println("This is not a directory!");
            System.exit(1);
        }
        try {
                  // internal iterator
                  //       |
                  //       v         // strategy -> FileVisitor<Path>
            Files.walkFileTree(path, new DeleteFileVisitor());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}

class DeleteFileVisitor implements FileVisitor<Path> {

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("Visiting " + dir);
        System.out.println("Size: " + attrs.size());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if (!attrs.isDirectory())
            System.out.println("Deleting file " + file.getFileName() + "...");
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        System.err.println("Cannot visit file " + file.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        if (Files.isDirectory(dir))
            System.out.println("Deleting directory " + dir.getFileName() + "...");
        return FileVisitResult.CONTINUE;
    }
}