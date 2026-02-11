
PN = "acl"
PE = "0"
PV = "2.3.2"
PR = "4.el10"
PACKAGES = "acl libacl libacl-devel"


URI_acl = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/acl-2.3.2-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:acl = "
 glibc
 libacl
"

URI_libacl = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libacl-2.3.2-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libacl = "
 glibc
 libattr
"

URI_libacl-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libacl-devel-2.3.2-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libacl-devel = "
 libacl
 pkgconf-pkg-config
 libattr-devel
"
