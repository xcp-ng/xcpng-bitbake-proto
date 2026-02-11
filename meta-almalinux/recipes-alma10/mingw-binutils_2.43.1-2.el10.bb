
PN = "mingw-binutils"
PE = "0"
PV = "2.43.1"
PR = "2.el10"
PACKAGES = "mingw-binutils-generic mingw32-binutils mingw64-binutils ucrt64-binutils"


URI_mingw-binutils-generic = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw-binutils-generic-2.43.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mingw-binutils-generic = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( )"
RPROVIDES:mingw-binutils-generic = "mingw-binutils-generic ( =  2.43.1-2.el10) mingw-binutils-generic(x86-64) ( =  2.43.1-2.el10)"

URI_mingw32-binutils = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw32-binutils-2.43.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mingw32-binutils = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) mingw32-filesystem ( >=  95) mingw-binutils-generic ( =  2.43.1-2.el10)"
RPROVIDES:mingw32-binutils = "mingw32-binutils ( =  2.43.1-2.el10) mingw32-binutils(x86-64) ( =  2.43.1-2.el10)"

URI_mingw64-binutils = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw64-binutils-2.43.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mingw64-binutils = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) mingw64-filesystem ( >=  95) mingw-binutils-generic ( =  2.43.1-2.el10)"
RPROVIDES:mingw64-binutils = "mingw64-binutils ( =  2.43.1-2.el10) mingw64-binutils(x86-64) ( =  2.43.1-2.el10)"

URI_ucrt64-binutils = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ucrt64-binutils-2.43.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ucrt64-binutils = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) ucrt64-filesystem ( >=  133) mingw-binutils-generic ( =  2.43.1-2.el10)"
RPROVIDES:ucrt64-binutils = "ucrt64-binutils ( =  2.43.1-2.el10) ucrt64-binutils(x86-64) ( =  2.43.1-2.el10)"
