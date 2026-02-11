
PN = "python-zstd"
PE = "0"
PV = "1.5.5.1"
PR = "5.el10"
PACKAGES = "python3-zstd"


URI_python3-zstd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-zstd-1.5.5.1-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-zstd = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libzstd.so.1()(64bit) ( ) python(abi) ( =  3.12) libzstd(x86-64) ( >=  1.5.5)"
RPROVIDES:python3-zstd = "python-zstd ( =  1.5.5.1-5.el10) python3-zstd ( =  1.5.5.1-5.el10) python3-zstd(x86-64) ( =  1.5.5.1-5.el10) python3.12-zstd ( =  1.5.5.1-5.el10) python3.12dist(zstd) ( =  1.5.5.1) python3dist(zstd) ( =  1.5.5.1)"
