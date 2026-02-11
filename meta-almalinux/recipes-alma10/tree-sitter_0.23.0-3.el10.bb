
PN = "tree-sitter"
PE = "0"
PV = "0.23.0"
PR = "3.el10"
PACKAGES = "libtree-sitter libtree-sitter-devel"


URI_libtree-sitter = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libtree-sitter-0.23.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libtree-sitter = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.17)(64bit) ( )"
RPROVIDES:libtree-sitter = "libtree-sitter.so.0.23()(64bit) ( ) libtree-sitter ( =  0.23.0-3.el10) libtree-sitter(x86-64) ( =  0.23.0-3.el10)"

URI_libtree-sitter-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libtree-sitter-devel-0.23.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libtree-sitter-devel = "/usr/bin/pkg-config ( ) libtree-sitter.so.0.23()(64bit) ( ) libtree-sitter(x86-64) ( =  0.23.0-3.el10)"
RPROVIDES:libtree-sitter-devel = "libtree-sitter-devel ( =  0.23.0-3.el10) libtree-sitter-devel(x86-64) ( =  0.23.0-3.el10) pkgconfig(tree-sitter) ( =  0.23.0)"
