## Access Modifiers
    * Access modifiers allow access control for variables and methods inside and outside classes and packages.
    * Four types of access modifiers:
        1. Private
        2. Public
        3. Protected
        4. Default


|  | **Private** | **Protected** | **Public** | **Default** |
| ---- | ------ | ----- | --- | ----- |
| Same Class | *Yes* | *Yes* | *Yes* | *Yes* | 
| Same Package Subclass | *No* | *Yes* | *Yes* | *Yes* |
| Same Package Non-Subclass | *No* | *Yes* | *Yes* | *Yes* |
| Different Package Subclass | *No* | *Yes* | *Yes* | *No* |
| Different Package Non-Subclass | *No* | *No* | *Yes* | *No* |

