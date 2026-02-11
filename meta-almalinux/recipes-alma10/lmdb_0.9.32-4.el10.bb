
PN = "lmdb"
PE = "0"
PV = "0.9.32"
PR = "4.el10"
PACKAGES = "lmdb-libs lmdb lmdb-devel lmdb-doc"


URI_lmdb-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/lmdb-libs-0.9.32-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lmdb-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( )"
RPROVIDES:lmdb-libs = "liblmdb.so.0.0.0()(64bit) ( ) lmdb-libs ( =  0.9.32-4.el10) lmdb-libs(x86-64) ( =  0.9.32-4.el10)"

URI_lmdb = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/lmdb-0.9.32-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lmdb = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) liblmdb.so.0.0.0()(64bit) ( )"
RPROVIDES:lmdb = "lmdb(x86-64) ( =  0.9.32-4.el10) lmdb ( =  0.9.32-4.el10)"

URI_lmdb-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/lmdb-devel-0.9.32-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lmdb-devel = "/usr/bin/pkg-config ( ) liblmdb.so.0.0.0()(64bit) ( ) lmdb(x86-64) ( =  0.9.32-4.el10)"
RPROVIDES:lmdb-devel = "lmdb-devel ( =  0.9.32-4.el10) lmdb-devel(x86-64) ( =  0.9.32-4.el10) pkgconfig(lmdb) ( =  0.9.32)"

URI_lmdb-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/lmdb-doc-0.9.32-4.el10.noarch.rpm;unpack=0"
RDEPENDS:lmdb-doc = ""
RPROVIDES:lmdb-doc = "lmdb-doc ( =  0.9.32-4.el10)"
