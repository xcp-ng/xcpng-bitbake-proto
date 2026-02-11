
PN = "xxhash"
PE = "0"
PV = "0.8.2"
PR = "4.el10"
PACKAGES = "xxhash xxhash-devel xxhash-doc xxhash-libs"


URI_xxhash = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/xxhash-0.8.2-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xxhash = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( )"
RPROVIDES:xxhash = "xxhash ( =  0.8.2-4.el10) xxhash(x86-64) ( =  0.8.2-4.el10)"

URI_xxhash-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/xxhash-devel-0.8.2-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xxhash-devel = "/usr/bin/pkg-config ( ) libxxhash.so.0()(64bit) ( ) xxhash-libs(x86-64) ( =  0.8.2-4.el10)"
RPROVIDES:xxhash-devel = "pkgconfig(libxxhash) ( =  0.8.2) xxhash-devel ( =  0.8.2-4.el10) xxhash-devel(x86-64) ( =  0.8.2-4.el10) xxhash-static ( =  0.8.2-4.el10)"

URI_xxhash-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/xxhash-doc-0.8.2-4.el10.noarch.rpm;unpack=0"
RDEPENDS:xxhash-doc = ""
RPROVIDES:xxhash-doc = "xxhash-doc ( =  0.8.2-4.el10)"

URI_xxhash-libs = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/xxhash-libs-0.8.2-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xxhash-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( )"
RPROVIDES:xxhash-libs = "libxxhash.so.0()(64bit) ( ) xxhash-libs(x86-64) ( =  0.8.2-4.el10) xxhash-libs ( =  0.8.2-4.el10)"
