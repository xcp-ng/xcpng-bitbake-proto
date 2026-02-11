
PN = "lmdb"
PE = "0"
PV = "0.9.32"
PR = "4.el10"
PACKAGES = "lmdb-libs lmdb lmdb-devel lmdb-doc"


URI_lmdb-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/lmdb-libs-0.9.32-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lmdb-libs = "
 glibc
"

URI_lmdb = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/lmdb-0.9.32-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lmdb = "
 glibc
 lmdb-libs
"

URI_lmdb-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/lmdb-devel-0.9.32-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lmdb-devel = "
 lmdb-libs
 lmdb
 pkgconf-pkg-config
"

URI_lmdb-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/lmdb-doc-0.9.32-4.el10.noarch.rpm;unpack=0"
RDEPENDS:lmdb-doc = ""
