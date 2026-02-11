
PN = "tree-sitter"
PE = "0"
PV = "0.23.0"
PR = "3.el10"
PACKAGES = "libtree-sitter libtree-sitter-devel"


URI_libtree-sitter = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libtree-sitter-0.23.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libtree-sitter = "
 glibc
"

URI_libtree-sitter-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libtree-sitter-devel-0.23.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libtree-sitter-devel = "
 libtree-sitter
 pkgconf-pkg-config
"
