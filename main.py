import os
import zipfile


def unzip_all_in_directory(directory):
    """Unzips all ZIP files within folders in the specified directory.

    Args:
        directory (str): The path to the directory containing ZIP files.

    Raises:
        OSError: If an error occurs while accessing or manipulating files.
    """
    root = os.path.abspath(directory)
    files = os.listdir(directory)
    print(files)
    for filename in files:
        if filename.endswith(".zip"):
            filepath = os.path.join(root, filename)
            try:
                with zipfile.ZipFile(filepath, "r") as zip_ref:
                    zip_ref.extractall(root)  # Extract to current folder
                    print(f"Extracted '{filename}' to '{root}'")
            except zipfile.BadZipFile:
                print(f"Error: '{filename}' is not a valid ZIP file.")
            except OSError as e:
                print(f"Error processing '{filename}': {e}")


if __name__ == "__main__":
    unzip_all_in_directory("./")
