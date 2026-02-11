
PN = "file"
PE = "0"
PV = "5.45"
PR = "7.el10"
PACKAGES = "file file-libs python3-file-magic file-devel file-static"


URI_file = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/file-5.45-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:file = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libmagic.so.1()(64bit) ( ) file-libs(x86-64) ( =  5.45-7.el10)"
RPROVIDES:file = "config(file) ( =  5.45-7.el10) file ( =  5.45-7.el10) file(x86-64) ( =  5.45-7.el10)"

URI_file-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/file-libs-5.45-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:file-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libz.so.1()(64bit) ( )"
RPROVIDES:file-libs = "libmagic.so.1()(64bit) ( ) file-libs(x86-64) ( =  5.45-7.el10) file-libs ( =  5.45-7.el10)"

URI_python3-file-magic = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-file-magic-5.45-7.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-file-magic = "python(abi) ( =  3.12) file-libs ( =  5.45-7.el10)"
RPROVIDES:python3-file-magic = "python-file-magic ( =  5.45-7.el10) python3-file-magic ( =  5.45-7.el10) python3-magic ( =  5.45-7.el10) python3.12-file-magic ( =  5.45-7.el10) python3.12dist(file-magic) ( =  0.4) python3dist(file-magic) ( =  0.4)"

URI_file-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/file-devel-5.45-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:file-devel = "/usr/bin/pkg-config ( ) libmagic.so.1()(64bit) ( ) file-libs(x86-64) ( =  5.45-7.el10)"
RPROVIDES:file-devel = "file-devel ( =  5.45-7.el10) file-devel(x86-64) ( =  5.45-7.el10) pkgconfig(libmagic) ( =  5.45)"

URI_file-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/file-static-5.45-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:file-static = "file-devel ( =  5.45-7.el10)"
RPROVIDES:file-static = "file-static ( =  5.45-7.el10) file-static(x86-64) ( =  5.45-7.el10)"
