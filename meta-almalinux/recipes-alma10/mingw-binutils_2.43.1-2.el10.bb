
PN = "mingw-binutils"
PE = "0"
PV = "2.43.1"
PR = "2.el10"
PACKAGES = "mingw-binutils-generic mingw32-binutils mingw64-binutils ucrt64-binutils"


URI_mingw-binutils-generic = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw-binutils-generic-2.43.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mingw-binutils-generic = "
 glibc
"

URI_mingw32-binutils = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw32-binutils-2.43.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mingw32-binutils = "
 glibc
 mingw-binutils-generic
 mingw32-filesystem
"

URI_mingw64-binutils = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw64-binutils-2.43.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mingw64-binutils = "
 glibc
 mingw-binutils-generic
 mingw64-filesystem
"

URI_ucrt64-binutils = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ucrt64-binutils-2.43.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ucrt64-binutils = "
 glibc
 mingw-binutils-generic
 ucrt64-filesystem
"
