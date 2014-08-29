/**
* Licensed for educational purposes only
*
* @author Fariz Luqman <farizluqman@simplelinux.my>
* @author Mahadir Ahmad <mahadir@madet.my>
*
**/

#include <iostream>
#include "genBST.h"
#include <list>

template<class T>
class newBST:public BST<typename T> {
public:
	//override the iterativePreorder
	int countRoot();
	int countRightLeaves();
	int getHeight();
	int productOfSmallestAndHighest();
};

template<class T>
int newBST<T>::countRoot() { 
	int count = 0;
	Stack<BSTNode<T>*> travStack;
	BSTNode<T> *p = root;
	if (p != 0) {
		travStack.push(p);
		while (!travStack.empty()) {
			p = travStack.pop();
			//visit(p);
			if ((p->right != 0) || (p->left != 0))
			{
				count++;
			}
			if (p->right != 0)
				travStack.push(p->right);
			if (p->left != 0)             // left child pushed after right
				travStack.push(p->left); // to be on the top of the stack;
		}
		return count;
	}
}

template<class T>
int newBST<T>::countRightLeaves() { 
	int count = 0;
	Stack<BSTNode<T>*> travStack;
	BSTNode<T> *p = root;
	if (p != 0) {
		travStack.push(p);
		while (!travStack.empty()) {
			p = travStack.pop();
			if (p->right != 0){
				count++;
				travStack.push(p->right);
			}	
			if (p->left != 0)             // left child pushed after right
				travStack.push(p->left); // to be on the top of the stack;
		}
		return count;
	}
}

template<class T>
int newBST<T>::getHeight() { 
    queue<BSTNode<T> *> q;
    BSTNode<T> *p = root;
	int height = 0;

	//no tree
	if(p==0)
		return 0;

	q.push(p);

	while(true){
		int nodeCount = q.size();
	    if (nodeCount == 0)
			return height;

		height++;

		while (nodeCount > 0)
        {
            BSTNode<T> *tmp = q.front();
            q.pop();
            if (tmp->left != 0)
                q.push(tmp->left);
            if (tmp->right != 0)
                q.push(tmp->right);
            nodeCount--;
        }
	}

    return height;
}

template<class T>
int newBST<T>::productOfSmallestAndHighest() { 
	list<T> allNodes;
	Stack<BSTNode<T>*> travStack;
	BSTNode<T> *p = root;
	if (p != 0) {
		travStack.push(p);
		while (!travStack.empty()) {
			p = travStack.pop();
			// insert all nodes to the allNodes list
			allNodes.push_front(p->el);
			if (p->right != 0)
				travStack.push(p->right);
			if (p->left != 0)             // left child pushed after right
				travStack.push(p->left); // to be on the top of the stack;
		}
		allNodes.sort();
		//product = (allNodes.begin() + allNodes.end());
		return ((allNodes.front()) * (allNodes.back()));
	}
}

int main()
{
	newBST<int> myTree;
	int input;

	/*
	Enter automatically, without being prompted

	myTree.insert(59);
	myTree.insert(67);
	myTree.insert(2);
	myTree.insert(5);
	myTree.insert(89);
	myTree.insert(23);
	myTree.insert(56);
	myTree.insert(1);
	myTree.insert(5);
	myTree.insert(45);
	myTree.insert(90);
	myTree.insert(15);
	myTree.insert(8);
	myTree.insert(34);
	myTree.insert(76);
	myTree.insert(77);
	myTree.insert(65);
	myTree.insert(9);
	myTree.insert(20);
	myTree.insert(84);
	*/

	do {
		// if the tree is empty, display "enter first integer :"
		if (myTree.isEmpty())
		{
			cout << "Enter root integer: ";
		}
		else
		{
			cout << "Enter an integer (or 0 to exit): ";
		}
		cin >> input;

		// to avoid value 0 being entered to the tree
		switch (input)
		{
		case 0:
			break;
		default:
			myTree.insert(input);
		}

	} while(input != 0);

	cout << endl << "Total root: " <<  myTree.countRoot() << endl;
	cout << endl << "Total right leaves: " <<  myTree.countRightLeaves() << endl;
	cout << endl << "Total height of the tree: " << myTree.getHeight() << endl;
	cout << endl << "Product of smallest and highest number: " << myTree.productOfSmallestAndHighest() << endl;
	return 0;
}