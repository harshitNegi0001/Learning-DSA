class TrieNode {
	TrieNode[] children;
	boolean isWord;

	TrieNode() {
		children = new TrieNode[26];
		isWord = false;
	}
}

class Trie {

	TrieNode root;

	Trie() {
		root = new TrieNode();
	}

	public int getIndex(char c) {
		return c - 'a';
	}
	public void insert(String word) {
		TrieNode current = this.root;
		for (int i = 0; i < word.length(); i++) {
			int index = getIndex(word.charAt(i));
			if (current.children[index] == null) {
				current.children[index] = new TrieNode();

			}
			current = current.children[index];

		}
		current.isWord = true;

	}

	public boolean search(String word) {
		TrieNode current = root;

		for (int i = 0 ; i < word.length(); i++) {
			int index = getIndex(word.charAt(i));

			if (current.children[index] == null) {
				return false;
			}
			current = current.children[index];
		}
		return current.isWord;
	}
}

public class TrieDataStructure {
	public static void main(String[] args) {

		Trie trie = new Trie();

		trie.insert("harshit");
		trie.insert("harsh");

		trie.insert("apple");
		trie.insert("application");
		trie.insert("apply");
		trie.insert("app");


		System.out.println("is present (harshit) : " + trie.search("harshit"));
		System.out.println("is present (har) : " + trie.search("har"));
		System.out.println("is present (harsh) : " + trie.search("harsh"));
		System.out.println("is present (harshita) : " + trie.search("harshita"));
		System.out.println("is present (apple) : " + trie.search("apple"));
		System.out.println("is present (apply) : " + trie.search("apply"));
		System.out.println("is present (application) : " + trie.search("application"));
		System.out.println("is present (app) : " + trie.search("app"));
		System.out.println("is present (tomato) : " + trie.search("tomato"));
	}
}